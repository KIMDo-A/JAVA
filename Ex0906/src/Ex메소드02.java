
public class Ex메소드02 {

	public static void main(String[] args) {
		
		// 사칙연산 메소드 구현
		int addNum = add(3,5);
		int minusNum = minus(3,5);
		int mulNum = mul(3,5);
		int divNum = div(3,5);
		
		add(3.14, 1.5);
		
		System.out.println("더하기 결과 : "+ addNum);
		System.out.println("빼기 결과 : "+ minusNum);
		System.out.println("곱하기 결과 : "+ mulNum);
		System.out.println("나누기 결과 : "+ divNum);
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 메소드 오버로딩 : "매개변수"만 다르게 해서 같은 이름으로 다른 메소드를 만드는 방법
	// = 메소드 중복정의
	// 반환타입이 아니라 매개변수를 기준으로 같은 함수명으로 정의
	public static double add(int num1, double num2) {
		return num1 + num2;
	}
	
	// 메소드 오버로딩임
	public static double add(double num1, double num2) {
		return (int)(num1 + num2);
	}
	
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
}
