package com.PredefinedList;

import java.util.List;

public class EmployeeDto {
	
	private int eid;
	private String ename;
	private List<String> languages;
	


	public EmployeeDto(int eid, String ename, List<String> languages) {
		
		this.eid = eid;
		this.ename = ename;
		this.languages = languages;
	}



	@Override
	public String toString() {
		return "EmployeeDto [eid=" + eid + ", ename=" + ename + ", languages=" + languages + "]";
	}
	

	
}
