package test1;
import java.util.Scanner;
public class a2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1=in.nextLine();
		System.out.println("Enter the String 2");
		String s2=in.nextLine();
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}