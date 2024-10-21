package 인터페이스;
//두번째
public class KartMain {

	public static void main(String[] args) {
		// 구현이 안되있기때문에
		// KartRider k = new KartRider();
		// 기본적으로는 생성자를 만들어서 객체 만들 수 없음
		// 인터페이스로 객체 생성 불가
		// 그럼 어떻게 구현할까?
		// 카트들을 만들수있는 클래스가 필요하다! 상속받는 클래스 만들기
		// LuxuryKart 클래스만들기
		
		// 네번째
		// 객체만듬
		// 인터페이스 왜먄듬? 카트라이더 여러차들에서 이 기능만들어야해!의무성주입하기위해서 만들었음
		// 반드시 이차에 기능이 있어야 하는데 한번에 만들기위해
		// 이 카트 만들려면 이 기능 무조건있어야해 하고 이 기능꼭만듭시다!!이프로젝트만들때 이거 꼭넣자 하고 정해놓은게 인터페이스임
		LuxuryKart kart1 = new LuxuryKart(); 
		kart1.go();
		
		// 상위클래스로 다루기 업캐스팅 ???????????이해못함 
		SolidKart kart2 = new SolidKart();
		KartRider kart = kart2;
		kart.go(); 

	}

}
