package UserDefinedList;

import java.util.List;

public class EmployeeDto3 {

	private int eid;
	private String ename;
	private List<AddressDto1> ad;
	public EmployeeDto3(int eid, String ename, List<AddressDto1> ad) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ad = ad;
		
		
		
	}
	@Override
	public String toString() {
		return "EmployeeDto3 [eid=" + eid + ", ename=" + ename + ", ad=" + ad + "]";
	}
	
}
