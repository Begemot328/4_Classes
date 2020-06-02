package by.module4.task22;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	
	private Engine engine;
	private FuelTank tank;
	private ArrayList<Runner> list;
	private WheelComplect wheels;
	private String name;
	
	public Car() {
		list = new ArrayList<Runner>();
		this.name = "Unknown";
		engine = new Engine();
		list.add(engine);
		tank = new FuelTank();
		list.add(tank);
		wheels = new WheelComplect();
		list.add(wheels);	
	}
	
	public Car (String name, int wheelQuantity, double volume, double power, double fuelCapacity, 
				double fuelConsumption, String wheelSound, String engineSound) {
		list = new ArrayList<Runner>();
		this.name = name;
		engine = new Engine(volume, power, fuelConsumption, engineSound);
		list.add(engine);
		tank = new FuelTank(fuelCapacity, fuelConsumption);
		list.add(tank);
		wheels = new WheelComplect(wheelQuantity);
		list.add(wheels);	
	}
	
	public Car (String name, double volume, double power, double fuelCapacity, 
			double fuelConsumption, String wheelSound, String engineSound) {
		list = new ArrayList<Runner>();
		this.name = name;
		engine = new Engine(volume, power, fuelConsumption, engineSound);
		list.add(engine);
		tank = new FuelTank(fuelCapacity, fuelConsumption);
		list.add(tank);
		wheels = new WheelComplect();
		list.add(wheels);	
	}
	
	public void drive() {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			try {
				((Runner) iterator.next()).drive();
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				break;
			}
		}
	}
	
	public boolean isOk() {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			if (!((Runner) iterator.next()).isOk()) {
				return false;
			} 
		}
		return true;
	}
	public void refuel() {
		this.tank.refuel();
		System.out.println(name + " tank is full");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
