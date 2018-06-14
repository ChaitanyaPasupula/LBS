package com.lbs.services;

import java.sql.SQLException;

import com.lbs.beans.Approvals;
import com.lbs.beans.LabOperations;
import com.lbs.beans.Registration;
import com.lbs.beans.User;
import com.lbs.daoimplementations.LabOperationsDaoImplementation;
import com.lbs.daoimplementations.RegistrationDaoImplementation;
import com.lbs.daointerfaces.LabOperationsDao;
import com.lbs.daointerfaces.RegistrationDao;



public class LabOperationsService {
	
	public  String labStatus(LabOperations operations) throws ClassNotFoundException , SQLException {
	LabOperationsDao labOperationsDao =new LabOperationsDaoImplementation();
	return labOperationsDao.labDetails(operations);
		
	
	}

	public String labDetails(LabOperations operations) throws ClassNotFoundException , SQLException{
		LabOperationsDao labOperationsDao =new LabOperationsDaoImplementation();
		return labOperationsDao.LabRequestDetails(operations);
	}
	
	public String labAllocation(LabOperations operations, Approvals approval) throws ClassNotFoundException , SQLException{
		LabOperationsDao labOperationsDao =new LabOperationsDaoImplementation();
		return labOperationsDao.labAllocation(operations , approval);
	}

}
