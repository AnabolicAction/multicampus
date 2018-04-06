package sample1;

public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
		super();
		System.out.println("MessageBeanImpl 기본생성자 호출");
	}

	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit + " MessageBeanImpl생성자 호출");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setCost()호출");
	}

	@Override
	public void sayHello() {      // XML를 통한 주입
		System.out.println(fruit + "   " + cost);
	}

	@Override                     
	public void sayHello(String a, int b) {   //메서드를 이용한 대입
		System.out.println(a + "   " + b);
	}
}






