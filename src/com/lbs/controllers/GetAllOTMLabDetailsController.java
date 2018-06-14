package com.lbs.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbs.services.LabService;

public class GetAllOTMLabDetailsController extends HttpServlet {
	public void init( ){
        // no code
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		
		 LabService labService =new LabService();
		 
		 List list= new ArrayList();
		 
		 try{
		     list =labService.getAllLabDetails();
		     
		     
		     }
		     
		     catch(ClassNotFoundException ce){
		             ce.printStackTrace();
		     }
		     
		     catch(SQLException se){
		            se.printStackTrace( );
		     }
		 
		 request.setAttribute("labDetails", list);
		     
		    RequestDispatcher rd = request.getRequestDispatcher("OTM.jsp");
		     
	        rd.forward(request, response);
		 
		 
	 


	}
}
