package d10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStringWrite 
{
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("enter cname");
		String cname;
		
		FileWriter fw = new FileWriter("dac");
		while(!(cname = br.readLine()).equals("exit")) {
			fw.write(cname + '\n');
		}
		
		System.out.println("file write is over");
		
		fw.close();
		
		
	}

}
