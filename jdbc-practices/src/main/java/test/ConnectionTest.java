package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection conn = null; // (주소, 아이디, 비번)
		try {
			// 1. JDBC Driver 로딩
			Class.forName("org.mariadb.jdbc.Driver");  // 클래스 로딩
			
			// 2. 연결하기
			String url = "jdbc:mysql://127.0.0.1:3306/webdb";
			
			conn = DriverManager.getConnection(url, "webdb", "webdb"); // (주소, 아이디, 비번)
			
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally { // close하면 자동 commit 됨
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}
	}

}

