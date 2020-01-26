package com.google.appengine;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class top10wines
 */
@WebServlet("/top10wines")
public class Top10Wines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Top10Wines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
	  	response.getWriter().println("<html>\r\n" + 
	  			"<head>\r\n" + 
	  			"	<title>CA675-G10</title>\r\n" + 
	  			"	<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n" + 
	  			"</head>\r\n" + 
	  			"	\r\n" + 
	  			"<body>\r\n" + 
	  			"	<header>\r\n" + 
	  			"		<div class=\"main\">\r\n" + 
	  			"			<ul>\r\n" + 
	  			"				<li><a href=\"index.html\">Home</a></li>\r\n" + 
	  			"				<li><a href=\"About Project.html\">About Project</a></li>\r\n" + 
	  			"				<li><a href=\"Contact Us.html\">Contact Us</a></li>\r\n" + 
	  			"			</ul>\r\n" + 
	  			"		</div>\r\n" + 
	  			"		<div class=\"title\">\r\n" + 
	  			"			<h1>Top 10 Wines Sold in United States</h1>\r\n" + 
	  			"		</div>\r\n" + 
				"<div class=\"container\">\r\n" + 
				"			<div class=\"input-group\">\r\n" + 
				"				<form action=\"SearchEngine\" method=\"GET\">\r\n" + 
				"					<input type=\"text\" class=\"form-control\"\r\n" + 
				"						placeholder=\"Search Your Wine..\" name=\"search\">\r\n" + 
				"					<div class=\"input-group-btn\">\r\n" + 
				"						<button class=\"btn btn-default\" type=\"submit\">Search</button>\r\n" + 
				"					</div>\r\n" + 
				"				</form>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" +
	  			"	</header>\r\n" + 
	  			"	<table>");
//	  	response.getWriter().println("This is Palash123");
		  try 
		  {
			  ConnectionSQL runSQL = new ConnectionSQL();
			  Connection con = runSQL.checkConneciton();
			  Statement stmt = con.createStatement();
			  
			  ResultSet rs = stmt.executeQuery("SELECT variety,country,description,price FROM wine1 WHERE country = 'US' AND variety!='' ORDER BY points DESC LIMIT 10");
//			  response.getWriter().println("<table border=1 width=10% height=10%>");  
			  response.getWriter().println("<table>");
			  response.getWriter().println("<tr><th>Name</th><th>Country</th><th>Description</th><th>Price</th></tr>");
//name country, points price
			  while(rs.next()) {
				  
				  String a = rs.getString("variety");
				  String b = rs.getString("country");
				  String c = rs.getString("description");
				  String d = rs.getString("price");
				  
				  response.getWriter().println("<tr><td>" + a + "</td><td>"+ b +"</td><td>"+ c +"</td><td>"+ d +"</td></tr>");
			  }
			  response.getWriter().println("</table>");
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  response.getWriter().println("</html></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
