package 인터페이스;
// 세번째
// 자동차와 관련된 기능을 위해 인터페이스 상속받아오기
// 인터페이스를 상속받기때문에 implement사용
public class LuxuryKart implements KartRider{
	
	//implement : 인터페이스 상속 키워드
	// 클래스는 다중상속불가능함->왜? 클래스는 구현되있음
	// 또한 부모가 여러개이면 어떤거 오버라이딩할지 모르기때문
	// 인터페이스는 다중상속이 가능함->왜? 구현이 안되어있으므로 
	// 또한 어차피 아래에서 새롭게 구현할꺼니까!
	// 추상메서드만 갖을 수 있다
		
	// 인터페이스 상속하겠다- > 추상메소드 구현하기
	// 빨간줄위에 add unimplenet~ 누르기
	// 세가지 재정의 오버라이딩 구현해야해!~
	// 각 자동차에 맞게끔 기능 만들기
	// 이제 하나의 차를 만들어서 탈수있음 -> 객체 만들기 main에서~

	@Override
	public void go() {
		System.out.println("선장님 출발");
		
	}

	@Override
	public void back() {
		System.out.println("선장님 후진");
		
	}

	@Override
	public void booster() {
		System.out.println("선장님 부스터~~~");
		
	}
	

	

}
