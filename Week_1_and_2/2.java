package test1;
import java.util.*;
public class b1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the array size");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		check1(a,n);
	}
	static void check1(int a[],int n)
	{
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
				a[c++]=a[i];
		}
		while(c<n)
			a[c++]=0;
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}