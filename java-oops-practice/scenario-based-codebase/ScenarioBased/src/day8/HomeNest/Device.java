package day8.HomeNest;

import java.util.*;

public class Device implements IControllable {
	protected int deviceId;
	protected String name;
	private String status;
	protected int energyUsage;
	protected int baseRate;
	protected int timeUsed;

	private List<String> firmwareLogs = new ArrayList<>();

	public Device(int deviceId, String name, int baseRate) {
		this.deviceId = deviceId;
		this.name = name;
		this.baseRate = baseRate;
		this.status = "off";
		this.energyUsage = 0;
		this.timeUsed = 0;
		firmwareLogs.add("Device registered");
	}

	public String getStatus() {
		return status;
	}

	protected void setStatus(String status) {
		this.status = status;
		firmwareLogs.add("Status changed to " + status);
	}

	protected void logFirmware(String msg) {
		firmwareLogs.add(msg);
	}

	public void printDevice() {
		System.out.println("Device Name: " + name);
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + status);
		System.out.println("Energy Usage: " + energyUsage + "V");
	}

	@Override
	public void turnOn() {
		timeUsed++;
		energyUsage = baseRate * timeUsed;
		setStatus("on");
	}

	@Override
	public void turnOff() {
		setStatus("off");
	}

	@Override
	public int reset() {
		energyUsage = 0;
		timeUsed = 0;
		setStatus("Off");
		logFirmware("System reset");
		return energyUsage;
	}
}
