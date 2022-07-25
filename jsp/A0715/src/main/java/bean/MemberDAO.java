package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberDAO {
	
	String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	String id = "JIS";
	String pw = "123456";
	
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	//데이터베이스접근 객체1
	public Connection getConnection() {
		try{
			//해당데이터베이스 사용하기위한 선언
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//데이터 베이스 접속
			con = DriverManager.getConnection(url,id,pw);
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
	//쿼리 실행 객체 1
	public void insertMember(MemberBean member) {
		try {
			con = getConnection();
			String sql = "insert into Mem values(?,?,?,?,?,?,?,?)";
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPass1());
			psmt.setString(3, member.getEmail());
			psmt.setString(4, member.getTel());
			psmt.setString(5, member.getHobby());
			psmt.setString(6, member.getJob());
			psmt.setString(7, member.getAge());
			psmt.setString(8, member.getInfo());
			psmt.executeUpdate();
			//삽입,삭제,수정 시에 사용하는 메소드
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//데이터베이스 결과 리턴받아 자바에 저장하는 객체1
	public Vector<MemberBean> allSelectMember() {
		Vector<MemberBean> vec = new Vector<>();
		try {
			con = getConnection();
			String sql = "select * from Mem";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			//쿼리를 실행시킨 결과를 리턴받아 자바에 저장
			
			
			while(rs.next()) {
				MemberBean m = new MemberBean();
				m.setId(rs.getString(1));
				m.setPass1(rs.getString(2));
				m.setEmail(rs.getString(3));
				m.setTel(rs.getString(4));
				m.setHobby(rs.getString(5));
				m.setJob(rs.getString(6));
				m.setAge(rs.getString(7));
				m.setInfo(rs.getString(8));
				vec.add(m);
			}
			
			rs.close();
			psmt.close();
			con.close();
		}catch(Exception e) {
			
		}
		return vec;
	}
	
	public MemberBean oneMember(String id) {
		MemberBean member = new MemberBean();
		con = getConnection();
		String sql = "select * from Mem where id=?";
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				member.setId(rs.getString(1));
				member.setPass1(rs.getString(2));
				member.setEmail(rs.getString(3));
				member.setTel(rs.getString(4));
				member.setHobby(rs.getString(5));
				member.setJob(rs.getString(6));
				member.setAge(rs.getString(7));
				member.setInfo(rs.getString(8));
			}
			rs.close();
			psmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return member; 
	}
	
	public MemberBean memberUpdate(String id) { 
		MemberBean member = new MemberBean();
		con = getConnection();
		String sql = "update from Mem where id=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				member.setId(rs.getString(1));
				member.setPass1(rs.getString(2));
				member.setEmail(rs.getString(3));
				member.setTel(rs.getString(4));
				member.setHobby(rs.getString(5));
				member.setJob(rs.getString(6));
				member.setAge(rs.getString(7));
				member.setInfo(rs.getString(8));
			}
			rs.close();
			psmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	
	public void updateMember(MemberBean member) { 
		con = getConnection();
		String sql = "update Mem set email=?,tel=? where id=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, member.getEmail());
			psmt.setString(2, member.getTel());
			psmt.setString(3, member.getId());
			psmt.executeUpdate();
			
			rs.close();
			psmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void memberDelete(String id) { 
		con = getConnection();
		String sql = "delete from Mem where id=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getPass(String id) {
		String pass="";
		con = getConnection();
		String sql = "select pass1 from Mem where id=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				pass = rs.getString(1);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pass;
	}
}
