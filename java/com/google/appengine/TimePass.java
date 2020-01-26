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
 * Servlet implementation class TimePass
 */
@WebServlet("/TimePass")
public class TimePass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimePass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String nextJSP = "timepass.jsp";
//		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//		dispatcher.forward(request,response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
	  	response.getWriter().println("<html><body>");
	  	
//	  	String instanceName = "ethereal-zodiac-257014:us-central1:cloud-assign2";
//	  	String databaseName = "cloudassign2";
	  	response.getWriter().println("This is Palash123");
//	  	String IP_OF_INSTANCE = "35.239.192.227";
//	  	String username = "root";
//		String password = "root";
		  try 
		  {
//			  Class.forName("com.mysql.jdbc.GoogleDriver");
//			  String jdbcURL = "jdbc:mysql://google/cloudassign2?cloudSqlInstance=ethereal-zodiac-257014:us-central1:cloud-assign2&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false&user=root&password=root";
//			  Connection con = DriverManager.getConnection(jdbcURL);
//			  Statement smt = con.createStatement();
//			  ResultSet rs = smt.executeQuery("select country from winereview");
			  
			  ConnectionSQL runSQL = new ConnectionSQL();
			  Connection con = runSQL.checkConneciton();
			  Statement stmt = con.createStatement();
			  
			  ResultSet rs = stmt.executeQuery("SELECT variety, points, country FROM wine WHERE variety LIKE '%cab%' AND country LIKE '%us%'");
//			  response.getWriter().println(rs);
			  response.getWriter().println("<table border=1 width=10% height=10%>");  
			  response.getWriter().println("<tr> <th>Variety</th> <th>Points</th> <th>Country</th></tr>");
			  response.getWriter().println("<table>");
//			  System.err.println(rs);

			  while(rs.next()) {
				  String n = rs.getString("variety");
				  String p = rs.getString("points");
				  String c = rs.getString("country");
				  response.getWriter().println("<tr><td>" + n + "</td><td>"+ p +"</td><td>" + c + "</td></tr>");
			  }
			  response.getWriter().println("</table>");
//			  response.getWriter().println("</html></body>");
//			 con.close();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  response.getWriter().println("</html></body>");
//	    response.setContentType("text/plain");
//	    response.setCharacterEncoding("UTF-8");
	//
//	    response.getWriter().print("Hello App Engine Palash!\r\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
