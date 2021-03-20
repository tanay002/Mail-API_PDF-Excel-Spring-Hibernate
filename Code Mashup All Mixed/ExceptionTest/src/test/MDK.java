package test;

public class MDK {

	private static int x=10;
	public void assign(int x)
	{
		this.x=x;
		System.out.println(this.x);
	}
	public String toString()
	{
		return (""+x);
	}
	public static void main(String[] args) {
		MDK p=new MDK();
		p.assign(100);
		MDK p2=p;
		System.out.println(p2);
		p2.x=200;
		System.out.println(p2);
		p.x=300;
		System.out.println(p);
		System.out.println(p2);
	}

}
