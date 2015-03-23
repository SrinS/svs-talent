import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreApplication {

    private static final int NUMBER_OF_CONNECTIONS_IN_POOL = 5;
    private static final int NUMBER_OF_WORKER_THREADS = 50;

    public static void main(String[] args) {

        final ExecutorService executorService = Executors.newCachedThreadPool();
        final DatabaseConnectionPool pool = new DatabaseConnectionPool(NUMBER_OF_CONNECTIONS_IN_POOL);

        for (int i = 0; i < NUMBER_OF_WORKER_THREADS; i++) {

            executorService.execute(new Runnable() {

                @Override
                public void run() {

                    final String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " acquiring connection...");
                    final DatabaseConnection connection = pool.getConnection();
                    System.out.println("Connection " + connection.getId() + " acquired by " + threadName + ".");

                    try {
                        TimeUnit.SECONDS.sleep(new Random().nextInt(10) + 1);
                    } catch (InterruptedException e) {
                    }

                    pool.releaseConnection(connection);
                    System.out.println("Connection " + connection.getId() + " released by " + threadName + ".");
                }
            });
        }
    }
}
