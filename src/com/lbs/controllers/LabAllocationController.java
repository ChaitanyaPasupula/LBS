package com.lbs.controllers;

import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbs.beans.Approvals;
import com.lbs.beans.LabOperations;
import com.lbs.services.LabOperationsService;

public class LabAllocationController extends HttpServlet {
	public void init( ){
        // no code
    }
 public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
	 String insertResult= " " ;
	      
		     String userId = request.getParameter("userid");
		     String labId = request.getParameter("labid");
	         String location = request.getParameter("location");
		     LabOperations operations=new LabOperations();
			operations.setLabId(labId);
		    operations.setuserId(userId);
		    operations.setLabLocation(location);
			 
		    Approvals approval = new Approvals();
		    
		     LabOperationsService labOperationsService=new LabOperationsService();
				try{
					 insertResult = labOperationsService.labAllocation(operations,approval);
//					 RequestDispatcher rd = request.getRequestDispatcher("OTM");
//				       rd.forward(request, response);
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
