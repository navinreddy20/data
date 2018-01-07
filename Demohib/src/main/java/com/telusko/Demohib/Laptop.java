package com.telusko.Demohib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	private int price;
	@ManyToMany(mappedBy="laptops")
	private List<Alien> aliens = new ArrayList<>();
	
	public List<Alien> getAliens() {
		return aliens;
	}
	public void setAliens(List<Alien> aliens) {
		this.aliens = aliens;
	}
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
