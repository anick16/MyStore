package com.hcl.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	private String title;
	private double price;
	private int isbn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
