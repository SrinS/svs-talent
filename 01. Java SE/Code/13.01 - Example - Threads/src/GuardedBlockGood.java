public class GuardedBlockGood {

	public static void main(String[] args) throws Exception {

		final Task task = new Task();
		final Thread taskThread = new Thread(task);
		taskThread.start();

		Thread.sleep(2000);
		Logger.log("Please proceed!");
		synchronized (task) {
			task.proceed = true;
			task.notifyAll();
		}
	}

	public static class Task implements Runnable {

		public boolean proceed = false;

		@Override
		public void run() {

			int i = 0;
			while (!proceed) {
				Logger.log("Waiting to proceed - " + i++);
				try {
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {
				}
			}

			Logger.log("Proceeding with execution.");
		}

	}
}
