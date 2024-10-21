// 자식클래스, 
public class Folder extends Tell{
	// Tell이라는 클래스로부터 확장시키겠다,물려받겠다,상속을 받겠다
	// extends : 부모 클래스를 상속받겠습니다.
	//			--> 부모클래스로부터 확장 시키겠습니다.
	
	// call(), callSend(), button() 부모로부터 몰려받은 기능
	// ★재정의 --> 메소드 오버라이딩(상속 개념이 포함)★  --cf)오버로딩 중복정의(매개변수만 다르게)
	// 같은이름으로 여러(여러)기능을 만들 수 있음  => 다형성!
	// 자식클래스에서 오버라이딩 했다면, 부모클래스에서 물려준 기능이 아닌 오버라이딩한 기능을 사용한다!
	// 한번 오버라이딩 되면 또 안된다???
	
	public void call() {
		// 오버라이딩 자식 call()
		System.out.println("폴더폰으로 전화를 걸다");
	}
	public void button() {
		// call(); // 따로 정의하지 않아도 부모기능 대로 사용
		// super.call(); // 전화걸다
		// super : 부모클래스의 call을 가르킴! -> 부모클래스 call 출력
		// super : 자식클래스에서 부모클래스를 가르킬때 사용됨!
		System.out.println("다이얼 '클릭해서' 버튼을 누른다");
	}
	// 자식에서 만든 기능은 부모에서 사용할 수 없다!
	public void open() {
		System.out.println("폴더폰을 연다");
	}

}
