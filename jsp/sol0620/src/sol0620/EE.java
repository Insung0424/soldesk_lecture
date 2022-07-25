package sol0620;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EE {

	public static void main(String[] args) throws SQLException {
		Connection conn = null; 
		// db와 연결하는 인터페이스
		PreparedStatement psmt = null;
		// sql문 실행시키기위한  객체
		ResultSet rs = null;
		// sql의 대한 반환값(쿼리실행에대한 결과값저장)

		try {
			conn = CC.get();
//			String input = "insert into emp1";
//					input += " values(8000,'ATOM','MANAGER',null,sysdate,7777,null,20)";
			
//			psmt=conn.prepareStatement(input);
//			int rs = psmt.executeUpdate();
			//executeUpdate 의 반환은 int
			
			String delete = "delete from emp1";
			delete += " where ename in 'ATOM'";
			
			psmt=conn.prepareStatement(delete);
			rs = psmt.executeQuery();
			
			System.out.println("성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		rs.close();
		psmt.close();
		conn.close();
	}

}
