package com.telusko.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.dao.AlienDAO;
import com.telusko.model.Alien;

@WebServlet("/newAlien")
public class AddAlien extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		String tech = request.getParameter("tech");
		
		Alien a = new Alien();
		a.setAid(aid);
		a.setAname(aname);
		a.setTech(tech);
		
		AlienDAO dao = new AlienDAO();
		dao.save(a);
		
	}

}
