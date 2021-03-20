package JdbcCallStoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ParamProcedureCall {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/plsqldemo","root","root");
	
		CallableStatement stmt=con.prepareCall("{call ProINParam4(?,?,?)}");
		System.out.println("Hii");
		stmt.setInt(1, 5);
		stmt.setString(3,"puyt" );
		stmt.setInt(2, 30000);
	stmt.registerOutParameter(2, java.sql.Types.INTEGER);
		stmt.executeUpdate();
		//	System.out.println(stmt.getInt(1)+","+stmt.getString(2)+","+stmt.getInt(3));
		System.out.println("Success");
	
	con.close();
	}
}
