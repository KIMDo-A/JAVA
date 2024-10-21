import java.util.Scanner;

public class ExWhile02 {

	public static void main(String[] args) {
		
		// 두 숫자를 입력, 결과 출력
		// 단, 두 숫자가 모두 0이 입력된다면 종료하겠습니다!
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("A 입력>>");
			int num1 = sc.nextInt();
			System.out.print("B 입력>>");
			int num2 = sc.nextInt();
		
			if (num1 == 0 && num2 == 0) {
				break;
			}
			
			System.out.println("결과>>" +(num1-num2));
		}
		
	}

}
