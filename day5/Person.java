// @1
//  heircheal inharitance , with "person" <= student , <= teacher 
package day5;

import java.util.Scanner;

public class Person 
{

	int no;
	String name;
	String add;
	
	//default constuctor
	Person()
	{
		System.out.println("noc Person" );
	}

	public Person(int no, String name, String add) {		
		this.no = no;
		this.name = name;
		this.add = add;
	}
	
}
