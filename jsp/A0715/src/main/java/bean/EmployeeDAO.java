package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDAO {
	String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	String id = "JIS";
	String pw = "123456";
	
	Connection con;
	PreparedStatement psmt;
	
	public Connection getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void addEmp(employee emp) {
		con = getCon();
		String sql = "insert into Employee values(?,?,?)";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, emp.getName());
			psmt.setString(2, emp.getAddress());
			psmt.setString(3, emp.getSsn());
			psmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			
		}
	}
}
