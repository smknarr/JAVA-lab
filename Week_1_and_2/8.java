package test1;
import java.util.*;
public class h1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("How are you?");
		System.out.println(s1.append(" hey"));
		System.out.println(s2.insert(4, '!'));
		System.out.println(s1.reverse());
		System.out.println(s2.substring(1,4));
	}
}
