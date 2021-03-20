package jdbcCallFunctParameter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class ParamFunCall {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/plsqldemo","root","root");
	
		CallableStatement stmt=con.prepareCall("{?= call `plsqldemo`.`FunJdbcCall`(?)}");
		stmt.setInt(2, 2);

	stmt.registerOutParameter(1, Types.VARCHAR);
	System.out.println("Hii");
	//System.out.println(stmt.getInt(1)+","+stmt.getInt(2)+","+stmt.getString(3));
	stmt.execute();
	String n = stmt.getString(1);
	System.out.println(n);
	/*
	ResultSet rs=stmt.executeQuery();
	while(rs.next())
	{
		System.out.println(stmt.getInt(1)+","+stmt.getInt(2)+","+stmt.getString(3));
	}
	*/System.out.println("Success");
	
	con.close();
	}

	}


