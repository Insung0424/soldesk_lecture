package firstMiniProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OneMonthCountRecord {
	String count = "select * from copy_lotto_table_count_number_ASC_MONTH1";
	String countd = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_DESC_MONTH1";
	
	OneMonthCountRecord(LoginProject lp){
		
		try {
			Connection conn = lp.getConnection();
			Statement stmt = conn.createStatement();
		
			ResultSet rset = stmt.executeQuery(count);
			while(rset.next()) {
				int i=rset.getInt(1);
				int j=rset.getInt(2);
				System.out.println("숫자 "+ i+"의 한달간 나온 횟수 "+ j);
			}
			System.out.println("목록에 없는 숫자는 한달간 나오지 않았습니다");
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
}
