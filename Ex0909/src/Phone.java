
public class Phone {
	// 현실세계 phone을 대신해서 사용할 수 있는 것
	// 클래스 : 사용자 임의의 "자료형"!
	
	// 데이터(필드) -> 변수
	// 전화번호
	//String number = "01047685180";
	// 기종
	//String kind = "G23";
	// 통신사
	//String tel = "SK";
	
	
	// 데이터를 바꿀때 하나하나 바꿔야 하는게 귀찮음
	// 두번째 방법 : 데이터 공간만 만듬 
	// 보통 데이터를 안넣음
	String number;
	String kind;
	String tel;
	
	// 생성자 오버로딩
	// 중복정의(매개변수만 다르게해서)
	// 생성자 오버로딩 = 중복정의(매개변수만 다르게해서)
	// 생성자 : 객체를 만들때 클래스의 공간을 만들어주는 기능(메서드)
	// 특징1. 반환타입 자체가 없다(공간을 만들겠다, 써야하는 로직이 있음)
	// 특징2. 생성자의 이름은 클래스명과 동일해야만 한다
	
	// default 생성자 -> 다른 생성자가 만들어지기 전까지만 사용 가능하다!
	public Phone() { // -> 이 구조가 defualt 생성자 꼭 써야함
		
	}
	
	//오버로딩을 하려면 defulat를 꼭 써야함!
	public Phone(String number, String kind, String tel) {
		// 3개의 데이터를 넘겨받아야 함
		// 위 3개의 변수와 다름!!!!
		// this : 이 클래스를 가르킴
		// this에, 받아온 값을 넣어주겠다.
		this.number = number;
		// this.number는 위에 있는 String number;임
		this.kind = kind;
		this.tel = tel;
		
	}
	
	// 기능 -> 메소드
	// 전화를 걸다
	// static은 main과 공유하면서 main에게 알려주기 위해 사용했었음,
	// 클래스에서 안적는이유는, 객체를 main안에서 만들었기 때문에 안적어도 됌 -> void
	// 클래스에서 만든 method는 static을 적지 않아도 됌
	public void call() {
		System.out.println("전화를 걸다");
	}
	// 문자를 보내다
	public void message() {
		System.out.println("문자를 보내다");
	}
	// 인터넷을 하다
	public void internet() {
		System.out.println("인터넷을 하다");
	}

}
