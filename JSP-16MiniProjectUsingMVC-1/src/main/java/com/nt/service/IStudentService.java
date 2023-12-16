package com.nt.service;

import java.sql.SQLException;
import java.util.List;

public interface IStudentService {
		public List<StudentsData> getData(String name) throws SQLException, ClassNotFoundException, Exception;
}
