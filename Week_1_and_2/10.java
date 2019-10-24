package test1;
import java.util.*;
public class b2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=in.nextLine();
		int ch[]=new int[20];
		for(int i=0;i<20;i++)
			ch[i]=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='a'||c=='A')
				ch[0]++;
			else if(c=='e'||c=='E')
				ch[1]++;
			else if(c=='i'||c=='I')
				ch[2]++;
			else if(c=='o'||c=='O')
				ch[3]++;
			else if(c=='u'||c=='U')
				ch[4]++;
		}
			System.out.println("a:"+ch[0]+"e:"+ch[1]+"i:"+ch[2]+"o:"+ch[3]+"u:"+ch[4]);
	}
}