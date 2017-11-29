package com.telusko.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.telusko.model.Alien;

public class AlienDAO 
{
	String url = "jdbc:mysql://localhost:3306/datajava";
	String username = "root";
	String password = "root";
	Connection con;
	
	public AlienDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public Alien getAlien(int aid)
	{
		
		String sql = "select * from alien where aid="+aid;
		
		Alien a = new Alien();
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return a;
	}

	public void save(Alien a) {
		
		try {
			String sql = "insert into alien  values (?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a.getAid());
			st.setString(2, a.getAname());
			st.setString(3, a.getTech());
			
			int i = st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public List<Alien> getAliens() {
		
		List<Alien> aliens = new ArrayList<>();
		
		try
		{
			String sql = "select * from alien";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				Alien a = new Alien();
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
				
				aliens.add(a);
				
			}
		}
		catch(Exception e){e.printStackTrace();}
		
		return aliens;
		
		
	}
}









