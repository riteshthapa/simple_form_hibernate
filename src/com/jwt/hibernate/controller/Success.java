package com.jwt.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemNumber = request.getParameter("itemNumber");
		PrintWriter writer = response.getWriter();

		writer.println("<html>" + "<body bgcolor='#FDF5E6'>" + "<center>"
				+ "Ordered placed sucessfully!" + "</center>" + "</body>"
				+ "</html>");
	}

}

//	//handles HTTP POST request
//		public void doPost(HttpServletRequest request, HttpServletResponse response)
//				throws IOException {
//			String itemNumber = request.getParameter("itemNumber");
//			int itemNum = Integer.parseInt(itemNumber);
//			String price = request.getParameter("price");
//			String firstName = request.getParameter("firstName");
//			String lastName = request.getParameter("LastName");
//			String shippingAddress = request.getParameter("address");	
//			String creditCard = request.getParameter("method");
//			String cardNumber = request.getParameter("cardNumber");	
//			response.setContentType("text/html");
//			PrintWriter out = response.getWriter();
//			
//			String docType =
//					"<!DOCTYPE HTML>\n";
//					out.println(docType
//					+"<HTML>\n"
//					+"<HEAD>"
//					+ "<TITLE>Lab3</TITLE>"
//					
//					/*--css begins-- */
//					+ "<STYLE>"
//	                + "table, th, td { border-style: ridge; } "
//	                + "h1 { padding-left:500px; } "
//					+ "</STYLE>"
//					/*--css ends--*/
//					+ "</HEAD>\n" 
//					+ "<BODY BGCOLOR=\"#FDF5E6\"\">\n"
//					+ "<H1>&nbsp;&nbsp;&nbsp;&nbsp;Reading All Request Parameters</H1>\n");
//					
//					/*--table begins--*/
//					out.println("<table align=\"center\" width=\"300\"> "
//
//					+ "<tr>" 
//					+ "<th bgcolor=\"#FF9F33\"> Parameter Name </th>"
//					+ "<th bgcolor=\"#FF9F33\"> Parameter Value(s) </th>"
//					+ "</tr>"
//				
//					+ "<tr>"
//					+ "<td>itemNum</td>"
//					+ "<td>" + itemNum + "</td>"
//					+ "</tr>"
//					
//					+ "<tr>"
//					+ "<td>lastName</td>"
//					+ "<td>" + lastName + "</td>"
//					+ "</tr>"
//					
//					+ "<tr>"
//					+ "<td>price</td>"
//					+ "<td>" + price + "</td>"
//					+ "</tr>"
//					
//					+ "<tr>"
//					+ "<td>address</td>"
//					+ "<td>" + shippingAddress + "</td>"
//					+ "</tr>"		
//					
//					+ "<tr>"
//					+ "<td>firstName</td>"
//					+ "<td>" + firstName + "</td>"
//					+ "</tr>"
//					
//					+ "<tr>"
//					+ "<td>cardType</td>"
//					+ "<td>" + creditCard + "</td>"
//					+ "</tr>"
//					
//					+ "<tr>"
//					+ "<td>cardNum</td>"
//					+ "<td>" + cardNumber + "</td>"
//					+ "</tr>"
//					
//					+ "</table>");
//					/*--table ends--*/
//
//					out.print("</BODY>");
//					out.print("</HTML>");
//		
//		}
//	}