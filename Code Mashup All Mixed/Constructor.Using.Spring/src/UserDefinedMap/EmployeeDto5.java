package UserDefinedMap;

import java.util.Map;
public class EmployeeDto5 {

	
	private int eid;
	private String ename;
	private Map<AddressDto3,LanguageDto> ad;
	public EmployeeDto5(int eid, String ename, Map<AddressDto3, LanguageDto> ad) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "EmployeeDto5 [eid=" + eid + ", ename=" + ename + ", ad=" + ad + "]";
	}
	
	
	
	
}
