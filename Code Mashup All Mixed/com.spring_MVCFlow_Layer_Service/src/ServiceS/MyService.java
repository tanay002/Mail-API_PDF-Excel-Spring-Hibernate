package ServiceS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import DataAccessObject.MyDao;
import MVCFlow_Layer_Service.UserDto;

public class MyService {

	@Autowired
    @Qualifier(value="MyDao")
	private MyDao m;
	
	public MyService() {
		super();
	}
	public boolean doUserReg(UserDto u)
	{	
		if(u!=null)
		{
	boolean b=m.doUserReg(u);
	return b;
		}
		else
	return false;
}
/*	public UserDto doUserLogin(UserDto u) throws Exception
	{
		if(u!=null)
		{
	u=m.doUserLogin(u);
		return u;
	}
		
		else
	return null;
		}	
	public boolean doDelete(UserDto u)
	{
	

		SessionFactory sf=t.getSessionFactory();
		Session s=sf.openSession();
		int a=u.getUid();
		Query q=s.createQuery("delete form UserDto where uid='"+a+"'");
		System.out.println(q);
		
		boolean b=false;
		if(u!=null)
			b=m.doDelete(u);
			return b;
		
		
}
*/}