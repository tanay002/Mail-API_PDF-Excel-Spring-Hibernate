package com.SpringBeanScope.Session;

public class Customer {
	
private	DataSessionScope dss;
private int cid;
public DataSessionScope getDss() {
	return dss;
}
public void setDss(DataSessionScope dss) {
	this.dss = dss;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
@Override
public String toString() {
	return "Customer [dss=" + dss + ", cid=" + cid + "]";
}

	
		
	}	


