import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritestuObject
{

	public static void main(String[] args) throws IOException 
	{
	
//		Student s1 = new Student(1001,"shan",30);
//		Student s2 = new Student(1002,"arun",40);
//		Student s3 = new Student(1003,"siju",60);
//		Student s4 = new Student(1004,"raj",80);
		
		String sp = ",";
		
		
		FileReader fr = new FileReader("student.csv");
		BufferedReader br = new BufferedReader(fr);
		
		String row;
		FileOutputStream fo = new FileOutputStream("dac");
		
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		
		
		
		
		
		while((row =br.readLine())!=null)
		{
			String[] stu =row.split(sp);
			
			Student s = new Student(Integer.parseInt(stu[0]),stu[1],Integer.parseInt(stu[2]));
			oo.writeObject(s);
			
			
		}
		
		
		
		System.out.println("student object is written into file dac");
		oo.close();
		fo.close();
		
		
		
		
		
	}
}
