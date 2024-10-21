
public class MouseMain {

	public static void main(String[] args) {
		
		// 부모클래스
		Mouse p1 = new Mouse();
		p1.LeftClick();
		p1.RightClick();
		p1.Drag();
		
		// 자식클래스
		HumanMouse p2 = new HumanMouse();
		p2.StressReduce(); 
		p2.LeftClick(); //바꾼좌클릭하기
		
		WheelMouse p3 = new WheelMouse();
		p3.Scroll();
		p3.LeftClick(); // 자식에서 정의하지 않아도 부모클래스 기능사용가능
	}
}
