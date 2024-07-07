import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileStringWrite 
{

	public static void main(String[] args) throws IOException 
	{
	
		//read from console
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("enter the cname");
		String  cname; 
		FileWriter fw = new FileWriter("dac");
		 while(!(cname = br.readLine()).equals("exit"))
				 {
			 		fw.write(cname+'\n');
				 }
		
		
		//write to the file
		//create file for write operation
		
		System.out.println("file write is over");
		
		fw.close();
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		
//		String str = s.next();
		
		
		
		
		
		
	}
	
	
}
