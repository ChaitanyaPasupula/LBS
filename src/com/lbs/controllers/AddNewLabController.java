package com.lbs.controllers;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.lbs.beans.Lab;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lbs.services.LabService;

public class AddNewLabController extends HttpServlet {
	public void init( ){
        // no code
    }
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws ServletException, IOException {
		 
	
	   String LabId = request.getParameter("labid");
	   String LabName =request.getParameter("labname");
	   String Location =request.getParameter("location");
	   String Capacity =request.getParameter("capacity");
	   String Status=request.getParameter("status");
	     Lab lab = new Lab();
	     
	     lab.setLabId(LabId);
	     lab.setLabName(LabName);
	     lab.setLocation(Location);
	     lab.setCapacity(Capacity);
	     lab.setStatus(Status);
	     
	     LabService labService =new LabService();
	     
	     try{
	     labService.addNewLab(lab);
	     }
	     
	     catch(ClassNotFoundException ce){
	             ce.printStackTrace();
	     }
	     
	     catch(SQLException se){
	            se.printStackTrace( );
	     }
	     
	     //RequestDispatcher rd = request.getRequestDispatcher("");
        // rd.forward(request, response);
	 }

}



