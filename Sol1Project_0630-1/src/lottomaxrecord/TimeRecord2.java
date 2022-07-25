package lottomaxrecord;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTextArea;

import UI.LottoLogin;

public class TimeRecord2 extends Thread implements maxRecord{
	
	//통계기록기간을 정하면 해당기간에 맞는 뷰테이블을 가져오기 위해 스위치케이스로 select함
	JTextArea tarea;
	private String count;
	private String select = "";
	private TimeRecord2() {}
	ArrayList<Integer> nlist = new ArrayList<>();
	
	public TimeRecord2(String count,JTextArea tarea) {
		this.count = count;
		this.tarea = tarea;
	}

	@Override
	public void run() {
		SelectQuery();
	}

	@Override
	public void SelectQuery() {
		try {
			Connection conn = LottoLogin.getUserConnection();
			Statement stmt = conn.createStatement();
			if(tarea.getText().equals("통계가 보이는 곳")) {
				tarea.setText("");
			}
		
			switch (count) {
			case "전체기간" :
				select = "select * from admin.copy_lotto_table_count_number_ASC";
				break;
			case "최근 한달" :
				select = "select * from admin.copy_lotto_table_count_number_ASC_MONTH1";
				break;
			case "최근 3개월" :
				select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
				break;
			case "최근 6개월" :
				select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
				break;
			case "최근 1년" :
				select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
				break;
			}
			
			ResultSet rset = stmt.executeQuery(select);
			nlist.clear(); //목록을 비워야 그 다음 통계기간을 대조할때 영향이 없음 
	    
		    while(rset.next()) {
		        int i=rset.getInt(1);
		        nlist.add(i);
		        int j=rset.getInt(2);
		        tarea.append("숫자 "+ i+"의 "+count+"동안 나온 횟수 "+ j+"\n");
		     }
		    tarea.append("\n");
		    NoneNum Nn = new NoneNum(nlist);
		     
		    if(Nn.getNoneNum().length() > 1) {
		    	 tarea.append("목록에 없는 숫자");
		    	 tarea.append("\n");
		    	 tarea.append(Nn.getNoneNum());
		    	 tarea.append("\n");
		    	 tarea.append("은(는) "+ count +"동안 나오지 않았습니다\n");
		    }
	    
	    }catch(Exception er) {
			er.printStackTrace();
		}
	}
}
	
	

	

	
	
	
	


