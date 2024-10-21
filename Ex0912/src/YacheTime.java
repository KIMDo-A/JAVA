
public class YacheTime extends Snack {
	
	public void pick() {
		System.out.println("야채타임을 먹다");
	}
	
	public void ketchup() {
		// Snack2에 ketychup이 없기때문에 안됌
		System.out.println("케찹을 찍어 먹다");
	}
	
	// pick은 오버라이딩했기때문에 상위클래스에서 

}
