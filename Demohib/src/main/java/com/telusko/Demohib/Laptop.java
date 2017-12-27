package com.telusko.Demohib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	private int price;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", price=" + price + "]";
	}
	
	
}
