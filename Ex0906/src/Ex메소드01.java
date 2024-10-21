
public class Ex메소드01 {

	public static void main(String[] args) {
		// 메소드 : 기능을 미리 만들어서 필요할때마다 불러서 사용할 수 있는 문법
		// 두개의 숫자를 더하기 기능
		int num1 = 30;
		int num2 = 60;
		int result = add(num1, num2); //90
		// add라는 데이터가 아니라 기능!!!! 이므로 (소괄호)
		// ★ 실행하면 아래 함수로 내려가서 return된 값이 호출한 위치 add로 다시 옴 ★
		System.out.println("결과 : " + result);
	}
	
	// 메소드 선언!!!!
	// 기본적엔 메소드 구조
	// public : 접근제한자 (어디서든지, 모두)
	// static : 공유하다!(main method와 공유)
	// int : 반환 타입 (메소드를 통해서 이 데이터타입을 넘겨주겠다)
	// add : 메소드 이름
	// (int num1, int num2) : 매개변수(이 기능을 실행하기 위한 재료)
	public static int add(int num1, int num2) {
	
		int result = num1 + num2;		
		return result;
		// return : 반환하겠다	
	}
}
