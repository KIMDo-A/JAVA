
public class CalculatorMain {

	public static void main(String[] args) {		
		// num1, num2를 사용할수 있도록 객체(실제 계산기)!!생성
		// 클래스는 현실세계에서 사용할 수 있도록 만든 틀?
		// -> 실제 객체로 만들어 사용
		// 데이터타입, 변수 = 공간만듬 인스턴스(클래스만큼)
		// 객체에는 클래스의 모든 정보가 다 담겨있음 -> 다 꺼내올수 있음
        Calculator cal = new Calculator(10, 30);

        System.out.println("더한값: " + cal.sum());
        System.out.println("뺀값: " + cal.sub());
        System.out.println("곱한값: " + cal.mul());
        System.out.println("나눈값: " + cal.div());
        
        // cal.num1 = 50; // private를 적었기 때문에 불가능!!
        cal.setNum1(75); // num1이 75로 바뀜
        cal.setNum2(5);
        System.out.println("바뀐값 " + cal.sum()); // 80
        // System.out.println("첫번째 숫자 : " + cal.num1); 
        // private를 적었기 때문에 불가능!! -> 우회
        System.out.println("바뀐값 : " + cal.getNum1());
    }
}