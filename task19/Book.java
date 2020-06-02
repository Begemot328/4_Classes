package by.module4.task19;

import java.util.Calendar;

public class Book {
	private double price;
	private int year;
	private int id;
	private String title;
	private String author;
	private String publisher;
	
	public Book() {
	}
	public Book(int id, String title, String author, String publisher, 
					int year, int price) {
		this.setId(id);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setPrice(price);
		this.setYear(year);
	}

	public String toString() {
		return "Book (" + id + ") " + title + " by " + author   
				+ ", " + publisher + " year: " + year 
				+ ", price: $" + price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price > 0) {
		this.price = price;
		} else {
			this.price = 3.50;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year >= Calendar.getInstance().get(Calendar.YEAR) || year <= 0) {
			System.out.println(year);
			System.out.println(Calendar.getInstance().get(Calendar.YEAR));
			this.year = 0;
		} else {
		this.year = year;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if (title.isEmpty()) {
			this.title = "Unknown"; 
		} else {
		this.title = title;
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		if (author.isEmpty()) {
			this.author = "Unknown"; 
		} else {
			this.author = author;
		}
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
