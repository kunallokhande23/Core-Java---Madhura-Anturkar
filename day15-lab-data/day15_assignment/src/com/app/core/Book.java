package com.app.core;

import java.time.LocalDate;

public class Book {
	/*
	 * Book details :
	 * title(string),category(enum),price(double),publishDate(LocalDate)
	 * ,authorName(string),quantity(int)
	 */
	private String title;
	private Category category;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	public Book(String title, Category category, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", category=" + category + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	public String getTitle() {
		return title;
	}
	public Category getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public String getAuthorName() {
		return authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
