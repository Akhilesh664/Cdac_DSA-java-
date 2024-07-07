// 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	
		Socket s = new Socket("192.168.133.1",999);
		
		//read from console
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("enter the message for server");
		String cmsg=br.readLine();
		
		//write to the socket
		
	     OutputStream os =s.getOutputStream();
	     
		 PrintStream ps = new PrintStream(os);
		 ps.println(cmsg);
	     
	     System.out.println("message sent to server");
	     
	     
	     //read from socket
	     
	     InputStream is    =s.getInputStream();
         
         InputStreamReader ir1 = new InputStreamReader(is);
         BufferedReader br1 = new BufferedReader(ir1);

         String smg=br1.readLine();
         
         //write the the console
         
         System.out.println("message from server is "+ smg);
	     s.close();
	     os.close();
	     ps.close();
	     
	     	
		
	}
	
	
}
