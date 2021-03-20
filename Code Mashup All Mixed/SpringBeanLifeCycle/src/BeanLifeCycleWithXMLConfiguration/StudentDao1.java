package BeanLifeCycleWithXMLConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao1 {

	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	//defining connection object
	Connection con;
	
	
	public String getDriver() {
	
		return driver;
	}


	public void setDriver(String driver) {
		System.out.println("Setting Driver...");
		this.driver = driver;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		System.out.println("Setting url...");
		this.url = url;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		System.out.println("Setting username...");
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		System.out.println("Setting Password...");
		this.password = password;
	}


	//for maintaining standard make init method
	public void init()throws ClassNotFoundException, SQLException
	{
		
		System.out.println("inside the custom init method");
		createStudentDbConnection();	
		
	}
	
	
	//this method call automatically in every utility method
	//@PostConstruct                                                     //once the object get constructed          //if this method comment so NullPointerException come
	
	//so we call init method in xml file 
	public void createStudentDbConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating Connection....");
		
		//load driver
				Class.forName(driver);
				//get a connection
			 con=	DriverManager.getConnection(url,username,password);
				
	}
	
	//Fatch all row
	public void selectAllRow() throws ClassNotFoundException, SQLException
	{
//		createStudentDbConnection();       //if we don't call this method than come null pointer exception    //if 50 utility method than 50 time we call this method
		
		System.out.println("Retriving All Student Data");
		
		
		//execute query
		Statement stmt=con.createStatement();   
		
		ResultSet rs=stmt.executeQuery("select * from HostalStudentInfo");
		
		while(rs.next())
		{
			int studentId=rs.getInt(1);
			String studentName=rs.getString(2);
			int hostalFee=rs.getInt(3);
			String foodtype=rs.getString(4);
			System.out.println(studentId+"  "+studentName+"   "+hostalFee+"  "+foodtype);
		}
	
	}
		//DeleteRecord
		/*public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException
		{
	//		createStudentDbConnection();                                when we create anotation than no need to call this method
			
			//execute query
			Statement stmt1=con.createStatement();
			System.out.println("Statement is created");
			
			stmt1.executeUpdate("delete from student.HostalStudentInfo where StudentId="+studentId);
			
			
			
				System.out.println("Record deleted with the id"+studentId);
			}
		*/	
		public void closeConnection() throws SQLException
		{
			
		//	Not print in consol so context.close method call first then this method execute
			//closing he connection
			con.close();
			
			
		}
			//@PreDestroy
			public void destroy() throws SQLException
			{
				
				System.out.println("inside destroy method");
				//cleanup job
				 closeConnection();
			
				
			}
			}
