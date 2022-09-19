package com.service;

public class Books implements Comparable<Books> {
	
	private int bookId;
	private String title;
	private int price;
	private String author;
	public Books(int bookId, String title, int price, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Books o) {
		
		return this.bookId - o.bookId;
	}
	
	
	

}
