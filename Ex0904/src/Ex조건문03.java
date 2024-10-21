import java.util.Scanner;

public class Ex조건문03 {

	public static void main(String[] args) {
		// switch ~ case : 여러개 조건(값)을 비교할 때
		
		// 사용자로부터 입력받은 월에 따라 계절 출력
		// 1,2,12 -> 겨울 / 3,4,5 -> 봄 / 6,7,8 -> 여름 / 9,10,11 -> 가을
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("월 입력>>");
//		int month = sc.nextInt();
		
//		switch(기준값) {
//		case 비교값 :
//			기준값과 비교값이 같을때 실행할 로직
//		}
		
//		switch(month) {
//		case 1 :
//			System.out.println("겨울");
//			break;
//			// swtich문 빠져나오기
//		case 2 :
//			System.out.println("겨울");
//			break;
//		case 12 :
//			System.out.println("겨울");
//			break;
//		}
		
//		switch(month) {
//		case 1 :
//		case 2 :
//		case 12 :
//			System.out.println("겨울");
//			break;
//		case 3 :
//		case 4 :
//		case 5 :
//			System.out.println("봄");
//			break;
//		case 6 :
//		case 7 :
//		case 8 :
//			System.out.println("여름");
//			break;
//		case 9 :
//		case 10 :
//		case 11 :
//			System.out.println("가을");
//			break;
//		}
		
		System.out.println("점수 입력>>");
		int grade = sc.nextInt();
		
		// case 99 case 98 case97 ~ 90
		switch (grade / 10) {
		case 9 :
			System.out.println("A학점");
			break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		default :
			// else와 같음 전부 다 아니라면~
			System.out.println("휴학ㄱ");
		}
		
		
		
		
		
		
		

	}
	
	

}
