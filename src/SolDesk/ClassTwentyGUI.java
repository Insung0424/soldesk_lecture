package SolDesk;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationGroupID;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassTwentyGUI extends JFrame{
//	//JFrame 상속받아 만든다
//	ClassTwentyGUI(){
//		super("Title is here"); // 제목 설정
//		JButton j1 = new JButton("button1");
//		JButton j2 = new JButton("button2");
//		JButton j3 = new JButton("button3");
//		Container c = getContentPane();
//			// 컨탠트팬을 가져오기
//		c.setLayout(new FlowLayout());
	/*
	 * 배치관리자 종류(setLayout(new ))
	 *  FlowLayout : left -> right 
	 *  BorderLayout : E/W/S/N/M 직접 위치지정
	 *  GridLayout : 2차원
	 *  CardLayout : 카드를 쌓아놓듯이 배치
	 *  
	 */
//		c.add(j1);
//		c.add(j2);
//		c.add(j3);
//		
//		setSize(300,450); // 크기 설정
//		setVisible(true); // 출력메소드
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
	
//	ClassTwentyGUI(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(new JButton("b1"));
//		setSize(900,600);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyGUI(){
//		Container c = getContentPane();
//		setTitle("Forth");
//		c.setLayout(new GridLayout(1,10));
//		for(int i=0;i<10;i++) {
//			JButton b = new JButton(Integer.toString(i));
//			c.add(b);
//		}
//		
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyGUI(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		setTitle("sixth");
//		JButton b = new JButton("click");
////		
////		방법 1
////		b.addActionListener(new my());
////		
////		방법 2
//		b.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton) e.getSource();
//									// e 의 원천을 가져옴
//				if(b.getText().equals("click")) {
//					b.setText("클릭");
//				}
//				else {
//					b.setText("click");
//				}
//			}
//		});
//		
//		c.add(b);
//		setSize(600,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		ClassTwentyGUI(){
//			Container c = getContentPane();
//			setTitle("seventh");
//			JButton b1 = new JButton("ok");
//			JButton b2 = new JButton("cancel");
//			c.setLayout(new FlowLayout(50,100,200));
//			c.setBackground(Color.lightGray);
//			// 배경색 지정
//			
//			b1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("ok");
//				}
//			});
//			
//			b2.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					b2.setEnabled(false); //버튼 비활성화
//				}
//			});
//			
//			c.add(b1);
//			c.add(b2);
//			setSize(600,450);
//			setVisible(true);
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
	
	public static void main(String[] args) {
		
//		new ClassTwentyGUI();
		
//		JFrame j = new JFrame();
//		j.setTitle("The Title");
//		j.setLayout(new BorderLayout());
//		j.add(new JButton("b1"), BorderLayout.EAST);
//		j.add(new JButton("b2"), BorderLayout.WEST);
//		j.add(new JButton("b3"), BorderLayout.NORTH);
//		j.add(new JButton("b4"), BorderLayout.SOUTH);
//		j.add(new JButton("b5"), BorderLayout.CENTER);
//		j.setSize(450,300);
//		j.setVisible(true);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JFrame j = new JFrame();
//		j.setTitle("Fifth");
//		j.setLayout(new FlowLayout());
//		JButton j1 = new JButton("one");
//		JButton j2 = new JButton("two");
//		j.add(j1);
//		j.add(j2);
//		j1.addMouseListener(new Mouse());
//		// one 을 클릭 했을 때 이벤트 처리
//		j2.addMouseListener(new Mouse());
//		j.setSize(450,300);
//		j.setVisible(true);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
//class my implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//							// e 의 원천을 가져옴
//		if(b.getText().equals("click")) {
//			b.setText("클릭");
//		}
//		else {
//			b.setText("click");
//		}
//	}
//}
//class Mouse extends MouseAdapter{
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("마우스클릭");
//		JButton b = (JButton) e.getSource();// 액션이 발생했을 때 버튼을 만듬
//        b.setText("버튼 누름");
//	}
//}