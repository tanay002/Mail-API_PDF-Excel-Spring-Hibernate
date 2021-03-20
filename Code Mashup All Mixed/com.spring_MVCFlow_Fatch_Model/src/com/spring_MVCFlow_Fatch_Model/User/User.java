package com.spring_MVCFlow_Fatch_Model.User;

public class User {
private int uid;
	private String uname;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
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
}
