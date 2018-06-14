package com.lbs.controllers;
import com.lbs.beans.Login;
import com.lbs.services.LoginService;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginController  extends HttpServlet{
	  public void init( ){
		        // no code
		    }
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
	         String userName = request.getParameter("username");
		   
		     String password = request.getParameter("password");
		  // System.out.println(userName);
	              String role = "";
	              Login login = new  Login();
		 login.setUserName(userName);
		 login.setPassword(password);
	         
	         LoginService loginservice=new LoginService();
	        // System.out.println(role);
		 try{
		 role=loginservice.LoginDetails(login);
		 	 
	} catch(ClassNotFoundException ce){
	}
	catch(SQLException se){
	}
	System.out.println(role);
	if( role.equalsIgnoreCase("OTH")){
		//out.println("");
	    HttpSession session = request.getSession();
	    session.setAttribute("userName",userName);
	    
	    RequestDispatcher rd = request.getRequestDispatcher("OTH.jsp");
	    rd.forward(request, response);

	}


	if( role.equalsIgnoreCase("LO")){
	    HttpSession session = request.getSession();
	    session.setAttribute("userName", userName);
	   
	   RequestDispatcher rd = request.getRequestDispatcher("newjsp.jsp");
	   rd.forward(request, response);
	}

	if( role.equalsIgnoreCase("OTM")){
	    HttpSession session = request.getSession();
	    session.setAttribute("userName", userName);
	   
	   RequestDispatcher rd = request.getRequestDispatcher("OTM.jsp");
	   rd.forward(request, response);
	}

	if( role.equalsIgnoreCase("invalid")){
	  
	    RequestDispatcher rd = request.getRequestDispatcher("invalid.jsp");
	    rd.forward(request, response);

	}
	}

	public void destory( ){
	// no code
	}

	   
}
