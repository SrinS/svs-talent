package com.ventoelectrics.waterheater;

public class VentoStandardWaterHeater extends VentoBaseWaterHeater {

	public static void main(String[] args) throws Exception {

		final VentoThermometer ventoThermometer = new VentoThermometer();
		final VentoHeater ventoHeater = new VentoHeater();
		final VentoPowerSwitch ventoPowerSwitch = new VentoPowerSwitch();

		final VentoThermoregulator ventoThermoregulator = null; // ACME standard thermoregulator instance. 

		final VentoStandardWaterHeater waterHeater = new VentoStandardWaterHeater();
		waterHeater.run(ventoThermoregulator, ventoHeater, ventoPowerSwitch);
	}
}
