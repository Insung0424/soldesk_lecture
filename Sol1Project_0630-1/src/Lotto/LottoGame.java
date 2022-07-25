package Lotto;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class LottoGame {
	private JFrame frame;
	
    LottoEvent lotto  = new LottoEvent(this);
 
    JPanel row1 = new JPanel();
    ButtonGroup option = new ButtonGroup();
    JCheckBox quickpick = new JCheckBox("ÀÚµ¿ ÃßÃ·",false);
    JCheckBox personal = new JCheckBox("¼öµ¿",true);
 
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("³»°¡ ¼±ÅÃÇÑ ¹øÈ£ : ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[6];
    JLabel winnersLabel = new JLabel("´çÃ· ¹øÈ£ : " , JLabel.RIGHT);
    JTextField[] winners = new JTextField[6];
 
    JPanel row3 = new JPanel();
    JButton stop = new JButton("¸ØÃß±â");
    JButton play = new JButton("°ÔÀÓ ½ÃÀÛ!");
    JButton reset = new JButton("Ã³À½À¸·Î");
 
    JPanel row4 = new JPanel();
    JLabel got3Label = new JLabel("5µî ´çÃ· È½¼ö :",JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4µî ´çÃ· È½¼ö:",JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("3µî ´çÃ· È½¼ö:",JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel got6Label = new JLabel("1µî ´çÃ· È½¼ö:",JLabel.RIGHT);
    JTextField got6 = new JTextField("0");
    JLabel drawingsLabel = new JLabel("±¸¸ÅÇÑ È½¼ö :",JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JLabel yearsLabel = new JLabel("¸î³âÀÌ Áö³µ³ª? :",JLabel.RIGHT);
    JTextField years = new JTextField("0");
 
    private void initialize() {
    	frame = new JFrame();
    	
        GridLayout layout = new GridLayout(5,1,10,10);
        frame.setLayout(layout);
 
        quickpick.addItemListener(lotto);
        personal.addItemListener(lotto);
        stop.addActionListener(lotto);
        play.addActionListener(lotto);
        reset.addActionListener(lotto);
 
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        option.add(quickpick);
        option.add(personal);
        row1.setLayout(layout1);
        row1.add(quickpick);
        row1.add(personal);
        frame.add(row1);
 
        GridLayout layout2 = new GridLayout(2, 7 ,10, 10);
        row2.setLayout(layout2);
        row2.add(numbersLabel);
        for (int i =0 ;i<6; i++){
            numbers[i] = new JTextField();
            row2.add(numbers[i]);
        }
        row2.add(winnersLabel);
        for (int i=0; i<6; i++){
            winners[i]=new JTextField();
            winners[i].setEnabled(false);
            row2.add(winners[i]);
        }
        frame.add(row2);
 
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row3.setLayout(layout3);
        stop.setEnabled(false);
        row3.add(stop);
        row3.add(play);
        row3.add(reset);
        frame.add(row3);
 
        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        row4.setLayout(layout4);
        row4.add(got3Label);
        got3.setEditable(false);
        row4.add(got3);
        row4.add(got4Label);
        got4.setEditable(false);
        row4.add(got4);
        row4.add(got5Label);
        got5.setEditable(false);
        row4.add(got5);
        row4.add(got6Label);
        got6.setEditable(false);
        row4.add(got6);
        row4.add(drawingsLabel);
        drawings.setEditable(false);
        row4.add(drawings);
        row4.add(yearsLabel);
        years.setEditable(false);
        row4.add(years);
        frame.add(row4);
 
        frame.setBounds(100, 100, 550, 260);
    }
    
    public LottoGame(){
		initialize();
    }
 
    public static void main (String[] arguments){
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LottoGame window = new LottoGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    
    public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
    
}
 

