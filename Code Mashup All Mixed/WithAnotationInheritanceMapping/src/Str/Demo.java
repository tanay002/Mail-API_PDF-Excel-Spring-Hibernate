package Str;

public class Demo {

	public static void main(String[] args) {
		String s=new String ("Bytecoder");
		String[] a=s.split(" ");
		for(int i=1;i<s.length();i++)
		{
			System.out.println(a[i]);
		}
	}

	
}
