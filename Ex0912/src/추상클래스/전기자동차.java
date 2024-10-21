package 추상클래스;

public class 전기자동차 extends 자동차{
	
	// 자동차기능 받기
	@Override
	public void run() {
		System.out.println("전기로 달리다!");	
	}
	// 추상메소드는 반드시 자식클래스에서 의무성을 띔
	// 추상클래스는 중요한점이 만들어진 과정임
	// 전기, 휘발, 수소만들다 보니 자동차는 달린다라는 기능run()이 필요해
	// 그럼 얘를 다음클래스부터 넣을수있게끔 추상화로 의미 부여해주자!	
}
