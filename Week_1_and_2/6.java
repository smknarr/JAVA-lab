package test1;
import java.util.*;
import java.math.*;
public class f1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=in.nextInt();
		if(arm(n))
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
	static boolean arm(int n)
	{
		int rem=0,digit,t;
		int i=String.valueOf(n).length();
		for(t=n;t>0;)
		{
			digit=t%10;
			rem+=(int)Math.pow(digit,i);
			t/=10;
		}
		if(rem==n)
			return true;
		else
			return false;
	}
}
