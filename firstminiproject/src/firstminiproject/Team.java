package firstminiproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


class Myinfo extends JFrame{
	String url = "jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
	Connection conn = null;
	Myinfo(){
		Font fontl = new Font("D2Coding", Font.BOLD, 25);
		Font fontb = new Font("D2Coding", Font.BOLD, 10);
		setLayout(null);
		setTitle("내 정보");		
		JLabel jLabel= new JLabel("내 정보 열람하기");
		jLabel.setBounds(100, 10, 250, 50);
		JLabel info=new JLabel();
		jLabel.setFont(fontl);
		 JButton returnbutton = new JButton("되돌아가기");
		 returnbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new Team();
				setVisible(false);
			}
		});
		 returnbutton.setFont(fontb);
		 returnbutton.setBounds(145, 250, 100, 50);
		 add(jLabel);
		 add(info);
		 add(returnbutton); 
		 setVisible(true);
		 setSize(400, 400);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("fine");
			conn = DriverManager.getConnection(url, "admin", "soldesk01TEAM)!");
			System.out.println("good");
			String a = "select m_id,null,m_name,m_birth,m_gender,m_email,m_phone "
					+ "from member_signup where m_id='admin123'";
			PreparedStatement psmt = conn.prepareStatement(a);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				String m_id = rs.getString(1);
				String m_name = rs.getString(3);
				Date m_birth = rs.getDate(4);
				String m_gender = rs.getString(5);
				String m_email = rs.getString(6);
				String m_phone = rs.getString(7);
				info.add( getParent(), "아이디: "+m_id+" 이름: "+m_name+" 생년월일: "+m_birth+" 성별: "+m_gender+" 이메일: "+m_email+" 연락처: "+m_phone, getDefaultCloseOperation());
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	

	}
}


public class Team extends JFrame {
	
	Team() {
		Font fontl = new Font("D2Coding", Font.BOLD, 25);// 폰트지정입니다
		Font fontb = new Font("D2Coding", Font.BOLD, 15);
		setTitle("팀프로젝트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		JLabel jl_pagelogo = new JLabel("마이페이지");
		jl_pagelogo.setOpaque(true);
		jl_pagelogo.setFont(fontl);
		jl_pagelogo.setBounds(130, 8, 130, 50);
		jl_pagelogo.setForeground(Color.black);

		JButton jb_lotto_record = new JButton("내 기록 보기");
		jb_lotto_record.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {			
				String url;
				Connection conn = null;
				url = "jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
				;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("fine");
					conn = DriverManager.getConnection(url, "admin", "soldesk01TEAM)!");
					System.out.println("good");
					String a = "select * from copy_lotto_record where m_id='admin123'";
					PreparedStatement psmt = conn.prepareStatement(a);

					ResultSet rs = psmt.executeQuery();

					while (rs.next()) {
						String m_id = rs.getString(1);
						Date record_time = rs.getDate(2);
						int num1 = rs.getInt(3);
						int num2 = rs.getInt(4);
						int num3 = rs.getInt(5);
						int num4 = rs.getInt(6);
						int num5 = rs.getInt(7);
						int num6 = rs.getInt(8);
						int bonus = rs.getInt(9);

						JOptionPane.showMessageDialog(null,
								"아이디: " + m_id + " 기록 시간 : " + record_time +" " + num1 + " " + num2 + " " + num3 + " "
										+ num4 + " " + num5 + " " + num6 + " " + bonus,
								"내 기록", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		});
		jb_lotto_record.setOpaque(true);
		jb_lotto_record.setFont(fontb);
		jb_lotto_record.setBounds(100, 130, 180, 50);
		jb_lotto_record.setForeground(Color.black);
		JButton jb_myinfo = new JButton("내 정보 보기");

		jb_myinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Myinfo();
				setVisible(false);
			}
		});

		jb_myinfo.setOpaque(true);
		jb_myinfo.setFont(fontb);
		jb_myinfo.setBounds(100, 190, 180, 50);
		jb_myinfo.setForeground(Color.black);

		add(jl_pagelogo);
		add(jb_lotto_record);
		add(jb_myinfo);

		setVisible(true);
		setSize(400, 400);
		}
	
		
	
		

	public static void main(String[] args) {
		new Team();

	}
	
}
