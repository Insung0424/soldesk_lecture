package Temp;
//MainP로 변경되었습니다
//
//package fun1;
//
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//
//import UI.LottoLogin;
//import UI.Sleep;
//import lottomaxrecord.TimeRecord;
//import myPage.MyPage;
//
//public class MainPage{
//	
//	private JFrame frame;
//	
//	public MainPage() {
//		initialize();
//	}
//	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainPage window = new MainPage();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	@SuppressWarnings("unchecked")
//	private void initialize() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.BLACK);
//		frame.getContentPane().setLayout(null);
//		frame.setVisible(true);
//		frame.setBounds(100, 100, 800, 600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		JButton Mypage = new JButton("마이페이지");
//		Mypage.setBounds(24, 10, 116, 45);
//		frame.add(Mypage);
//		
//		Mypage.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new MyPage();
//				
//				frame.dispose();
//			}
//		});
//		
//		JButton Logout = new JButton("로그아웃");
//		Logout.setBounds(152, 10, 116, 45);
//		frame.add(Logout);
//		Logout.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LottoLogin n = new LottoLogin();
//				n.setVisible(true);
//				frame.dispose();
//
//			}
//		});
//		
//		JButton Lotto1 = new JButton("기능 1");
//		Lotto1.setBounds(69, 409, 347, 110);
//		frame.add(Lotto1);
//
//		JButton Lotto2 = new JButton("기능 2");
//		Lotto2.setBounds(69, 258, 347, 110);
//		frame.add(Lotto2);
//
//		JComboBox<String> combo = new JComboBox<String>();
//	      combo.setModel(new DefaultComboBoxModel<String>(
//	            new String[] {"기간 설정","전체기간","최근 한달","최근 3개월","최근 6개월","최근 1년"}));
//	      combo.setBounds(69, 107, 300, 25);
//	      frame.add(combo);
//	      
//	      combo.addActionListener(new ActionListener() {
//	         @Override
//	         public void actionPerformed(ActionEvent e) {
//	            JComboBox<?> JC = (JComboBox<?>) e.getSource();
//	            String count = JC.getSelectedItem().toString();
//	            TimeRecord tr = new TimeRecord(count);
////	            tr.countRecord();
//	         }
//	      });
//	      
//	      JButton teacher = new JButton("선생님?");
//	      teacher.setBounds(69,157,300,25);
//	      frame.add(teacher);
//	      
//	      teacher.addActionListener(new ActionListener() {
//	         
//	         @Override
//	         public void actionPerformed(ActionEvent e) {
//	            new Sleep(null);
//	         }
//	      });
//	}
//	
//	public void setVisible(boolean b) {
//		frame.setVisible(b);
//		
//	}
//}

