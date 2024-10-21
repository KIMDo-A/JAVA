// 자식클래스
public class HumanMouse extends Mouse{
	
	public void StressReduce() {
		System.out.println("피로감소");
	}
	
	// 오버라이딩 - 재정의
	public void LeftClick() {
		System.out.println("바꾼좌클릭하기");
		super.LeftClick(); // 부모 출력
		
	}

}
