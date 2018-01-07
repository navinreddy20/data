package com.telusko.Demohib.inhe;

import javax.persistence.Entity;

@Entity
public class Desktop extends Computer
{
	private int screen;

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}
	
}
