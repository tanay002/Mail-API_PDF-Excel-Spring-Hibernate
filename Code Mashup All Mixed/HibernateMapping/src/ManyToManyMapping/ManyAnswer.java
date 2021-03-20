package ManyToManyMapping;

import java.util.List;

public class ManyAnswer {
	private int ansId;
	private String ans;
	private List<Question1> ql;
	
	
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public List<Question1> getQl() {
		return ql;
	}
	public void setQl(List<Question1> ql) {
		this.ql = ql;
	}
	

}
