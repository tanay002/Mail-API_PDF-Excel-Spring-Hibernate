
public class MyThread1 extends Thread {
	public void start()
	{
		super.start();
		System.out.println("hii");
	}
public void run()
{
System.out.println("Hello");	
}
	public static void main(String[] args) {
		MyThread1 th=new MyThread1();
		th.start();
	}

}
