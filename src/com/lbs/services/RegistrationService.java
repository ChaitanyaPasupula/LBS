package com.lbs.services;


	
import com.lbs.beans.Registration;

import com.lbs.daoimplementations.RegistrationDaoImplementation;
import com.lbs.daointerfaces.RegistrationDao;
import java.sql.SQLException;
	public class RegistrationService {
	
	
		 public int getAllCustomerDetails(Registration registration ) throws ClassNotFoundException, SQLException{
		        RegistrationDao registrationDao =new RegistrationDaoImplementation();
		        return registrationDao.insertDetails(registration);
		    }

		
		
	
}
