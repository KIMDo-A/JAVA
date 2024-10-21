
public class Ex배열01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입의 여러개 데이터를 하나의 묶음으로 다루는 방법
		// 		(순차적으로 데이터를 다룬다 --> 인덱스)
		
		//10,20,30,100
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 100;
		
		// 파이썬과 자바 배열 차이점
		// 1. 자바에서의 배열은 한가지 타입의 데이터만 다룰 수 있다
		// 2. 자바에서의 배열은 크기가 고정적이다!
		
		int array2[] = {10,20,30,100}; //중괄호를 통해서 만듬
		
		int array[] = new int[4];
		// 배열 선언, 이 배열은 int형, new 공간을 만들겠다. 정수데이터 4개를만들겠다 => array4칸짜리공간을만듬
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 100;
		//array[4] = 110; 오류 : ArrayIndexOutOfBoundsException(배열크기넘어감)
		//array[3] = "도아"; 오류 : cannot convert from String to int
		System.out.println("배열크기 : " + array.length);
		
		//array에 있는 모든 데이터를 출력
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]); // array.length -1
		// System.out.println(array); => XX
		// ★reference(참조)변수★! 메모리를 찾아갈 수 있는 변수
		// array는 찾아갈수있는 주소값임
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		

	}

}
