package d5;

import java.util.Scanner;

public class Student extends Person
{
	int mark;
	String subject;
	
	
	Student(){
		System.out.println("noc student");
	}
	
	public Student(int no, String name, String add, int mark, String subject) {
		super(no, name, add);
		this.mark = mark;
		this.subject = subject;
	}
	
//	void readStudent()
//	{
//		Scanner s = new Scanner(System.in);
//		no  = s.nextInt();
//		name = s.next();
//		add = s.next();
//		mark = s.nextInt();
//		subject = s.next();
//	}
	
	void dispStudent()
	{
		System.out.print(no + name + add +mark+subject);
	}
	
	
	void findresult()
	{
		if(mark>16)
			System.out.print("pass");
		else
		    System.out.print("fail");
		System.out.println();
	}
	

}
