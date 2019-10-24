package test1;
import java.util.*;
public class e1 {
	public static void main(String args[])
	{
		prime();
	}	
	static void prime()
	{
		int i,j,n=50;
		for(i=2;i<=n;i++)
		{
			int flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}