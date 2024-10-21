
public class PhoneMain {

	public static void main(String[] args) {
		
		int num = 30; // 숫자형 타입
		String name = "승환"; // 문자형 타입
		
		// 휴대폰 (타입은? -> 클래스 만들기!)
		// main안에서 휴대폰 사용하기~ Phone.java에서 별도 클래스로 만들었었음!
		Phone p1 = new Phone(); // default 생성자
		// Phone : Phone이라는 데이터로 다루겠다 -> 데이터 타입임
		// p1 : 변수
		// new : (데이터를 다룰 수 있는)공간을 만들겠다
		// Phone() : 클래스(만큼), 생성자 메소드 -> 클래스 생성시 기본적으로 만들어짐
		// 생성자 : 클래스 만큼의 공간을 생성
		// p1을 객체, 인스턴스라 불림
		
		System.out.println(p1.number); //01047685180 
		// .은 앞에서 꺼내오겠다
		p1.call(); //전화를 걸다
			
		// 만드는방법 예시 2가지~
		int array[] = new int[3];
		array[0]=10;
		array[1]=20;
		array[2]=30;	
		int array2[] = {10,20,30};
					
		// 범식쌤 휴대폰도 사용
		Phone p2 = new Phone("iphone", "010010", "KT");
//		Phone p2 = new Phone();
//		p2.kind = "iphone";
//		p2.number="01010101";
//		p2.tel = "KT";
		// -> 그때그때 하나하나 변경해야함!
		
		// phone이라는 생성자를 통해서 객체를 만듬.
		System.out.println(p2.number); //iphone
	}

}
