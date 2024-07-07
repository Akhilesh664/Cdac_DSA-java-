// @3
public class Teacher extends Person
{
		int sal;
		
	   public Teacher(int no, String name, String add,int sal) 
	   {
		
		   super(no, name, add);
		   this.sal = sal;
	   }

	
	   void findtax()
	   {
		     if(sal>30000)
		    	 System.out.print(sal*0.02f);
		     else
		    	 System.out.print(sal*0.01f);
	   }

      void dispTeacher()
      {
    	  System.out.print(no+name+add+sal);
      }
	
	   
	
	
}
