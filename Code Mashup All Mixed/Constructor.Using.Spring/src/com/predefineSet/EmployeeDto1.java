package com.predefineSet;


import java.util.Set;

public class EmployeeDto1 {

	
	private int eid;
	private String ename;
	private Set<String> languages;
	
	
	public EmployeeDto1(int eid, String ename, Set<String> languages) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.languages = languages;
	}


	@Override
	public String toString() {
		return "EmployeeDto1 [eid=" + eid + ", ename=" + ename + ", languages=" + languages + "]";
	}
	
	
	
	
}
