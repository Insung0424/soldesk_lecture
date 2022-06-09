package Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class yun extends JFrame{

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		JButton jb1 = new JButton("아메리카노");
		jb1.setBounds(50,50,100,100);
		jp1.add(jb1);
		JLabel jl1 = new JLabel("2000원");
		jl1.setBounds(80, 200, 40, 20);
		jp1.add(jl1);
		JButton minus1 = new JButton("-");
		minus1.setBounds(18, 240, 20, 20);
		jp1.add(minus1);
		JTextField f1 = new JTextField();
		f1.setBounds(60, 240, 75, 20);
		jp1.add(f1);
		JButton plus1 = new JButton("+");
		plus1.setBounds(154, 240, 20, 20);
		jp1.add(plus1);
		JButton confirm1 = new JButton("확인");
		confirm1.setBounds(50, 280, 100, 30);
		jp1.add(confirm1);
		JLabel cal1 = new JLabel("계산결과");
		cal1.setBounds(50, 350, 50, 50);
		jp1.add(cal1);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f1.setText("0");
				jb1.setEnabled(false);
			}
		});
		minus1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(f1.getText());
				i--;
				if(i<0) {
					i=0;
				}
				f1.setText(Integer.toString(i));
			}
		});
		plus1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = Integer.parseInt(f1.getText());
				i++;
				f1.setText(Integer.toString(i));
			}
		});
		confirm1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirm1.setEnabled(false);
				int i = Integer.parseInt(f1.getText());
				if(cal1.getText().equals("계산결과")){
					cal1.setText("0");
					int total = i*2000;
					cal1.setText(Integer.toString(total));
				}
				else {
					int total = i*2000;
					cal1.setText(Integer.toString(total+Integer.parseInt(cal1.getText())));
				}
				minus1.setEnabled(false);
				plus1.setEnabled(false);
			}
		});
		
		JButton jb2 = new JButton("카페라테");
		jb2.setBounds(50,50,100,100);
		jp2.add(jb2);
		JLabel jl2 = new JLabel("4000원");
		jl2.setBounds(80, 200, 40, 20);
		jp2.add(jl2);
		JButton minus2 = new JButton("-");
		minus2.setBounds(18, 240, 20, 20);
		jp2.add(minus2);
		JTextArea f2 = new JTextArea();
		f2.setBounds(60, 240, 75, 20);
		jp2.add(f2);
		JButton plus2 = new JButton("+");
		plus2.setBounds(154, 240, 20, 20);
		jp2.add(plus2);
		JButton confirm2 = new JButton("확인");
		confirm2.setBounds(50, 280, 100, 30);
		jp2.add(confirm2);
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f2.setText("0");
				jb2.setEnabled(false);
			}
		});
		minus2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(f2.getText());
				i--;
				if(i<0) {
					i=0;
				}
				f2.setText(Integer.toString(i));
			}
		});
		plus2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = Integer.parseInt(f2.getText());
				i++;
				f2.setText(Integer.toString(i));
			}
		});
		confirm2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirm2.setEnabled(false);
				int i = Integer.parseInt(f2.getText());
				if(cal1.getText().equals("계산결과")){
					cal1.setText("0");
					int total = i*4000;
					cal1.setText(Integer.toString(total));
				}
				else {
					int total = i*4000;
					cal1.setText(Integer.toString(total+Integer.parseInt(cal1.getText())));
				}
				minus2.setEnabled(false);
				plus2.setEnabled(false);
			}
		});
		
		
		JButton jb3 = new JButton("아이스티");
		jb3.setBounds(50,50,100,100);
		jp3.add(jb3);
		
		JLabel jl3 = new JLabel("4000원");
		jl3.setBounds(80, 200, 40, 20);
		jp3.add(jl3);
		
		JButton minus3 = new JButton("-");
		minus3.setBounds(18, 240, 20, 20);
		jp3.add(minus3);
		
		JTextArea f3 = new JTextArea();
		f3.setBounds(60, 240, 75, 20);
		jp3.add(f3);
		
		JButton plus3 = new JButton("+");
		plus3.setBounds(154, 240, 20, 20);
		jp3.add(plus3);
		
		JButton confirm3 = new JButton("확인");
		confirm3.setBounds(50, 280, 100, 30);
		jp3.add(confirm3);
		
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f3.setText("0");
				jb3.setEnabled(false);
			}
		});
		minus3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(f3.getText());
				i--;
				if(i<0) {
					i=0;
				}
				f3.setText(Integer.toString(i));
			}
		});
		plus3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = Integer.parseInt(f3.getText());
				i++;
				f3.setText(Integer.toString(i));
			}
		});
		confirm3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirm3.setEnabled(false);
				int i = Integer.parseInt(f3.getText());
				if(cal1.getText().equals("계산결과")){
					cal1.setText("0");
					int total = i*4000;
					cal1.setText(Integer.toString(total));
				}
				else {
					int total = i*4000;
					cal1.setText(Integer.toString(total+Integer.parseInt(cal1.getText())));
				}
				minus3.setEnabled(false);
				plus3.setEnabled(false);
			}
		});
		
		jf.setSize(800,800);
		
		jp1.setBounds(0,0,200,590);
		jp1.setLayout(null);
		
		jp2.setBounds(205,0,200,590);
		jp2.setLayout(null);
		
		jp3.setBounds(410,0,200,590);
		jp3.setLayout(null);
		
		jf.add(jp1);
		jf.add(jp2);
		jf.add(jp3);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

}
