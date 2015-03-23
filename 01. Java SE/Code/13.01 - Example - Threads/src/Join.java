public class Join {

	public static void main(String[] args) throws Exception {

		final Task task = new Task();
		final Thread taskThread = new Thread(task);
		taskThread.start();
		
		Logger.log("Waithing on task to finish...");
		taskThread.join();
		Logger.log("Task finished.");
	}
	
	public static class Task implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				Logger.log(String.valueOf(i));
			}
		}
		
	}
}
