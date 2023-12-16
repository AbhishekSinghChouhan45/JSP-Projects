package com.nt.service;

public class Employee {
		private String eno;
		private String ename;
		private String eadd;
		private double salary;
		private double gsalary;
		private double nsalary;
		//Setters and Getters
		public String getEno() {
			System.out.println("Employee.getEno()");
			return eno;
		}

		public void setEno(String eno) {
			System.out.println("Employee.setEno()");
			this.eno = eno;
		}

		public String getEname() {
			System.out.println("Employee.getEname()");
			return ename;
		}

		public void setEname(String ename) {
			System.out.println("Employee.setEname()");
			this.ename = ename;
		}

		public String getEadd() {
			System.out.println("Employee.getEadd()");
			return eadd;
		}

		public void setEadd(String eadd) {
			System.out.println("Employee.setEadd()");
			this.eadd = eadd;
		}

		public double getSalary() {
			System.out.println("Employee.getSalary()");
			return salary;
		}

		public void setSalary(double salary) {
			System.out.println("Employee.setSalary()");
			this.salary = salary;
		}

		public double getGsalary() {
			System.out.println("Employee.getGsalary()");
			return gsalary;
		}

		public void setGsalary(double gsalary) {
			System.out.println("Employee.setGsalary()");
			this.gsalary = gsalary;
		}

		public double getNsalary() {
			System.out.println("Employee.getNsalary()");
			return nsalary;
		}

		public void setNsalary(double nsalary) {
			System.out.println("Employee.setNsalary()");
			this.nsalary = nsalary;
		}

		
		public Employee() {
			System.out.println("Employee:: 0-param constructor");
		}
}
