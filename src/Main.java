import java.io.*;
import java.util.*;
public class Main {
	static String username;
	static char[] password;
	public static void main(String[] args) throws Exception {
		System.out.println("******Welcome to Student Management App*****");
		Console console = System.console();
		Scanner y = new Scanner(System.in);
		System.out.print("Username : ");
		username = y.nextLine();
		password = console.readPassword("Password : ");
		
		
		
	}

}
