import java.util.*;
public class Main {
	static String username;
	static String  password;
	public static void main(String[] args){
		System.out.println("******Welcome to Student Management App*****");
		Scanner y = new Scanner(System.in);
		System.out.print("Username : ");
		username = y.nextLine();
		System.out.print("Password : ");
		password = y.nextLine();
	
		boolean to_run = true;
		Auth auth = new Auth();
		if(auth.getUsername().equals(username) && auth.getPassword().equals(password)) {
			System.out.println("Access Granted....");
		}else {
			to_run = false;
			System.out.println("Wrong Credentials...");
		}
		
		while(to_run) {
			
			System.out.println("Press 1 to insert student detail");
			int choice = y.nextInt();
			if(choice==1) {
				Student s = new Student();
				s.setName("Anshuman Mohapatra");
				s.setAge(21);
				s.setPhone("8895455356");
				s.setFathers_name("Dilip Kumar Mohapatra");
				s.setDob("26-DEC-01");
				s.setGender("Male");
				s.setAddress("Aiginia, Bhubaneswar");
				boolean res = Operations.InsertStudent(s);
				if(res) {
					System.out.println("Student added successfully....");
				}else {
					System.out.println("Somthing went wrong , please try later");
				}
			}
		}
		
	}

}
