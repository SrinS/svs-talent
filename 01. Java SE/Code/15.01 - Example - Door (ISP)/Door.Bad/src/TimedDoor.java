public class TimedDoor implements Door {

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
