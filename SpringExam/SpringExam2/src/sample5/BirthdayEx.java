package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayEx {
	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("sample5/date.xml");
		
		//또는   DateVo ob1=(DateVo)factory.getBean("hong");
		//getBean에서 hong이라는 애를 찾아와서 (DateVo)로 형변환하여 ob1 에 넣어준다
		DateVo ob1=factory.getBean("hong", DateVo.class);
		//hong이란 이름을 찾아서 DateVo.class(class타입의 객체가된다) 형태로 강제로 형변환해서 주세요
		
		System.out.println(ob1.toString());
		
		DateVo  ob2=factory.getBean("lee", DateVo.class);
		System.out.println(ob2.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
