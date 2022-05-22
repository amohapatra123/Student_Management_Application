import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	static Connection connection;
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Auth auth = new Auth();
			connection = DriverManager.getConnection(auth.getUrl(), auth.getUsername(),auth.getPassword());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
