package com.lbs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lbs.services.LabService;

public class DeactivateLabController extends HttpServlet{
	public void init( ){
        // no code
    }
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		 
		 String labName = request.getParameter("labname");
	    
		 LabService labService =new LabService();
		 
		 try{
		     labService.deactivateLAb(labName);
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		     
		    // RequestDispatcher rd = request.getRequestDispatcher("");
	        // rd.forward(request, response);
		 
		 
	 }
}



