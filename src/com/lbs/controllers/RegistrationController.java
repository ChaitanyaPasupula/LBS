package com.lbs.controllers;

import javax.servlet.http.HttpServlet;




import com.lbs.beans.Registration;
import com.lbs.services.LoginService;
import com.lbs.services.RegistrationService;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RegistrationController extends HttpServlet {

	 public void init( ){
	        // no code
	    }
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 int insertResult=0;
		         String userName = request.getParameter("user");
			      String password = request.getParameter("pass");
			     String role = request.getParameter("role");
			     String userId = request.getParameter("userid");
			     
			     
			     Registration registration=new Registration();
				
			     registration.setUserId(userId);
					registration.setPassword(password);
					registration.setUserName(userName);
					registration.setRole(role);
				 
					RegistrationService registrationService=new RegistrationService();
					try{
						 insertResult=registrationService.getAllCustomerDetails(registration);
						
					       }
					       catch(ClassNotFoundException ce ){
					           ce.printStackTrace();
					           // append message to log file
					       }
					       catch(SQLException se){
					           se.printStackTrace( );
					           // append message to log file
					       }
					    if(insertResult==1){
						request.setAttribute("result1",insertResult);
					       RequestDispatcher rd = request.getRequestDispatcher("registered.html");
					       rd.forward(request, response);

					    }
					    else{
					    	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
						       rd.forward(request, response);

					    }
					
	 }
}
