package com.SpringBeanAutowireing.Autowiring.ByType;

public class StudentDtoByType {
	private int sid;
	private String sname;
	private AddressDtoByType add1;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public AddressDtoByType getAdd1() {
		return add1;
	}
	public void setAdd1(AddressDtoByType add1) {
		this.add1 = add1;
	}
	@Override
	public String toString() {
		return "StudentDtoByType [sid=" + sid + ", sname=" + sname + ", add1=" + add1 + "]";
	}
	
	

}
