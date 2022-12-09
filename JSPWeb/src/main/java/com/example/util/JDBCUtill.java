package com.example.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtill {

	public static void close(Connection conn, 
							PreparedStatement pstmt, 
							ResultSet rs
							) {
		//종료하는 메서드를 만듬
		try {
			if(conn!=null) conn.close();
			if(pstmt!=null) pstmt.close();
			if(rs!=null) rs.close();
		} catch (Exception e2) {
			System.out.println("Close에러");
		}
	}

}
