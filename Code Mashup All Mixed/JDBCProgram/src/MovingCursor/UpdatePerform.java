package MovingCursor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerform {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/hmapping";
		String userName="root";
		String password="root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,userName,password);
	
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_UPDATABLE);
		System.out.println("Hii");
	int ss=stmt.executeUpdate("update product set proName='BC' where productId=4");
	System.out.println(ss);
	stmt.close();
	
	
	
	
	
	Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	        ResultSet.CONCUR_UPDATABLE);
	
	
	ResultSet rs=st.executeQuery("select * from product");  
    
	// Getting Results ifrom ForWard only direction
	System.out.println("Moving Forward");

	rs.first();
	//rs.previous(); 
	while(rs.next())
	   {		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
	   }	
	 
   rs.afterLast();
	System.out.println("moving backward");
	   while(rs.previous())
	   {		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
	   }

	st.close();
	
	    
	// Getting Results ifrom ForWard only direction
			System.out.println("Success");

		
		
	}

		

}
