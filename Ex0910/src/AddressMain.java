import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		
		//Address p1 = new Address("승환", 20, "01033334444");
		// 하나하나 쓰려면 객체가 너무 많음!
			
		ArrayList<Address> addArray = new ArrayList<Address>();
		// 크기가 정해져있지 않은 동적배열
		// Address라는 데이터 타입을 addArray에 p1전체가 들어감
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int menu = sc.nextInt();
		
			if(menu==1) {
				// 추가 - add()
				System.out.print("이름 : " );
				String name = sc.next(); // 입력
				System.out.print("나이 : " ); //출력
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
						
				addArray.add(new Address(name, age, phoneNumber));
				// ★new Address(name, age, phoneNumber) => 객체★
				// 데이터가 arraylist에 추가됌 (생성자 Address())
				
			}else if(menu==2) {
				// 조회 - get()
				if(addArray.size()>0) {
					for(int i=0;i<addArray.size();i++) {
						System.out.println((i+1) + ". "+addArray.get(i).getName() + "(" + addArray.get(i).getAge() 
								+ "세) : " + addArray.get(i).getPhoneNumber());
						}
				}else{
					System.out.println("등록된 연락처가 없습니다");
				}				
			}else if(menu==3) {
				if(addArray.size()>0) {
					for(int i=0;i<addArray.size();i++) {
						System.out.println((i+1) + ". "+addArray.get(i).getName() + "(" + addArray.get(i).getAge() 
								+ "세) : " + addArray.get(i).getPhoneNumber());
						}
					// 삭제 - remove()
					System.out.print("삭제할 번호 입력 : ");
					int deleteNum = sc.nextInt();				
					addArray.remove(deleteNum-1);			
				}else{
					System.out.println("등록된 연락처가 없습니다.");
				}
			}else if(menu==4) {
				// 검색
				// 숫자 데이터 비교 A == B
				// ★"승환".equals("범식") 비교★
				System.out.print("검색할 이름 입력 : ");
				String inputName = sc.next();
				int count = 0; //검색됐는지 안됐는지 판단 변수★
				
				for(int i=0; i<addArray.size();i++) {
					if(addArray.get(i).getName().equals(inputName)) {
						System.out.println((i+1) + ". "+addArray.get(i).getName() + "(" + addArray.get(i).getAge() 
								+ "세) : " + addArray.get(i).getPhoneNumber());
						System.out.println();
						count++; // ★
					}
				}			
				if(count ==0 ) {
					// 검색이 안됌
					System.out.println("검색한 이름의 정보가 없습니다!");
				}								
			}else if(menu==5) {
				// 프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(" ");
		}
	}
}
