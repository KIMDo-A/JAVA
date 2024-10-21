import java.util.Scanner;

public class ExWhile01 {

	public static void main(String[] args) {
		
		// 사용자로부터 정수를 입력받겠습니다.
		// 단 10보다 작은 숫자를 입력했을때만 계속 입력받을꺼예요!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>>");
		int num = sc.nextInt();
		
		// int num; -> 변수 선언!!
		// num = 30;
		// int num = 50; -> 안됌! Java는 같은 이름으로 변수를 여러개 만들 수 없기 때문!
		// 파이썬과 달리, 같은 이름으로 변수를 다시 만들수가 없음
		// JS는 var는 되지만 let, const는 불가능함
		// While : 반복 횟수가 정해져 있지 않을때 사용하는 반복문
		
//		while (num < 10) {
//			System.out.println("정수 입력>>");
//			num = sc.nextInt();
//			// 앞 int빼야함, 위에서 int num 변수를 선언했기 때문
//		}
		
		while (true) {
			System.out.println("정수 입력>>");
			num = sc.nextInt();
			// 앞 int빼야함, 위에서 int num 변수를 선언했기 때문
			
			if(num>10) {
				break;
			}
		}
		
//		int number =30;
//		System.out.println("Test : %d", number);

	}

}
