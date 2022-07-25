package jdbcConnect;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class lgin {

	JPanel cardPanel;
	lgin lp;
	CardLayout card;
	String id = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lgin lp = new lgin();
		lp.setFrame(lp);
	}

	public void setFrame(lgin lpro) {

		JFrame jf = new JFrame();
		LoginPanel lp = new LoginPanel(lpro);
		signupPanel sp = new signupPanel(lpro);
		userMyPage ump = new userMyPage(lpro);
		adminUser au = new adminUser(lpro);

		card = new CardLayout();

		cardPanel = new JPanel(card);
		cardPanel.add(lp.mainPanel, "Login");
		cardPanel.add(sp.mainPanel, "Register");
		cardPanel.add(ump.mainPanel, "My Page");
		cardPanel.add(au.mainPanel, "Admin Page");
		
		jf.add(cardPanel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 700);
		jf.setVisible(true);
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;

		conn = DriverManager.getConnection("jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=C://ora/Wallet_DBSOLDESKTEAM1",
				"admin","soldesk01TEAM)!");

		return conn;
	}
	
	public void setid(String id) {
		this.id = id;
	}

}

class LoginPanel extends JPanel implements ActionListener {

	JPanel mainPanel;
	JTextField idTextField;
	JPasswordField passTextField;

	String userMode = "일반";
	lgin lp;
	Font font = new Font("회원가입", Font.BOLD, 40);
	String admin = "admin";

	public LoginPanel(lgin lp) {
		this.lp = lp;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5, 1));

		JPanel centerPanel = new JPanel();
		JLabel loginLabel = new JLabel("로그인 화면");
		loginLabel.setFont(font);
		centerPanel.add(loginLabel);

		JPanel userPanel = new JPanel();

		JPanel gridBagidInfo = new JPanel(new GridBagLayout());
		gridBagidInfo.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		GridBagConstraints c = new GridBagConstraints();

		JLabel idLabel = new JLabel(" 아이디 : ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		gridBagidInfo.add(idLabel, c);

		idTextField = new JTextField(15);
		c.insets = new Insets(0, 5, 0, 0);
		c.gridx = 1;
		c.gridy = 0;
		gridBagidInfo.add(idTextField, c);

		JLabel passLabel = new JLabel(" 비밀번호 : ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(20, 0, 0, 0);
		gridBagidInfo.add(passLabel, c);

		passTextField = new JPasswordField(15);
		c.insets = new Insets(20, 5, 0, 0);
		c.gridx = 1;
		c.gridy = 1;
		gridBagidInfo.add(passTextField, c);

		JPanel loginPanel = new JPanel();
		JButton loginButton = new JButton("로그인");
		loginPanel.add(loginButton);

		JPanel signupPanel = new JPanel();
		JButton signupButton = new JButton("회원가입");
		loginPanel.add(signupButton);

		mainPanel.add(centerPanel);
		mainPanel.add(userPanel);
		mainPanel.add(gridBagidInfo);
		mainPanel.add(loginPanel);
		mainPanel.add(signupPanel);


		loginButton.addActionListener(this);

		signupButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.card.next(lp.cardPanel);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton) e.getSource();

		switch (e.getActionCommand()) {

		case "일반":
			userMode = "일반";
			break;

		case "관리자":
			userMode = "관리자";
			break;

		case "로그인":

			String id = idTextField.getText();
			String pass = passTextField.getText();

			try {

				String passCheck = "SELECT m_id,m_pw FROM copy_member_signup "
						+ "WHERE m_id = 'admin123' and m_pw='admin'";

				Connection conn = lp.getConnection();
				Statement stmt = conn.createStatement();

				ResultSet rset = stmt.executeQuery(passCheck);
				rset.next();

				if(id.equals(rset.getString(1))) {
					if (pass.equals(rset.getString(2))) {
						JOptionPane.
						showMessageDialog(this, "로그인 되었습니다", "로그인 성공", 1);
						
						System.out.println("good");
					} 
					else {
						JOptionPane.
						showMessageDialog(this, "ID 혹은 비밀번호가 틀렸습니다","로그인 실패", 1);
					
						System.out.println("fail");
					}
				}
				else {
					JOptionPane.
					showMessageDialog(this, "ID 혹은 비밀번호가 틀렸습니다","로그인 실패", 1);
					
					System.out.println("fail");
				}

			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(this, "Login Failed", "로그인 실패", 1);
				System.out.println("SQLException" + ex);
			}

			break;

		}
	}

} // class LoginPanel

