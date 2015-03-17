public class ThreadingUsingThread {

	public static void main(String[] args) {
		
		Logger.log("Hello from main!");
		
		final Thread thread = new HelloThread();
		thread.start();
	}
	
	public static class HelloThread extends Thread {

		@Override
		public void run() {
			Logger.log("Hello from a thread!");
		}
		
	}
}
