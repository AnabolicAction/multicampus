package exam2;

import org.springframework.stereotype.Component;

@Component
public class AfternoonGreetingImpl implements Greeting{


	@Override
	public void greet() {
		System.out.println("��ſ� ���ĵǼ���");
		
	}

}