package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carTire")   //기본값 : car
public class Car {
	@Autowired
	private Tire tire;

	public Car() {
		super();
	}

	public Car(Tire tire) {
		super();
		this.tire = tire;
	}
	
	public void drive(){
		System.out.println(tire.getBrand() + "로 만들어진 국산 자동차");
	}
}


