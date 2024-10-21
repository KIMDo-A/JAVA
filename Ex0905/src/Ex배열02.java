import java.util.Scanner;

public class Ex배열02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		
		// 입력구
		for(int i=0;i<array.length;i++) {
			System.out.print(i+1 + "번째 정수 입력>>");
			int num = sc.nextInt();	
			array[i] = num; // 배열에 입력한 수 담기
			// array[0] = 첫번째 정수
			// array[1] = 두번째 정수
		}
		System.out.print("3의 배수 : ");
		
		// 출력구
		for(int i =0;i<array.length;i++) {	
			if(array[i] %3 == 0) { // 배열에 담긴 수들이 3의배수
				System.out.println(array[i]);
			}
		}
		
	}

}
