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
 * Servlet implementation class MostExpensiveWine
 */
@WebServlet("/MostExpensiveWine")
public class MostExpensiveWine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostExpensiveWine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
	  	response.getWriter().println("<html>\r\n" + 
	  			"<head>\r\n" + 
	  			"	<title>CA675-G10</title>\r\n" + 
	  			"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
	  			"	\r\n" + 
	  			"	<link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n" + 
	  			"	\r\n" + 
	  			"	<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n" + 
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
	  			"			<h1>Most Expensive Wines</h1>\r\n" + 
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
	  			"	</header>");
	  	
//	  	response.getWriter().println("This is Palash123");
		  try 
		  {
			  ConnectionSQL runSQL = new ConnectionSQL();
			  Connection con = runSQL.checkConneciton();
			  Statement stmt = con.createStatement();
			  
			  ResultSet rs = stmt.executeQuery("SELECT variety,price,country,winery FROM wine1 WHERE country = 'US' ORDER BY price DESC LIMIT 20");
			  response.getWriter().println("<table>");  
			  response.getWriter().println("<tr> <th>Variety</th> <th>Country</th> <th>Price</th> <th>Winery</th></tr>");
			  while(rs.next()) {
				  String a = rs.getString("variety");
				  String b = rs.getString("country");
				  String c = rs.getString("price");
				  String d = rs.getString("winery");
				  response.getWriter().println("<tr><td>" + a + "</td><td>"+ b +"</td><td>" + c + "</td><td>" + d + "</td></tr>");
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
