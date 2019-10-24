package test1;
import java.util.*;
public class a1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the array size");
		n=in.nextInt();
		int a[]=new int[n];
		int x[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		for(int i=0;i<n;i++)
			x[i]=a[i];
		check(a,x,n);
	}
	static void check(int a[],int x[],int n)
	{
		int count[]=new int[n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				if(a[i]==x[j])
					count[i]++;
			}
		for(int i=0;i<a.length;i++)
		{
			if(count[i]>1)
				System.out.println(a[i]+"-"+count[i]);
		}
	}
}
