package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDMLselectcom5 { 
	
	public static void main(String[]args) throws SQLException {
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","258069");
		
		Statement stmt=con.createStatement();
		
		
		String s = "select * from customers";
		
		
		ResultSet rs=stmt.executeQuery(s);
		
		
		while(rs.next())
		{
			int eid = rs.getInt("customerid");
			String cname = rs.getString("name");
			
			System.out.println(eid +"   "+cname);
			
		}
		
		con.close();
		
		System.out.println("Query executed......");
		
		}
				
		
	}
