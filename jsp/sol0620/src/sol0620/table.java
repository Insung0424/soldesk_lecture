package sol0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class table {
	public static Connection c;
	
	public static Connection Ct() {
		Connection c= null;
		
		PreparedStatement psmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			c = DriverManager.getConnection(url,"JIS","123456");
			
			System.out.println("연결됨");
			
		}catch(Exception e) {
			System.out.println("로딩 실패");
		}
		return c;
	}
	
	public static void main(String[] args) throws SQLException {
		
		
		String input = "create table emp3 as select * from emp1";
		Connection con = null;
		PreparedStatement psmt = null;
		
		try {
			con = Ct();
			//DB 와 연결
			psmt = con.prepareStatement(input);
			//sql 명령문 저장
			int n = psmt.executeUpdate();
			//sql 명령문 전달
			
			System.out.println(n>0 ? "성공":"실패");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		psmt.close();
		con.close();
		
	}

}
