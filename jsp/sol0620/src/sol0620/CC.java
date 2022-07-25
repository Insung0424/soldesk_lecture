package sol0620;

import java.sql.Connection;
import java.sql.DriverManager;

public class CC {

	public static Connection con;
	// 데이터베이스와 연결하기 위한 인터페이스
	public static Connection get() {
		Connection conn = null;
		try {
			String id = "JIS";
			String pw = "123456";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//jdbc 드라이버 로딩 -> DriverManeger 에 등록됨
			//forName은 정적메소드
			
			conn = DriverManager.getConnection(url,id,pw);
			//connection 객체를 얻음
			//conn 은 데이터베이스와 연결하여 작업을 수행할 수 있는
			// 통로로 작용하는 객체변수로 사용됨
			
			System.out.println("데이터베이스에 연결됨");
			
			
			
			
		}catch(Exception e) {
			System.out.println("로딩 실패");
		}
		return conn;
	}
	

}
