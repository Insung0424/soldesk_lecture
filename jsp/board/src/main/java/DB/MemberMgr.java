package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import member.MemberBean;
import member.ZipBean;

public class MemberMgr {
	
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	public boolean checkId(String id) {
		String sql = "select id from tblmember where id=?";
		try {
			con = DBConnectionMgr.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1)==id) {
					return true;
				}
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean loginMember(String id, String pwd) {

      String sql = null;
      boolean flag = false;      
      try {
         con = DBConnectionMgr.getConnection();
         //select id를 쓰는 경우보다 아래의 경우가 더 효율적으로 id를 검색할 수 있음
         //sql = "select id from tblMember where id=? and pwd=?";
         sql = "select count(id) from tblMember where id=? and pwd=?";
         psmt = con.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pwd);
         rs = psmt.executeQuery();         
         if(rs.next()&&rs.getInt(1)==1)
            flag = true;
         
         con.close();
         psmt.close();
         rs.close();
      } catch (Exception e) {
         e.printStackTrace();
      }    
      return flag;
	}
	
	public void insertMember(MemberBean bean) {
		String sql = "insert into tblmember values(?,?,?,?,?,?,?,?)";
		try {
			
			con = DBConnectionMgr.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, bean.getId());
			psmt.setString(2, bean.getPwd());
			psmt.setString(3, bean.getName());
			psmt.setString(4, bean.getGender());
			psmt.setString(5, bean.getEmail());
			psmt.setString(6, bean.getBirth());
			psmt.setString(7, bean.getZipcode());
			psmt.setString(8, bean.getAddress());
			psmt.setString(9, bean.getHobby());
			psmt.setString(10, bean.getJob());
			psmt.executeUpdate();
			
			con.close();
			psmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 우편번호 검색
	public Vector<ZipBean> ZipCodeSearch(String area3){
		String sql = null;
		
		Vector<ZipBean> zlist = new Vector<ZipBean>();
		
		try {
			con = DBConnectionMgr.getConnection();

			
			sql = "select * from tblzipcode where area3 like  ? ";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, "%"+area3+"%");
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				ZipBean bean = new ZipBean();
				bean.setZipcode(rs.getString(1));
				bean.setArea1(rs.getString(2));
				bean.setArea2(rs.getString(3));
				bean.setArea3(rs.getString(4));
				
				zlist.add(bean);
			}
			DBConnectionMgr.close(con, psmt, rs);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return zlist;
	}
}
