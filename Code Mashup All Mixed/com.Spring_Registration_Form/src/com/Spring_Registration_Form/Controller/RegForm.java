package com.Spring_Registration_Form.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")

public class RegForm {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String uname;
	private String email;
	private String pass;
	
	
	public RegForm() { }
	 
    public RegForm(int uid, String uname, String email, String pass) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.pass = pass;
	}


public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
		
}