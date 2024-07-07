// 4
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 
{

	private static void openfile() throws FileNotFoundException 
	{
		FileInputStream fs = new FileInputStream("dac");
		
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException  
	{		
			openfile();
		
	}

	
}
