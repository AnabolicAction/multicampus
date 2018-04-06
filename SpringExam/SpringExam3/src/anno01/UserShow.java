package anno01;

public class UserShow {
	private User user;

	public UserShow() {		
		super();
		System.out.println("생성자 호출(no-args)");
	}

	public UserShow(User user) {
		super();
		this.user = user;
		System.out.println("생성자 호출(User-args)");
	}

	public void setUser(User user) {
		System.out.println("setter 호출");
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserShow [user=" + user + "]";
	}

}
