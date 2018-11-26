package com.zhang.entity;

public class Product {
	private Integer id;
	private String name;
	private int price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";

	}
}