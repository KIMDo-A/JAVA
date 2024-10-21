public class SunChip extends Snack{
	
	// 추상메소드는 의무성을 띈다! -> pick()이 반드시 있어야함
	// 어노테이션 지침(의존성)!
	// 생성자를 안만들어도되고 DB와 바로 연결됌	
	@Override
	public void pick() {
		System.out.println("썬칩을 먹다");
	}
}
