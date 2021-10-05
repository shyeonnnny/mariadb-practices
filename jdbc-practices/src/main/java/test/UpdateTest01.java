package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest01 {

	public static void main(String[] args) {
		DeptVo vo = new DeptVo();
		vo.setNo(8L);
		vo.setName("전략기획팀");
		
		Boolean result = update(vo);
		if(result) {
			System.out.println("성공!");
		}
	}

	private static Boolean update(DeptVo vo) {
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
			String sql=
					"update dept" + "  set name='" + vo.getName() + "'" + "where no=" + vo.getNo();
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
