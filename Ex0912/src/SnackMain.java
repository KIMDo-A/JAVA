public class SnackMain {

	public static void main(String[] args) {		
		// 썬집, 허니버터칩, 야채타임 과자를 먹고싶어요!
		SunChip S1 = new SunChip();
		Honey S2 = new Honey();
		YacheTime S3 = new YacheTime();
		
		eat(S1);
		eat(S2);
		eat(S3);
	}
	
	public static void eat(Snack s) {
		// 원래 (Sunchip S1), (Honey S2), ..등 하나하나 만들어야했음
		// => 상위클래스를 만들어서 하위클래스 메소드 불러오기
		// => 데이터타입이 Sunchip이 -> Snack2
		s.pick();		
		// 야채 타침 과자를 먹을 경우, 케첩에 찍어 먹고 싶어요!(자식클래스내용 사용)
		// s.ketchup(); // 오류! =>오버라이딩안되있음(부모클래스에 없음) 
		// 이때, ★downCasting★을 진행! 부모클래스 -> 자식클래스
		// 야채타임이 들어올때만!!
		// 조건) 업캐스팅된 것을 다시 원래대로 자식클래스로 바꿈
		// ★"instanceof"★ --> 업캐스팅 이전의 타입을 확인하는 연산
		// 업,다운클래는 클래스 형변환
		if(s instanceof YacheTime) {
			// 아직까지 야채타임의 타입은 부모임! (Snack2 s)
			YacheTime yache = (YacheTime) s;
			//하위타입으 객체를 강제로 상위타입객체로 바꿈
			yache.ketchup();		
		}
	}
}
