
public class Ex메소드05 {
	
	public static void main(String[] args) {

		int array[] = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		// 이 배열은 어딘가의 저장공간에 위치 있음, array라는 변수안에는 ★저장공간을 찾아 갈 수 있는 "주소값"★이 있음
		// array을 reference라 부름
		
		int num = 10;
		// 값만 넘긴거임		
		myPrint(array);
		// call-by-reference
		myPrint2(num);
		// call-by-value
		System.out.println(array[0]);
		System.out.println(num);
	}
	
	// myPrint 하는 함수를 만들어서 array에 있는 내용을 전부 출력
	// 반환타입 : void 출력만함으로,
	// 매개변수 : 정수타입의 배열을 넘겨 받음
	// int array[] : ex)1001이라는 주소값이 담긴거임
	// 같은배열을 가르킴 똑같은 주소값을 타고 들어가기때문에 변수가 바뀜
	
	public static void myPrint(int array[]) {
		array[0] = 30;
		// 1001이라는 주소값을타고 들어가서 30을 넣음 ! => 값 바뀜★
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
	}
	
	public static void myPrint2(int num) {
		// int num = 10; (위에서작성) --> 값만 넘긴거임
		// 두개의 num 그릇은 다름 ! => 값 안바뀜★		
		num = 30;		
	}
}
