
public class Student {
	private String name;
	private int age;
	private String phone;
	private String fathers_name;
	private String dob;
	private String gender;
	private String address;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getFathers_name() {
		return fathers_name;
	}
	public String getDob() {
		return dob;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public Student(String name, int age, String phone, String fathers_name, String dob, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.fathers_name = fathers_name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
}
