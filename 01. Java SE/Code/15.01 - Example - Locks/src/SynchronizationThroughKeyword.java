import java.util.concurrent.TimeUnit;

public class SynchronizationThroughKeyword {

	public static void main(String[] args) {
		
		final Counter counter = new Counter();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					counter.incrementAndPrint();
				}
			}).start();;
		}
	}
	
	public static class Counter {
		
		private int count = 0;
		
		public synchronized void incrementAndPrint() {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			count++;
			Logger.log("Counter set to " + count);
		}
	}
}
