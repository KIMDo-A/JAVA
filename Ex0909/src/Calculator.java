
// 계산기 사용할 수 있는 수단(틀)
public class Calculator {
	
	// private 정보은닉 
	private int num1;
	private int num2;
	
	// 두개 데이터를 받아올 수 있는 "생성자"(임의 공간) 오버로딩 만들기~
	// public : 다른 곳에서 사용가능
	// 생성자 : 메소드임, 원래 반환타입이 와야하는데 안옴. 역할이 이미 정해져있기 때문!
	public Calculator(int num1, int num2) {
	    this.num1 = num1;
	    this.num2 = num2;
	 }
	
	// 정보은닉이지만, 우회할 수 있는 방법!!!!
	// ★setter --> private의 필드값을 바꿀 수 있는 기능★
	// 반환타입 void : num1의 값을 바꿔주겠다. return을 하지 않으므로
	// 매개변수 int num1
	public void setNum1(int num1) {
		this.num1 = num1;
		// 받아온 매개변수를 현재 클래스 num1
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	// ★getter --> private의 값을 꺼내 오는 기능★
	// 반환타입 : num1에 있는 값을 다른 파일로 넘기는 것 -> return
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	// 기능
	// 생성자 만들때 num1, num2값이 할당되어질것이므로, ()안에 매개변수를 적지 않아도 됌!!★
	public int sum() {
		return num1 + num2;
	};
	
	public int sub() {
		return num1 - num2;
	};
	
	public int mul() {
		return num1 * num2;
	};
	
	public double div() {
		return num1 / num2;
	};
}

