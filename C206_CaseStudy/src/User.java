

public class User{
	private int userId;
	private String role ;
	private int contactNum;
	private String username;
	private String password;

	public User(int userId, String role , int contactNum, String username,
	 String password) {
		this.userId=userId;
		this.role=role;
		this.contactNum = contactNum;
		this.username=username;
		this.password=password;
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role=role;
	}

	public int getconatctNum() {
		return contactNum;
	}

	public void setMobileNum(int contactNum) {
		this.contactNum = contactNum;
	}
	public String getUsername() {
		return username;
}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}