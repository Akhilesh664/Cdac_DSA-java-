package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStringRead 
{
public static void main(String[] args) throws IOException 
{

	//read from file
	//open the file for read
	
	FileReader fr = new FileReader("dac");
	BufferedReader br = new BufferedReader(fr);
	String str;
	
	while((str = br.readLine()) !=null)
	{
		
		System.out.println(str);
	}
	
	
//	String str = br.readLine();
//	String str1 = br.readLine();
//	String str2 = br.readLine();
	
	//write the console
	
//	System.out.println(str);
//	System.out.println(str1);
//	System.out.println(str2);
//	
	
	
	
	
	
}
}
