package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlDMLcommands2 {
	
	public static void main(String[]args) throws SQLException {
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","258069");
		
		Statement stmt=con.createStatement();
		
		String s="UPDATE CUSTOMERS SET NAME='DAVID' WHERE customerid=03";
		
		stmt.execute(s);
		
		con.close();
		
		System.out.println("Query executed......");
		
		}
				
		
	}

