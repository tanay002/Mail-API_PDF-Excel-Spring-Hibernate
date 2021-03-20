package TriggerJDBC;


import java.sql.*;

import java.sql.SQLException;



public class TriggerDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try {
			int status = 0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plsqldemo", "root", "root");
		
				System.out.println("Hii");
				
				String sql = "INSERT INTO employee1 VALUES (?, ?, ?)";
				PreparedStatement stmt=con.prepareStatement(sql);
				stmt.setInt(1, 11);
				stmt.setString(2, "Preeti");
				stmt.setInt(3, 160000);

				stmt.executeUpdate();
			//	System.out.println(stmt.getInt(1) + "," + stmt.getString(2) + "," + stmt.getInt(3));
			
			System.out.println("Success");

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
