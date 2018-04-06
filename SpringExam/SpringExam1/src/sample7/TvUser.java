package sample7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//bean.xml을 이용해서 결합도를 낮춤
public class TvUser {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory
        	=new ClassPathXmlApplicationContext("bean.xml");
		Tv tv=(Tv)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		factory.close();
	}
}
