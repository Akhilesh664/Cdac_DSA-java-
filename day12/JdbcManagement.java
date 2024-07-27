// @2 JDBC STATEMENT    *(EXAMPLE : WHERE WE NEED TO GET VALUE FROM USER TO EDIT IN DATA)*

package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcManagement 
{
	 Connection con;

	public static Connection createConnection() throws ClassNotFoundException, SQLException 
	{
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");

		return con;
	}


	public static void selectAll(Connection con) throws SQLException
	
	{
		String q1;
		q1= "select * from emp ";
		
		
						
		PreparedStatement pmt;
		pmt = con.prepareStatement(q1);
		
		
		
		ResultSet rs =pmt.executeQuery();
		while(rs.next())
	    {
	    	System.out.println(rs.getInt("EMPNO")+" "+rs.getString("ENAME")+ " "+rs.getFloat("SAL") +" "+rs.getInt(8));
	    	
	    }
		
	}


	public static void selectWithCondition(Connection con) throws SQLException 
	{
		String q1;
		q1= "select * from emp where deptno = ?";
		
		
		
		Scanner s;
		s= new Scanner(System.in);
		System.out.println("enter the depntno to retrive records");
		int dno=0;
		dno =s.nextInt();
						
		PreparedStatement pmt;
		pmt = con.prepareStatement(q1);
		
		pmt.setInt(1, dno);
		
		
		ResultSet rs =pmt.executeQuery();
		while(rs.next())
	    {
	    	System.out.println(rs.getInt("EMPNO")+" "+rs.getString("ENAME")+ " "+rs.getFloat("SAL") +" "+rs.getInt(8));
	    	
	    }
	}

	public static void delete(Connection con) throws SQLException 
	{
		String q1= "delete from emp where empno = ?";
		
		 Scanner s = new Scanner(System.in);
		System.out.println("enter the empno to delete");
		int eno=0;
		eno =s.nextInt();
		
		PreparedStatement pmt= con.prepareStatement(q1);
		
		pmt.setInt(1, eno);
		
		int nor=0;
		nor=pmt.executeUpdate();
		System.out.println("no of recored deleted "+ " "+nor);
		
		
		
	}

	public static void update(Connection con) throws SQLException 
	{

		String q1= "update emp set job = ? where empno = ?";
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the ,job,empno to update");
		int eno =s.nextInt();
		String jb = s.next();
		
		
		PreparedStatement pmt= con.prepareStatement(q1);
		
		pmt.setString(1, jb);
		pmt.setInt(2, eno);
		 int nor =pmt.executeUpdate();
		System.out.println("no of recored updated"+ " "+nor);
		
		
	}

	public static void insert(Connection con) throws SQLException 
	{
		
		String q1= "insert into emp(empno,ename,sal) value(?, ?, ? )";
		
		 Scanner s = new Scanner(System.in);
		System.out.println("enter the empno,ename,sal to insert");
		int empno;
		String ename;
		float sal;
		empno =s.nextInt();
		ename = s.next();
		sal = s.nextFloat();
		PreparedStatement pmt= con.prepareStatement(q1);
		pmt.setInt(1, empno);
		pmt.setString(2,ename);
		pmt.setFloat(3, sal);
		int nor =pmt.executeUpdate();
		System.out.println("no of recored inserted "+ " "+nor);
		
		
		
		
	}

	

	
	
	
	
}
