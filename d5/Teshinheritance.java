package d5;

public class Teshinheritance 
{
	public static void main(String[] args) 
	{
		Student s = new Student(101, "anil", "blr", 34, "java" );
		s.dispStudent();
		s.findresult();
		
		Teacher t = new Teacher(1002,"raj","pune",40000);
		t.dispTeacher();
		t.findtax();
		
	}

}
