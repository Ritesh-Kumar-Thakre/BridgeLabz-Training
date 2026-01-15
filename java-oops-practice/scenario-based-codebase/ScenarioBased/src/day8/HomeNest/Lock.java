package day8.HomeNest;

public class Lock extends Device {

	public Lock(int deviceId, String name, int baseRate) {
		super(deviceId, name, baseRate);
	}

	@Override
	public int reset() {
		energyUsage = (energyUsage / 2) + 1;
		logFirmware("Lock synced");
		return energyUsage;
	}
}
