package day8.HomeNest;

public class Thermostat extends Device {

	public Thermostat(int deviceId, String name, int baseRate) {
		super(deviceId, name, baseRate);
	}

	@Override
	public int reset() {
		energyUsage = (energyUsage / 2) + 6;
		logFirmware("Temperature recalibrated");
		return energyUsage;
	}
}
