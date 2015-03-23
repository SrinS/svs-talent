import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierApplication {

    private static final int NUMBER_OF_SPRINTERS = 8;

    public static void main(String[] args) {

        final CyclicBarrier startSignal = new CyclicBarrier(NUMBER_OF_SPRINTERS, new StartSignalDelay());
        final ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_SPRINTERS);
        for (int i = 1; i <= NUMBER_OF_SPRINTERS; i++) {
            executorService.submit(new Sprinter(i, startSignal));
        }

        executorService.shutdown();
    }
}
