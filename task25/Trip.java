package by.module4.task25;

public class Trip {
	public final String DEFAULT_DESTINATION = "UNKNOWN";
	public final String DEFAULT_NAME = "UNKNOWN_NAME";
	public final int MINIMAL_LENGTH = 1;
	public final int DEFAULT_PRICE = 0; 
	public final Food DEFAULT_FOOD = Food.NO_FOOD; 
	public final Transport DEFAULT_TRANSPORT = Transport.BUS;
	public final TravelAim DEFAULT_AIM = TravelAim.REST;
	private double price;
	private String name;
	private TravelAim aim;
	private String destination;
	private Transport transport;
	private int length;
	private Food food;
	private int id;
	
	
	
	public Trip(int id, String name) {
		this(name);
		
		if (id < 0) {
			id = 0;
		}
		this.id = id;

	}
	
	public Trip(String name) {
		this.setName(name);
		this.destination = DEFAULT_DESTINATION;
		this.length = MINIMAL_LENGTH;
		this.price = DEFAULT_PRICE;
		this.transport = DEFAULT_TRANSPORT;
		this.aim = DEFAULT_AIM;
		this.food = DEFAULT_FOOD;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the aim
	 */
	public TravelAim getAim() {
		return aim;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @return the transport
	 */
	public Transport getTransport() {
		return transport;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @return the food
	 */
	public Food getFood() {
		return food;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param transport the transport to set
	 */
	void setTransport(Transport transport) {
		this.transport = transport;
		if (transport == null) {
			transport = DEFAULT_TRANSPORT;
		}
	}
	/**
	 * @param id the id to set
	 */
	void setId(int id) {
		this.id = id;
	}
	/**
	 * @param price the price to set
	 */
	void setPrice(double price) {
		this.price = price;
		if (price < 0 ) {
			this.price = DEFAULT_PRICE;
		}
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		if (name.isEmpty()) {
			name = DEFAULT_NAME;
		}
		this.name = name;
	}
	/**
	 * @param aim the aim to set
	 */
	void setAim(TravelAim aim) {
		this.aim = aim;
		if (aim == null) {
			this.aim = DEFAULT_AIM;
		}
	}
	/**
	 * @param destination the destination to set
	 */
	void setDestination(String destination) {
		this.destination = destination;
		if (destination.isEmpty()) {
			this.destination = DEFAULT_DESTINATION;
		}
	}
	/**
	 * @param length the length to set
	 */
	void setLength(int length) {
		this.length = length;
		if (length < MINIMAL_LENGTH) {
			this.length = MINIMAL_LENGTH;
		}
	}
	/**
	 * @param food the food to set
	 */
	void setFood(Food food) {
		
		this.food = food;
		if (food == null) {
			this.food = DEFAULT_FOOD;
		}
	}

	@Override
	public String toString() {
		return "Trip [price=" + price + ", name=" + name + ", aim=" + aim + ", destination=" + destination
				+ ", transport=" + transport + ", length=" + length + ", food=" + food + ", id=" + id + "]";
	}
}
