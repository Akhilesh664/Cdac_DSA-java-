// @5  implements
package day9;

import java.util.Comparator;

public class Sortbymark implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) 
	{
		if(s1.mark>s2.mark)
			return 1;
		else
			return -1;
		
	}

	
}
