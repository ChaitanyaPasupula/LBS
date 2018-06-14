package com.lbs.daoimplementations;

import com.lbs.beans.Approvals;
import com.lbs.beans.Lab;
import com.lbs.beans.LabOperations;

import com.lbs.daointerfaces.LabDao;
import com.lbs.utilities.DatabaseConnectivityUtility;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author techm
 */
public  class LabDaoImplementation implements LabDao {
      

    public void addNewLab(Lab lab) throws ClassNotFoundException, SQLException {
    	Connection con = DatabaseConnectivityUtility.getConnection();
		 PreparedStatement pstmt=null;
		 String labId=lab.getLabId();
		 String labName=lab.getLabName();
		 String location=lab.getLocation();
		 String capacity=lab.getCapacity();
		 String status=lab.getStatus();
		 pstmt=con.prepareStatement("insert into lab values(?,?,?,?,?)");
		 pstmt.setString(1,labId );
		 pstmt.setString(2, labName);
		 pstmt.setString(3, location);
		 pstmt.setString(4, capacity);
		 pstmt.setString(5, status);
		 pstmt.executeUpdate();
		 DatabaseConnectivityUtility.closeConnection(con);
    }

   
   
    public List<Lab> getAllLabDetails() throws ClassNotFoundException, SQLException {
         List<Lab> LabList = new ArrayList<Lab>( );
        Connection con = DatabaseConnectivityUtility.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from lab");
        Lab vallabhi = null;
         while(rs.next()){
            vallabhi = new Lab();
            vallabhi.setLabId(rs.getString("LABID"));
            vallabhi.setLabName(rs.getString("LABNAME"));
            vallabhi.setLocation(rs.getString("LOCATION"));
            vallabhi.setCapacity(rs.getString("CAPACITY"));
            vallabhi.setStatus(rs.getString("STATUS"));
            LabList.add(vallabhi);
        }
          DatabaseConnectivityUtility.closeConnection(con);
         
        return LabList;
    }

	
	@Override
	public void labUpdate(int labId,String selectionAttribute,String selectionValue) throws ClassNotFoundException, SQLException {

    	Connection con = DatabaseConnectivityUtility.getConnection();
		 PreparedStatement pstmt=null;
		 if(selectionAttribute.equalsIgnoreCase("capacity")){
			 
				pstmt= con.prepareStatement("update lab set capacity=? where labid=labId");
			   
				pstmt.setString(1,selectionValue);
				pstmt.executeUpdate();
    }
		 else if(selectionAttribute.equalsIgnoreCase("labname")){
			 
				pstmt= con.prepareStatement("update lab set labname=? where labid=labId");
			   
				pstmt.setString(1,selectionValue);
				pstmt.executeUpdate();
		 }
		 else if(selectionAttribute.equalsIgnoreCase("LAB ID")){
			 
				pstmt= con.prepareStatement("update lab set LABID=? where labid=labId");
			   
				pstmt.setString(1,selectionValue);
				pstmt.executeUpdate();
		 }
		 DatabaseConnectivityUtility.closeConnection(con);
			
		
	}

	@Override
	public void deactivateLAb(String labName) throws ClassNotFoundException, SQLException {

		Connection con = DatabaseConnectivityUtility.getConnection();
		 PreparedStatement pst= con.prepareStatement("delete from lab where LABNAME= ? ");
		 pst.setString(1,labName);
		pst.executeUpdate();
		
		
		 DatabaseConnectivityUtility.closeConnection(con);
		
	}



 



	@Override
	public List getAllRequestDetails() throws ClassNotFoundException,
			SQLException {
		   List LabreqList = new ArrayList( );
	        Connection con = DatabaseConnectivityUtility.getConnection();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from laboperations");
	        LabOperations vallabhi = null;
	         while(rs.next()){
	            vallabhi = new LabOperations();
	            vallabhi.setDateOfRelease(rs.getString("DATEOFRELEASE"));
	            vallabhi.setDateOfRequest(rs.getString("DATEOFREQUEST"));
	            vallabhi.setuserId(rs.getString("USERID"));
	            vallabhi.setLabCapacity(rs.getString("CAPACITY"));
	            vallabhi.setLabLocation(rs.getString("LOCATION"));
	            LabreqList.add(vallabhi);
	        }
	          DatabaseConnectivityUtility.closeConnection(con);
	         
	        return LabreqList;
	}



	@Override
	public List getAllApprovalDetails() throws ClassNotFoundException,
			SQLException {
		 List LabApprList = new ArrayList( );
	        Connection con = DatabaseConnectivityUtility.getConnection();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from Approvals");
	        Approvals vallabhi = null;
	         while(rs.next()){
	            vallabhi = new Approvals();
	           vallabhi.setLabId(rs.getString("LABID"));
	           vallabhi.setLabName(rs.getString("LABNAME"));
	           vallabhi.setLocation(rs.getString("LOCATION"));
	           vallabhi.setUserId(rs.getString("USERID"));
	            LabApprList.add(vallabhi);
	        }
	          DatabaseConnectivityUtility.closeConnection(con);
	         System.out.println(vallabhi.getUserId());
	        return LabApprList;
		
	}

	
    
}

