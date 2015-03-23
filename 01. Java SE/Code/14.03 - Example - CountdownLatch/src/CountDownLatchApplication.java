import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchApplication {

    private static final int NUMBER_OF_OPERATIONS = 3;

    public static void main(String[] args) throws Exception {

        final CountDownLatch latch = new CountDownLatch(NUMBER_OF_OPERATIONS);
        final ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= NUMBER_OF_OPERATIONS; i++) {
            executorService.execute(new ComplexOperation(i, latch));
        }

        System.out.println("Waithing for all complex operations to finish...");
        latch.await();
        System.out.println("All complex operations finished.");

        executorService.shutdown();
    }
}
