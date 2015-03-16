public class StandardDoor implements Door {

    @Override
    public void lock() {
        System.out.println("StandardDoor.lock");
    }

    @Override
    public void unlock() {
        System.out.println("StandardDoor.unlock");
    }

    @Override
    public void timeOut() {
        System.out.println("StandardDoor.timeOut - Degenerate implementation");
    }
}
