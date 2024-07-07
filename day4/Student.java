import java.util.Scanner;

public class Student 
{

	int sid;
	String sname;
	int mark;
	static String cname;
	
	
	
	
	 Student(int sid, String sname, int mark) 
	{
		
		this.sid = sid;
		this.sname = sname;
		this.mark = mark;
		
	}
	
	static void changeCname()
	{
		cname = "dbda";
	}
	
	void dispStudent()
	{
		System.out.println(sid + sname +mark + cname);
		
	}
	
	
	
}
