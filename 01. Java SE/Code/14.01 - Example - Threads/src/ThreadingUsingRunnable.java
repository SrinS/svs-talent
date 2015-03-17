public class ThreadingUsingRunnable {

	public static void main(String[] args) {
		
		Logger.log("Hello from main!");
		
		final Thread thread = new Thread(new HelloRunnable());
		thread.start();
	}
	
	public static class HelloRunnable implements Runnable {

		@Override
		public void run() {
			Logger.log("Hello from a thread!");
		}
		
	}
}
