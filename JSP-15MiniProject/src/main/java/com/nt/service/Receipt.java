package com.nt.service;

public class Receipt {
	public void getReceipt(Employee st) {
		System.out.println("From Receipt "+st.hashCode());
		st.setGsalary(st.getSalary() + (st.getSalary() * 0.4));
		st.setNsalary(st.getGsalary() - (st.getGsalary() * 0.2));
		System.out.println("Gross salary and Net salary sended");
	}
	public Receipt() {
		System.out.println("Receipt:: 0-param consturctor");
	}
	
}
