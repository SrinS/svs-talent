package com.ventoelectrics.waterheater;

public class VentoEfficientWaterHeater extends VentoBaseWaterHeater {

	public static void main(String[] args) throws Exception {

		final VentoThermometer ventoThermometer = new VentoThermometer();
		final VentoHeater ventoHeater = new VentoHeater();
		final VentoPowerSwitch ventoPowerSwitch = new VentoPowerSwitch();

		final VentoThermoregulator ventoThermoregulator = null; // ACME efficient thermoregulator instance. 

		final VentoEfficientWaterHeater waterHeater = new VentoEfficientWaterHeater();
		waterHeater.run(ventoThermoregulator, ventoHeater, ventoPowerSwitch);
	}
}
