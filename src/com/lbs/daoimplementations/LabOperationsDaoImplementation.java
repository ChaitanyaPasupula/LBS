package com.lbs.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lbs.beans.Approvals;
import com.lbs.beans.LabOperations;
import com.lbs.daointerfaces.LabOperationsDao;

import com.lbs.utilities.DatabaseConnectivityUtility;

public class LabOperationsDaoImplementation implements LabOperationsDao {
	Connection con=null;
	  ResultSet rs=null;
	  ResultSet rs1=null;
	  ResultSet rs2=null;
	  
	@Override
	public String labStatus() throws ClassNotFoundException, SQLException {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public String labDetails(LabOperations operations) {
		// TODO Auto-generated method stub
		return "";
	}
	@Override
	public String LabRequestDetails(LabOperations operations)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		  String status="";
          
	        try{
	           
	            con = DatabaseConnectivityUtility.getConnection();
	            System.out.println(con==null);
	            
	          
	        
	        	  
	            PreparedStatement ps=con.prepareStatement("insert into laboperations values(?,?,?,?,?)");
	            ps.setString(1,operations.getDateOfRequest());
	            ps.setString(2,operations.getDateOfRelease());
	            ps.setString(3,operations.getUserId());
	            ps.setString(4,operations.getLabCapacity());
	            ps.setString(5,operations.getLabLocation());
	         ps.executeUpdate();
	           	            
		       
		        
	        }catch(Exception e){
	            e.printStackTrace();
	            
	        }
	        
	       
	  
	        return status;
		
	}


	@Override
	public String labAllocation(LabOperations operations , Approvals approval)
			throws ClassNotFoundException, SQLException {
		
		

        try{
           
            con = DatabaseConnectivityUtility.getConnection();
            System.out.println(con==null);
            
      
       
            PreparedStatement ps=con.prepareStatement("select * from lab where LABID=?");
            ps.setString(1, operations.getLabId());
            rs=ps.executeQuery();
            
         while(rs.next()){
        	 
        	 operations.setLabStatus(rs.getString("STATUS"));
        	 if(operations.getLabStatus()=="GREEN"){
          	   operations.setLabStatus("RED");
             }
         }
           
           
         
           PreparedStatement pst=con.prepareStatement("update lab set STATUS = ?  where LABID = ? ");
           pst.setString(1, "RED");
           pst.setString(2, operations.getLabId());
         pst.executeUpdate();
           
           
           PreparedStatement pss=con.prepareStatement("select * from lab where LABID=?");
           pss.setString(1, operations.getLabId());
           
           rs1= pss.executeQuery();
        
      
          
           while(rs1.next()){
        	   
        	   approval.setLabId(rs1.getString("LABID"));
        	   approval.setLabName(rs1.getString("LABNAME"));
        	   approval.setLocation(rs1.getString("LOCATION"));
        	   approval.setUserId(operations.getUserId());
           }
           
        System.out.println(approval.getLabId());
           PreparedStatement psss=con.prepareStatement("insert into APPROVALS(LABID,LOCATION,USERID,LABNAME) values(?,?,?,?)");
           psss.setString(1,approval.getLabId());
           psss.setString(2,approval.getLocation());
           psss.setString(3,approval.getUserId());
           psss.setString(4, approval.getLabName());
          
         psss.executeUpdate();
           
         PreparedStatement psv=con.prepareStatement("delete from laboperations where userid= ? ");
          psv.setString(1,approval.getUserId());
           	            
	       psv.executeUpdate();
	        
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
		
		
		
		
		return null;
	}


	@Override
	public String labRelease(LabOperations operations, Approvals approval)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
