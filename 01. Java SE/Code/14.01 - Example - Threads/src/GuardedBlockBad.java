public class GuardedBlockBad {

	public static void main(String[] args) throws Exception {

		final Task task = new Task();
		final Thread taskThread = new Thread(task);
		taskThread.start();

		Thread.sleep(2000);
		Logger.log("Please proceed!");
		task.proceed = true;
	}

	public static class Task implements Runnable {
		
		public boolean proceed = false;

		@Override
		public void run() {

			int i = 0;
			while (!proceed) {
				Logger.log("Waiting to proceed - " + i++);
			}
			
			Logger.log("Proceeding with execution.");
		}
	}
}
