package com.Alex.Server.Pojo;

/**
 * Book
 * @author Alexmono
 *
 */
public class Book {
	private String bId;
	private String bookName;
	private String author;
	private String bookId;
	private String publishingHouse;
	private Double price;

	/**
	 * Book 构造方法
	 * @param bId
	 * @param bookName
	 * @param author
	 * @param bookId
	 * @param publishingHouse
	 * @param price
	 */
	public void Book(String bId, String bookName, String author, String bookId, String publishingHouse, Double price) {
		this.bId = bId;
		this.bookName = bookName;
		this.author = author;
		this.bookId = bookId;
		this.publishingHouse = publishingHouse;
		this.price = price;
	}

	/*
	 * BookDao's get and set way
	 */
	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
