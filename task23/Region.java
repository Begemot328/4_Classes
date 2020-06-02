package by.module4.task23;

public class Region {
	private String name;
	private City capital;
	double square;
	
	public Region(String name, City capital) {
		super();
		this.name = name;
		this.capital = capital;
	}
	public Region(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCapital() {
		return capital;
	}
	public void setCapital(City capital) {
		this.capital = capital;
	}
	
	public String toString() {
		return name;
	}
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		if (square < 0) {
			square = 0;
		}
		this.square = square;
	}
	
	@Override
	public boolean equals(Object obj) {
		Region region;
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Region)) {
			return false;
		}
		region = (Region) obj;
		if(!(region.getCapital().equals(this.capital))) {
			return false;
		}
		if(!(region.getName().contentEquals(this.getName()))) {
			return false;
		}
			return true;
	}
}
