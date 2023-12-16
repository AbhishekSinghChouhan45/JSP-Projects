package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.MailerModel;

public interface IMailerDAO {
	public int registerUser(String NAME,String EMAIL,String PASSWORD,String GENDER,String DOB,String ADDRESSLINE,String CITY,String STATE,String COUNTRY,String CONTACT,String REGISTERDATE)throws SQLException,Exception;
	public List<MailerModel> loginUser(String username,String password)throws SQLException,Exception;
	
}
