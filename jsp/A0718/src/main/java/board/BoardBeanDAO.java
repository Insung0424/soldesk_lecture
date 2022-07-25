package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardBeanDAO {
	
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void getConnection() {
		// 미리 db에 연결해두는 작업
		try {
			Context ctx = new InitialContext();
			Context env = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) env.lookup("jdbc/pool");
			con = ds.getConnection();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertBoard(BoardBean board) {
		getConnection();
		int ref=0; // 글 그룹
		int re_step=1; // 새 글
		int re_level=1; // 
		
		try {
			String rsql = "select max(ref) from board";
			
			psmt = con.prepareStatement(rsql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				ref=rs.getInt(1)+1;
			}
			
			String sql = "insert into board values(bo_seq.NEXTVAL,?,?,?,?,sysdate,?,?,?,0,?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, board.getWriter());
			psmt.setString(2, board.getEmail());
			psmt.setString(3, board.getSubject());
			psmt.setString(4, board.getPassword());
			psmt.setInt(5, ref);
			psmt.setInt(6, re_step);
			psmt.setInt(7, re_level);
			psmt.setString(8, board.getContent());
			
			psmt.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Vector<BoardBean> allBoard(int start, int end) {
		Vector<BoardBean> vec = new Vector<>();
		getConnection();
		try {
			String sql=
					"select * from "
		            + "(select A.*, Rownum Rnum from "
		            + "(select * from board order by ref desc, re_level asc) A) "
		            + "where Rnum>=? and Rnum<=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, start);
			psmt.setInt(2, end);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BoardBean board = new BoardBean();
				board.setNum(rs.getInt(1));
				board.setWriter(rs.getString(2));
				board.setEmail(rs.getString(3));
				board.setSubject(rs.getString(4));
				board.setPassword(rs.getString(5));
				board.setReg_date(rs.getDate(6).toString());
				board.setRef(rs.getInt(7));
				board.setRe_step(rs.getInt(8));
				board.setRe_level(rs.getInt(9));
				board.setReadcount(rs.getInt(10));
				board.setContent(rs.getString(11));
				vec.add(board);
			}
			
			rs.close();
			psmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vec;
	}
	
	public int getAllCount() {
		int count = 0;
		getConnection();
		try {
			String sql = "select count(*) from board";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public BoardBean oneBoard(int num){
		BoardBean b = new BoardBean();
		getConnection();
		
		try {
			String readsql = "update board set readcount=readcount+1 where num=?";
			psmt = con.prepareStatement(readsql);
			psmt.setInt(1, num);
			psmt.executeQuery();
					
			String sql = "select * from board where num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if(rs.next()) {
				b.setNum(rs.getInt(1));
				b.setWriter(rs.getString(2));
				b.setEmail(rs.getString(3));
				b.setSubject(rs.getString(4));
				b.setPassword(rs.getString(5));
				b.setReg_date(rs.getDate(6).toString());
				b.setRef(rs.getInt(7));
				b.setRe_step(rs.getInt(8));
				b.setRe_level(rs.getInt(9));
				b.setReadcount(rs.getInt(10));
				b.setContent(rs.getString(11));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public void reWriteBoard(BoardBean b) {
		// 댓글달기
		getConnection();
		int ref = b.getRef();
		int re_step = b.getRe_step();
		int re_level = b.getRe_level();
		try {
			String levelsql = "update board set re_level=re_level+1 where ref=? and re_level>?";
			psmt = con.prepareStatement(levelsql);
			psmt.setInt(1, ref);
			psmt.setInt(2, re_level);
			psmt.executeUpdate();
			
			String sql = "insert into board values(bo_seq.NEXTVAL,?,?,?,?,sysdate,?,?,?,0,?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, b.getWriter());
			psmt.setString(2, b.getEmail());
			psmt.setString(3, b.getSubject());
			psmt.setString(4, b.getPassword());
			psmt.setInt(5, ref);
			psmt.setInt(6, ++re_step);
			psmt.setInt(7, ++re_level);
			psmt.setString(8, b.getContent());
			psmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public BoardBean oneupdateBoard(int num) {
		//입력된 번호의 글 정보 가져오기
		BoardBean b = new BoardBean();
		getConnection();
		
		try {
			String sql = "select * from board where num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if(rs.next()) {
				b.setNum(rs.getInt(1));
				b.setWriter(rs.getString(2));
				b.setEmail(rs.getString(3));
				b.setSubject(rs.getString(4));
				b.setPassword(rs.getString(5));
				b.setReg_date(rs.getDate(6).toString());
				b.setRef(rs.getInt(7));
				b.setRe_step(rs.getInt(8));
				b.setRe_level(rs.getInt(9));
				b.setReadcount(rs.getInt(10));
				b.setContent(rs.getString(11));
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public String getPass(int num) {
		// 입력된 글 번호의 비밀번호값가져오기
		String pw ="";
		getConnection();
		
		try {
			String sql="select password from board where num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if(rs.next()) {
				pw = rs.getString(1);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pw;
	}
	
	public void updateBoard(BoardBean b) {
		//
		getConnection();
		
		try {
			String sql = "update board set subject=?, content=? where num=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, b.getSubject());
			psmt.setString(2, b.getContent());
			psmt.setInt(3, b.getNum());
			psmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBoard(int num) {
		getConnection();
		try {
			String sql = "delete from board where num=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
