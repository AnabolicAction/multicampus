package anno09;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("userService")   //기본값 : userServiceImpl
public class UserServiceImpl implements UserService{
	//or @Autowired
	@Resource(name="myuser")
	User member;
	
	public void setMember(User member) {
		this.member = member;
	}

	@Override
	public void addUser() {
		System.out.println("추가된 멤버 : " + member.getUserName());
	}
}
