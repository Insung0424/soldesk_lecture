package jdbcConnect;
//package firstMiniProject;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.SQLException;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//public class LogInOne {
//	// 로그인 창
//	 class Login extends JPanel{
//		JPanel buttonPanel = new JPanel();
//		
//		JButton title = new JButton("Login");
//		JLabel id = new JLabel("ID");
//		JLabel password = new JLabel("Password");
//		
//		JTextField idText = new JTextField("");
//		JPasswordField pwText = new JPasswordField("");
//		
//		JButton ok = new JButton("확인");
//		JButton no = new JButton("취소");
//		
//		Login() {
//			setBackground(Color.pink);
//			setLayout(null);
//			
//			title.setBounds(100, 100, 250, 50);
//			title.setFont(new Font("Serif", Font.BOLD, 50));
//			title.setForeground(new Color(204, 000, 153));
//			title.setBorderPainted(false);
//			
//			id.setBounds(75, 170, 310, 50);
//			id.setFont(new Font(null, Font.BOLD, 20));
//			
//			password.setBounds(75, 270, 310, 50);
//			password.setFont(new Font(null, Font.BOLD, 20));
//			
//			idText.setBounds(80, 215, 280, 45);
//			idText.setFont(new Font(null, Font.PLAIN, 20));
//			idText.setBackground(Color.white);
//			
//			pwText.setBounds(80, 315, 280, 45);
//			pwText.setFont(new Font(null, Font.PLAIN, 20));
//			pwText.setBackground(Color.white);
//			
//			buttonPanel.setLayout(new GridLayout(1, 2));
//			buttonPanel.setBackground(Color.pink);
//			buttonPanel.setBounds(105, 410, 230, 40);
//			buttonPanel.add(ok);
//			buttonPanel.add(no);
//			
//			add(title);
//			add(id);
//			add(password);
//			add(idText);
//			add(pwText);
//			add(buttonPanel);
//		}
//	 }
//	 
//	 
////	 //로그인 완료창 보다는 main으로 넘어가야함
////	 class LoginComplete extends JFrame{
////			JPanel background = new JPanel();
////			
////			JLabel message = new JLabel("로그인이 완료되었습니다!");
////			
////			JButton ok = new JButton("확인");
////			
////			LoginComplete() {
////				setTitle("Login Success!");
////				setSize(230, 100);
////				setLocation(550, 320);
////				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
////				
////				background.setLayout(null);
////				background.setBackground(Color.white);
////				
////				message.setBounds(55, 10, 150, 20);
////				
////				ok.setBounds(80, 40, 70, 30);
////
////				background.add(message);
////				background.add(ok);
////				
////				add(background);
////				
////				setVisible(false);
////			}
////		}
//	 
//	 
//	 // 존재하지않는 id
//	 class NoExistID extends JFrame implements ActionListener{
//			JPanel background = new JPanel();
//
//			JLabel message = new JLabel("존재하지 않는 ID입니다!");
//
//			JButton ok = new JButton("확인");
//
//			NoExistID() {
//				setTitle("Error");
//				setSize(170, 100);
//				setLocation(585, 300);
//				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//				background.setLayout(null);
//				background.setBackground(Color.white);
//
//				message.setBounds(25, 12, 150, 20);
//
//				ok.setBounds(53, 40, 70, 30);
//				ok.addActionListener(this);
//
//				background.add(message);
//				background.add(ok);
//
//				add(background);
//
//				setVisible(true);
//			}
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				dispose();
//			}
//		}
//	 
//	 
//	 //password error
//	 class NoExistPW extends JFrame implements ActionListener{
//			JPanel background = new JPanel();
//
//			JLabel message = new JLabel("Password가 잘못되었습니다!");
//
//			JButton ok = new JButton("확인");
//
//			NoExistPW() {
//				setTitle("Error");
//				setSize(205, 100);
//				setLocation(585, 300);
//				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//				background.setLayout(null);
//				background.setBackground(Color.white);
//
//				message.setBounds(25, 10, 250, 20);
//
//				ok.setBounds(60, 40, 70, 30);
//				ok.addActionListener(this);
//
//				background.add(message);
//				background.add(ok);
//
//				add(background);
//
//				setVisible(true);
//			}
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				dispose();
//			}
//		}
//	 
//	 // 빈칸 로그인 시도
//	 class Empty extends JFrame implements ActionListener{
//			JPanel background = new JPanel();
//
//			JLabel message = new JLabel("빈칸을 모두 채워주세요!");
//
//			JButton ok = new JButton("확인");
//
//			Empty() {
//				setTitle("Error!");
//				setSize(200, 100);
//				setLocation(570, 300);
//				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//				background.setLayout(null);
//				background.setBackground(Color.white);
//
//				message.setBounds(40, 10, 300, 20);
//
//				ok.setBounds(65, 40, 70, 30);
//				ok.addActionListener(this);
//
//				background.add(message);
//				background.add(ok);
//
//				add(background);
//
//				setVisible(true);
//			}
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				dispose();
//			}
//		}
//	 
//	 // id 없이 로그인
//	 class EmptyID extends JFrame implements ActionListener{
//			JPanel background = new JPanel();
//
//			JLabel message = new JLabel("ID를 입력해주세요!");
//
//			JButton ok = new JButton("확인");
//
//			EmptyID() {
//				setTitle("ID Empty!");
//				setSize(170, 100);
//				setLocation(585, 300);
//				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//				background.setLayout(null);
//				background.setBackground(Color.white);
//
//				message.setBounds(38, 10, 150, 20);
//
//				ok.setBounds(53, 40, 70, 30);
//				ok.addActionListener(this);
//
//				background.add(message);
//				background.add(ok);
//
//				add(background);
//
//				setVisible(true);
//			}
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				dispose();
//			}
//		}
//	 
//	 // 로그인 체크
//	 private void loginCheck() {
//			String id = loginDisplay.idText.getText();
//			String pw = loginDisplay.pwText.getText();
//
//			if(id.equals("") || pw.equals("")) {
//				new Empty();
//			}
//			else {
//				try {
//					connect.stmt = (Statement)connect.conn.createStatement();
//					connect.rs = connect.stmt.executeQuery("select * from user_manager where id = '" + id +"'");
//					String getID = "";
//					String getPW = "";
//					String getNN = "";
//					String gender = "";
//
//					while(connect.rs.next()) {
//						getNN = connect.rs.getString("name");
//						getID = connect.rs.getString("id");
//						getPW = connect.rs.getString("password");
//						gender = connect.rs.getString("gender");
//					}
//
//					if(getID.equals("")) {
//						new NoExistID();
//					}
//					else if(!getPW.equals(pw)) {
//						new NoExistPW();
//					}
//					else {
//						user.set(getNN, getID, getPW, gender);
////						loginSetting();
//						loginFrame.setVisible(true);
//					}
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//
//		}
//	 
////	 private void loginSetting() {
////			menuDisplay.setLabel(user.nickname);
////			menuDisplay.setImage(user.gender);
////			infoDisplay.set(user);
////		}
//}
