package anno05;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire{

	@Override
	public String getBrand() {
		return "�ѱ� Ÿ�̾�";
	}
}
