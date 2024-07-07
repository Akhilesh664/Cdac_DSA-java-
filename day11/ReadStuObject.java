// 1
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadStuObject
{

	public static void findresult(Student s)
	{
		if(s.mark>16)
			System.out.println("pass");
		else
			System.out.println("fail");
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		FileInputStream fi = new FileInputStream("dac");
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		Student s;
		

		
		try
		{
		while((s= (Student) oi.readObject())!=null)
		{
			
			s.dispStudent();
			findresult(s);
						
		}
		}catch(EOFException e)
		{
			System.out.println("student object is displayed");
		}
		
		
		
		fi.close();
		oi.close();
		
	}
}
