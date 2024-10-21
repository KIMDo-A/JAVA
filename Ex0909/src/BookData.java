
public class BookData {
	
	private String title;
	private int price;
	private String writer;
	
	// 데이터가 담기는 생성자 만들기~
	// 조건 public, 클래스명과 동일
	public BookData(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getWriter() {
		return writer;
	}
}
