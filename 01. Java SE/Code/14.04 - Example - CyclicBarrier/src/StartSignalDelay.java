import java.util.concurrent.TimeUnit;

public class StartSignalDelay implements Runnable {

    @Override
    public void run() {

        System.out.println("All sprinters are ready...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Start!!!");
    }

}
