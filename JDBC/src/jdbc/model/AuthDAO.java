package jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AuthDAO {
	
	//멤버변수
	private String url = MainClass.url;	//주소
	private String uid = MainClass.uid;	//계정
	private String upw = MainClass.upw;	//비밀번호
	
	//메서드화
	public int insertEx(String name, String job) {
		int result = 0;

		
		String sql = "Insert Into Auth values( seq_auth.nextval ,?,?)";
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url, uid, upw);
		
		pstmt= conn.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setString(2, job);
		 
		result = pstmt.executeUpdate();
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				System.out.println("close에러");
			}
		}
		
		
		
		
		
		
		return result;
	}
	
	
	//조회메서드
	public ArrayList<AuthVO> selectEx() {
		ArrayList<AuthVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM auth order by auth_id DESC";

		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeQuery();
			
			while(result.next()) {	//다음 row가 있으면 true 없으면 false
				int auth_id = result.getInt("auth_id");
				String name = result.getString("name");
				String job = result.getString("job");
				
				//VO에 행 데이터 저장
				//VO를 리스트에 저장
				AuthVO vo = new AuthVO(auth_id,name,job);
				list.add(vo);
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
		
		return list;
	}
}
