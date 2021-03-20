package SimpleConstructorProgram;

public class Employee {
private int eid;
private String ename;
public Employee()
{
System.out.println("Default Constructor");	
}


public Employee(int eid, String ename) {
	
	this.eid = eid;
	this.ename = ename;
}

void show()
{
System.out.println(eid+"   "+ename);	
}

}
