package day4; 

import java.util.Scanner;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		
		Student.changeCname();
		
		Student s1 = new Student(1001,"shan",30);
		s1.dispStudent();
		Student s2 = new Student(1002,"raj",40);
		s2.dispStudent();
		
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter course for siju : ");
	    Student.cname = s.next();
	    
		Student s3 = new Student(1003,"siju",50);
		s3.dispStudent();

		
		
		
	}
}
