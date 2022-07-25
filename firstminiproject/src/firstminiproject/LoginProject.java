package firstMiniProject;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginProject {

	JPanel cardPanel;
	LoginProject lp;
	CardLayout card;
	

	public static void main(String[] args) {

		LoginProject lp = new LoginProject();
		lp.setFrame(lp);
		
	}

	public void setFrame(LoginProject lpro) {

		JFrame jf = new JFrame();
		LoginPanel lp = new LoginPanel(lpro);

		card = new CardLayout();

		cardPanel = new JPanel(card);
		cardPanel.add(lp.mainPanel, "Login");
		
		jf.add(cardPanel);
		jf.setSize(500, 700);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;

		conn = DriverManager.
				getConnection("jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=C://ora/Wallet_DBSOLDESKTEAM1",
						"admin","soldesk01TEAM)!");

		return conn;
	}


	
	
}
	
class LoginPanel extends JPanel implements ActionListener {

		JPanel mainPanel;
		JTextField idTextField;
		JPasswordField passTextField;

		LoginProject lp;
		Font font = new Font("회원가입", Font.BOLD, 40);

		public LoginPanel(LoginProject lp) {
			this.lp = lp;
			
			mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(6, 1));

			JPanel centerPanel = new JPanel();
			JLabel loginLabel = new JLabel("로그인 화면");
			loginLabel.setFont(font);
			centerPanel.add(loginLabel);
			
			JComboBox combo = new JComboBox();
			combo.setModel(new DefaultComboBoxModel(
					new String[] {"기간 설정","전체기간","최근 한달","최근 3개월","최근 6개월","최근 1년"}));
			JPanel comPanel = new JPanel();
			comPanel.add(combo);

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
			mainPanel.add(comPanel);
			mainPanel.add(userPanel);
			mainPanel.add(gridBagidInfo);
			mainPanel.add(loginPanel);
			mainPanel.add(signupPanel);


			loginButton.addActionListener(this);
			
			combo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JComboBox JC = (JComboBox) e.getSource();
					
					switch (JC.getSelectedItem().toString()) {
					case "전체기간" :
						new AllTimeCountRecord(lp);
						break;
					case "최근 한달" :
						new OneMonthCountRecord(lp);
						break;
					case "최근 3개월" :
						new ThreeMonthCountRecord(lp);
						break;
					case "최근 6개월" :
						new SixMonthCountRecord(lp);
						break;
					case "최근 1년" :
						new OneYearCountRecord(lp);
						break;
					}
					
				}
			});

			signupButton.addActionListener(new ActionListener() {
					// 회원가입으로 넘어가기
				@Override
				public void actionPerformed(ActionEvent e) {
//					lp.card.next(lp.cardPanel);

					//========================================================================
					
//					new Sleep();
					//=============== 선생님 컨셉 ===========================
					
				}
				
				
				
			});

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton) e.getSource();

			switch (e.getActionCommand()) {
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
							
							//여기서 이동 메인으로 이동
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




