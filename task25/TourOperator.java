package by.module4.task25;

import java.util.ArrayList;
import java.util.Iterator;

public class TourOperator {
	public ArrayList<Trip> list;

	public TourOperator() {
		this.list = new ArrayList<Trip>();
	}

	public ArrayList<Trip> findTours(SearchingIndex index, Object obj) {
		return findTours(this.list, index, obj);
	}
	
	public ArrayList<Trip> findTours() {
		return list;
	}
			
	public Trip findTour(int id) {
		Trip next;
		Iterator<Trip> iterator;
		
		iterator = list.iterator();
		while (iterator.hasNext()) {
			next = (Trip) iterator.next();
			if(next.getId() == id) {
				return next;
			}
		}
		return null;
	}
	
	public Trip createTour(String name) {
		return new Trip(name);
	}
	
	public int addTour(Trip trip) {
		int id = 0;
		if (!(trip == null)) {
			id = list.size();
			trip.setId(id);
		}
		list.add(trip);
		return id;
	}
	
	public ArrayList<Trip> findTours(ArrayList<Trip> list, SearchingIndex index, Object obj) {
		ArrayList<Trip>  result;
		Iterator<Trip> iterator;
		boolean isFit;
		Trip next;
		double price;
		int length;
		
		switch (index) {
		case PRICE_LOWER:
			if (!(obj instanceof Number) && !(Number.class.isInstance(obj))) {
				return null;
			}
			if ((Integer)obj <= 0) {
				return null;
			}
			break;
		case PRICE_HIGHER:
			if (!(obj instanceof Number) && !(Number.class.isInstance(obj))) {
				return null;
			}
			if ((Integer)obj <= 0) {
				return null;
			}
			break;
		case LENGTH_SHORTER:
			if (!(obj instanceof Integer) && !(Integer.class.isInstance(obj))) {
				return null;
			}
			if ((Integer)obj <= 0) {
				return null;
			}
			break;
		case LENGTH_LONGER:
			if (!(obj instanceof Integer) && !(Integer.class.isInstance(obj))) {
				return null;
			}
			if ((Integer)obj <= 0) {
				return null;
			}
			break;
		case TRAVEL_AIM:
			if (!(obj instanceof TravelAim) || (obj == null)) {
				return null;
			}
			break;
		case FOOD:
			if (!(obj instanceof Food) || (obj == null)) {
				return null;
			}	
			break;
		case TRANSPORT:
			if (!(obj instanceof Transport) || (obj == null)) {
				return null;
			}
			break;	
		case DESTINATION:
			if (!(obj instanceof String) || (obj == null) || (((String)obj).isEmpty())) {
				return null;
			}
			break;	
		}
		result = new ArrayList<Trip>();
		iterator = list.iterator();
		
		while (iterator.hasNext()) {
			isFit = false;
			next = (Trip) iterator.next();
			
			switch (index) {
			case PRICE_LOWER:
				price = ((Number) obj).doubleValue();
				if(price >= next.getPrice()) {
					isFit = true;
				}	
				break;
			case PRICE_HIGHER:
				price = ((Number) obj).doubleValue();
				if(price <= next.getPrice()) {
					isFit = true;
				}	
				break;
			case LENGTH_SHORTER:
				length = (int) obj;
				if(length >= next.getLength()) {
					isFit = true;
				}	
				break;
			case LENGTH_LONGER:
				length = (int) obj;
				if(length >= next.getLength()) {
					isFit = true;
				}	
				break;
			case TRAVEL_AIM:
				if(((TravelAim)obj).equals(next.getAim())) {
					isFit = true;
				}	
				break;
			case FOOD:
				if(((Food)obj).equals(next.getFood())) {
					isFit = true;
				}		
				break;
			case TRANSPORT:
				if(((Transport)obj).equals(next.getTransport())) {
					isFit = true;
				}		
				break;
			case DESTINATION:
				if(next.getDestination().toLowerCase().contains(
						((String) obj).toLowerCase())) {
					isFit = true;
				}
				break;
			}
			
			if (isFit) {
				result.add(next);
			}
		}
		return result;
	}
	
	public void setTransport(Trip trip, Transport transport) {
		trip.setTransport(transport);
	}

	public void setId(Trip trip, int id) {
		trip.setId(id);
	}

	public void setPrice(Trip trip, double price) {
		trip.setPrice(price);
	}

	public void setName(Trip trip, String name) {
		trip.setName(name);
	}

	public void setAim(Trip trip, TravelAim aim) {
		trip.setAim(aim);
	}

	public void setDestination(Trip trip, String destination) {
		trip.setDestination(destination);
	}

	public void setLength(Trip trip, int length) {
		trip.setLength(length);
	}

	public void setFood(Trip trip, Food food) {
		trip.setFood(food);
	}
}
