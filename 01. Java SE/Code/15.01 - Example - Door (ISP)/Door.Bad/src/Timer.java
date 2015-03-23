import java.util.ArrayList;
import java.util.List;

public class Timer {

	private List<Door> doors = new ArrayList<Door>();

	public void register(int timeout, Door door) {

		// Ignoring the timeout for lower implementation complexity.
		doors.add(door);
	}

	public void run() {

		// Simulating timeout.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (Door door : doors) {
			door.timeOut();
		}
	}
}
