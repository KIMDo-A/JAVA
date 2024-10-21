
public class StudentMain {

	public static void main(String[] args) {
		
		// ③
		// Student 클래스 내용을 1이라는 객체에 담아줌 -> 생성자 이용
		// 홍길동과 김영희 학생을 만듬 
		Student student1 = new Student("홍길동","20150675", 22, 50, 90, 77 );
		Student student2 = new Student("김영희", "20090541", 29, 90, 25, 30);

		// 출력
		// System.out.println(student1.name); 출력안됌 -> private를 썼기 때문★!
		// private 접근 제한자 사용 -> student1.name = "김도아"; 변경 안됌 
		System.out.println(student1.number); // 20150675
		
		student1.show();
		student2.show();
		
	}
}
