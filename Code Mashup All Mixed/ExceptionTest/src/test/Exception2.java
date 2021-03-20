package test;

public class Exception2 extends RuntimeException
{
Exception2(String s){super(s);
} 

public static int method()
{
try
{
int i=10/0;
return 1;
}
catch(NumberFormatException e)
{
return 1;	
}
finally{
	return method();
}
}
public static void main(String[] args) {
method();
	}

}
