package es;

import es.control.PowerButton;
import es.fan.Fan;
import es.lamp.Lamp;

public class ElectricalSystemApplication {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        final Lamp lamp = new Lamp();
        final PowerButton lampButton = new PowerButton(lamp);
        lampButton.click();
        
        final Fan fan = new Fan();
        // final PowerButton fanButton = new PowerButton(fan); // Won't compile.
    }
}
