package 인터페이스;
// 클래스에서 인터페이스로 바뀜
// 인터페이스는 먼저 정의하고 시작
// 이건 여기에 꼭 있어야함 지정하고 시작 
// 그 다음 implement를 적고 함
// ①
public interface KartRider {
	// 새로 만들어야 한다고 정의하기 -> abstract 추상메소드
	
	// 인터페이스 : 프로젝트 시작시 어떤 기능을 반드시 만들껀지 정의 하는 설계도
	// 카트라이더 만들기위해 아래 세가지 기능 정의만. 함
	// 의무성을 주입해서 정의! --> 추상 메소드만 사용 가능하다! 우리 이렇게 만들꺼야~
	// 만들꺼야라고 희망사항만 말했을 뿐, 클래스 객체 아직 안만듬
	// KartMain이동ㄴ
	// 구현이 안되어있다->main에서 구현
	
	// Kartrider라는 인터페이스가 럭셔리 상속받음, 솔리드카트에서 
	// 상수 --> final키워드 붙이기
	// 값이 안바뀜
	// 인터페이스 안에 변수 만들면, 미리 정의해야하기때문에 상수형태로 만들어야함
	// final int number = 10;
	// 여기서 지정하고 시작
	int number = 10; // final 생략 가능
	int startpoint = 0; // 미리 정함
	
	
	//1. 전진
	// public abstract void go(); // 구현정의안한다!
	void go(); 
	// public abstract 생략 가능
	
	
	//2. 후진
	public abstract void back();
	
	//3. 부스터
	public abstract void booster();

}
