package com.telusko.Demohib.inhe;

import javax.persistence.Entity;

@Entity
public class Laptop extends Computer
{
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

		
}
