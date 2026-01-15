package day8.HomeNest;

public class Camera extends Device {
	public Camera(int deviceId, String name, int baseRate) {
		super(deviceId, name, baseRate);
	}

	@Override
	public int reset() {
		energyUsage = (energyUsage / 2) + 2;
		logFirmware("Camera soft reset");
		return energyUsage;
	}
}
