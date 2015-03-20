import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Sprinter implements Runnable {

    private Integer position;
    private CyclicBarrier startSignal;

    public Sprinter(Integer position, CyclicBarrier startSignal) {
        this.position = position;
        this.startSignal = startSignal;
    }

    @Override
    public void run() {

        System.out.println("Sprinter " + position + " is preparing for race...");
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10) + 1);
        } catch (InterruptedException e) {
        }
        System.out.println("Sprinter " + position + " is ready.");

        try {
            startSignal.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

        long timeAtStart = System.currentTimeMillis();
        System.out.println("Sprinter " + position + " is running...");
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10) + 1);
        } catch (InterruptedException e) {
        }
        long timeAtEnd = System.currentTimeMillis();
        System.out.println("Sprinter " + position + " finished the race in " + ((timeAtEnd - timeAtStart) / 1000) + " seconds.");
    }

}
