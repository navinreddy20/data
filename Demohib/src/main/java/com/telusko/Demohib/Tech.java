package com.telusko.Demohib;

import javax.persistence.Embeddable;

@Embeddable
public class Tech 
{
	private String tname;
	private int exp;
	private int level;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Tech [tname=" + tname + ", exp=" + exp + ", level=" + level + "]";
	}
	
	
}
