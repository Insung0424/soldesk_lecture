package sol0620;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DD {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null; 
		// db와 연결하는 인터페이스
		PreparedStatement psmt = null;
		// sql문 실행시키기위한  객체
		ResultSet rs = null;
		// sql의 대한 반환값(쿼리실행에대한 결과값저장)

		try {
			String que = "select * from emp1";
			conn = CC.get();
			psmt=conn.prepareStatement(que);
			rs = psmt.executeQuery();
			// select - executeQuery()
			// DML - executeUpdate()
			
			while(rs.next()) {
				//DB에 있는 값들을 가져옴
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				java.sql.Date hiredate = rs.getDate(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno + " "
						+ ename + " " +job + " "
						+ mgr + " " +hiredate + " "
						+ sal + " " +comm + " "
						+ deptno);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		rs.close();
		psmt.close();
		conn.close();
	}

}
