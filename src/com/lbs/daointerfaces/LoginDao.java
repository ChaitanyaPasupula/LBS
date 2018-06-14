package com.lbs.daointerfaces;

import java.sql.SQLException;

import com.lbs.beans.Login;

public interface LoginDao {
	public abstract String matchDetails(Login login)throws ClassNotFoundException,SQLException;
}
