package com.paresh.OOPs;

class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	void displayBookDetails() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

class Library {
	String libraryName;
	Book[] books; // Aggregation: Library "has-a" collection of Books

	Library(String libraryName, Book[] books) {
		this.libraryName = libraryName;
		this.books = books;
	}

	void displayLibraryDetails() {
		System.out.println("Library: " + libraryName);
		System.out.println("Books in the library:");
		for (Book book : books) {
			book.displayBookDetails();
		}
	}
}

public class AggregationDemo {

	public static void main(String[] args) {
		Book book1 = new Book("First Book", "Paresh");
		Book book2 = new Book("Second Book", "Suva");

		Book[] books = { book1, book2 };

		Library library = new Library("City Library", books);

		library.displayLibraryDetails();
	}
}
