package day11;

// 1
import java.io.Serializable;

public class Student implements Serializable
{

	int sid;
	String sname;
	int mark;
	public Student(int sid, String sname, int mark) {
		
		this.sid = sid;
		this.sname = sname;
		this.mark = mark;
	}
	
	void dispStudent()
	{
		System.out.print(sid+sname+mark);
	}
	
	
}
