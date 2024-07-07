// @2 JDBC STATEMENT     *(EXAMPLE : WHERE WE NEED TO GET VALUE FROM USER TO EDIT IN DATA)*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPreparedStatement 
{

	
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//create connection
		Connection con = JdbcManagement.createConnection();
				
		//select all
		JdbcManagement.selectAll(con);
		
		//select with condition
		JdbcManagement.selectWithCondition(con);
			
		//delete
		
		JdbcManagement.delete(con);
			
		//select all
		JdbcManagement.selectAll(con);
		
		//update
		
		JdbcManagement.update(con);
		
		
		//select all
		JdbcManagement.selectAll(con);
		
		//INSERT
		
		JdbcManagement.insert(con);
		
		//select all
		JdbcManagement.selectAll(con);
		

		
	}
	
}
