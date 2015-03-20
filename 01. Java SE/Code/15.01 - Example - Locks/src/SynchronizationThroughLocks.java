import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizationThroughLocks {

	public static void main(String[] args) {
		
		final Counter counter = new Counter();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					counter.increment();
				}
			}).start();;
		}
	}
	
	public static class Counter {
		
		private int count = 0;
		private Lock lock = new ReentrantLock();
		
		public void increment() {
			
			lock.lock();
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			count++;
			Logger.log("Counter set to " + count);
			
			lock.unlock();
		}
	}
}
