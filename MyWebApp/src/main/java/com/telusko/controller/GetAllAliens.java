package com.telusko.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.dao.AlienDAO;
import com.telusko.model.Alien;

public class GetAllAliens extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		AlienDAO dao = new AlienDAO();
		List<Alien> aliens = dao.getAliens();
		
		request.setAttribute("aliens", aliens);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("showAllAliens.jsp");
		rd.forward(request, response);
		
	}

	
}
