package com.nt.service;

import java.util.List;

import com.nt.dao.BankDaoImpl;
import com.nt.dao.IBankDao;
import com.nt.model.Customers;

public class BankServiceImpl implements IBankService{
		private IBankDao dao = new BankDaoImpl();
	@Override
	public List<Customers> getData() throws Exception {
		return dao.getData();
	}

	@Override
	public int saveCustomer(Customers customer) throws Exception {
		return dao.saveCustomer(customer);
	}
		
}
