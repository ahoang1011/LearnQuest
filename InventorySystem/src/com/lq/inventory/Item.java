package com.lq.inventory;

public class Item {
	
	private String title;
	private double price;
	private int quantiy;
	
	public Item(String title, double price, int quantiy) {
		this.title = title;
		this.price = price;
		this.quantiy = quantiy;
	}
	
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
	public int getQuantiy() {
		return quantiy;
	}
	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}

}
