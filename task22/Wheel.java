package by.module4.task22;

public class Wheel implements Runner {
	private int radius;
	private String sound;
	
	public Wheel() {
		radius = 15;
		sound = "shhhhhhh";
	}
	
	public Wheel(int radius, String sound) {
		this.radius = radius;
		this.sound = sound;
		if (sound.isEmpty()) {
			this.sound = "shhhhhhh";
		}
	}

	@Override
	public void drive() {
		System.out.println(sound);
	}
	
	public boolean isOk() {
		return true;
	}
}
