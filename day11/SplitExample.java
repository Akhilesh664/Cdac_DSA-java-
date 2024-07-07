// 2
public class SplitExample 
{

	public static void main(String[] args) 
	{
	    String sp = ",";
		String str = "1006 ,kumar , 40";
		
		
		       String[] e =str.split(sp);
		
		       System.out.println(e[0]);
		       System.out.println(e[1]);
		       System.out.println(e[2]);
		       
//		       Student s = new Student(Integer.parseInt(e[0]),e[1],Integer.parseInt(e[2]));
//		       
//		       s.dispStudent();
//		  for(String s  :e)
//		  {
//			  System.out.println(s);
//		  }
		
	}
}
