package com.lbs.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lbs.beans.Registration;
import com.lbs.daointerfaces.RegistrationDao;
import com.lbs.utilities.*;


public class RegistrationDaoImplementation implements RegistrationDao {
	Connection con=null;
	  ResultSet rs=null;
	  public int insertDetails(Registration register){
	        int status=0;
	             
	        try{
	           
	            con = DatabaseConnectivityUtility.getConnection();
	            System.out.println(con==null);
	            PreparedStatement pst = con.prepareStatement("select * from users where userid=?");
	            pst.setString(1, register.getUserId());
	            rs=pst.executeQuery();
	            if(rs.next())
	             {
	             status=0;
	             }
	            else
	            {
	              status=1;
	            }
	           if(status==1)
	           {
	        	  
	            PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?)");
	            
	          
	            
	            ps.setString(1,register.getUserId());
	            ps.setString(2,register.getUserName());
	            ps.setString(3,register.getRole());
	            ps.setString(4,register.getPassword());
	            int stat=ps.executeUpdate();
//	           
////	            int stat=ps.executeUpdate();
////	            //System.out.println("stat"+stat);
////	           PreparedStatement ps1=con.prepareStatement("insert into customerlogin values(?,?,?)");
////	            ps1.setString(1,register.getUserId());
////	            ps1.setString(2,register.getPassword());
////	            ps1.setString(3,"CUSTOMER");
////	              
////	            
////	            int s=ps1.executeUpdate();
////	           // System.out.println("====================");
////	             //System.out.println("s"+s);
	             }
	            
	       
	        
	        }catch(Exception e){
	            e.printStackTrace();
	            
	        }
	        
	       
	  
	        return status;
	     }
	@Override
	public String matchDetails(Registration registration)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
