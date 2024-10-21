
public class PhoneMain {

	public static void main(String[] args) {
		
//		// 부모객체
//		Tell parent = new Tell();
//		parent.call(); //전화걸다
//		parent.callSend(); //전화를 받다
//		parent.button(); //다이얼을 '돌려서' 버튼을 누른다
//		// parent로부터 기능을 사용할 수 있음! 
//		//parent.open(); -> 자식에서 만든 기능 불가능함!!!!
//		
//		// 자식객체
//		Folder childF = new Folder();
//		childF.call(); //폴더폰으로 전화를 걸다 => 오버라이딩 자식으로 출력
//		childF.button(); //다이얼 '클릭해서' 버튼을 누른다 => 오버라이딩 자식으로 출력
//		childF.open(); //폴더폰을 연다
//		childF.callSend();
		
		// 새롭게 재정의
//		Smart childS = new Smart();
//		childS.button(); //버튼을 터치한다! 
		
		// Casting : 데이터 타입 변환
		String number = "10";
		// 문자열은 주소값, reference 타입
		int num = Integer.parseInt(number);
		int num2 = (int)3.14;
		// 강제형변환 : 기본적인 형태만 강제로 변환이 가능함 -> referece타입X
		System.out.println(num); // 10
		System.out.println(num2); // 3
		
		// UpCasting : 하위클래스 타입 객체 -> 상위클래스 타입 객체로 형변환
		// (자동 타입 변환)
		Folder p1 = new Folder();
		// p1 객체타입, Folder클래스는 자식클래스임
		// 타입을 부모클래스로 바꾸기 => UpCasting
		Tell p2 = p1; 
		// p1은 자식클래스에서(부모 tell class로) Up된 객체, 
		// - ★업캐스팅된 객체는 부모 클래스에 있는 내용만 사용 가능함★
		//p2.open(); 오류남 -> p2를 이용해서 open기능(자식에만 있는)을 사용못함
		// 부모클래스에 있는 기능만 사용하지만,
		// 단! 자식클래스에서 ★오버라이딩(재정의)한 경우에는 업캐스팅 했더라도 자식클래스에 있는 기능을 사용함.
		p2.button(); // Folder자식 button으로 출력
		p2.call(); // Folder자식 call로 출력
		p2.callSend(); // Tell부모로 출력
		// 업캐스팅은 클래스가 아니라 객체가 바뀌는 거임
		// 객체를 만들 수 있는 설계도가 클래스이고, 객체는 현실세계에 있는 제품임
		// 자식클래스가 만들어지고 상위클래스로 모양만(객체)바뀐것이기 때문에 기존 자식객체는 그대로 사용
		
	}

}
