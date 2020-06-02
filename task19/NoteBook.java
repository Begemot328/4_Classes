package by.module4.task19;

import java.util.Calendar;

public class NoteBook {
	private Book[] library = new Book[10];
	int bookCounter;
	
	public void addBook(Book book) {
		library[bookCounter] = book;
		bookCounter++;
	}
	
	public Book getBook(int number) {
		if (number >= library.length || number < 0) {
			return null;
		}
		return library[number];
	}
	
	public Book getBookByID(int id) {
		for (int i = 0; i < library.length; i++) {
			if (library[i].getId() == id) {
				return library[i];
			}
		}
		return null;
	}
	
	public Book[] getBooks (String string, SearchIndex index) {		
		Book[] books = new Book[this.library.length];
		int counter = 0;
		boolean result;
		for (int i = 0; i < this.library.length; i++) {
			result = false;
			if (this.library[i] == null) {
				break;
			}
			switch (index) {
				case AUTHOR:
					if (this.library[i].getAuthor().toLowerCase().contains(string.toLowerCase())) {
						result = true;
					}
					break;
				case TITLE:
					if (this.library[i].getTitle().toLowerCase().contains(string.toLowerCase())) {
						result = true;
					}
					break;
				case PUBLISHER:
					if (this.library[i].getPublisher().toLowerCase().contains(string.toLowerCase())) {
						result = true;
					}
					break;
			}
			if (result) {
				books[counter] = this.library[i];
				counter++;
			}
		}
		return books;
	}
	
	public Book[] getBooksByYear (int year) {		
		return getBooksByYears(year, year);
	}
	
	public Book[] getBooksBeforeYear (int year) {		
		return getBooksByYears(0, year);
	}
	
	public Book[] getBooksAfterYear (int year) {		
		return getBooksByYears(year, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public Book[] getBooksByYears (int start, int end) {		
		Book[] books = new Book[this.library.length];
		int counter;
		counter = 0;
		
		if (start > end) {
			return null;
		}
		for (int i = 0; i < this.library.length; i++) {
			if (this.library[i] == null) {
				break;
			}
			if (library[i].getYear() >= start && library[i].getYear() <= end) {
				books[counter] = this.library[i];
				counter++;
			}
		}
		return books;
	}
}
