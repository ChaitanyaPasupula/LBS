package com.lbs.services;
import com.lbs.daoimplementations.LoginDaoImplementation;
import com.lbs.daointerfaces.LoginDao;
import java.sql.SQLException;
import com.lbs.beans.Login;
public class LoginService {
	public String LoginDetails(Login login) throws ClassNotFoundException,SQLException{
		
		
		LoginDao loginService = new LoginDaoImplementation();
	        
		return loginService.matchDetails(login);
		} 
}
