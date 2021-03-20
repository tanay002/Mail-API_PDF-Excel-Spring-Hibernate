package InterceptorDemo;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InterceptMain {
	private static SessionFactory sf ;
	Transaction tx = null;
	Session ses = null;

	public InterceptMain() {
	}

	public static void main(String[] args) {
		  
	      try {
	         sf = new Configuration().configure("Intercept.cfg.xml").buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }

		
		
		InterceptMain im = new InterceptMain();

		/* Add few employee records in database */
		Integer empID1 = im.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = im.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = im.addEmployee("John", "Paul", 10000);

		
		im.addEmployee("Zara", "Ali", 1000);
		/* List down all the employees */
		im.listEmployees();

		/* Update employee's records */
		im.updateEmployee(empID1, 5000);

		/* Delete an employee from the database */
		im.deleteEmployee(empID2);

		/* List down new list of the employees */
	im.listEmployees();
	}

	/* Method to CREATE an employee in the database */
	public Integer addEmployee(String fname, String lname, int salary) {
		
		MyInceptor m = new MyInceptor();
		System.out.println(m);

		ses=sf.openSession(m);
		Transaction tx = null;
		
		Integer employeeID = null;
		tx = ses.beginTransaction();
		System.out.println("Hello");
	
		EmployeeDtoIn employee = new EmployeeDtoIn(fname, lname, salary);
		employeeID = (Integer) ses.save(employee);

		System.out.println("Add Employee Data");
		tx.commit();
		ses.close();

		return employeeID;
	}

	/* Method to READ all the employees */
	public void listEmployees() {
		ses=sf.openSession(new MyInceptor());
		tx = ses.beginTransaction();
		List employees = ses.createQuery("FROM EmployeeDtoIn").list();
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			EmployeeDtoIn employee = (EmployeeDtoIn) iterator.next();
			System.out.print("First Name: " + employee.getFirstName());
			System.out.print("  Last Name: " + employee.getLastName());
			System.out.println("  Salary: " + employee.getSalary());
		}

		System.out.println("Show Read List Employee");
		tx.commit();
		ses.close();

	}

	/* Method to UPDATE salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary) {
		ses=sf.openSession(new MyInceptor());

		tx = ses.beginTransaction();
		EmployeeDtoIn employee = (EmployeeDtoIn) ses.get(EmployeeDtoIn.class, EmployeeID);
		employee.setSalary(salary);
		ses.update(employee);
		System.out.println("Update Employee");
		tx.commit();
		ses.close();

	}

	/* Method to DELETE an employee from the records */
	public void deleteEmployee(Integer EmployeeID) {

		Session ses = sf.openSession(new MyInceptor());

		tx = ses.beginTransaction();
		EmployeeDtoIn employee = (EmployeeDtoIn) ses.get(EmployeeDtoIn.class, EmployeeID);
		ses.delete(employee);

		System.out.println("Deelete Employee");
		tx.commit();
		ses.close();

	}
}
