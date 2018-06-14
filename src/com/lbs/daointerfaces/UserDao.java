package com.lbs.daointerfaces;

import java.sql.SQLException;

import com.lbs.beans.User;

public interface UserDao {
	   
		public abstract void labRelease() throws ClassNotFoundException , SQLException;
		
	    public abstract void labExtension() throws ClassNotFoundException , SQLException;
	    
	    
}
