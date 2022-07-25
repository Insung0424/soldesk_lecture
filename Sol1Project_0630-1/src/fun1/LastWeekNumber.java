package fun1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;

import UI.LottoLogin;

public class LastWeekNumber extends Thread{
	
	JLabel jl1;
	JLabel jl2;
	JLabel jl3;
	JLabel jl4;
	JLabel jl5;
	JLabel jl6;
	
	public LastWeekNumber(JLabel jl1, JLabel jl2, JLabel jl3,
			JLabel jl4, JLabel jl5, JLabel jl6) {
		this.jl1 = jl1;
		this.jl2 = jl2;
		this.jl3 = jl3;
		this.jl4 = jl4;
		this.jl5 = jl5;
		this.jl6 = jl6;
	}

	public void run() {
		try{
			Connection conn = LottoLogin.getConnection();
			Statement stmt = conn.createStatement();
			String s = "select num1,num2,num3,num4,num5,num6 "
						+"from copy_lotto_table "
						+"where draw_date = "
						+"(select TRUNC(sysdate, 'iw') - 2 from dual)";
			ResultSet rset = stmt.executeQuery(s);
	    	while(rset.next()) {
			    jl1.setText(String.valueOf(rset.getInt(1)));
			    jl2.setText(String.valueOf(rset.getInt(2)));
			    jl3.setText(String.valueOf(rset.getInt(3)));
			    jl4.setText(String.valueOf(rset.getInt(4)));
			    jl5.setText(String.valueOf(rset.getInt(5)));
			    jl6.setText(String.valueOf(rset.getInt(6)));
	    	}
		}
		catch(Exception e) {
			
		}
	}
	
	
}
	
