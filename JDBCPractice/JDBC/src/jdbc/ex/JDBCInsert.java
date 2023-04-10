package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		//Insert
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//주소
		String uid = "hr";	//계정
		String upw = "hr";	//비밀번호
		
		String sql = "Insert Into Auth values( seq_auth.nextval ,?,?)";
		
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
			
		
		//Driver Loading
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//Connection  ( DriverManager.getConnectino은 Connection타입으로 반환받음)
		conn = DriverManager.getConnection(url, uid, upw);
		
		//Statement 객체
		pstmt= conn.prepareStatement(sql);
		
		//PreparedStatement의 ?값 세팅
		//setString/setInt/setDate/setTimestamp 등으로 값을 넣음
		pstmt.setString(1, "홍길동");
		pstmt.setString(2, "프로그래머");
		
		//SQL 실행 (SELECT문은 QUERY문장 실행, I,D,U문은 UPDATE문으로 실행_
		//위에서 sql을 전달했기때문에 매개변수 없이 실행
		//executeUpdate는 성공 실패 결과를 반환 (성공:1 / 실패:0)
		int result = pstmt.executeUpdate();
		
		if (result == 1 ) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
			
		
		System.out.println(conn);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//connection과 PreparedStatement는 trycatch안에서 닫아줘야함
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				System.out.println("close에러");
			}
		}
	}
}
