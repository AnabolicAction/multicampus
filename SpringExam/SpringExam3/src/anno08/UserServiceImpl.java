package anno08;

public class UserServiceImpl implements UserService{
	
	User member;
	
	public void setMember(User member) {
		this.member = member;
	}

	@Override
	public void addUser() {
		System.out.println("Ãß°¡µÈ ¸â¹ö : " + member.getUserName());
	}
}

















