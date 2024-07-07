// @5  implements

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistStudent 
{

	public static void main(String[] args) 
	{
	
		Student s1 = new Student(1001,"bala",40);
		Student s2 = new Student(1002,"nathan",80);
		Student s3 = new Student(1003,"shan",30);
		Student s4 = new Student(1004,"akash",90);
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(new Student(1005,"guru",20));
		
		System.out.println("sort by mark");
		System.out.println("before sorting");
		for(Student s   :al)
		{
			s.display();
		}
		
		Sortbymark sm = new Sortbymark();
		
		Collections.sort(al,sm);
		
		
		System.out.println("after sorting");
		for(Student s   :al)
		{
			s.display();
		}
		
		
		System.out.println("sort by name");
		
		System.out.println("before sorting");
		for(Student s   :al)
		{
			s.display();
		}
		
		
		System.out.println("after sorting by name" );
		
		Sortbyname sn = new Sortbyname();
		Collections.sort(al,sn);
		
		
		for(Student s   :al)
		{
			s.display();
		}
		
		
		
		
//		ArrayList<Integer> al1 = new ArrayList<>();
//		
//		al1.add(10);
//		al1.add(90);
//		al1.add(100);
//		al1.add(70);
//		al1.add(20);
//		
//		System.out.println("before sorting");
//		
//		for(Integer n   :al1)
//		{
//			System.out.println(n);
//		}
//		
//		
//		Collections.sort(al1);
//		
//		
//		System.out.println("after sorting");
//		
//		for(Integer n   :al1)
//		{
//			System.out.println(n);
//		}
//		
		
		
		
	}
}
