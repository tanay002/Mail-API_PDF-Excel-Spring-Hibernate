package DataAccessObject;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import MVCFlow_Layer_Service.UserDto;

@Repository
public class MyDao {

	@Autowired
	HibernateTemplate t;
	
	public boolean doUserReg(UserDto u)
	{		
		int n=(int)t.save(u);	
		if(n!=0)
		{
			return true;	
		}
		else
		{
			return false;
		}
}
	/*public UserDto doUserLogin(UserDto u)throws Exception
	{
	String userName=u.getUname();
	String password=u.getPass();
	
	System.out.println(userName);
	System.out.println(password);
	
	SessionFactory sf=t.getSessionFactory();
	Session s=sf.openSession();
	
	Query q=s.createQuery("form UserDto where userName='"+userName+"' and password='"+password+"'");
	System.out.println(q);
	List l=q.list();
	System.out.println(l);
	s.close();
	if(l.size()!=0)
	{
		Iterator itr=l.iterator();
		u=(UserDto)itr.next();
		
	}
	else
	{
		u=null;
	}
	if(u!=null)
	{
		return u;
	}
	else
	{
		return null;
	}
	}
		

public boolean doDelete(UserDto u)
{


	SessionFactory sf=t.getSessionFactory();
	Session s=sf.openSession();
	int a=u.getUid();
	Query q=s.createQuery("delete form UserDto where uid='"+a+"'");
	System.out.println(q);
		
	
	if(u!=null)
	{
		t.delete(u);
		return true;
	}
	else 
		return false;
}*/
}