package com.oop.demo;

public class Book {
	private String author;//required, immutable
	private String title; //required, immutable
	private float price;//not mandatory, mutable
	private STATUS status;// required, mutable

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}
	
	public Book(String author,String title) {//custom constructor
		this.author = author;
		this.title = title;
	}
}
