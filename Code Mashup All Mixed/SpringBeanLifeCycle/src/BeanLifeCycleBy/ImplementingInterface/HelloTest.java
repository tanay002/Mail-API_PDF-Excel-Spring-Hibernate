package BeanLifeCycleBy.ImplementingInterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean3.xml");

		Hello hello=context.getBean("hello",Hello.class);
		hello. Sample();
		context.close();
	}

}