class signupPanel extends JPanel {

	JTextField idTf;
	JPasswordField passTf;
	JPasswordField passReTf;
	JTextField nameTf;
	JTextField yearTf;
	JTextField phoneTf;
	JPanel mainPanel;
	JPanel subPanel;
	JComboBox<String> monthComboBox;
	JComboBox<String> dayComboBox;
	JRadioButton menButton;
	JRadioButton girlButton;
	JButton registerButton;
	Font font = new Font("회원가입", Font.BOLD, 40);

	String year = "", month = "", day = "";
	String id = "", pass = "", passRe = "", name = "", sex = "", phone = "";
	lgin lp;

	public signupPanel(lgin lp) {

		this.lp = lp;
		subPanel = new JPanel();
		subPanel.setLayout(new GridBagLayout());
		subPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

		JLabel idLabel = new JLabel("아이디 : ");
		JLabel passLabel = new JLabel("비밀번호 : ");
		JLabel passReLabel = new JLabel("비밀번호 재확인 : ");
		JLabel nameLabel = new JLabel("이름 : ");
		JLabel birthLabel = new JLabel("생년월일 : ");
		JLabel sexLabel = new JLabel("성별 : ");
		JLabel phoneLabel = new JLabel("핸드폰번호 : ");

		idTf = new JTextField(15);
		passTf = new JPasswordField(15);
		passReTf = new JPasswordField(15);
		nameTf = new JTextField(15);
		yearTf = new JTextField(4);
		phoneTf = new JTextField(11);

		monthComboBox = new JComboBox<String>(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" });
		dayComboBox = new JComboBox<String>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31" });

		menButton = new JRadioButton("남자");
		girlButton = new JRadioButton("여자");
		ButtonGroup sexGroup = new ButtonGroup();
		sexGroup.add(menButton);
		sexGroup.add(girlButton);

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(15, 5, 0, 0);

		c.gridx = 0;
		c.gridy = 0;
		subPanel.add(idLabel, c);

		c.gridx = 1;
		c.gridy = 0;
		subPanel.add(idTf, c); // 아이디

		c.gridx = 0;
		c.gridy = 1;
		subPanel.add(passLabel, c);

		c.gridx = 1;
		c.gridy = 1;
		subPanel.add(passTf, c); // pass
		
		c.gridx = 2;
		c.gridy = 1; 
		subPanel.add(new JLabel("특수문자 + 8자"),c); //보안설정

		c.gridx = 0;
		c.gridy = 2;
		subPanel.add(passReLabel, c);

		c.gridx = 1;
		c.gridy = 2;
		subPanel.add(passReTf, c); // password 재확인

		c.gridx = 0;
		c.gridy = 3;
		subPanel.add(nameLabel, c);

		c.gridx = 1;
		c.gridy = 3;
		subPanel.add(nameTf, c); // 이름

		c.gridx = 0;
		c.gridy = 4;
		subPanel.add(birthLabel, c);

		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 0.6;
		subPanel.add(yearTf, c);

		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 0.2;
		subPanel.add(monthComboBox, c);

		c.gridx = 3;
		c.gridy = 4;
		c.weightx = 0.2;
		subPanel.add(dayComboBox, c);

		c.gridx = 0;
		c.gridy = 5;
		subPanel.add(sexLabel, c);

		c.gridx = 1;
		c.gridy = 5;
		subPanel.add(menButton, c);

		c.gridx = 2;
		c.gridy = 5;
		subPanel.add(girlButton, c);

		c.gridx = 0;
		c.gridy = 6;
		subPanel.add(phoneLabel, c);

		c.gridx = 1;
		c.gridy = 6;
		subPanel.add(phoneTf, c);

		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		JLabel signupLabel = new JLabel("회원가입 화면 ");
		signupLabel.setFont(font);
		signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		registerButton = new JButton("회원가입");
		registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		mainPanel.add(signupLabel);
		mainPanel.add(subPanel);
		mainPanel.add(registerButton);

		monthComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == monthComboBox) {
					JComboBox monthBox = (JComboBox) e.getSource();
					month = (String) monthBox.getSelectedItem();
					System.out.println(month);
				}

			}
		});
		dayComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == dayComboBox) {
					JComboBox dayBox = (JComboBox) e.getSource();
					day = (String) dayBox.getSelectedItem();
					System.out.println(month);
				}
			}
		});

		menButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sex = e.getActionCommand();
			}
		});

		girlButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sex = e.getActionCommand();
			}
		});
		registerButton.addActionListener(new ActionListener() {      //회원가입버튼

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				id = idTf.getText();
				pass = new String(passTf.getPassword());
				passRe = new String(passReTf.getPassword());
				name = nameTf.getText();
				year = yearTf.getText();
				phone = phoneTf.getText();

				String sql = "insert into user_info(id, password, name, birthday, sex, phoneNumber) values (?,?,?,?,?,?)";

				Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$"); //8자 영문+특문+숫자
				Matcher passMatcher = passPattern1.matcher(pass);

				if (!passMatcher.find()) {
					JOptionPane.showMessageDialog(null, "비밀번호는 영문+특수문자+숫자 8자로 구성되어야 합니다", "비밀번호 오류", 1);
				} else if (!pass.equals(passRe)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 서로 맞지 않습니다", "비밀번호 오류", 1);

				} else {
					try {
						Connection conn = lp.getConnection();

						PreparedStatement pstmt = conn.prepareStatement(sql);

						String date = yearTf.getText() + "-" + month + "-" + day;

						pstmt.setString(1, idTf.getText());
						pstmt.setString(2, pass);
						pstmt.setString(3, nameTf.getText());
						pstmt.setString(4, date);
						pstmt.setString(5, sex);
						pstmt.setString(6, phoneTf.getText());

						int r = pstmt.executeUpdate();
						System.out.println("변경된 row " + r);
						JOptionPane.showMessageDialog(null, "회원 가입 완료!", "회원가입", 1);
						lp.card.previous(lp.cardPanel); // 다 완료되면 로그인 화면으로
					} catch (SQLException e1) {
						System.out.println("SQL error" + e1.getMessage());
						if (e1.getMessage().contains("PRIMARY")) {
							JOptionPane.showMessageDialog(null, "아이디 중복!", "아이디 중복 오류", 1);
						} else
							JOptionPane.showMessageDialog(null, "정보를 제대로 입력해주세요!", "오류", 1);
					} // try ,catch
				}
			}
		});

	}
}



