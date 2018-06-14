package com.lbs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.lbs.services.LabService;

public class LabUpdateController extends HttpServlet {
	public void init( ){
        // no code
    }
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		 
		 int labId =Integer.parseInt(request.getParameter("labId")) ;
	     String selectionAttribute = request.getParameter("selectionAttribute");
	    
	     String selectionValue = request.getParameter("selectionValue");
	     
	    LabService labService =new LabService();
	     
	     try{
		     labService.labUpdate(labId,selectionAttribute,selectionValue);
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		     
		   //  RequestDispatcher rd = request.getRequestDispatcher("");
	        // rd.forward(request, response);
	 }

}


