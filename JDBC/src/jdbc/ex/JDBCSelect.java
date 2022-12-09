package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect {

	public static void main(String[] args) {
		//SELECT
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//주소
		String uid = "hr";	//계정
		String upw = "hr";	//비밀번호

		String sql = "SELECT * FROM auth order by auth_id DESC";

		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Connection
			conn = DriverManager.getConnection(url, uid, upw);

			//Statement
			pstmt = conn.prepareStatement(sql);
			
			//?가 있으면 값 세팅
//			pstmt.setString(1, "");
			
			//sql 실행
			result = pstmt.executeQuery();

			
			while(result.next()) {	//다음 row가 있으면 true 없으면 false
				//한 행에 대한 처리(getInt, getString, getDouble, getTimestamp, getDate)
				int auth_id = result.getInt("auth_id");
				String name = result.getString("name");
				String job = result.getString("job");
				System.out.println("번호 : " + auth_id + ", 이름 : " + name+ "직업 : " + job);
			}




		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
