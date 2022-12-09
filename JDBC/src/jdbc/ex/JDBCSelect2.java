package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect2 {
	
	public static void main(String[] args) {
		
		/*
		 * 사원수를 입력받습니다.
		 * 
		 * employees, departments 테이블에서 부서별 사원수를가 입력받은 사원수보다 큰 데이터를 select 
		 * 
		 * 출력할 컬럼은 employee_id, 부서명, 사원수
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("사원수 제한>");
		int num = scan.nextInt();
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//주소
		String uid = "hr";	//계정
		String upw = "hr";	//비밀번호
		
		String sql = "select * from("
			    	+ "Select department_name 부서명, "
				    + "       (Select COUNT(*) from employees e where e.department_id = d.department_id) 사원수,"
				    + "       d.department_id "
				    + "from departments d)"
				    + "where 사원수>?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			result = pstmt.executeQuery();
			
			while(result.next()) {
				String dName = result.getString("부서명");
				int dPpl = result.getInt("사원수");
				int dId = result.getInt("department_id");
//				System.out.println("부서명 : "+dName + ", 사원수 : " + dPpl + ", 부서번호 : " + dId  );
				System.out.printf("%-20s", "부서명 : "+dName);
				System.out.printf("%-15s", "| 사원수 : "+dPpl);
				System.out.printf("%-15s", "| 부서번호 : "+dId);
				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				result.close();
				scan.close();
				
			} catch (Exception e2) {
				System.out.println("Close 에러");
			}
		}
	}
}
