package com.shop.core;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * product id (int : PK) , name (string) , description , quantity , price , category (enum : BREAD, BISCUITS,OIL,GRAIN,SPICES,FRUITS....)
 * ,manufactureDate

 */
public class Product  implements Comparable<Product>  {
//state : data
	private int productId;
	private String name;
	private String desc;
	private int quantity;
	private double price;
	private Category productCategory;
	private LocalDate manufactureDate;

	public Product(int productId, String name, String desc, int quantity, double price, Category productCategory,
			LocalDate manufactureDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.quantity = quantity;
		this.price = price;
		this.productCategory = productCategory;
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", desc=" + desc + ", quantity=" + quantity
				+ ", price=" + price + ", productCategory=" + productCategory + ", manufactureDate=" + manufactureDate
				+ "]";
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product o) {
		System.out.println("in compareTo");
		return ((Integer)productId).compareTo(o.productId);
	}

}
