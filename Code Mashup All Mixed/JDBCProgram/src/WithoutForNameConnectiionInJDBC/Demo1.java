package WithoutForNameConnectiionInJDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;



public class Demo1 {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/hmapping";
		String userName="root";
		String password="root";
		Driver d=new Driver();
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from product");  
	    
		   while(rs.next())
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
				 
		//	System.out.println("Success");

		
		
	}

}
