
public class ComplexOperation implements Runnable {

    @Override
    public void run() {
        System.out.println("Complex operation started...");
        try {
        	Thread.sleep(3000);	
		} catch (InterruptedException e) {
		}
        System.out.println("Complex operation completed.");
    }
}
