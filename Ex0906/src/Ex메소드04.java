
public class Ex메소드04 {
	public static void main(String[] args) {
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
	}	
	// void : 반환하지 않겠습니다! return을 쓰지 않음!!
	// void -> 아무 데이터 안받아와도돼!
	public static void getDivisor(int num) {
		
		System.out.print(num + "의 약수 : ");		
		for(int i=1; i<=num;i++) {
			if(num % i == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("");
	}
}
