package day8.HomeNest;

public class Light extends Device {

	public Light(int deviceId, String name, int baseRate) {
		super(deviceId, name, baseRate);
	}

	@Override
	public int reset() {
		energyUsage = (energyUsage / 2) + 4;
		logFirmware("Light calibrated");
		return energyUsage;
	}
}