class userMyPage extends JPanel implements ActionListener {

	JPanel mainPanel;
	JPanel centerPanel;
	JPanel downPanel;
	JButton logoutButton;
	JButton unregisterButton;
	lgin lp;
	Font font = new Font("회원가입", Font.BOLD, 40);

	JTextField changepassTF;
	JTextField changephoneTF;

	JButton changepassButton;
	JButton changephoneButton;

	public userMyPage(lgin lp) {

		this.lp = lp;

		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		// top
		JLabel mypageLabel = new JLabel("내 정보");
		mypageLabel.setFont(font);
		mypageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		// center

		centerPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		changepassTF = new JTextField(13);
		changephoneTF = new JTextField(12);
		changepassButton = new JButton("비밀번호 바꾸기");
		changephoneButton = new JButton("전화번호 바꾸기");

		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 5, 0, 0);

		c.gridx = 0;
		c.gridy = 0;
		centerPanel.add(changephoneTF, c);

		c.gridx = 1;
		c.gridy = 0;
		centerPanel.add(changephoneButton, c);

		c.gridx = 0;
		c.gridy = 1;
		centerPanel.add(changepassTF, c);

		c.gridx = 1;
		c.gridy = 1;
		centerPanel.add(changepassButton, c);

		// down
		downPanel = new JPanel();
		logoutButton = new JButton("로그아웃");
		unregisterButton = new JButton("탈퇴");
		downPanel.add(logoutButton);
		downPanel.add(unregisterButton);

