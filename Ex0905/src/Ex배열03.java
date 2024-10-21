import java.util.Scanner;

public class Ex배열03 {

	public static void main(String[] args) {
		
		// 5칸 짜리 배열에 사용자가 입력한 값을 넣어주고
		// 입력한 값중 제일 큰 값과. 제일 작은 값을 출력!
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		
		// 입력구
		for(int i=0;i<array.length;i++) {
			System.out.print(i+1 + "번째 정수 입력>>");
			int num = sc.nextInt();	
			array[i] = num;
		}

		// 출력구
		int max = array[0];
		for(int i =0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("최고 점수 : " + max);
		
		int min = array[0];
		for(int i =0;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		System.out.println("최저 점수 : " + min);
	}

}
