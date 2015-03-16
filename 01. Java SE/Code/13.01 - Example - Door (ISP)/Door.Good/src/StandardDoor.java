public class StandardDoor implements Door {

    @Override
    public void lock() {
        System.out.println("StandardDoor.lock");
    }

    @Override
    public void unlock() {
        System.out.println("StandardDoor.unlock");
    }
}
