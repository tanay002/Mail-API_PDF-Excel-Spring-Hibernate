package com.SpringBeanAutowireing.constructor;

public class StudentDtoByConstructor {
	private int sid;
	private String sname;
	private AddressDtoByConstructor ad;
	public StudentDtoByConstructor(int sid, String sname, AddressDtoByConstructor ad) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "StudentDtoByConstructor [sid=" + sid + ", sname=" + sname + ", ad=" + ad + "]";
	}
	
	

}
