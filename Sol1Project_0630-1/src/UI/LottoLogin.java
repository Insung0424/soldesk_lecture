package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import myPage.MyPage;

class ImagePanel extends JPanel{
	
	private Image img;
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null);
	}
	
}

public class LottoLogin implements ActionListener {
	public Connection conn;
	public JFrame frame;
	private JTextField IdTextField;
	private JPasswordField passTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LottoLogin window = new LottoLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LottoLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		IdTextField = new JTextField();
		IdTextField.setBounds(259, 264, 266, 33);
		panel.add(IdTextField);
		IdTextField.setColumns(10);
		
		JButton LogInbtn = new JButton("LOG IN");
			
		LogInbtn.setForeground(Color.BLACK);
		LogInbtn.setBackground(Color.WHITE);
		LogInbtn.setFont(new Font("Arial", Font.PLAIN, 20));
		LogInbtn.setBounds(305, 417, 174, 60);
		panel.add(LogInbtn);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(259, 221, 57, 33);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 15));
		lblPassword.setBounds(259, 307, 133, 33);
		panel.add(lblPassword);
		
		JLabel Signlb = new JLabel("Create Account");
		Signlb.setForeground(Color.WHITE);
		Signlb.setBounds(350, 499, 94, 22);
		Signlb.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				CreateAccount n = new CreateAccount();
				n.setVisible(true);
				frame.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				Signlb.setForeground(Color.yellow);
			}

			public void mouseExited(MouseEvent e) {
				Signlb.setForeground(Color.white);
			}
			
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}

		});
		panel.add(Signlb);
		
		passTextField = new JPasswordField();
		passTextField.setBounds(259, 344, 266, 33);
		panel.add(passTextField);
		
		JPanel ImageUser = new JPanel();
		ImageUser.setBackground(Color.BLACK);
		ImageUser.setBounds(363, 73, 67, 69);
		panel.add(ImageUser);
		
		ImagePanel ip = new ImagePanel(new ImageIcon("./image/user.png").getImage());
		ImageUser.add(ip);
		
		frame.setTitle("로그인 화면");
		frame.setBounds(100, 100, 800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		LogInbtn.addActionListener(this);
		//자기 자신이 리스너의 구현 클래스이므로 this를 매개변수로 준다

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();

		String id = IdTextField.getText();
		String pass = passTextField.getText();
		String fail = "ID 혹은 비밀번호가 틀렸습니다";
		String logfail = "로그인 실패";
			
		if(id.equals("admin123")) {
			try {
				String passCheck = "SELECT m_id,m_pw FROM copy_member_signup "
						+ "WHERE m_id = 'admin123' and m_pw='admin'";

				Connection conn = getConnection();
				Statement stmt = conn.createStatement();

				ResultSet rset = stmt.executeQuery(passCheck);
				rset.next();

				if(id.equals(rset.getString(1))) {
						
					if (pass.equals(rset.getString(2))) {
						JOptionPane.
						showMessageDialog(jb, "관리자계정입니다", "로그인 성공", 1);
						// 이부분에서 관리자 페이지 이동
						MyPage mp = new MyPage();
						mp.setVisible(true);
						frame.dispose();
							
					} 
					else {
						JOptionPane.
						showMessageDialog(jb, fail,logfail, 1);
						
					}
				}
				else {
					JOptionPane.
					showMessageDialog(jb, fail,logfail, 1);
						
				}
					
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(jb, this, logfail, 1);
				System.out.println("SQLException" + ex);
			}
		}//admin 계정 로그인
			
		else {
			try {

				String passCheck = "SELECT m_id,m_pw FROM admin.copy_member_signup "
						+ "WHERE m_id ='"+id+"' and m_pw='"+pass+"'";

				Connection conn = getUserConnection();
				Statement stmt = conn.createStatement();

				ResultSet rset = stmt.executeQuery(passCheck);
				rset.next();

				if(id.equals(rset.getString(1))) {
						
					if (pass.equals(rset.getString(2))) {
						JOptionPane.
						showMessageDialog(jb, "로그인 되었습니다", "로그인 성공", 1);
							
						MainP mp = new MainP();
						mp.setVisible(true);
						frame.dispose();
							
					} 
					else {
						JOptionPane.
						showMessageDialog(jb, fail,logfail, 1);
						
					}
				}
				else {
					JOptionPane.
					showMessageDialog(jb, fail,logfail, 1);
						
				}
					
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(jb, this, logfail, 1);
				System.out.println("SQLException" + ex);
					
			}
				
		}// 일반 유저 로그인
			
	};// 로그인 버튼 리스너

	
	public static Connection getConnection() throws SQLException {
		Connection conn = null;

		conn = DriverManager.
				getConnection("jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1",
						"admin","soldesk01TEAM)!");

		return conn; //관리자 계정 연결
	}
	
	public static Connection getUserConnection() throws SQLException {
		Connection conn = null;

		conn = DriverManager.
				getConnection("jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1",
						"atpc_user","SOLDESKteam0!");

		return conn; // 일반 유저 연결
	}
	
	
	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
}
