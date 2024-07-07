// @3 JDBC CALLABLE-STATEMENT

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class JdbcCallable 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
		
		CallableStatement cmt = con.prepareCall("{call getEmpName(? ,?)}");
		
		Scanner s;
		s= new Scanner(System.in);
		System.out.println("enter the empno to get name of the employee");
		int dno=0;
		dno =s.nextInt();
		
		cmt.setInt(1, dno);
		cmt.registerOutParameter(2,Types.VARCHAR);
		
		cmt.execute();
		System.out.println("employee name " + cmt.getString(2));
		
		con.close();
		cmt.close();
		
		
		
		
		
		
	}
	
}
