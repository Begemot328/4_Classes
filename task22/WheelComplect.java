package by.module4.task22;

public class WheelComplect  implements Runner{
	private Wheel[] wheels;
	private int wheelQuantity;
	
	public WheelComplect() {
		wheels = new  Wheel[4];
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel();
		}		
	}
	
	public WheelComplect(int wheelQuantity) {
		wheels = new  Wheel[wheelQuantity];
	}

	public void replaceWheel(int i) {
		if (i < 0 || i >= wheels.length) {
			return;
		}
		wheels[i] = new Wheel();
	}
	
	public boolean isOk() {
		boolean result = true;
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i] == null) {
				return false;
			}
		}	 
		return true;
	}

	@Override
	public void drive() {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i].drive();
		}	
	}
}
