package day11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteReadPrimitiaves
{

	public static void main(String[] args) throws IOException 
	{
	
				int  pid =1001;
				float price= 40000;
				String pname= "Lenovo";

			FileOutputStream fo = new FileOutputStream("dac1");
					
			DataOutputStream ds = new DataOutputStream(fo);
			
			
			ds.writeInt(pid);
			ds.writeFloat(price);
			ds.writeUTF(pname);
			System.out.println("primitives write is over");
			ds.close();
			
			FileInputStream fi = new FileInputStream("dac1");
			
			DataInputStream di = new DataInputStream(fi);
			
			pid = di.readInt();
			price = di.readFloat();
			pname = di.readUTF();
			
			System.out.println(pid + "" + price + pname);
			
			di.close();
			fi.close();
			
		
	}
}
