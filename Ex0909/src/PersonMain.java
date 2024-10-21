
public class PersonMain {

	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 25);
		Person person2 = new Person("김영희", 27);
		Person person3 = new Person("임승환", 20);
		Person person4 = new Person("신범식", 20);
		
		System.out.println("Person1의 이름 : " + person1.getName() + ", 나이 : " + person1.getAge() );
		System.out.println("Person2의 이름 : " + person2.getName() + ", 나이 : " + person2.getAge() );
		
		// (객체)배열
		// 여러개 데이터를 사용하고 싶다면, 배열 만들기!
		// 자바에서 배열은 여러개 데이터타입이 불가능함
		// int array[] = {"승환", 10}; // => 불가능함!
		// 위 객체의 데이터 타입은 Person임!!!!! -> 공통된타입
		// Person 데이터 타입으로 배열 만들기
		// Person타입으로 만들어진 데이터인 객체를 각각의 공간에 넣겠다 -> 공간에 각 "객체"들이 들어가있음
		
		Person pArray[] = new Person[5]; 
		pArray[0] = person1; // = new Person("홍길동", 25);
		pArray[1] = person2; // = new Person("김영희", 27);
		pArray[2] = person3; // = new Person("임승환", 20);
		pArray[3] = person4; // = new Person("신범식", 20);
		pArray[4] = new Person("윤주향", 15);
				
		// 예제) 임승환 출력하기
		// 배열 인덱스값-> 객체접근
		System.out.println(pArray[2]); //Person@59f95c5d 
		//System.out.println(pArray[2].name); //안됌!!private
		System.out.println(pArray[2].getName()); // 임승환
		
		//예제) pArray를 이용해서 모든 사람의 이름과 나이를 출력
		for(int i =0; i<pArray.length;i++) {
			System.out.println("이름 : " + pArray[i].getName() +", 나이 : " +pArray[i].getAge());
		}
	}
}
