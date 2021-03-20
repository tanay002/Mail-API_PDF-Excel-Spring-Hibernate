package ManyToManyMapping;

import java.util.List;

public class Question1 {
	
private int queId;
private String ques;
private List<ManyAnswer> answer;

public int getQueId() {
	return queId;
}
public void setQueId(int queId) {
	this.queId = queId;
}
public String getQues() {
	return ques;
}
public void setQues(String ques) {
	this.ques = ques;
}
public List<ManyAnswer> getQa() {
	return answer;
}
public void setQa(List<ManyAnswer> answer) {
	this.answer = answer;
}


}
