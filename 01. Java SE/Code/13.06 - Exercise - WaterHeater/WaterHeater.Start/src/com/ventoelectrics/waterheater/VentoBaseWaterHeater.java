package com.ventoelectrics.waterheater;

import java.util.concurrent.TimeUnit;

public abstract class VentoBaseWaterHeater {

	protected void run(VentoThermoregulator thermoregulator,
			VentoHeater heater, VentoPowerSwitch powerSwitch) {

		powerSwitch.controlPowerFor(thermoregulator);
		powerSwitch.controlPowerFor(heater);

		thermoregulator.setTemperature(20);
		powerSwitch.turnOn();

		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
		}
		thermoregulator.setTemperature(40);

		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
		}
		powerSwitch.turnOff();
	}
}
