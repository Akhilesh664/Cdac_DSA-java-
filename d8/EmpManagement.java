package d8;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpManagement {
	
	// create addEmp function
	public static ArrayList<Emp> addEmp() {
		
		Emp e1 = new Emp(101,"anil",3000);
		Emp e2 = new Emp(102,"neha",7000);
		Emp e3 = new Emp(103,"prakash",2000);
		
		ArrayList<Emp> al = new ArrayList<>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		return al;
		
	}

	// display Emp
	public static void dispEmp(ArrayList<Emp> al) 
	{
		for(Emp e : al) {
			e.dispEmp();
		}
	}

	public static void deleteEmp(ArrayList<Emp> al) {
		System.out.println("enter empno for deleting emp : ");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		
		int pos = 0;
		for(Emp e : al) {
			if(e.empno == no) {
				pos = al.indexOf(e);
			}
		}
		al.remove(pos);
		
	}

	public static void updateEmp(ArrayList<Emp> al) {
		System.out.println("enter empno for updation emp : ");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		System.out.println("enter name for update emp : ");
		String name = s.next();
		System.out.println("enter amount to update sal : ");
		int amt = s.nextInt();
		
		for(Emp e : al) {
			if(e.empno == no) {
				e.name = name;
				e.sal = amt + e.sal;
			}
		}

	}
	

}
