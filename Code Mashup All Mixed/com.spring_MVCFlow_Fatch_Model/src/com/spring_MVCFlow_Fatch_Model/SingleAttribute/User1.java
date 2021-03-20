package com.spring_MVCFlow_Fatch_Model.SingleAttribute;

public class User1 {
	
private int uid;
private String uname;

public User1() {
}

//constructor
public User1(int uid, String uname) {
	super();
	this.uid = uid;
	this.uname = uname;
}

//Setter/getter
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

//toString
@Override
public String toString() {
	return "User1 [uid=" + uid + ", uname=" + uname + "]";
}	




}
