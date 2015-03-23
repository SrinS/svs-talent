import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ComplexOperation implements Runnable {

    private Integer orderNumber;
    private CountDownLatch latch;

    public ComplexOperation(Integer orderNumber, CountDownLatch latch) {
        this.orderNumber = orderNumber;
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            System.out.println("Complex operation " + orderNumber + " started...");
            TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
            System.out.println("Complex operation " + orderNumber + " completed.");
            latch.countDown();

        } catch (InterruptedException e) {
        }
    }
}
