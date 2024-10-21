import java.util.Scanner;

public class Ex조건문01 {

	public static void main(String[] args) {
		
		// if-else문
//		// 사용자로부터 나이를 입력 받아주세요!
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("나이를 입력 >> ");
//		int age = sc.nextInt();
//		
		// 예제1)
//		// 만약 입력받은 나이가 20보다 크다면 "성인입니다" 출력
//		// 20보다 크지 않다면 "미성년자입니다"
//		// 조건식은 반드시 true or false 로 와야한다!
//		
//		if(age>20) {
//			System.out.println("성인입니다");
//		}
//		//else : 주어진 조건이 거짓일때 실행할 로직
//		else {
//			System.out.println("미성년자입니다");
//		}
		
		// 예제2) 
		// 정수를 입력받아 1의자리에서 반올림한 결과를 출력하시요
		// % 나머지
		System.out.println("정수입력 >>");
		int num = sc.nextInt();
		
		if (num % 10 >= 5) {
			//System.out.println(num+(10-(num%10)));
			System.out.println(num/10*10+10);
		}
		else {
			//System.out.println(num-(num%10));
			System.out.println(num/10*10);
		}
		
		System.out.println("종료!");
	}

}
