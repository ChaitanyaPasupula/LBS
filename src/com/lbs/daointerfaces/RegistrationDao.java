package com.lbs.daointerfaces;

import java.sql.SQLException;

import com.lbs.beans.Registration;

public interface RegistrationDao {
	public abstract String matchDetails(Registration registration)throws ClassNotFoundException,SQLException;
	 public int insertDetails(Registration register);
}
