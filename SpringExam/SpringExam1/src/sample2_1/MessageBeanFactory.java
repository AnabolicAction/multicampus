package sample2_1;

public class MessageBeanFactory {
	public static MessageBean getBean(){
		java.util.Random rand=new java.util.Random();
		MessageBean result;
		if(rand.nextBoolean())
			result=new MessageBeanKr();
			else
				result=new MessageBeanEn();
			return result;
		
						
		
	}
}
