package sample2;

//의존관계를 약하게 설정하는 프로그램(결합도를 낮춤)
public class HelloSpring {
	public static void main(String[] args) {
//		MessageBean bean=new MessageBeanEn();
//		bean.sayHello("Spring");
		
		MessageBean bean=new MessageBeanKr();
		bean.sayHello("스프링");
	}
}
