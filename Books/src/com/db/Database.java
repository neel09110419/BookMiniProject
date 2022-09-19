package com.db;

import java.util.TreeSet;

import com.service.Books;

public class Database {
	
	
	
	TreeSet<Books> books ;
	
	public Database() {
		 books = new TreeSet<>();
		 Books b1 = new Books(101, "System Design", 1000, "Sangeeta");
		 Books b2 = new Books(102, "Analog Design", 1500, "Sumit");
		 Books b3 = new Books(103, "Java Programming", 2000, "Priya");
		 Books b4 = new Books(104, "Database", 2500, "Rahul");
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
	}

	public TreeSet<Books> getBooks() {
		return books;
	}

	public void setBooks(TreeSet<Books> books) {
		this.books = books;
	}
	

}
