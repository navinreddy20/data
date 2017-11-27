package com.telusko.dao;

import java.sql.*;


import com.telusko.model.Alien;

public class AlienDAO 
{
	String url = "jdbc:mysql://localhost:3306/datajava";
	String username = "root";
	String password = "0";
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
			Statement st = con.createStatement();
			
			String sql = "insert into alien values (" + a.getAid() + ",'" + a.getAname() + "','" + a.getTech() + "')";
			st.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
