package d9;

import java.util.Comparator;

public class Sortbymark implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.mark>o2.mark)
			return 1;
		else
			return -1;
	}
	

}
