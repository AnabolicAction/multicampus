package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory
		    	= new ClassPathXmlApplicationContext("sample1/beans.xml");
		System.out.println("**** Container �ʱ�ȭ �۾� �� ****");
		
		//Ŭ���̾�Ʈ�� ��ü�����ϱ����� �̸������ص�
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello();                 //����
		bean.sayHello("banana", 1500);   //����
		System.out.println(bean);
		System.out.println(factory.getBean("messageBean"));
		System.out.println(factory.getBean("messageBean"));
		((ClassPathXmlApplicationContext)factory).close();
	}
}




