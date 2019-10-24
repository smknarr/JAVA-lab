import java.util.*;
public class Student {
	String name="";
	int roll=0;
	double sub[]=new double[4];
	student_details(String n,int i,double s[])
	{
		name=n;
		roll=i;
		sub=s;
	}
	void calculateMarks()
	{
		double total=0;
		for(int i=0;i<4;i++)
		{
			total+=sub[i];
		}
		System.out.println(total);
	}
	void calculateMarks(int a)
	{
		double total=0;
		for(int i=0;i<4;i++)
		{
			total+=sub[i];
		}
		System.out.println(total*1.08);
	}
	void calculateMarks(double b)
	{
		double total=0;
		for(int i=0;i<4;i++)
		{
			total+=sub[i];
		}
		System.out.println(total*1.045);
	}
	public static void main(String args[])
	{
		String n;
		int r,o;
		double s[]=new double[4];
		System.out.println("Enter");
		Scanner in=new Scanner(System.in);
		n=in.nextLine();
		r=in.nextInt();
		for(int i=0;i<4;i++)
			s[i]=in.nextInt();
		student_details st=new student_details(n,r,s);
		System.out.println("Enter option: 1 for normal student, 2 for student participated in Technical events, 3 for students participated in Non-Technical events:");
		o=in.nextInt();
		if(o==1)
			st.calculateMarks();
		else if(o==2)
			st.calculateMarks(1);
		else if(o==3)
			st.calculateMarks(2.2);
	}
}
