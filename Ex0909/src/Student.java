
public class Student {
	
	// private : 나만 사용하겠다!(접근제한자) -> 제대로 정보은닉하기 위해서는 private을 써야함
	// private : 제일 좁은 접근 제한자 
	// --> 현재 클래스에서만 사용하겠습니다!!
	// default 접근제한자 : 같은 클래스, 같은 패키지, 상속 받은 클래스에서 사용X
	// protected 접근제한자 : 같은 클래스, 같은 패키지, 상속 받은 클래스 O
	
	//① 데이터(필드)
	private String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	// Student 클래스 안에 Student()생성자가 있으므로, 생성자 통해 쓰면 정보를 수정할 수 있다.!
	// ②
	// Student()생성자 - 임의로 만듬 공간만 만들어줌, 6개 데이터 받아와서 넣겠다, 클래스만들겠다
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		// 매개변수와 위 필드명이 같으므로 구별하기 위해서 ★ this를 넣은거임★
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	// 기능(메소드)
	// show --> 객체가 가지는 정보 출력 기능
	public void show() {
		// show()는 매개변수를 필드명과 같은 매개변수를 받아오지 않기때문에 this를 안써도 됌!!
		// 같은 이름의 매개변수가 없다면, -> 클래스가 가지고 있는 필드를 의미한다!
		
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.println(name + "님의 Java 점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web 점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android 점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("===============================================");
	    }
	
}
