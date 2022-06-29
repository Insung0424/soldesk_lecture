package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcCon {
	public static void main(String[] args) {
//		String url;
//		Connection conn = null;
//		url="jdbc:oracle:thin:@localhost:1521/xepdb1";
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("fine");
//			conn=DriverManager.getConnection(url,"ID","PW");
//			System.out.println("good");
//			String a = "select empno,ename,job from emp1 where ename='KING'";
//			PreparedStatement psmt = conn.prepareStatement(a);
//			ResultSet rs = psmt.executeQuery();
//			
//			int a1 = 0;
//			String n1 = null;
//			String n2 = null;
//			while(rs.next()) {
//				a1 = rs.getInt(1);
//				n1 = rs.getString(2);
//				n2 = rs.getString(3);
//			}
//			System.out.println(a1+" "+n1+" "+n2);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		String url;
		Connection conn = null;
		// DB와 이클립스를 연결하는 객체
		
		
		url="jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
		/*
		 *  url 설정법 
		 *  jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=
		 *  여기까지는 기본 그대로 두시면 됩니다
		 *  이후에 나오는 이부분을 수정 해야합니다 /ora/Wallet_DBSOLDESKTEAM1"
		 * 	전자지갑압축파일을 받으셨을텐데 압축해제하시고
		 * 	생성된파일인 Wallet_DBSOLDESKTEAM1 가 있는 경로를 써주시면 됩니다
		 *  추천 경로는 c 드라이브 밑에 ora폴더를 만들고 그 안에서 압축해제입니다
		 *  C:/ora/Wallet_DBSOLDESKTEAM1(압축해제된파일) 인 상태가 되면
		 *  경로 변경없이 사용가능 합니다
		 *  
		 */
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("fine");
			
			
			conn=DriverManager.getConnection(url,"admin","soldesk01TEAM)!");
			System.out.println("good");
			
			
			String a = "select LO_ROUND,NUM1,NUM2 from copy_lotto_table "
					+ "where lo_round=30";
			
//			String a1 = "select LO_ROUND,NUM1,NUM2 from copy_lotto_table";
			/*
			 * 기본적인 이클립스와 클라우드DB와 연동은 확인됬습니다
			 * 
			 * 쿼리문 실행해서 여러줄받아보려했는데 막상 결과값이 한줄만 나왔습니다
			 * 지금 집컴퓨터에서는 수업저장한게 없어서 어떻게 하는지 몰라서 넘겼습니다
			 * 방법을 아시는 분은 확인바랍니다 
			 * 
			 */
			PreparedStatement psmt = conn.prepareStatement(a);
			ResultSet rs = psmt.executeQuery();
			
			int a1 = 0;
			int n1 = 0;
			int n2 = 0;
			while(rs.next()) {
				a1 = rs.getInt(1);
				n1 = rs.getInt(2);
				n2 = rs.getInt(3);
			}
			System.out.println(a1+" "+n1+" "+n2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
