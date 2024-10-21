
public class Ex메소드03 {

	public static void main(String[] args) {		
		// Scanner sc = new Scanner(System.in);
		int num1 = 50;
		int num2 = 15;
		char op = '-';		
		// 문자열 -> 문자로 이루어진 배열
		// char op = sc.next().toCharArray()[0]; // 형변환	
		System.out.println("결과 >> " + cal(num1, num2, op));
	}
	
	// void : 반환하지 않겠다 
	public static int cal(int num1, int num2, char op) {		
		// 다른방법) int result = 0, void
		// return -> result
		// return result;	
		if(op == '-') {
			return num1 - num2;	
		} else if(op == '*') {
			return num1 * num2;
		} else if(op == '/') {
			return num1 / num2;
		} else if(op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}	
}
