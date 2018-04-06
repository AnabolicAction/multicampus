package anno10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("anno10/bean.xml");
		System.out.println("초기화 완료--------------------");
		MyMessage ob1=(MyMessage)factory.getBean("myMessage");
		System.out.println(ob1.getMessage() +"  "+ob1);
		
		MyMessage ob2=(MyMessage)factory.getBean("myMessage");
		System.out.println(ob2.getMessage() +"  "+ob2);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
