package com.lbs.daointerfaces;
import com.lbs.beans.Lab;
import java.sql.SQLException;
import java.util.List;
public interface LabDao {
	 public abstract void  addNewLab(Lab lab )throws ClassNotFoundException , SQLException;
		public abstract void  deactivateLAb(String labName )throws ClassNotFoundException , SQLException;
		public abstract void labUpdate(int labId,String selectionAttribute,String selectionValue) throws ClassNotFoundException , SQLException;
		public abstract List getAllLabDetails()throws ClassNotFoundException , SQLException;
		public abstract List getAllRequestDetails()throws ClassNotFoundException , SQLException;
		public abstract List getAllApprovalDetails()throws ClassNotFoundException , SQLException;
}
