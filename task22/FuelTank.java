package by.module4.task22;

public class FuelTank implements Runner{
	private double capacity;
	private double maxCapacity;
	private double fuelConsumption;
	
	public FuelTank(double maxCapacity, double fuelConsumption) {
		this.maxCapacity = maxCapacity;
		this.fuelConsumption = fuelConsumption;
		if (maxCapacity < 0) {
			this.maxCapacity = 40;
		}
		if (maxCapacity <= 0) {
			this.maxCapacity = 8;
		}
	}
	
	public FuelTank() {
		maxCapacity = 40;
		fuelConsumption = 10;
	}
	
	public void refuel() {
		this.capacity = maxCapacity;
	}
	
	public void drive() throws RuntimeException {
		capacity -= fuelConsumption;
		if (capacity <= 0) {
			capacity = 0;
			throw new RuntimeException("No fuel");
		}
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
	public boolean isOk() {
		if (capacity > 0) {
			return true;
		} else {
			return false;
		}
		
	}
}
