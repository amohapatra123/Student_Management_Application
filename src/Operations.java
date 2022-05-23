import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
    public static boolean DeleteStudentById(int id) {
		
		try {
			Connection connection = Connector.createConnection();
			String query = "delete from student where id=?";
			PreparedStatement p = connection.prepareStatement(query);
			p.setInt(1, id);
			p.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
    
    public static boolean DeleteStudentByPhone(String phone) {
		
		try {
			Connection connection = Connector.createConnection();
			String query = "delete from student where phone=?";
			PreparedStatement p = connection.prepareStatement(query);
			p.setString(1,phone);
			p.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
    
    public static boolean UpdateStudentById(Student stud,int id) {
		
		try {
			Connection connection = Connector.createConnection();
			String query = "update student set name=?,age=?,phone=?,fathers_name=?,dob=?,gender=?,address=? where id=?";
			PreparedStatement p = connection.prepareStatement(query);
			p.setString(1, stud.getName());
			p.setInt(2, stud.getAge());
			p.setString(3,stud.getPhone());
			p.setString(4, stud.getFathers_name());
			p.setString(5, stud.getDob());
			p.setString(6,stud.getGender());
			p.setString(7, stud.getAddress());
			p.setInt(8, id);
			p.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
    
    public static boolean UpdateStudentByPhone(Student stud,String phone_for_update) {
		
		try {
			Connection connection = Connector.createConnection();
			String query = "update student set name=?,age=?,phone=?,fathers_name=?,dob=?,gender=?,address=? where phone=?";
			PreparedStatement p = connection.prepareStatement(query);
			p.setString(1, stud.getName());
			p.setInt(2, stud.getAge());
			p.setString(3,stud.getPhone());
			p.setString(4, stud.getFathers_name());
			p.setString(5, stud.getDob());
			p.setString(6,stud.getGender());
			p.setString(7, stud.getAddress());
			p.setString(8, phone_for_update);
			p.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
    
    public static void DisplayStudents() {
    	
    	try {
    		Connection connection = Connector.createConnection();
        	String query = "select * from student";
        	Statement s = connection.createStatement();
        	ResultSet r = s.executeQuery(query);
        	while(r.next()) {
        		System.out.println("Name : "+r.getString("name"));
        		System.out.println("Age : "+r.getInt("age"));
        		System.out.println("Phone : "+r.getString("phone"));
        		System.out.println("Fathers name : "+r.getString("fathers_name"));
        		System.out.println("DOB : "+r.getString("dob"));
        		System.out.println("Gender : "+r.getString("gender"));
        		System.out.println("Address : "+r.getString("address"));
        		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        	}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	
    }
}
