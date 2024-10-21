public class MemberDTO {
	// DAO : DB정보에 접근
	// DTO : Data Transfer Object
	// 세가지 데이터를 한번에 다룰 수 있는 타입만들기
	// VO 클래스 : Value Object(get만 존재)
	// 사용자 임의의 값을 가지겠다!
	
	private String id;
	private String pw;
	private String nick;
	
	public MemberDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	// getta 메소드
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNick() {
		return nick;
	}	

}
