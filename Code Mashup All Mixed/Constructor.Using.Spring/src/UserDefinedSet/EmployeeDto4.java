package UserDefinedSet;



import java.util.Set;

import UserDefinedList.AddressDto1;

public class EmployeeDto4 {

	private int eid;
	private String ename;
	private Set<AddressDto2> ad;
	
	
	public EmployeeDto4(int eid, String ename, Set<AddressDto2> ad) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ad = ad;
	}


	@Override
	public String toString() {
		return "EmployeeDto4 [eid=" + eid + ", ename=" + ename + ", ad=" + ad + "]";
	}

	
	
	
}
