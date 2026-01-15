package day8.HomeNest;

import java.util.*;

public class HomeNestManager {
	private List<Device> devices = new ArrayList<>();

	public void register(Device d) {
		devices.add(d);
	}

	public void turnAllOn() {
		for (Device d : devices) {
			d.turnOn();
		}
	}

	public void turnAllOff() {
		for (Device d : devices) {
			d.turnOff();
		}
	}

	public void resetAll() {
		for (Device d : devices) {
			d.reset();
		}
	}

	public void showAll() {
		for (Device d : devices) {
			d.printDevice();
		}
	}

	public int getTotalEnergy() {
		int total = 0;
		for (Device d : devices) {
			total += d.energyUsage;
		}
		return total;
	}
}
