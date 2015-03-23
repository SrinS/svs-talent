public class TimedDoor implements Door, TimerClient {

    @Override
    public void lock() {
        System.out.println("TimedDoor.lock");
    }

    @Override
    public void unlock() {
        System.out.println("TimedDoor.unlock");
    }

    @Override
    public void timeOut() {
        System.out.println("TimedDoor.timeOut");
    }
}
