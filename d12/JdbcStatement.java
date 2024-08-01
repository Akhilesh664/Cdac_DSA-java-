package d12;

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
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
		
		Statement smt = con.createStatement();
		
		String q = "select * from emp where deptno = 30";
	
		ResultSet rs = smt.executeQuery(q);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2)+rs.getString(3) + " "+rs.getFloat(6)+" "+rs.getInt(8));
		}
		
		rs.close();
	    con.close();
	}

}
