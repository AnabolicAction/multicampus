package anno06;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
@Autowired : 스프링 전용, 먼저 변수명과 동일한 name으로 찾고 없으면 type으로 찾는다.
                     객체의 이름 지정하려면 @Qualifier 애노테이션을 추가로 사용한다.
@Resource : 자바전용, 먼저 변수명과 동일한 name으로 찾고 없으면 type으로 찾는다.
                     객체의 이름 지정하려면 name 속성을 설정한다.
*/

@Component("mySchool")
public class School {
	@Autowired
	public Student person;
	
	@Resource(name="grade")
	public int grade;
	
	public School() {
		super();
	}
	public School(Student person) {
		super();
		this.person = person;
	}
	@Override
	public String toString() {
		return "ABC고등학교 [학생정보=" + person.toString() + "학년=" + grade + "]";
	}
}




