
public class Auth {
	private String username = "root";
	private String password = "Anshuman@2001";
	private String url = "jdbc:mysql://localhost:3306/student_management_application";
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "Auth [username=" + username + ", password=" + password + "]";
	}
}
