import java.util.*;
public class Main {
	static String username;
	static String  password;
	static String name;
	static int age;
	static String phone;
	static String fathers_name;
	static String dob;
	static String gender;
	static String address;
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
				
				System.out.println("Name : ");
				y.nextLine();
				name = y.nextLine();
				System.out.print("Age : ");
				age = y.nextInt();
				y.nextLine();
				System.out.print("Phone : ");
				phone = y.nextLine();
				System.out.print("Fathers Name : ");
				fathers_name = y.nextLine();
				System.out.print("DOB (eg. 21-MAR-09) : ");
				dob = y.nextLine();
				System.out.print("Gender : ");
				gender = y.nextLine();
				System.out.print("Address : ");
				address = y.nextLine();
				Student s = new Student(name,age,phone,fathers_name,dob,gender,address);				
//				s.setAge(age);				
//				s.setPhone(phone);				
//				s.setFathers_name(fathers_name);				
//				s.setDob(dob);				
//				s.setGender(gender);				
//				s.setAddress(address);
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
