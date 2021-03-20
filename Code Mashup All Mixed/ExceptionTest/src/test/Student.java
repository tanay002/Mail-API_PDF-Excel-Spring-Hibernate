package test;

public class Student {
	static int id=100;
	int roll_no;
	Student()
	{
		roll_no=id;
		id++;
	}
	
	public int hashCode()
	{
		return roll_no;
	}
	

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		System.out.println(s.toString());
	}

}
