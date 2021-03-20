package JDBC_Cursor_With_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CursorDemo {

	public static void main(String[] args) {
try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/plsqldemo","root","root");

	
		System.out.println("Hii");
	CallableStatement stmt=con.prepareCall("{call CursorForSelect1(?,?,?)}");
	System.out.println("Hello");
	stmt.setInt(0, 10);
	stmt.setString(1,"Rinki" );
	stmt.setDouble(2, 140000);
stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
stmt.registerOutParameter(2, java.sql.Types.DOUBLE);



stmt.executeUpdate();

System.out.println(stmt.getString(1)+","+stmt.getDouble(2));

	
	
	


	System.out.println("Success");

con.close();

}
catch(ClassNotFoundException|SQLException e)
{
e.printStackTrace();	
}
	}

}
