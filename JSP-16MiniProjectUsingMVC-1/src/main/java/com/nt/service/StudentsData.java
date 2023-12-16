package com.nt.service;

public class StudentsData {
	private Integer Sno;
	private String Sname;
	private Integer Sclass;
	private Double Spercentage;
	private String Sresult;
	//Getter and Setter Methods
	public Integer getSno() {
		return Sno;
	}
	public void setSno(Integer sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Integer getSclass() {
		return Sclass;
	}
	public void setSclass(Integer sclass) {
		Sclass = sclass;
	}
	public Double getSpercentage() {
		return Spercentage;
	}
	public void setSpercentage(Double spercentage) {
		Spercentage = spercentage;
	}
	public String getSresult() {
		return Sresult;
	}
	public void setSresult(String sresult) {
		Sresult = sresult;
	}
	public StudentsData() {
		System.out.println("StudentsData:: 0-param contructor");
	}
}
