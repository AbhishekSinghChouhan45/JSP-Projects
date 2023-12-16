package com.nt.student;
public class Student {
		private int sno;
		private String sname;
		private String sadd;
		private int m1,m2,m3;
		public int getsno() {
			System.out.println("student.getsno()");
			return sno;
		}
		public void setsno(int sno) {
			System.out.println("student.setsno()");
			this.sno = sno;
		}
		public String getsname() {
			System.out.println("student.getsname()");
			return sname;
		}
		public void setsname(String sname) {
			System.out.println("student.setsname()");
			this.sname = sname;
		}
		public String getsadd() {
			System.out.println("student.getsadd()");
			return sadd;
		}
		public void setsadd(String sadd) {
			System.out.println("student.setsadd()");
			this.sadd = sadd;
		}
		public int getM1() {
			System.out.println("Student.getM1()");
			return m1;
		}
		public void setM1(int m1) {
			System.out.println("Student.setM1()");
			this.m1 = m1;
		}
		public int getM2() {
			System.out.println("Student.getM2()");
			return m2;
		}
		public void setM2(int m2) {
			System.out.println("Student.setM2()");
			this.m2 = m2;
		}
		public int getM3() {
			System.out.println("Student.getM3()");
			return m3;
		}
		public void setM3(int m3) {
			System.out.println("Student.setM3()");
			this.m3 = m3;
		}
		public Student() {
			System.out.println("Student:: 0-param constuctor");
		}
		
}
