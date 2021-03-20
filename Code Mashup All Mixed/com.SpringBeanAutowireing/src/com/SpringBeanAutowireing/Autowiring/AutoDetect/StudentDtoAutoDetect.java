package com.SpringBeanAutowireing.Autowiring.AutoDetect;

public class StudentDtoAutoDetect {
	
	private int sid;
	private String sname;
	private AddressDtoAutoDetect add;
	
	public StudentDtoAutoDetect(int sid, String sname, AddressDtoAutoDetect add) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.add = add;
	}


	@Override
	public String toString() {
		return "StudentDtoAutoDetect [sid=" + sid + ", sname=" + sname + ", add=" + add + "]";
	}


}
