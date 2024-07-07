// @2b overriding - Example

public class Student extends Object
{

	int sno;
	String name;
	int mark;
	
	public Student(int sno, String name, int mark) {
		
		this.sno = sno;
		this.name = name;
		this.mark = mark;
	}
	
	
		
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", mark=" + mark + "]";
	}





	public static void main(String[] args) 
	{		
		Student s = new Student(1001,"shan",40);
		
		System.out.println(s);
	}
	
}
