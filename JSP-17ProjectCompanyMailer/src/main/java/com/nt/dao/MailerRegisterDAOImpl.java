package com.nt.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.model.MailerModel;

import jakarta.annotation.PostConstruct;

public class MailerRegisterDAOImpl implements IMailerDAO {
	private Connection con;
	private static final String REGISTER_USER="INSERT INTO company_mailer_user (NAME,EMAIL,PASSWORD,GENDER,DOB,ADDRESSLINE,CITY,STATE,COUNTRY,CONTACT,REGISTERDATE,AUTHORIZED) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	@Override
	public int registerUser(String NAME,String EMAIL,String PASSWORD,String GENDER,String DOB,String ADDRESSLINE,String CITY,String STATE,String COUNTRY,String CONTACT,String REGISTERDATE) throws SQLException, Exception {
		int count = 0;
		try(PreparedStatement ps = con.prepareStatement(REGISTER_USER)){
			Date date = Date.valueOf(DOB);
			Date rdate = Date.valueOf(REGISTERDATE);
			ps.setString(1, NAME);
			ps.setString(2, EMAIL);
			ps.setString(3, PASSWORD);
			ps.setString(4, GENDER);
			ps.setDate(5, date);
			ps.setString(6, ADDRESSLINE);
			ps.setString(7, CITY);
			ps.setString(8, STATE);
			ps.setString(9, COUNTRY);
			ps.setString(10, CONTACT);
			ps.setDate(11, rdate);
			ps.setString(12, "NO");
			count = ps.executeUpdate();
		}catch (Exception e) {
			throw e;
		}
		return count;
	}

	@Override
	public List<MailerModel> loginUser(String username,String password) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@PostConstruct
	public void init() throws Exception {
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mailer","root","root");
			}catch (Exception e) {
				throw e;
			}finally {
				if(con!=null) {
					try {
						con.close();
					}catch (Exception e) {
						throw e;
					}
				}
			}
	}
	public MailerRegisterDAOImpl() {
		
	}
}
