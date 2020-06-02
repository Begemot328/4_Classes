package by.module4.task23;

import java.util.ArrayList;
import java.util.Iterator;

public class State {
	private String name;
	private ArrayList<Region> list;
	private City capital;
	double square;
	
	public State() {
		list = new ArrayList<Region>();
	}
	
	public State(String name, City capital) {
		list = new ArrayList<Region>();
		this.capital = capital;
		this.name = name;
	}
	
	public State(String name) {
		list = new ArrayList<Region>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Region> getList() {
		return (ArrayList<Region>) list.clone();
	}

	public void setList(ArrayList<Region> list) {
		this.list = list;
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
		square = 0;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			square += ((Region) iterator.next()).getSquare();
		}
		return square;
	}
	
	public void addRegion(Region region) {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			if (((Region) iterator.next()).equals(region)) {
				region = null;
			}
		}
		if (!(region == null)) {
			list.add(region);
		}
	}
}
