package com.lbs.daoimplementations;
import com.lbs.beans.Login;
import com.lbs.daointerfaces.LoginDao;
import com.lbs.utilities.DatabaseConnectivityUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginDaoImplementation implements LoginDao {
	 Connection con=null;
     public String matchDetails(Login Login){

      int status=0;
      String userName = Login.getUserName();
      String password = Login.getPassword();
      String role="";
      

     

     try{

          con=DatabaseConnectivityUtility.getConnection();
          PreparedStatement ps=con.prepareStatement("Select * from USERS where USERNAME =? and PASSWORD=?");
          ps.setString(1,Login.getUserName());
          ps.setString(2, Login.getPassword());
        //  ps.setString(5, Login.getRole());
          ResultSet rs= ps.executeQuery();
              
          
          if(rs.next()){
              role=rs.getString(3);
             System.out.println(rs.getString(3));
          }
          else{
              role = "invalid";
          }
         
      }
     
          
       
      catch(Exception e){
      e.printStackTrace();

      }
     return role;
}
}
