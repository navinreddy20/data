package com.telusko.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.dao.AlienDAO;
import com.telusko.model.Alien;

@WebServlet("/alien")
public class GetAlien extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid  = Integer.parseInt(request.getParameter("aid"));
		
		AlienDAO dao = new AlienDAO();
		
		Alien alien = dao.getAlien(aid);
		request.setAttribute("alien", alien);
		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		
		rd.forward(request, response);
		
		
	}

}
