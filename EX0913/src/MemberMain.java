import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		//JDBC = 인터페이스(정의해둔문서)
		
		// 회원관리 프로그램
		// 1. 회원가입 기능
		// 2. 로그인
		// 3. 회원정보 수정
		// 4. 회원 목록 출력
		// 5. 종료		
		Scanner sc = new Scanner(System.in);
		
		MemberDAO dao = new MemberDAO();
		
		while(true) {
			System.out.print("1. 회원가입 2. 로그인 3. 정보수정 4. 회원 목록 출력 5. 종료 >> ");
			int menu = sc.nextInt();
			
			// 1. 회원가입
			if(menu == 1) {
				// 회원가입(ID, PW, NICK)
				System.out.print("ID입력 >>");
				String id = sc.next();
				System.out.print("PW입력 >>");
				String pw = sc.next();
				System.out.print("NICK입력 >>");
				String nick = sc.next();
			
				//MemberDAO dao = new MemberDAO();
				int cnt = dao.join(id, pw, nick);

				// 회원가입에 성공했는지 확인여부
				if(cnt > 0) {
						System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패!");
				}
				
			// 2. 로그인
			}else if(menu == 2) {
				//1. 로그인할 ID, PW를 사용자로부터 입력받기
				//2. 입력받은 ID, PW를 지니고 있는 회원이 있다면
				// 	 로그인 성공! --> main 클래스에서 출력
				//   입력받은 ID, PW를 가지고 있는 회원이 없다면
				// 	 로그인 실패! --> main 클래스에서 출력
								
				
				// 3. 회원정보 수정
				}else if(menu == 3) {
					// 회원정보 수정
					// 1. 수정하고 싶은 회원의 ID 입력받기
					// 2. 어떤 NICK으로 바꿀껀지 new Nick 입력받기
					// 3. 입력한 ID를 가진 회원의 NICK 수정하기
					// 반드시 연결, 실행, 종료부 있어야 함!
					// ex)입력부, 종료부 반복되는 부분은 함수 만들어서 필요할때 부르기 => 단순화
					
					System.out.println("수정하고 싶은 ID입력 >> ");
					String inputId = sc.next();
					System.out.println("수정할 NICK입력 >> ");
					String inputNick = sc.next();
					
					// 클래스 = 설계도, 실제로 사용할 수 있는 ㄴ객체 만들기
					// MemberDAO dao = new MemberDAO(); -> 반복되므로 맨 위로!
					// dao.update(inputId, inputNick);
					// 사용자가 입력한 값을 update()로 넘겨주기
					// psmt, conn 변수 DAO맨 위로 옮기기
					int cnt = dao.update(inputId, inputNick);
					// cnt변수 앞 int
									
					// 제대로 실행 됬는지 안됬는지
					if(cnt > 0) {
						// 쿼리문이 제대로 돌아갔다면 = 1개의 행이 변경 됬다면,
						System.out.println("수정 성공!");
					}else {
						System.out.println("수정 실패");
					}											
					
				// 4. 회원 목록 출력		
				}else if(menu ==4) {
				// (테이블에 있는 모든 데이터 출력)
				//MemberDAO dao = new MemberDAO(); -> 반복되므로 맨 위로!
				//dao.getMemberList();
				ArrayList<MemberDTO> memberList = dao.getMemberList();
				for(int i=0; i<memberList.size();i++) {
					System.out.print("ID : " + memberList.get(i).getId());
					System.out.print(" PW : " + memberList.get(i).getPw());
					System.out.print(" Nick : " + memberList.get(i).getNick());
					System.out.println();
				}
			
				// 5. 종료
				}else if(menu == 5) {
				// 종료
					break;
				}
		}

	}

}
