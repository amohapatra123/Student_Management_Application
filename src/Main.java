import java.util.*;
public class Main {
	static Scanner y = new Scanner(System.in);
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
			System.out.println();
			System.out.println("Press 1 to insert student detail");
			System.out.println("Press 2 to delete student detail");
			System.out.println("Press 3 to update student detail");
			System.out.println("Press 4 to display student detail");
			int choice = y.nextInt();
			//add a student
			if(choice==1) {
				takeInfo();
				Student s = new Student(name,age,phone,fathers_name,dob,gender,address);				
				boolean res = Operations.InsertStudent(s);
				if(res) {
					System.out.println("Student added successfully....");
				}else {
					System.out.println("Somthing went wrong , please try later");
				}
			}else if(choice==2) {
				System.out.println("Press 1 to delete by id");
				System.out.println("Press 2 to delete by phone number");
				int ch = y.nextInt();
				if(ch==1) {
					System.out.println("Enter id : ");
					int id = y.nextInt();
					boolean res = Operations.DeleteStudentById(id);
					if(res) {
						System.out.println("Student deleted successfully....");
					}else {
						System.out.println("Somthing went wrong , please try later");
					}
				}else if(ch==2) {
					System.out.println("Enter phone number : ");
					y.nextLine();
					phone  = y.nextLine();
					boolean res = Operations.DeleteStudentByPhone(phone);
					if(res) {
						System.out.println("Student deleted successfully....");
					}else {
						System.out.println("Somthing went wrong , please try later");
					}
				}
			}else if(choice==3) {
				System.out.println("Press 1 to update by id");
				System.out.println("Press 2 to update by phone number");
				int ch = y.nextInt();
				
				if(ch==1) {
					System.out.println("Enter id : ");
					int id = y.nextInt();
					takeInfo();
					Student s = new Student(name,age,phone,fathers_name,dob,gender,address);
					boolean res = Operations.UpdateStudentById(s,id);
					if(res) {
						System.out.println("Student updated successfully....");
					}else {
						System.out.println("Somthing went wrong , please try later");
					}
				}else if(ch==2) {
					System.out.println("Enter phone number : ");
					y.nextLine();
					String phone_for_update = y.next();
					takeInfo();
					Student s = new Student(name,age,phone,fathers_name,dob,gender,address);
					boolean res = Operations.UpdateStudentByPhone(s,phone_for_update);
					if(res) {
						System.out.println("Student updated successfully....");
					}else {
						System.out.println("Somthing went wrong , please try later");
					}
				}
				
			}else if(choice==4) {
				
			}else if(choice==5) {
				break;
			}
		}
		System.out.println("Thank You !!");
	}
	
	public static void takeInfo() {

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
	}

}
