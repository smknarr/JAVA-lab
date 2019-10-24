package test1;
import java.util.*;
public class c2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=in.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equals(rev))
		System.out.println("Palindrome!");
		else
		System.out.println("Not Palindrome..");
	}
}
