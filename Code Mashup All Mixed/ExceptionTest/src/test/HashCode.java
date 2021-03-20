package test;

public class HashCode {
	int n;
	byte m;
	HashCode(int n1,byte i)
	
	{
		n=n1;
		m=i;	
	}

	public static void main(String[] args) {
		String name="yyy";
		String s="dd";
		if(!name.equals(s))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		HashCode h= new HashCode(1,(byte)1);
		HashCode h1=new HashCode(1,(byte)2);
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
	}
public int hashCode()
{
return (""+n+m).hashCode();	
}
}
