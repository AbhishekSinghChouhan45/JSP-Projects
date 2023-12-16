package com.nt.dao;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import com.nt.model.Customers;

public interface IBankDao {
		public Connection getCon()throws Exception;
		public List<Customers> getData()throws Exception;
		public int saveCustomer(Customers customer)throws Exception;
}
