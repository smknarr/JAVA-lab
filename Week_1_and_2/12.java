package test1;
import java.util.*;
public class d2 {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the String 1");
	String s1=in.nextLine();
	int s=in.nextInt();
	int e=in.nextInt();
	System.out.println(s1.substring(s,e));
}
}