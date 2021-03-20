package com.SpringBeanAutowireing.Autowiring.ByName;

public class StudentDtoByName {
	private int sid;
	private String sname;
	private AddressDtoByName add;
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAdd(AddressDtoByName add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "StudentDtoByName [sid=" + sid + ", sname=" + sname + ", add=" + add + "]";
	}

	
}
