public class InterruptsWhileSleeping {

	public static void main(String[] args) throws Exception {
		
		final TaskThatSleeps task = new TaskThatSleeps();
		final Thread taskThread = new Thread(task);
		taskThread.start();
		
		Thread.sleep(3000);
		Logger.log("Interupting the task...");
		taskThread.interrupt();
	}
	
	public static class TaskThatSleeps implements Runnable {

		@Override
		public void run() {
			
			int i = 0;
			while (true) {
				Logger.log(String.valueOf(i++));
				if (Thread.interrupted()) {
					Logger.log("I've been interrupted.");
					return;
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Logger.log("I've been interupted while sleeping.");
				}
			}
		}
		
	}
}
