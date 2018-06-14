package com.lbs.services;

import java.sql.SQLException;
import java.util.List;


import com.lbs.beans.Lab;



import com.lbs.daoimplementations.LabDaoImplementation;


import com.lbs.daointerfaces.LabDao;


public  class LabService {
	public void addNewLab(Lab lab) throws ClassNotFoundException, SQLException{
		LabDao labDao= new LabDaoImplementation();
		labDao.addNewLab(lab);
		
	}
	 public void deactivateLAb(String labName) throws ClassNotFoundException, SQLException {
		LabDao labDao= new LabDaoImplementation();
		labDao.deactivateLAb(labName);

}
	 public  void labUpdate(int labId,String selectionAttribute,String selectionValue) throws ClassNotFoundException , SQLException{
		 LabDao labDao= new LabDaoImplementation();
			labDao.labUpdate(labId,selectionAttribute,selectionValue);
}
	 public List<Lab> getAllLabDetails() throws ClassNotFoundException, SQLException {
		 LabDao labDao= new LabDaoImplementation();
			return (labDao.getAllLabDetails());
	 }
	 public List getAllRequestDetails() throws ClassNotFoundException, SQLException{
		 LabDao labDao= new LabDaoImplementation();
			return (labDao.getAllRequestDetails());
	 }
	 public List getAllApprovalDetails() throws ClassNotFoundException, SQLException{
		 LabDao labDao= new LabDaoImplementation();
			return (labDao.getAllApprovalDetails());
	 }
}