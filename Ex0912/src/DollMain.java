
// 인형뽑기
public class DollMain {

	public static void main(String[] args) {
		
		// 포켓몬 인형뽑기
		// 피카츄 인형을 뽑고싶어요! -> 객체만들기	
		Pika d1 = new Pika();
		//d1.pick(); // "피카츄 인형을 뽑다"
		
		//하지만, 나는 객체를 기계에 담아서!! 기계에서 뽑을꺼야
		machineControll(d1);
		// 잠만보 인형을 뽑고 싶어요!
		Zam d2 = new Zam();
		machineControll(d2);
		// 치코리타 인형을 뽑고 싶어요!
		Chico d3 = new Chico();
		machineControll(d3);
	}
	
	// (Doll d) : 매개변수 d는 이미 외부에서 만들어진 객체(자식클래스의 인스턴스)를 전달
	// 이때, 해당 객체들은 Doll 타입으로 ★업캐스팅(Upcasting)★
	// 업캐스팅이란, 자식클래스의 객체를 부모클래스의 참조변수로 가리키는 것
	public static void machineControll(Doll d) {
		d.pick(); 
		// 오버라이딩한 자식 기능이 출력
		// 자식클래스가 전부 pick()을 갖고있음, 부모클래스를 만들어 상속
		//=> 부모클래스 하나로 자식클래스를 전부 다 다룰 수 있음
		// upcasting이 없다면 메소드를 하나하나 적어야했음
	}
	
	// 인형뽑기 기능(메소드)
	// 지금까지 static 안적었음->객체를 만들때 클래스기능을 main안에 들어와서 적었기때문
	// 여기는 main밖임! main과 공유하기 위해서 static적음
	
	// 기계안에서 <피카츄 인형을 뽑기>
	// 매개변수(Pika d1) : 피카츄 객체를 가져옴! 기계에 넣은다음에 피카츄 뽑겠다
//	public static void machineControll(Pika d1) {	
//		d1.pick();
//	}
//	
//	public static void machineControll(Zam d2) {	
//		d2.pick();	
//	}
//	
//	public static void machineControll(Chico d3) {	
//		d3.pick();	
//	}
	// => 1080개 하나하나 일일이 다 만들 수가 없음!!!!
}
