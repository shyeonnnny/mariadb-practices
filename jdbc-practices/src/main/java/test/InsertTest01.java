package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest01 {

	public static void main(String[] args) {
		insert("영업");
		insert("개발");
		insert("기획");
	}

	private static boolean insert(String name) {
		boolean result = false;
		Connection conn = null; // (주소, 아이디, 비번)
		Statement stmt = null;
		try {
			// 1. JDBC Driver 로딩
			Class.forName("org.mariadb.jdbc.Driver");  // 클래스 로딩
			
			// 2. 연결하기
			String url = "jdbc:mysql://127.0.0.1:3306/employees?charset=utf8"; // ?charset=utf8은 옵션
			conn = DriverManager.getConnection(url, "hr", "hr"); // (주소, 아이디, 비번)
			
			// 3. Statement 생성
			stmt = conn.createStatement();
			
			// 4. SQL 실행
			String sql="insert into dept values(null, '" + name + "')";
			int count = stmt.executeUpdate(sql);
			
			result = count == 1;
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally { // close하면 자동 commit 됨
			// clean up
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}
		return result;
	}

}
