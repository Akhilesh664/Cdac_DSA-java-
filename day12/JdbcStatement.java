// @1 JDBC STATEMENT    *(EXAMPLE : WHERE WE NEED TO GIVE CONDITION INSIDE PROGRAM )  
package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatement 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","akhil@1");
		Statement smt;
		 smt=con.createStatement();
		
	    //SELECT
		
		String q1;
		q1= "select * from emp";	
		
	    ResultSet rs=smt.executeQuery(q1);
	    
	    
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt("EMPNO")+" "+rs.getString("ENAME")+ " "+rs.getFloat("SAL"));
	    	
	    }
	    
	    
	   //UPDATE 
	    	q1 = "update emp set sal = sal+100 where empno = 7369";
	    
	        int nor =smt.executeUpdate(q1);
	        
	         System.out.println("no of record updated" + " "+ nor);
	    
	    
		rs.close();
		
	}
}
