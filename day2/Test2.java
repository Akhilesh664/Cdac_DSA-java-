import java.util.Scanner;

public class Test2 
{

	public static void main(String[] args) 
	{
	
		int labm = 30;
		int ccee = 40;
		
//		if(labm>16 && ccee>16)
//			System.out.println("pass");
//		else
//			System.out.println("fail");
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the sname");
		String sname = s.next();
		int sno = s.nextInt();
		float per = s.nextFloat();
		char grade;
		
		if(per>80)
			grade = 'A';
		else if(per>=60 && per<80)
		
			grade = 'B';
		
		else if(per>=50 && per<60)
			grade = 'C';
		else
			grade = 'D';

		System.out.println(sname);
		System.out.println(sno);
		System.out.println(per);
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
		
		
				
	}
	
}
