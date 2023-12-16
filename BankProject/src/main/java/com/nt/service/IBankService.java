package com.nt.service;

import java.util.List;

import com.nt.model.Customers;

public interface IBankService {
	public List<Customers> getData()throws Exception;
	public int saveCustomer(Customers customer)throws Exception;
}
