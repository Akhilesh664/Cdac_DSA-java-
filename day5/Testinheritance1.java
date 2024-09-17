// @4
package day5;

public class Testinheritance1 
{

	public static void main(String[] args) 
	
	{
	
		Student s = new Student(); //1001,"shan","blr",30 ,"java"
		s.readStudent();
		s.dispStudent();
		s.findresult();
		
		Teacher t = new Teacher(1002,"raj","pune",40000);
	    t.dispTeacher();
		t.findtax();
		
	}
}
