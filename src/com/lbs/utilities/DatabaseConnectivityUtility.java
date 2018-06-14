package com.lbs.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivityUtility {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
       
       Connection con=null;
       try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@hstslc015:1521:elp","elp1686","msat123$");
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           //con =DriverManager.getConnection("jdbc:odbc:emp");
       }
       catch(Exception e){
           e.printStackTrace();
       }
        return con;
       
   }

    public static void closeConnection(Connection con) throws SQLException {
       con.close();
    }
}
