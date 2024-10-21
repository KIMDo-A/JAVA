import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {

		// ArrayList : 크기가 동적인 배열(같은 타입만 다룰 수 있다!) -> 크기가 정해져있지X
		// 일반적인 배열은 같은타입만, 데이터 크기가 정해져있었음
		
		ArrayList<String> myTeam = new ArrayList<String>(); 
		// 동적인 배열 : 추가, 삭제가 사용자 임의로 가능하다!
		// myTeam에 "배열의 시작 위치"★가 담김
			
		// ArrayList메소드		
		// 1. 마지막 요소 추가 add() --- 파이썬) append()
		// 배열 맨 마지막에 추가함
		myTeam.add("승환");
		myTeam.add("범식");
		myTeam.add("지영");
		
		// 2. 선택 추가 가능(원하는 위치에 넣을 수 있음)
		myTeam.add(1, "주향"); // [1]에 주향이 들어감 -> 승환주향범식
		myTeam.add(0, "준표"); // 준표승환주향
		
		// 3. 데이터 삭제 remove()
		myTeam.remove(2);
		
		// 4. 데이터 전체 삭제
		//myTeam.clear();
		 		
		// 5. 데이터 출력(꺼내기) get() - 인덱스
		System.out.println(myTeam.get(0)); //승환
		System.out.println(myTeam.get(1)); //범식
		System.out.println(myTeam.get(2)); //지영
		
		// 6. ArrayList 크기 : size() --- 배열길이 length()
		
		// 전부 다 출력하기
		for(int i=0; i<myTeam.size();i++) {
			System.out.println(myTeam.get(i));
		}
	}
}
