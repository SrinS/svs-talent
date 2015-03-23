public class DoorApplication {

    public static void main(String[] args) {

        final StandardDoor standardDoor = new StandardDoor();
        standardDoor.lock();

        final TimedDoor timedDoor = new TimedDoor();
        timedDoor.lock();

        final Timer timer = new Timer();
        timer.register(1, timedDoor);
        // timer.register(1, standardDoor); // The compiler doesn't allow this anymore.
        timer.run();
    }

}
