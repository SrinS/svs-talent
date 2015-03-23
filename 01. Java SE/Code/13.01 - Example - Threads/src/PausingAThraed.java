
public class PausingAThraed {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			Logger.log(String.valueOf(i));
		}
	}
}
