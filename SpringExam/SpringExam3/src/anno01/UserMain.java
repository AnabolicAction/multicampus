package anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext factory 
		    = new ClassPathXmlApplicationContext("anno01/bean.xml");
		
		UserShow ob=factory.getBean("myProcess1", UserShow.class);
		System.out.println(ob.toString());		
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
