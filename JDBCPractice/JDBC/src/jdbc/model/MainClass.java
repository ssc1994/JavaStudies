package jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	//상수로 선언
	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";	//주소
	public static final String uid = "hr";	//계정
	public static final String upw = "hr";	//비밀번호

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//DAO 클래스 선언
		AuthDAO authDAO = new AuthDAO();

		while(true) {
			try {
				System.out.print("메뉴선택 [1.저장, 2.조회] \n >");
				String menu = scan.next();
				switch (menu) {
				case "1":
				case "저장":
					System.out.print("이름 >");
					String name = scan.next();
					System.out.print("직업 >");
					String job = scan.next();
				
					int result = authDAO.insertEx(name, job);
					
					if( result ==1) {
						System.out.println("정상 입력되었습니다");
					}else {
						System.out.println("입력 오류 발생");
						
					}
					 
					break;
				case "2":
					ArrayList<AuthVO> list = authDAO.selectEx();

					for(AuthVO vo:list) {
						System.out.println(vo.toString());
					}
					
					
					
					
					break;
				default:

					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
