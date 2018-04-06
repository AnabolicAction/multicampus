package exam2;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anno10.MyMessage;

public class GreetingTest {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("exam2/greeting.xml");
		int time = LocalDateTime.now().getHour();
		Greeting gt=null;
		if(time<12){
			gt=(MorningGreetingImpl)factory.getBean("morningGreetingImpl");	
		}else if(time<17){
			gt=(AfternoonGreetingImpl)factory.getBean("afternoonGreetingImpl");
		}else if(time<22){
			gt=(EveningGreetingImpl)factory.getBean("eveningGreetingImpl");
		}
		
		gt.greet();
		
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
