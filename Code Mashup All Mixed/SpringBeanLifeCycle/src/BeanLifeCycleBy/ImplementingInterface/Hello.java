package BeanLifeCycleBy.ImplementingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean
{

	@Override
	public void destroy() throws Exception {
		System.out.println("This method inside DisposableBean Interface");
	}

	public void Sample()
	{
		System.out.println("This my coding Start and ends here");
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This method inside Initializing Interface");
	}

}
