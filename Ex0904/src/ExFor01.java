
public class ExFor01 {

	public static void main(String[] args) {
		
		// for : 반복횟수가 정해져 있을 때 사용하는 반복문
		// ~언제부터, ~언제까지 명시
		
		// 1부터 5까지 출력 해주세요!
		// ctrl + alt 방향키 누르면 반복해서 나옴
//		 for(초기화구문; 검사조건; 반복 후 작업){
//					실행할 로직
//		}
		// * i는 6까지 감 *
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		// 21부터 57까지 출력시켜주세요
		for(int i=21; i<=57; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		// 96부터 53까지 출력시켜주세요
		for(int i=96; i>=53; i--) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		// 21부터 57까지의 수중 홀 수만 출력 시켜 주세요!
		for(int i=21; i<=57; i++) {
			// for(int i=21; i<=57; i+=2) {
			if(i%2==1) {
				System.out.print(i+ " ");
			}
		}

	}

}
