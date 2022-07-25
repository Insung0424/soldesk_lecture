package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import Lotto.LottoGame;
import Lotto.LottoGame2;
import fun1.LastWeekNumber;
import fun1.Sleep;
import lottomaxrecord.TimeRecord2;
import myPage.MyPage;


public class MainP extends Thread{
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainP window = new MainP();
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
	public MainP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("메인 화면");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(79, 84, 630, 229);
		
		JTextArea tarea = new JTextArea("통계가 보이는 곳");
		JScrollPane scroll = new JScrollPane(tarea);
		scroll.setBounds(0, 0, 630, 229);
	    panel.add(scroll);
	    
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		Sleep sleep = new Sleep(tarea);
		
		
		ImagePanel ip = new ImagePanel(new ImageIcon("./image/user.png").getImage());
		
		JPanel MyPagepn = new JPanel();
		MyPagepn.setBackground(Color.BLACK);
		MyPagepn.setBounds(12, 10, 66, 65);
		MyPagepn.add(ip);
		MyPagepn.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				MyPage t = new MyPage();
				t.setVisible(true);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
		});
	
		frame.getContentPane().add(MyPagepn);
		
		//밑의 라벨에 팀이름 넣는 방향으로 진행
		JLabel Titlelb = new JLabel("Title");
		Titlelb.setFont(new Font("Arial", Font.PLAIN, 40));
		Titlelb.setHorizontalAlignment(SwingConstants.CENTER);
		Titlelb.setForeground(Color.WHITE);
		Titlelb.setBounds(186, 10, 411, 65);
		frame.getContentPane().add(Titlelb);
		
		JPanel Numpanel1 = new JPanel();
		Numpanel1.setBounds(79, 337, 100, 100);
		frame.getContentPane().add(Numpanel1);
		Numpanel1.setLayout(null);
		
		JLabel Num1 = new JLabel("1");
		Num1.setHorizontalAlignment(SwingConstants.CENTER);
		Num1.setFont(new Font("Arial", Font.BOLD, 30));
		Num1.setBounds(21, 35, 57, 30);
		Numpanel1.add(Num1);
		
		JPanel Numpanel2 = new JPanel();
		Numpanel2.setBounds(185, 337, 100, 100);
		frame.getContentPane().add(Numpanel2);
		Numpanel2.setLayout(null);
		
		JLabel Num2 = new JLabel("2");
		Num2.setHorizontalAlignment(SwingConstants.CENTER);
		Num2.setFont(new Font("Arial", Font.BOLD, 30));
		Num2.setBounds(21, 35, 57, 30);
		Numpanel2.add(Num2);
		
		JPanel Numpanel3 = new JPanel();
		Numpanel3.setBounds(291, 337, 100, 100);
		frame.getContentPane().add(Numpanel3);
		Numpanel3.setLayout(null);
		
		JLabel Num3 = new JLabel("3");
		Num3.setHorizontalAlignment(SwingConstants.CENTER);
		Num3.setFont(new Font("Arial", Font.BOLD, 30));
		Num3.setBounds(21, 35, 57, 30);
		Numpanel3.add(Num3);
		
		JPanel Numpanel4 = new JPanel();
		Numpanel4.setBounds(397, 337, 100, 100);
		frame.getContentPane().add(Numpanel4);
		Numpanel4.setLayout(null);
		
		JLabel Num4 = new JLabel("4");
		Num4.setFont(new Font("Arial", Font.BOLD, 30));
		Num4.setHorizontalAlignment(SwingConstants.CENTER);
		Num4.setBounds(21, 35, 57, 30);
		Numpanel4.add(Num4);
		
		JPanel Numpanel5 = new JPanel();
		Numpanel5.setBounds(503, 337, 100, 100);
		frame.getContentPane().add(Numpanel5);
		Numpanel5.setLayout(null);
		
		JLabel Num5 = new JLabel("5");
		Num5.setFont(new Font("Arial", Font.BOLD, 30));
		Num5.setHorizontalAlignment(SwingConstants.CENTER);
		Num5.setBounds(21, 35, 57, 30);
		Numpanel5.add(Num5);
		
		JPanel Numpanel6 = new JPanel();
		Numpanel6.setBounds(609, 337, 100, 100);
		frame.getContentPane().add(Numpanel6);
		Numpanel6.setLayout(null);
		
		JLabel Num6 = new JLabel("6");
		Num6.setHorizontalAlignment(SwingConstants.CENTER);
		Num6.setFont(new Font("Arial", Font.BOLD, 30));
		Num6.setBounds(21, 35, 57, 30);
		Numpanel6.add(Num6);
		
		
		//기능 버튼 2개는 크기 조절 해야 함
		LastWeekNumber lw = new LastWeekNumber(Num1,Num2,Num3,
				Num4,Num5,Num6);
		
		JButton Functionbtn = new JButton("지난주");
		Functionbtn.setBounds(82, 469, 97, 65);
		Functionbtn.setBackground(Color.white);
		frame.getContentPane().add(Functionbtn);
		Functionbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lw.isAlive()) {
					lw.interrupt();
				}
				LastWeekNumber lw 
				= new LastWeekNumber(Num1,Num2,Num3,
						Num4,Num5,Num6);
				lw.start();
				return;
				
			}
		});
		
		JButton Functionbtn2 = new JButton("추첨기능2");
		Functionbtn2.setBounds(180, 469, 97, 65);
		Functionbtn2.setBackground(Color.white);
		frame.getContentPane().add(Functionbtn2);
		Functionbtn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				LottoGame Lotto = new LottoGame();
				Lotto.setVisible(true);
				
			}
		});

		JButton Mainbtn = new JButton("메인 게임");
		Mainbtn.setBackground(Color.WHITE);
		Mainbtn.setBounds(329, 469, 125, 65);
		frame.getContentPane().add(Mainbtn);
		Mainbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				LottoGame2 Lotto2 = new LottoGame2();
				
			}
		});
		
		JButton Resetbtn = new JButton("초기화");
		Resetbtn.setBackground(Color.WHITE);
		Resetbtn.setBounds(612, 469, 97, 65);
		frame.getContentPane().add(Resetbtn);
		Resetbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Num1.setText("1");
				Num2.setText("2");
				Num3.setText("3");
				Num4.setText("4");
				Num5.setText("5");
				Num6.setText("6");
				tarea.setText("");
			}
		});
		
		JButton Extrabtn = new JButton("통계");
		Extrabtn.setBackground(Color.WHITE);
		Extrabtn.setBounds(684, 10, 88, 49);
		frame.getContentPane().add(Extrabtn);
		Extrabtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Extrabtn.setVisible(false);
				JComboBox<String> CountRecord = new JComboBox<String>();
				CountRecord.setModel(new DefaultComboBoxModel<String>(
			            new String[] {"기간 설정","전체기간","최근 한달",
			            		"최근 3개월","최근 6개월","최근 1년","선생님?","돌아가기"}));
				CountRecord.setBounds(684, 10, 88, 49);
				CountRecord.setBackground(Color.white);
				frame.getContentPane().add(CountRecord);
				
				CountRecord.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						ArrayList<Integer> nlist = new ArrayList<>();
						
						JComboBox<String> JC = (JComboBox<String>) e.getSource();
			            String count = JC.getSelectedItem().toString();
			            
						if(count.equals("기간 설정")) {
			            	return;
			            }
			            else if(count.equals("돌아가기")) {
			            	CountRecord.setVisible(false);
			            	Extrabtn.setVisible(true);
			            	return;
			            }
			            else if(count.equals("선생님?")) {
			            	if(sleep.isAlive()) {
								sleep.interrupt();
							}
							Sleep sleep = new Sleep(tarea);
							sleep.start();
							return;
			            }
			         
						TimeRecord2 t2 = new TimeRecord2(count,tarea);
						t2.start();
					}
				});
				
			}
		});
		
		
		
		
		
		//메인 화면 설정
		frame.setBounds(100, 100, 800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
	
	
}
