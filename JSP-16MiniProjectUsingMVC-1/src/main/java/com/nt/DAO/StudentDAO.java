package com.nt.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.service.StudentsData;

public class StudentDAO {
//		private Connection con;
//		private PreparedStatement ps;
//		private ResultSet rs;
		private static final String GET_QUERY = "SELECT * FROM STUDENT WHERE name = (?)";
		
		public List<StudentsData> setData(String name) throws SQLException, ClassNotFoundException{
			List<StudentsData> list = new ArrayList<StudentsData>();
			Class.forName("com.mysql.cj.jdbc.Driver");
				try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
						PreparedStatement ps = con.prepareStatement(GET_QUERY);
						){
						ps.setString(1, name);
						ResultSet rs = ps.executeQuery();
						while (rs.next()) {
							StudentsData s = new StudentsData();
							s.setSno(rs.getInt(1));
							s.setSname(rs.getString(2));
							s.setSclass(rs.getInt(3));
							s.setSpercentage(rs.getDouble(4));
							list.add(s);
						}
				}catch (Exception e) {
					System.out.println("Exception in StudentDAO: "+e.getMessage());
					throw e;
				}
				return list;
		}
		public StudentDAO() {
			System.out.println("StudentDAO:: 0-param contructor");
		}
}
