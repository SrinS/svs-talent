import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class DatabaseConnectionPool {

    private Set<DatabaseConnection> pool = Collections.synchronizedSet(new HashSet<DatabaseConnection>());
    private Semaphore semaphore;

    public DatabaseConnectionPool(Integer poolSize) {
    	
        semaphore = new Semaphore(poolSize);
        for (int i = 1; i <= poolSize; i++ ) {
            pool.add(new DatabaseConnection(i));
        }
    }

    public DatabaseConnection getConnection() {

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
        }

        final DatabaseConnection connection;
        synchronized (this) {
        	connection = pool.iterator().next();	
        	pool.remove(connection);
        }
        return connection;
    }

    public void releaseConnection(DatabaseConnection connection) {
    	synchronized (this) {
    		pool.add(connection);
    	}
        semaphore.release();
    }
}
