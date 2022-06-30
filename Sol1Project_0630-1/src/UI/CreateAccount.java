package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CreateAccount {

	private JFrame frame;
	private JTextField idTf;
	private JTextField nameTf;
	private JTextField yearTf;
	private JTextField phoneTf;
	private JPasswordField passTf;
	private JPasswordField passReTf;
	private JTextField emailTf;
	private JComboBox MonthCB;
	
	String year = "", month = "", day = "";
	   String id = "", pass = "", passRe = "", name = "", sex = "", email = "", phone = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
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
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("회원가입 화면");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		nameTf = new JTextField();
		nameTf.setColumns(10);
		nameTf.setBounds(259, 249, 266, 33);
		frame.getContentPane().add(nameTf);
		
		yearTf = new JTextField();
		yearTf.setColumns(10);
		yearTf.setBounds(259, 303, 88, 33);
		frame.getContentPane().add(yearTf);
		
		emailTf = new JTextField();
		emailTf.setColumns(10);
		emailTf.setBounds(259, 455, 266, 33);
		frame.getContentPane().add(emailTf);
		
		phoneTf = new JTextField();
		phoneTf.setColumns(10);
		phoneTf.setBounds(259, 350, 266, 33);
		frame.getContentPane().add(phoneTf);
		
		idTf = new JTextField();
		idTf.setColumns(10);
		idTf.setBounds(259, 82, 266, 33);
		frame.getContentPane().add(idTf);
		
		
		JLabel lblNewLabel = new JLabel("아이디 : ");
		lblNewLabel.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(171, 82, 93, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("비밀번호 :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblPassword.setBounds(155, 135, 85, 33);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 확인 : ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(110, 192, 142, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이름 : ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(185, 249, 62, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("생년월일 : ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(154, 303, 93, 33);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("핸드폰번호 : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(140, 453, 116, 33);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblPassword_1 = new JLabel("4자 이상 숫자, 영문 포함");
		lblPassword_1.setForeground(Color.LIGHT_GRAY);
		lblPassword_1.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		lblPassword_1.setBounds(551, 137, 300, 33);
		frame.getContentPane().add(lblPassword_1);
		
		MonthCB = new JComboBox<String>(
	            new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" });
		MonthCB.setBounds(359, 303, 77, 33);
		frame.getContentPane().add(MonthCB);
		
		JComboBox DayCB = new JComboBox();
		DayCB.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		DayCB.setBounds(448, 303, 77, 33);
		frame.getContentPane().add(DayCB);
		
		JLabel emailLB = new JLabel("이메일 : ");
		emailLB.setForeground(Color.WHITE);
		emailLB.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		emailLB.setBounds(185, 350, 80, 33);
		frame.getContentPane().add(emailLB);
		
		JLabel GenderLB = new JLabel("성별 : ");
		GenderLB.setForeground(Color.WHITE);
		GenderLB.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		GenderLB.setBounds(185, 391, 62, 33);
		frame.getContentPane().add(GenderLB);
		
		JRadioButton MaleRB = new JRadioButton("남자");
		MaleRB.setFont(new Font("휴먼모음T", Font.PLAIN, 16));
		MaleRB.setForeground(Color.WHITE);
		MaleRB.setBackground(Color.BLACK);
		MaleRB.setBounds(259, 397, 88, 23);
		frame.getContentPane().add(MaleRB);
		
		JRadioButton FemaleRB = new JRadioButton("여자");
		FemaleRB.setFont(new Font("휴먼모음T", Font.PLAIN, 16));
		FemaleRB.setForeground(Color.WHITE);
		FemaleRB.setBackground(Color.BLACK);
		FemaleRB.setBounds(359, 397, 88, 23);
		frame.getContentPane().add(FemaleRB);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(MaleRB);
		g1.add(FemaleRB);
		
		JButton Registerbtn = new JButton("회원가입");
		Registerbtn.setForeground(Color.BLACK);
		Registerbtn.setBackground(Color.WHITE);
		Registerbtn.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		Registerbtn.setBounds(582, 479, 168, 55);
		frame.getContentPane().add(Registerbtn);
		
		passTf = new JPasswordField();
		passTf.setBounds(259, 137, 268, 33);
		frame.getContentPane().add(passTf);
		
		passReTf = new JPasswordField();
		passReTf.setBounds(259, 194, 268, 33);
		frame.getContentPane().add(passReTf);
		
		JButton Backbtn = new JButton("Back");
		Registerbtn.setFont(new Font("휴먼모음T", Font.PLAIN, 18));
		Backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LottoLogin n = new LottoLogin();
				n.setVisible(true);
				frame.dispose();
			}
		});
		Backbtn.setBackground(Color.WHITE);
//		Backbtn.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\left-arrow (2).png"));
		Backbtn.setBounds(30, 30, 55, 44);
		frame.getContentPane().add(Backbtn);
		frame.setTitle("회원가입");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	
	MonthCB.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == MonthCB) {
				JComboBox monthBox = (JComboBox) e.getSource();
				month = (String) monthBox.getSelectedItem();
			}

		}
	});
	
	DayCB.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == DayCB) {
				JComboBox dayBox = (JComboBox) e.getSource();
				day = (String) dayBox.getSelectedItem();
			}
		}
	});

	MaleRB.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            sex = "M";
         }
      });

	FemaleRB.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            sex = "F";
         }
      });

	Registerbtn.addActionListener(new ActionListener() {      //회원가입버튼

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			id = idTf.getText();
            pass = new String(passTf.getPassword());
            passRe = new String(passReTf.getPassword());
            name = nameTf.getText();
            year = yearTf.getText();
            email = emailTf.getText();
            phone = phoneTf.getText();


			String sql = "insert into copy_member_signup(m_id, m_pw, m_name, m_birth, m_gender, m_email, m_phone) values (?,?,?,?,?,?,?)";

            Pattern passPattern1 = Pattern.compile("^(?=.*\\d)(?=.*[a-zA-Z]).{4,10}$"); //4~10자 숫자 영문 포함
            Matcher passMatcher = passPattern1.matcher(pass);

            if (!passMatcher.find()) {
               JOptionPane.showMessageDialog(null, "비밀번호는 영문+숫자 4자 이상로 구성되어야 합니다", "비밀번호 오류", 1);

			} else if (!pass.equals(passRe)) {
				JOptionPane.showMessageDialog(null, "비밀번호가 서로 맞지 않습니다", "비밀번호 오류", 1);

			} else {
				try {
					Connection conn = LottoLogin.getConnection();

	                  PreparedStatement pstmt = conn.prepareStatement(sql);

	                  String date = yearTf.getText() + month + day;

	                  pstmt.setString(1, idTf.getText());
	                  pstmt.setString(2, pass);
	                  pstmt.setString(3, nameTf.getText());
	                  pstmt.setString(4, date);
	                  pstmt.setString(5, sex);
	                  pstmt.setString(6, phoneTf.getText());
	                  pstmt.setString(7, emailTf.getText());


					int r = pstmt.executeUpdate();
					System.out.println("변경된 row " + r);
					JOptionPane.showMessageDialog(null, "회원 가입 완료!", "회원가입", 1);
					
					LottoLogin n = new LottoLogin();
					n.setVisible(true);
					frame.dispose();// 다 완료되면 로그인 화면으로
					
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

	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
}


