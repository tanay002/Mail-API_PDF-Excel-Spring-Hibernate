package MovingCursor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/hmapping";
		String userName="root";
		String password="root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,userName,password);
	
		/*Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
		        ResultSet.CONCUR_READ_ONLY);
		*/
	/*	Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
		        ResultSet.CONCUR_UPDATABLE);
	*/	
		Statement stmt = con.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
	              java.sql.ResultSet.CONCUR_READ_ONLY);
	stmt.setFetchSize(Integer.MIN_VALUE);

		
/*		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY);
	*/ResultSet rs=stmt.executeQuery("select * from product");  
	    
	// Getting Results ifrom ForWard only direction
	System.out.println("Moving Forward");

	//rs.first();
	//rs.previous(); 
	while(rs.next())
	   {		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
	   }	
	 
   // rs.afterLast();
	System.out.println("moving backward");
	   while(rs.previous())
	   {		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
	   }
/*	boolean b=rs.first();
	System.out.println(b);   
*/	
	
	// Getting Results ifrom ForWard only direction
			//	System.out.println("Moving Forward");
			
		   
		//   rs.previous();
			 
			

		//	System.out.println("Success");

		
		
	}

		
	}

