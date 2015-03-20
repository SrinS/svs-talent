import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceApplication {

    private static final int THREAD_POOL_SIZE = 2;

    public static void main(String[] args) {

        System.out.println("ScheduledExecutorServiceApplication.main()");

        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(THREAD_POOL_SIZE);
        scheduledExecutorService.schedule(new ComplexOperation(), 4, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new ComplexCalculation(), 6, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
