package com.lbs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbs.beans.LabOperations;
import com.lbs.beans.Registration;
import com.lbs.services.LabOperationsService;



public class LabRequestController extends HttpServlet {
	public void init( ){
        // no code
    }
 public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
	 String insertResult= " " ;
	         int temp =1;
		     String dateOfRelease = request.getParameter("requestdate");
		     String dateOfRequest = request.getParameter("releasedate");
		      String userId = request.getParameter("userid");
		     String labLocation = request.getParameter("location");
		    String labCapacity = request.getParameter("capacity");
		     
		     
		     
		     LabOperations operations=new LabOperations();
			
		     operations.setuserId(userId);
		     operations.setDateOfRelease(dateOfRelease);
		     operations.setDateOfRequest(dateOfRequest);
		     operations.setLabCapacity(labCapacity);
		     operations.setLabLocation(labLocation);
			 
		     LabOperationsService labOperationsService=new LabOperationsService();
				try{
					 insertResult = labOperationsService.labDetails(operations);
					 RequestDispatcher rd = request.getRequestDispatcher("requested.jsp");
				       rd.forward(request, response);
				       }
				       catch(ClassNotFoundException ce ){
				           ce.printStackTrace();
				           // append message to log file
				       }
				       catch(SQLException se){
				           se.printStackTrace( );
				           // append message to log file
//				       }
//				    if(insertResult==1){
//					request.setAttribute("result1",insertResult);
//				       RequestDispatcher rd = request.getRequestDispatcher("registered.html");
//				       rd.forward(request, response);
//
//				    }
//				    else{
//				    	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//					       rd.forward(request, response);
//
//				    }
//				
 
				        
}

}
}

