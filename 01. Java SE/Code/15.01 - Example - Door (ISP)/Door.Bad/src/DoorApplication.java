public class DoorApplication {

    public static void main(String[] args) {

        final StandardDoor standardDoor = new StandardDoor();
        standardDoor.lock();

        final TimedDoor timedDoor = new TimedDoor();
        timedDoor.lock();

        final Timer timer = new Timer();
        timer.register(1, timedDoor);
        timer.register(1, standardDoor); // The compiler doesn't mind but it doesn't make sense for a standard door to be registered with a timer.
        timer.run();
    }

}
