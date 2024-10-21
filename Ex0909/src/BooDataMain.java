import java.util.ArrayList;
import java.util.Scanner;

public class BooDataMain {

	public static void main(String[] args) {
		
		// 클래스 5개만큼 공간
		// 배열 안 각각 객체가 담김
		// 자바 배열의 크기는 정해져있다!!!!!!
		BookData BookArray[] = new BookData[5];
		
		ArrayList<BookData> bArray2 = new ArrayList<BookData>();
		// ArrayList : 크기가 동적인 배열(같은 타입만 다룰 수 있다!)
		// barray2는 bookdata타입의 객체만 데이터로 들어갈 수 있다.
		// 크기가정해지지않는배열일뿐이지 똑같음
		bArray2.add(new BookData("Java", 21000, "홍길동"));
		bArray2.add(new BookData("C++", 29000, "박문수"));
		bArray2.add(new BookData("Database", 31000, "김장독"));
		bArray2.add(new BookData("Android", 18000, "이순신"));
		bArray2.add(new BookData("Web", 26000, "김철수"));
		
		BookArray[0] = new BookData("Java", 21000, "홍길동");
		BookArray[1] = new BookData("C++", 29000, "박문수");
		BookArray[2] = new BookData("Database", 31000, "김장독");
		BookArray[3] = new BookData("Android", 18000, "이순신");
		BookArray[4] = new BookData("Web", 26000, "김철수");
		
		System.out.println(BookArray[0].getPrice());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int price2 = sc.nextInt();
		
//		for(int i=0; i<BookArray.length;i++) {
//			if(price2 > BookArray[i].getPrice()) {
//			System.out.println("구매 가능한 책 목록");
//			
//			System.out.println("[" + BookArray[i].getTitle() + "," + BookArray[i].getWriter() + "," + BookArray[i].getPrice() + "원]");
//			}	
//		}
		
		for(int i=0; i<bArray2.size();i++) {
			// bArray2.get(i) == bArray[i]
			if(price2 >bArray2.get(i).getPrice()) {
			System.out.println("구매 가능한 책 목록");
			
			System.out.println("[" + bArray2.get(i).getTitle() + "," + bArray2.get(i).getWriter() + "," + bArray2.get(i).getPrice() + "원]");
			}	
		}
		
		
		
		
		
	}

}
