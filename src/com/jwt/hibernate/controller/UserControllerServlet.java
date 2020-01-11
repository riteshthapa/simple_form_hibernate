package com.jwt.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jwt.hibernate.dao.UserDAO;

public class UserControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String itemNumber = request.getParameter("itemNumber");
		String price = request.getParameter("price");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String method = request.getParameter("method");
		String cardNumber = request.getParameter("cardNumber");

		HttpSession session = request.getSession(true);
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(price, itemNumber, address,firstName, lastName, method, cardNumber);
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
