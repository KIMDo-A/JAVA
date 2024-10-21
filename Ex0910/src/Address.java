
public class Address {
	
	private String name;
	private int age;
	private String phoneNumber;
	
	public Address(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	// getter 값 가져오기
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
