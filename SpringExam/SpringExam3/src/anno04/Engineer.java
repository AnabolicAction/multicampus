package anno04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//기본생성자, setter, toString()
@Component
public class Engineer {
	//@Autowired
	//@Qualifier("emp2") //Autowired,Qualifier 이둘은 spring 전용 애노테이션
	@Resource(name="emp1")  //자바전용 애노테이션
	//name="emp1" 이게없으면 먼저 이름으로 찾아보고 없으면 타입으로 Autowired해준다 Autowired랑 기능 비슷.
	private Emp emp;
	private String dept;
	
	public Engineer() {
		super();
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp.toString()+"\n"+ dept +"에 근무 합니다";
	}
}







