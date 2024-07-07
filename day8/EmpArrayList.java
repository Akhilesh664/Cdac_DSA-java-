//@2 Array-List

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmpArrayList 
{

	public static void main(String[] args) 
	{
	
		ArrayList<Emp> al=Empmanagement.addemp();
		Empmanagement.dispemp(al);
		Empmanagement.deleemp(al);
		Empmanagement.dispemp(al);
		Empmanagement.updateemp(al);
		Empmanagement.dispemp(al);
		
		
		
		
	}
	
}
