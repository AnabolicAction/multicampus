package anno09;

public class User {
	private String userName;

	public User() {
		super();
	}

	public User(String userName) {
		super();
		this.userName = userName;      //홍길동 주입
	}

	public String getUserName() {
		return userName;
	}
}
