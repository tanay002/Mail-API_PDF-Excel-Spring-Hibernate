package test;

import java.io.FileNotFoundException;

public class Demo extends B {
	int s;
	String h;
	void m1()throws RuntimeException
	
	{
		if(true)
			{System.out.println("true");
		System.out.println(1);}
		else 
			System.out.println("ss");
	}
	public Demo(int s, String h) {
		super();
		this.s = s;
		this.h = h;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		if (h == null) {
			if (other.h != null)
				return false;
		} else if (!h.equals(other.h))
			return false;
		if (s != other.s)
			return false;
		return true;
	}
	
public static void main(String []args)

{ try{
	
}catch (Exception e) {
	// TODO: handle exception
}
catch (RuntimeException w) {
	// TODO: handle exception
}
	Demo o=new Demo(1,"gg");
Demo o1=new Demo(1,"gg");
System.out.println(o.getClass());
System.out.println(o.equals("bhawana"));
System.out.println(o.equals(null));
	}}
class A
{void m1()
	{}
	}
class B extends A
{void m1()
	{}
	}
