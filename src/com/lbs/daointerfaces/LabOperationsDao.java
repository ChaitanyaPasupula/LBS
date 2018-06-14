package com.lbs.daointerfaces;
import java.sql.SQLException;
import com.lbs.beans.Approvals;
import com.lbs.beans.LabOperations;


public interface LabOperationsDao {
	public  String labStatus() throws ClassNotFoundException , SQLException;
	public String LabRequestDetails(LabOperations operations)throws ClassNotFoundException , SQLException;
	public String labDetails(LabOperations operations)throws ClassNotFoundException , SQLException;
	public String labAllocation(LabOperations operations,Approvals approval)throws ClassNotFoundException , SQLException;
	public String labRelease(LabOperations operations,Approvals approval)throws ClassNotFoundException , SQLException;
}
