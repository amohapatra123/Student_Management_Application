import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operations {
	static boolean result = false;
	public static boolean InsertStudent(Student stud) {
		
		try {
			Connection connection = Connector.createConnection();
			String query = "insert into student(name,age,phone,fathers_name,dob,gender,address) values(?,?,?,?,?,?,?)";
			PreparedStatement p = connection.prepareStatement(query);
			p.setString(1, stud.getName());
			p.setInt(2, stud.getAge());
			p.setString(3,stud.getPhone());
			p.setString(4, stud.getFathers_name());
			p.setString(5, stud.getDob());
			p.setString(6,stud.getGender());
			p.setString(7, stud.getAddress());
			p.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
