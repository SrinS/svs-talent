public class Interrupts {

	public static void main(String[] args) throws Exception {
		
		final Task task = new Task();
		final Thread taskThread = new Thread(task);
		taskThread.start();
		
		Thread.sleep(3000);
		Logger.log("Interupting the task...");
		taskThread.interrupt();
	}
	
	public static class Task implements Runnable {

		@Override
		public void run() {
			
			int i = 0;
			while (true) {
				Logger.log(String.valueOf(i++));
				if (Thread.interrupted()) {
					Logger.log("I've been interrupted.");
					return;
				}
			}
		}
		
	}
}
