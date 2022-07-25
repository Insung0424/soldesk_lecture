package sol0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FF {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		
		String que = "insert into emp1(empno,ename,job)"
		+" values(?,?,?)";
		//  ? : 주기적으로 변경해서 입력할 값
		Connection con = null;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url,"JIS","123456");
			psmt = con.prepareStatement(que);
			psmt.setInt(1, 1234);
			psmt.setString(2, "ATOM");
			psmt.setString(3, "ANALYST");
			
			int n = psmt.executeUpdate();
			
			System.out.println(n>0 ? "성공":"실패");
		}catch(Exception e) {
			e.printStackTrace();
		}
		psmt.close();
		con.close();
		
	}

}
