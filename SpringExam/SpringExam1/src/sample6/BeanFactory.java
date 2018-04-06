package sample6;

public class BeanFactory {
	public Tv getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTv();
		}else if(beanName.equals("lg")) {
			return new LgTv();
		}
		return null;
	}
}
