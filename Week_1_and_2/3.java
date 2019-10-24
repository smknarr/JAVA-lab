package test1;
import java.util.*;
public class c1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=in.nextInt();
		System.out.println("Factorial is:"+fact(n));
	}
	static int fact(int n)
	{
		int rem=1;
		for(int i=1;i<=n;i++)
			rem=rem*i;
		return rem;
	}
}
