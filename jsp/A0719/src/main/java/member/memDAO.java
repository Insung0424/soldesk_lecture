package member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class memDAO {
	Connection con;
	PreparedStatement psmt;
	
	public void getCon() {
		try {
			Context ctx = new InitialContext();
			Context env = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) env.lookup("jdbc/pool");
			con = ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertM(memBean m) {
		getCon();
		try {
			String sql = "insert into member values(?,?,?,?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, m.getId());
			psmt.setString(2, m.getPasswd());
			psmt.setString(3, m.getName());
			psmt.setInt(4, m.getAge());
			psmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
