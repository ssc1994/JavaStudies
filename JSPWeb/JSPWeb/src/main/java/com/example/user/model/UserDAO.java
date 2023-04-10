package com.example.user.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.util.JDBCUtill;

public class UserDAO {
	
	//UserDAO는 불필요하게 여러개 만들어질 필요가 없기 때문에
	//한개의 객체만 만들어지도록 singleton형식으로 설계함
	
	//1. 나자신의 객체를 생성해서 1개로 제한함.
	private static UserDAO instance = new UserDAO();
	
	//2. 직접 객체를 생성 할 수 없도록 생성자에 private
	private UserDAO() {
		//드라이버클래스 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스 로드 에러");
			e.printStackTrace();
		}
		
	}
	
	//3. 외부에서 객체생성을 요구할때 getter메서드를 통해 1번의 객체를 반환
	public static UserDAO getInstance() {
		return instance;
	}
	
	//4. 필요한 데이터베이스 변수 선언
	public String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public String UID = "jsp";
	public String UPW = "jsp";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//5. 메서드 
	public int idCheck(String id, String email) {
		int result=0;
		
		String sql = "SELECT count(*) AS total FROM users WHERE id= ? or email = ?";
		try {
			//1. connection 객체
			conn = DriverManager.getConnection(URL,UID,UPW);
			//2. pstmt객체
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, email);
			
			//3. select문은 execute query로 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result=rs.getInt("total");
			}
		} catch (Exception e) {

		}finally {
			JDBCUtill.close(conn, pstmt, rs);
		}
		return result;
	}
	
	public void join(UserVO vo) {
		String sql = "INSERT INTO users VALUES (?,?,?,?,?)";
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getGender());
			
			pstmt.executeUpdate();	//실행 (성공시 1, 실패시 0 반환)
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtill.close(conn, pstmt, rs);
		}
	}
	
	//로그인
	public UserVO login(String id, String pw) {
		UserVO vo = null;
		
		String sql = "select * from users where id = ? and pw = ?";
		
		try {
			conn = DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {	//로그인 성공 후 vo에 회원정보 저장
				String id2 = rs.getString("id");
				String name2 = rs.getString("name");
				String email2 = rs.getString("email");
				String gender2 = rs.getString("gender");
				
				 vo = new UserVO(id2, null, name2, email2, gender2);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtill.close(conn, pstmt, rs);
		}
		
		
		
		return vo;
	}

	public UserVO getInfo(String id) {
		UserVO vo = null;
		
		String sql="Select * from users where id = ?";
		
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String id2 = rs.getString("id");
				String pw2 = rs.getString("pw");
				String name2 = rs.getString("name");
				String email2 = rs.getString("email");
				String gender2 = rs.getString("gender");
				vo = new UserVO(id2, pw2, name2, email2, gender2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtill.close(conn, pstmt, rs);
		}
		
		
		return vo;
	}
	
	public int update(UserVO vo) {
		int result = 0;
		String sql = "update users set pw=?, name=?, gender=? where id=?";
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPw());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getId());
			result= pstmt.executeUpdate();		//0이면 실패 1이면 성공
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtill.close(conn, pstmt, rs);
		}
		return result;
	}
	
	public int delete(String id) {
		int result=0;
		String sql = "delete from users where id=?";
		
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtill.close(conn, pstmt, rs);
		}
		return result;
	}

}
