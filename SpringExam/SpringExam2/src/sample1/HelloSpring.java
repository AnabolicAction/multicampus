package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory
		    	= new ClassPathXmlApplicationContext("sample1/beans.xml");
		System.out.println("**** Container 초기화 작업 끝 ****");
		
		//클라이언트가 객체생성하기전에 미리생성해둠
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello();                 //주입
		bean.sayHello("banana", 1500);   //대입
		System.out.println(bean);
		System.out.println(factory.getBean("messageBean"));
		System.out.println(factory.getBean("messageBean"));
		((ClassPathXmlApplicationContext)factory).close();
	}
}





