package test1;
import java.util.*;
public class g1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=in.nextLine();
		System.out.println(s1.length());
		String s2="    hello     ";
		System.out.println(s2.trim());
		System.out.println(s1.replace('h','l'));
		System.out.println(s2.contains(s1));
		System.out.println(s1.equals(s2));
	}
}