		mainPanel.add(mypageLabel);
		mainPanel.add(centerPanel);
		mainPanel.add(downPanel);

		logoutButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.card.first(lp.cardPanel);
			}
		});

		changephoneButton.addActionListener(this);
		changepassButton.addActionListener(this);
		unregisterButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;
		// System.out.println(lp.id);

		try {
			conn = lp.getConnection();

			switch (e.getActionCommand()) {

			case "전화번호 바꾸기":
				String SQL = "update user_info set phoneNumber=? where id=?";
				pstmt = conn.prepareStatement(SQL);

				pstmt.setString(1, changephoneTF.getText());
				pstmt.setString(2, lp.id);

				int r = pstmt.executeUpdate();
				System.out.println("변경된 row : " + r);

				break;

			case "비밀번호 바꾸기":
				String SQL1 = "update user_info set password=? where id=?";
				pstmt = conn.prepareStatement(SQL1);

				pstmt.setString(1, changepassTF.getText());
				pstmt.setString(2, lp.id);

				int r1 = pstmt.executeUpdate();
				System.out.println("변경된 row : " + r1);
				break;

			case "탈퇴":

				String SQL2 = "delete from user_info where id=?";
				pstmt = conn.prepareStatement(SQL2);

				int result = JOptionPane.showConfirmDialog(null, "정말로 탈퇴하시겠습니까?", "Confirm message",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					pstmt.setString(1, lp.id);
					int r2 = pstmt.executeUpdate();
					System.out.println("변경된 row: " + r2);
					lp.card.first(lp.cardPanel);
				} else
					break;

				break;

			default:
				break;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}// userinfo 클래스

class adminUser implements ActionListener {

	JPanel mainPanel;
	Font font = new Font("회원가입", Font.BOLD, 40);
	lgin lp;
	String unregisterID;

	public adminUser(lgin lp) {

		this.lp = lp;

		List<String> idList = new ArrayList<String>(getIDs());

		JLabel adminpageLabel = new JLabel("관리자 모드");
		adminpageLabel.setFont(font);
		adminpageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JComboBox<String> idComboBox = new JComboBox<String>(idList.toArray(new String[idList.size()]));
		JButton logoutButton = new JButton("로그아웃");
		JButton unregisterButton = new JButton("강제탈퇴");

		JPanel centerPanel = new JPanel();
		centerPanel.add(idComboBox);
		centerPanel.add(unregisterButton);

		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(adminpageLabel);
		mainPanel.add(centerPanel);
		mainPanel.add(logoutButton);

		idComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox<String> idBox = (JComboBox) e.getSource();
				unregisterID = idBox.getSelectedItem().toString();
			}
		}); // idComboBox 이벤트 처리

		logoutButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.card.first(lp.cardPanel);
			}
		}); // 로그아웃 이벤트 처리

		unregisterButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			Connection conn = lp.getConnection();
			String SQL2 = "delete from user_info where id=?";
			PreparedStatement pstmt = conn.prepareStatement(SQL2);

			if (unregisterID.equals("admin")) {
				JOptionPane.showMessageDialog(null, "관리자 계정은 지울수 없습니다.", "삭제 실패", 1);
			} else {
				int result = JOptionPane.showConfirmDialog(null, "정말로 탈퇴하시겠습니까?", "Confirm message",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					pstmt.setString(1, unregisterID);
					int r2 = pstmt.executeUpdate();
					System.out.println("변경된 row: " + r2);
				}

			}
		

		} catch (SQLException e5) {
			e5.printStackTrace();
		}
	}//회원탈퇴
	
	public List<String> getIDs() {
		List<String> list = new ArrayList<String>();
		
		try {
			Connection conn = lp.getConnection();
			String SQL = "SELECT ID FROM user_info";
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(SQL);

			while (rs.next()) {
				list.add(rs.getString("id"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
