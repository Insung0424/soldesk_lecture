package SolDesk;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassTwentytwo extends JFrame{
	
//	ClassTwentytwo(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JLabel jl = new JLabel("���̵�");
//		JTextField tf = new JTextField(10);
//		c.add(jl); c.add(tf);
//		
//		setSize(450,300);
//		setVisible(true);
//	}
	
//	String[] sar = {"�׸�","����"};
//	ImageIcon[] img = {new ImageIcon("C://Users//soldesk//Desktop//�׸�.png"),
//						new ImageIcon("C://Users//soldesk//Desktop//����.png")};
//	JLabel jl = new JLabel(img[0]);
//	ClassTwentytwo(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JComboBox com = new JComboBox(sar);
//		com.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JComboBox jcom = (JComboBox) e.getSource();
//				int i = jcom.getSelectedIndex();
//				// �޺��ڽ��� �ε����� �˾Ƴ��� �ڵ�
//				jl.setIcon(img[i]);
//				//�̹����迭 [i] ����
//			}
//		});
//		c.add(jl); c.add(com);
//		
//		setSize(450,300);
//		setVisible(true);
//	}
	
//	ClassTwentytwo(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		ImageIcon[] img = {new ImageIcon("C://Users//soldesk//Desktop//�׸�.png"),
//							new ImageIcon("C://Users//soldesk//Desktop//����.png"),
//							new ImageIcon("C://Users//soldesk//Desktop//�׸�.png")};
//		for(int i=0;i<img.length;i++) {
//			c.add(new JLabel(img[i]));
//		}
//		setSize(900,600);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
	
//	ClassTwentytwo(){
//		Container c = getContentPane();
//		
////		int r=JOptionPane.showConfirmDialog(null,"continue?","confirm",JOptionPane.YES_NO_OPTION);
//		// �⺻ �˾� â
////		if(r==JOptionPane.YES_OPTION) {
////			System.out.println("yes");
////		}
//		
////		JOptionPane.showMessageDialog(null,"watch out","message",JOptionPane.ERROR_MESSAGE);
//		// �޼��� �˾� â
//		
//		JOptionPane.showInputDialog("Enter a name");
//		// �Է� �˾� â
//		
//		setSize(900,600);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
	
//	ClassTwentytwo(){
////		Panel : �����Ӿ����� ���� ����̹Ƿ� 
////				������ũ�⸦ �Ѿ �� ����
//		setTitle("dialog");
//		Container c = getContentPane();
//		c.add(new Dia(),BorderLayout.NORTH);
//		
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//	class Dia extends Panel{
//		JButton jb1 = new JButton("Enter a name");
//		JTextField tf1 = new JTextField(10);
//		JButton jb2 = new JButton("Confirm");
//		JButton jb3 = new JButton("Message");
//		Dia(){
//			setBackground(Color.LIGHT_GRAY);
//			add(jb1);
//			add(tf1);
//			add(jb2);
//			add(jb3);
//			
//			jb1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					String name = JOptionPane.showInputDialog("Enter a name");
//					if(name != null) {
//						tf1.setText(name);
//					}
//				}
//			});
//			
//			jb2.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					int end = JOptionPane.showConfirmDialog(null,"Continue?",
//							"Confirm",JOptionPane.YES_NO_OPTION);
//					if(end == JOptionPane.CLOSED_OPTION) {
//						tf1.setText("Not selected");
//					}
//					else if(end == JOptionPane.YES_OPTION){
//						tf1.setText("YES");
//					}
//					else {
//						tf1.setText("NO");
//					}
//				}
//			});
//			
//			jb3.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, "Warning", "Message", JOptionPane.WARNING_MESSAGE);
//				}
//			});
//		}
//	}
	
//	ClassTwentytwo(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JTextField tf1 = new JTextField(10);
//		JPasswordField tf2 = new JPasswordField(10);
//		tf1.setText("ID");
//		tf2.setText("PASSWORD");
//		JButton jb = new JButton("Enter");
//		jb.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String name = JOptionPane.showInputDialog("Entar a name");
//				String pass = JOptionPane.showInputDialog("Entar a password");
//				if(name != null) {
//					tf1.setText(name);
//					System.out.println(tf1.getText());
//				}
//				if(pass != null) {
//					tf2.setText(pass);
//					System.out.println(tf2.getPassword());
//				}
//			}
//		});
//		c.add(jb);
//		c.add(tf1);
//		c.add(tf2);
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
	
//	JSlider js = new JSlider(100/*min*/,
//							200/*max*/,
//							150/*value*/);
//	JLabel jl = new JLabel(" ");
//	ClassTwentytwo(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(js); c.add(jl);
//
//		js.setMajorTickSpacing(20); //���� ����
//		js.setPaintLabels(true); //���ڿ� ���
//		js.setPaintTicks(true); //���� ���
//		jl.setHorizontalAlignment(JLabel.CENTER);
//		//���ڿ� ��ġ�� �߾ӿ� ��ġ
//		jl.setText(Integer.toString(js.getValue()));
//		// ������ ���� ���� ���ڿ��� �����ؼ� jl���� ���
//		jl.setOpaque(true);//����������
//		jl.setBackground(Color.magenta);//�����ؾ� ������ ��µ�
//		
//		js.addChangeListener(new ChangeListener() {
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				jl.setText(Integer.toString(js.getValue()));
//				// �����̴��� �����̸� �װ��� jl�� �ݿ�
//			}
//		});
//		
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
	
	public static void main(String[] args) {
//		new ClassTwentytwo();
		
//		JFrame j = new JFrame();
//		j.setLayout(new FlowLayout());
//		JTextArea jt = new JTextArea(10,20);
//		jt.append("���� �Է�");
//		JButton jb = new JButton("delete");
//		jb.addActionListener(new Text(jt));
//		j.add(jb);
//		j.add(jt);
//		
//		j.setSize(450,300);
//		j.setVisible(true);
		
////		1
//		Thread th1=new MovieThread();
//		th1.start();
//		Thread th2=new Thread(new MusicThread());
//		th2.start();
		
////		2
//		String str = "1+2+3+4+5";
////		str=str.trim(); // �������� �Լ�
//		int sum=0;
//		StringTokenizer st = new StringTokenizer(str.trim(),"+");
//		while(st.hasMoreTokens()) {
//			sum+=Integer.parseInt(st.nextToken());
//		}
//		System.out.println(sum);
		
////		3
//		Color c[]={Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE};
//		JFrame j = new JFrame("color");
//		j.setLayout(new GridLayout(1,5));
//		JButton[] bar = new JButton[c.length];
//		for(int i=0;i<c.length;i++) {
//			bar[i] = new JButton("color"+(i+1));
//			bar[i].setBackground(c[i]);
//			j.add(bar[i]);
//		}
//		j.setSize(450,300);
//		j.setVisible(true);
//		j.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}

//class MovieThread extends Thread{
//	@Override
//	public void run() {
//		System.out.println("��ȭ�� ����մϴ�");
//		System.out.println("��ȭ�� ����մϴ�");
//		System.out.println("��ȭ�� ����մϴ�");
//	}
//}
//class MusicThread implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("������ ����մϴ�");
//		System.out.println("������ ����մϴ�");
//		System.out.println("������ ����մϴ�");
//	}
//}
//class Text implements ActionListener{
//	JTextArea jt;
//	Text(JTextArea jt){
//		this.jt = jt;
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		jt.setText("������\n");
//		jt.append("���� �Է�");
//	}
//}