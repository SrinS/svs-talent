package com.ventoelectrics.waterheater;

import java.util.concurrent.TimeUnit;

public abstract class VentoBaseWaterHeater {

	private VentoThermoregulator thermoregulator;
	private VentoHeater heater;
	private VentoPowerSwitch powerSwitch;

	public VentoBaseWaterHeater(VentoThermoregulator thermoregulator,
			VentoHeater heater, VentoPowerSwitch powerSwitch) {

		super();
		this.thermoregulator = thermoregulator;
		this.heater = heater;
		this.powerSwitch = powerSwitch;
	}

	protected void run() {

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
