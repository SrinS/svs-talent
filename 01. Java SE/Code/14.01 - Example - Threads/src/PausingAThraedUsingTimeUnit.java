import java.util.concurrent.TimeUnit;

public class PausingAThraedUsingTimeUnit {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			Logger.log(String.valueOf(i));
		}
	}
}
