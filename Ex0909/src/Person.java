
public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 필드값 변경
	public void setName(String name) {
		this.name = name;
	}
	// 필드값 꺼내오기
	public String getName(){
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public int getAge(){
		return age;
	}
}
