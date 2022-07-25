package firstMiniProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ThreeMonthCountRecord {
	String count = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_aSC_MONTH3";
	String countd = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_DESC_MONTH3";
	
	ThreeMonthCountRecord(LoginProject lp){
		
		try {
			Connection conn = lp.getConnection();
			Statement stmt = conn.createStatement();
		
			ResultSet rset = stmt.executeQuery(count);
			while(rset.next()) {
				int i=rset.getInt(1);
				int j=rset.getInt(2);
				System.out.println("숫자 "+ i+"의 최근 3개월간 나온 횟수 "+ j);
			}
			System.out.println("목록에 없는 숫자는 최근 3개월간 나오지 않았습니다");
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
}
