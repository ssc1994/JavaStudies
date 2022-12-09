package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdate {

	public static void main(String[] args) {
		// 스캐너로 auth_id name job을 입력받아서 
		//해당 auth_id의 name, job을 업데이트하는 구문
		Scanner scan = new Scanner(System.in);
		
		System.out.print("바꿀 Auth_id : >"); 
		int auth_id = scan.nextInt();
		
		System.out.print("Name : >"); 
		String name = scan.next();
		
		System.out.print("job : >"); 
		String job = scan.next();


		//Update
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//주소
		String uid = "hr";	//계정
		String upw = "hr";	//비밀번호


		String sql = "UPDATE Auth SET name = ? , job = ? WHERE auth_id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn= DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setString(2,job);
			pstmt.setInt(3,auth_id);	//number타입이라 int

			int result = pstmt.executeUpdate();
			
			if(result ==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			System.out.println(conn);

		} catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				scan.close();
			} catch (Exception e2) {
				System.out.println("close에러");
			}
		}
	}
}
