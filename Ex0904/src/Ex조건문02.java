import java.util.Scanner;

public class Ex조건문02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 다중 if문
		
		
//		// 예제1) 나이가 8살이상, 20미만 이라면 "학생 입니다!"
//		System.out.println("나이 입력>>");
//		int age = sc.nextInt();
//		if(age>20 ) {
//			System.out.println("성인입니다");
//		}
//		else if(age>=8){
//			// 조건 하나씩 분리해야 함 8<=age<20 안됌 !!
//			// age>=8 && age<20
//			System.out.println("학생입니다");
//		}
//		else {
//			System.out.println("미성년 입니다");
//		}
		
		// 예제2)	
		System.out.println("점수 입력>>");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("A학점입니다");
		}
		else if(grade>=80) {
			// grade>=80 && grade<90 
			System.out.println("B학점입니다");
		}
		else if(grade>=70) {
			System.out.println("C학점입니다");
		}
		else {
			System.out.println("휴학ㄱ");
		}

	
	}

}
