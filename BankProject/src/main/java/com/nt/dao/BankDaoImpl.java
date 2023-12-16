package com.nt.dao;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import com.nt.model.Customers;

import oracle.jdbc.proxy.annotation.GetCreator;
import oracle.sql.TIMESTAMP;

public class BankDaoImpl implements IBankDao {
	private final String saveDate ="INSERT INTO RBIBANK(NAME,USERNAME,PASSWORD,DOB,TYPE,GENDER,PHONENUMBER,ADDRESS,BALANCE,IDENTITY,AGE,CREATIONDATE,LASTUPDATE) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	@Override
	public Connection getCon() throws  Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		try{
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
				if(con!=null) {
					return con;
				}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Customers> getData() throws Exception {
		System.out.println("------------getData()---------");
		List<Customers> customers = new ArrayList<Customers>();
			Class.forName("oracle.jdbc.driver.OracleDriver");	
		try(Connection con = getCon();
			  PreparedStatement ps = con.prepareStatement("SELECT * FROM RBIBANK");
			  ResultSet rs =ps.executeQuery();){
			while(rs.next()!=false) {
				Customers c = new Customers();
				c.setCId(rs.getInt("ID"));
				c.setCName(rs.getString("NAME"));
				c.setCUsername(rs.getString("USERNAME"));
				c.setCAddress(rs.getString("ADDRESS"));
				c.setCDob(rs.getDate("DOB"));
				c.setCNumber(rs.getLong("PHONENUMBER"));
				c.setCType(rs.getString("TYPE"));
				c.setCBalance(rs.getDouble("BALANCE"));
				c.setCGender(rs.getString("GENDER"));
				c.setCAge(rs.getInt("AGE"));
				c.setCreationDate(rs.getTimestamp("CREATIONDATE"));
				customers.add(c);
			}
		}catch (Exception e) {
			System.out.println("E in GD "+e.getMessage());
		}
		System.out.println("BankDaoImpl.getData() "+customers.size());
		return customers;
	}

	@Override
	public int saveCustomer(Customers customer)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");){
				Date dob = customer.getCDob();
				int age = LocalDate.now().getYear() - dob.toLocalDate().getYear();
				LocalDateTime creationDate = LocalDateTime.now();
				LocalDateTime lastUpdation = LocalDateTime.now();
				List<Customers> list = getData();
				for(Customers c:list) {
					if(c.getCUsername().equals(customer.getCUsername())){
						return 3;
					}
				}
				
				  String image =
				  "C://Users//Jarvis//Desktop//indian-bollywood-actor-salman-khan-has-a-cup-of-coffee-during-a-break-from-shooting-an-action.jpeg";
				 
				System.out.println(customer.getCIdentity());
				InputStream ls = new FileInputStream(image);
				byte [] photoData = new byte[ls.available()];
				photoData = ls.readAllBytes();
				try(PreparedStatement ps = con.prepareStatement(saveDate);){
					ps.setString(1, customer.getCName());
					ps.setString(2, customer.getCUsername());
					ps.setString(3, customer.getCPassword());
					ps.setDate(4, dob);
					ps.setString(5, customer.getCType());
					ps.setString(6, customer.getCGender());
					ps.setLong(7, customer.getCNumber());
					ps.setString(8, customer.getCAddress());
					ps.setDouble(9, customer.getCBalance());
					ps.setBytes(10, photoData);
					ps.setInt(11, age);
					ps.setTimestamp(12,Timestamp.valueOf(creationDate));
					ps.setTimestamp(13,Timestamp.valueOf(lastUpdation));
					int value = ps.executeUpdate();
					if(value > 0)
						return 1;
				}
		}catch (Exception e) {
			System.out.println("Exception in dao "+e.getMessage());
			throw e;
		} 
		
		return 0;
	}

}
