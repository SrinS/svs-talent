public class JoinWithTimeout {

	public static void main(String[] args) throws Exception {

		final Task task = new Task();
		final Thread taskThread = new Thread(task);
		taskThread.start();
		
		Logger.log("Waithing on task to finish...");
		taskThread.join(3000);
		Logger.log("Task finished or timeout exeeded.");
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
