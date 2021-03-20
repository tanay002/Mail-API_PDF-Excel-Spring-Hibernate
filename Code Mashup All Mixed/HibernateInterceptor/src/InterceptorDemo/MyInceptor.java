package InterceptorDemo;

import java.io.Serializable;
import java.util.Iterator;

import javax.persistence.metamodel.Type;

import org.hibernate.EmptyInterceptor;

public class MyInceptor extends EmptyInterceptor{
	private int updates;
	   private int creates;
	   private int loads;

	public MyInceptor() {
		}
	
	   public void onDelete(Object entity, Serializable id,
			      Object[] state, String[] propertyNames, Type[] types) {
			       // do nothing
			   }

			   // This method is called when Employee object gets updated.
			   public boolean onFlushDirty(Object entity, Serializable id,
			      Object[] currentState, Object[] previousState, String[] propertyNames,
			      Type[] types) {
			         if ( entity instanceof EmployeeDtoIn ) {
			            System.out.println("Update Operation");
			            return true; 
			         }
			         return false;
			   }
				
			   public boolean onLoad(Object entity, Serializable id,
			      Object[] state, String[] propertyNames, Type[] types) {
			         // do nothing
			         return true;
			   }
			   
			   // This method is called when Employee object gets created.
			   public boolean onSave(Object entity, Serializable id,
			      Object[] state, String[] propertyNames, Type[] types) {
			         if ( entity instanceof EmployeeDtoIn ) {
			            System.out.println("Create Operation");
			            return true; 
			         }
			         return false;
			   }
			   
			   //called before commit into database
			   public void preFlush(Iterator iterator) {
			      System.out.println("preFlush");
			   }
			   
			   //called after committed into database
			   public void postFlush(Iterator iterator) {
			      System.out.println("postFlush");
			   }
	

}
