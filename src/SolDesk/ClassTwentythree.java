package SolDesk;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


//public class ClassTwentythree /*implements Runnable*/{
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//	//Runnable인터페이스를 이용하여 쓰레드를 생성해라(0~9까지 출력) 
//	//쓰레드는 작동 1초 후 종료하게끔 작성해라
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.exit(0);
//	}
class Th extends Thread{
//	1. 쓰레드가실행될때화면에1초단위로정수를출력하게끔만들어라 
//	 정수0부터시작하여프레임에정수를문자열로변경해서넣고try문안에서
//	 1초씩정지하게끔만들어라예외발생하면쓰레드는종료된다(return)
	JLabel jlabel;
	JLabel jlabel1;
	public Th(JLabel j,JLabel jlabel1) {
		this.jlabel=j;
		this.jlabel1 = jlabel1;
	}
	@Override
	public void run() {
		int i = 0;
		int m = 0;
		while(true) {
			jlabel.setText(Integer.toString(i));
			i++;
			if(i == 60) {
				i = 0;
				m++;
				jlabel1.setText(Integer.toString(m));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}

////1
//class Number{
//	static void pr(int i){
//		System.out.println(i);
//	}
//	public void show(double d){
//		System.out.println(d);
//	}
//}
public class ClassTwentythree extends JFrame{
	ClassTwentythree(){
		Container c=getContentPane();
	    c.setLayout(new FlowLayout());
	    JLabel j=new JLabel();
	    c.add(j);
	    JLabel j1=new JLabel();
	    c.add(j1);
	    Th t=new Th(j,j1);   
	    t.start(); 
	    setSize(300,300);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
//	ClassTwentythree(){
//		Container c = getContentPane();
//		c.setLayout(new GridLayout(4,3));
//		c.setBackground(Color.white);
//		JLabel[] jlabelarr = new JLabel[12];
//		for(int i=0;i<jlabelarr.length;i++) {
//			jlabelarr[i] = new JLabel("java"+Integer.toString(i+1));
//			c.add(jlabelarr[i]);
//		
//			jlabelarr[i].addMouseListener(new MouseAdapter() {
//				public void mouseClicked(MouseEvent e) {
//					JLabel jl = (JLabel) e.getSource();
//					int r = (int)(Math.random()*256);
//					int g = (int)(Math.random()*256);
//					int b = (int)(Math.random()*256);
//					
//					jl.setOpaque(true);
//					jl.setBackground(new Color(r,g,b));
//				}
//			});
//		}
//		setSize(300,300);
//	    setVisible(true);
//	    setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
	
//	JButton cal = new JButton("cal");
//	JLabel total = new JLabel("계산결과");
//	
//	ClassTwentythree(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(total);
//		c.add(cal);
//		
//		cal.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Aa a = new Aa();
//				a.setVisible(true); // 새창을 띄움
//			}
//		});
//		
//		setSize(300,450);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//	
//	class Aa extends JDialog{
//		JTextField tf1 = new JTextField(15);
//		JTextField tf2 = new JTextField(15);
//		JButton jb1 = new JButton("ADD");
//		
//		Aa(){
//			setLayout(new FlowLayout());
//			add(new JLabel("두 수를 더합니다"));
//			add(tf1);
//			add(tf2);
//			add(jb1);
//			setSize(200,300);
//			jb1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					setVisible(false); // 새로 생긴 창을 닫음
////					int i1 = Integer.parseInt(tf1.getText());
////					int i2 = Integer.parseInt(tf2.getText());
////					int sum = i1 + i2 ;
//					int sum = Integer.parseInt(tf1.getText())
//							+ Integer.parseInt(tf2.getText());
//					total.setText(Integer.toString(sum));
//				}
//			});
//		}
//	}

////	2
//	ClassTwentythree(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JLabel jlabel = 
//				new JLabel(Integer.toString((int)(Math.random()*50+1)));
//		c.add(jlabel);
//		JButton jbutton1 = new JButton("+5");
//		JButton jbutton2 = new JButton("-5");
//		JButton jbutton3 = new JButton("/5");
//		c.add(jbutton1);
//		c.add(jbutton2);
//		c.add(jbutton3);
//		
//		jbutton1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////				int i = Integer.parseInt(jlabel.getText()) + 5;
////				jlabel.setText(Integer.toString(i));
//				jlabel.setText(Integer.parseInt(jlabel.getText()) + 5 + "");
//				jbutton1.setEnabled(false);
//			}
//		});
//		
//		jbutton2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////				int i = Integer.parseInt(jlabel.getText()) - 5;
////				jlabel.setText(Integer.toString(i));
//				jlabel.setText(Integer.parseInt(jlabel.getText()) - 5 + "");
//				jbutton2.setEnabled(false);
//			}
//		});
//		
//		jbutton3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////				int i = Integer.parseInt(jlabel.getText()) / 5;
////				jlabel.setText(Integer.toString(i));
//				jlabel.setText(Integer.parseInt(jlabel.getText()) / 5 + "");
//				jbutton3.setEnabled(false);
//			}
//		});
//		
//		setVisible(true);
//		setSize(300,300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
	
	
	
	public static void main(String[] args) {
//		Thread thread = new Thread(new ClassTwentythree());
//		thread.start();
		
		new ClassTwentythree();
		
//		Number.pr(100);
//		Number n=new Number();
//		n.show(3.14);
		
//		HashMap<String,Integer> hashMap = 
//				new HashMap<>();
//		hashMap.put("aa", 1);
//		hashMap.put("bb", 2);
//		hashMap.put("cc", 3);
//		
//		Iterator<String> iterator = 
//				hashMap.keySet().iterator();
//		int max = 0;
//		String blank = "";
//		while(iterator.hasNext()) {
//			String name = iterator.next();
//			int n = hashMap.get(name);
//			if(n > max) { 
//				max = n;
//				blank = name;
//			}	
//		}
//		System.out.println(blank + " " + max);
		
//		Double b[] = {1.12,3.65};
//		for(Double d : b) {
//			System.out.println(d);
//		}
		
//		Sh sh = new Sh();
//		Student th1 = new Student("Jack",sh);
//		Student th2 = new Student("Tom",sh);
//		th1.start();
////		try {
////			th1.join();
////		}catch(Exception e) {}
//		th2.start();
		
	}

}
//class Sh{
//	private int num=0;
//	
//	public synchronized void add() {
//		int n = num;
//		Thread.yield();
//		n+=10;
//		num=n;
//		System.out.println(num);
//	}
//}
//class Student extends Thread{
//	String a;
//	Sh sh;
//	public Student(String a, Sh sh) {
//		this.a = a;
//		this.sh = sh;
//	}
//	public void run() {
//		for(int i=1;i<6;i++) {
//			try {
//				sh.add();
//				sleep(500);
//			} catch (InterruptedException e) {}
//		}
//	}
//}
