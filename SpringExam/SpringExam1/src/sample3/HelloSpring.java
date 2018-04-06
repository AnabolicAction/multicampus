package sample3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//스프링을 이용해서 접근
public class HelloSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory
		         =new ClassPathXmlApplicationContext("bean.xml");
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello("Spring");
		factory.close();
	}
}
