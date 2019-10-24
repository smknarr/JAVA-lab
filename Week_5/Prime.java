import java.util.*;
class thread1 extends Thread 
{
	public void run()
	{
		try
		{
			for(int i=2;i<=100;i++)
			{
				int flag=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("Prime Number : "+i);
					Thread.sleep(5000);
				}
			}
		}	
		catch (Exception e) {} 
	}
}
class thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=100;i++)
			{
				if((i%2==0)&&(i%4==0)&(i%6==0))
				{
					System.out.println("Number divisible : "+i);
					Thread.sleep(5000);
				}
			}
		}
		catch (Exception e) {} 
	}
}
public class a1 {
    public static void main(String args[])
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
	}
}