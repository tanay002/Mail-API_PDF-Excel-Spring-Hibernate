package JDBC_ODBC_Driver_Program;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		
		Connection con=DriverManager.getConnection("jdbc:ucanaccess:\\D:\\Users\\TCP\\Documents\\myDatabase.accdb");
	

		System.out.println("Hii");
		   Statement st=con.createStatement();  
		   ResultSet rs=st.executeQuery("select * from employee");  
		    
		   while(rs.next()){  
		    System.out.println(rs.getString(1));  
		   }  
		//	System.out.println(stmt.getInt(1)+","+stmt.getString(2)+","+stmt.getInt(3));
		System.out.println("Success");
	st.close();
	con.close();
	}

	}


