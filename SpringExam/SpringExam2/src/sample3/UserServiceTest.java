package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample2.InterFoo;

public class UserServiceTest {
	public static void main(String[] args) {
		ApplicationContext factory
        		=new ClassPathXmlApplicationContext("sample3/applicationContext.xml");
		System.out.println("** Container 초기화 작업 완료 **");
		
		UserService u1=(UserService)factory.getBean("userService");
		//UserVo vo=new UserVo("둘리");
		UserVo vo=(UserVo)factory.getBean("userService1");
		u1.addUser(vo);
		System.out.println(u1);
		System.out.println("----------------------------------------------------");
		
		UserService u2=factory.getBean("userService", UserService.class);
		UserVo vo2=(UserVo)factory.getBean("userService2");
		u2.addUser(vo2);
		System.out.println(u2);		
		((ClassPathXmlApplicationContext)factory).close();
	}
}





