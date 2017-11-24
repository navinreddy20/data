package com.telusko.dao;

import com.telusko.model.Alien;

public class AlienDAO 
{
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		a.setAid(aid);
		a.setAname("Suman");
		a.setTech("Android");
		return a;
	}
}
