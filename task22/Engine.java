package by.module4.task22;

public class Engine implements Runner {
	private double volume;
	private double power;
	private double fuelConsumption;
	private String sound;
	
	public Engine() {
		this.volume = 1.6;;
		this.power = 100;
		this.fuelConsumption = 8;
		this.sound = "Rrrrrrrrrrrrrrrrrrrrr";
	}

	public Engine(double volume, double power, double fuelConsumption, String sound) {
		this.volume = volume;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.sound = sound;
		
		if (sound.isEmpty()) {
			this.sound = "Rrrrrrrrrrrrrrrrrrrrr";
		}
		if (volume <= 0) {
			this.volume = 1.6;
		}
		if (power <= 0) {
			this.power = 100;
		}
		if (fuelConsumption <= 0) {
			this.fuelConsumption = 8;
		}
	}
	
	public void drive() {
		System.out.println(sound);
	}
	
	public boolean isOk() {
		return true;
	}
}
