import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// MVC
	// Model : DTO
	// View :  Main(사용자에게 보여짐)
	// Controller : DAO(기능)
	// 클래스(파일)을 나눠서 관리하는 것을 MVC디자인패턴이라고함
// ==================================================	
	
	// DAO : Data Access Object
	// DB에 관련한 작업 모음
	// 연결부, 종료부 두가지 꼭 필요함 ! 

	// DB 연결 필요 객체 생성
	Connection conn = null;
	PreparedStatement psmt = null;
	
	///////////////// 연결부
	public void conn() {
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 외부파일을 불러올때 있을수도, 없을수도 있음. 
			// 또는 외부와 연결되기때문에 인식이 될수도 안될수도 있음 -> try-catch문
			
			//Connection conn; // -> 맨 위 전역변수로 올림
			String url = "jdbc:oracle:thin:@localhost:1522:xe";
			String dbUser="hr";
			String dbpw ="hr";
			
			conn = DriverManager.getConnection(url, dbUser, dbpw);
			// conn 연결 정보(JAVA와 DB "연결 통로") 
			// conn안에 db연결 정보가 담겨있음
			// db에 접근할수 있는지 없는지 파악하기 위해 -> try-catch(외부에의한내용) add catch 클릭하기
			
		} catch (ClassNotFoundException e) { // Class.forName
			e.printStackTrace();
		} catch (SQLException e) { // DriverManager
			e.printStackTrace();
		}
	}
	
		
	/////////////////////// 종료부
	public void close() {
		// 두개의 객체 닫기
		try {
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// <3. 회원 정보 수정>
	// 실행부 => 입력부 + 종료부 합침
	public int update(String inputId, String inputNick) {
		// 파라미터로 매개변수(String inputId, String inputNick) 
		// Main에서 사용자가 입력한 값 가져오기
		// return값이 cnt인 int임! public void -> int로 변경
	
		/////////////////// 연결부 ////////////////////
		conn();
		
		/////////////////// 실행부 /////////
		// update member set nick = inputNick where id = inputId
		String sql = "update member set nick = ? where id = ?";	
		// inputnick, inputid 문자열이 아닌 사용자가 입력한 값 넣으려면 ?사용
		
		int cnt=0; //★
		
		try {
			psmt = conn.prepareStatement(sql);
			// psmt : 통로위에 올라가 있는 JAVA에서 만들었던 쿼리문 정보			
			psmt.setString(1, inputNick); // 첫번째 물음표는,
			// psmt.setString 문자열데이터 세팅
			psmt.setString(2, inputId); // 두번재 물음표는,
			
			// executeUpdate() --> 쿼리문을 통해 변경된 "행의 갯"수를 반환
			// 실행 ex) 쿼리문 ctrl + enter
			cnt = psmt.executeUpdate();
			// ★ int빼기
			
		} catch (SQLException e) { // psmt
			e.printStackTrace();
		}
		
		//////////////// 종료부 ///////////////////
		finally {
			close();
		}	
		
		return cnt; // ★
		// cnt 변경된 행의 갯수 출력
		// return값이 int이므로 public void->int로 바꾸기
	}
	
	// <1. 회원가입>
	public int join(String id, String pw, String nick) {
		// 입력받은 변수를 가져오기 -> 매개변수 안에 넣기!
		// return이 cnt 값으로 반환되므로 데이터 타입 int임!
		
		/////////// 연결부
		conn();
		
		////////// 실행부
		String sql = "insert into member values (?,?,?)"; 
		
		int cnt = 0; //★	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id); //첫번재 물음표
			psmt.setString(2, pw); //두번재 물음표
			psmt.setString(3, nick); //세번재 물음표		
			cnt = psmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		////////// 종료부
		finally {
			close();
		}	
		return cnt; //★ 변경된 행의 개수 반환		
	}
	
		
	// <4. 전체회원 정보 가져오기>
	// -> 테이블의 모든 정보 가져오기
	public ArrayList<MemberDTO> getMemberList() {
		
		// 입력부
		conn();
		// 실행부
		String sql = "select * from member";
		
		// ★동적배열 만들기
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		// id, pw, nick 타입이 다 다름 ->  <String>이 아님
		// 3개의 데이터를 다룰 수 있는(사용자임의의 타입) 클래스 만들기 -> MemberDTO
		
		try {
			psmt = conn.prepareStatement(sql);
			// 쿼리문에 물음표 없음 -> setStirng 안해도 됌!
			
			//psmt.executeUpdate();
			// 변경된 행의 개수 -> select문은 데이터 변경이 아님-> executeQuery()
			
			ResultSet rs = psmt.executeQuery();
			//★rs : 쿼리문을 통해 가져온 데이터★			
			// 가지고 온 데이터 꺼내기 -> getString()
			//String id = rs.getString(1); // => id
			// 가지고온 데이터 rs 에서 특정데이터(문자열데이터) 가져오겠다
			// (인덱스) 괄호안 인덱스
			//System.out.println(id);
			// 오류남 -> ResultSet.next가 호출되지 않았음
			// rs는 데이터 주소값을 가지고 있음!
			// rs는 커서 같이 위치를 가르킴
			
			//★rs.next() -> 다음 행★을 가르킴(데이터가 있다면 True, 없다면 False)
//			if(rs.next()) { // 다음행이 있다면,
//				String id = rs.getString(1);
//				System.out.println(id); // Test 첫번째 id 출력
//			}
			
			// 테이블의 모든 데이터 출력하기 -> 얼만큼 있는지 모르므로 while문 사용
			while(rs.next()) {
				String id = rs.getString(1);
//				System.out.print("id : " + id); //첫번째 id 출력(1행1열)	
				String pw = rs.getString(2); 
//				System.out.print(" pw : " + pw); //첫번째 pw 출력(1행2열)
				String nick = rs.getString("nick");
//				// 인덱스위치가 아닌 컬럼명을 적어도 됌 ! 
//				System.out.print(" nick : " + nick); //첫번째 nick 출력(1행3열)
//				System.out.println("");	
				
				// 여기서 출력하기 보다, MVC를 사용해 Main에서 출력하게 하기
				// MVC나누기 위해 동적리스트 arraylist사용		
				memberList.add(new MemberDTO(id, pw, nick));
				// 리스트에 객체들이 하나씩 만들어져서 담김
				// 반환타입 void getMemberList() ->  ArrayList<MemberDTO>로 바꾸기			
			}
			
			} catch (SQLException e) {			
					e.printStackTrace();
			}
	
		//종료부
		finally {
			close();
		}
		
		return memberList; //★
		
	}

}
