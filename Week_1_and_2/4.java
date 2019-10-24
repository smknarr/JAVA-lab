package test1;
import java.util.*;
public class d1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=in.nextInt();
		fibo(n);
	}
	static void fibo(int n)
	{
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		c=a+b;
		for(int i=0;i<n;i++)
		{
			System.out.println(" "+c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}