package Lotto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;
 
public class LottoEvent implements ItemListener, ActionListener, Runnable {
    LottoGame gui;  
    Thread playing;
 
    public LottoEvent(LottoGame in){
        gui = in;
    }
 
    public void actionPerformed(ActionEvent event){
        String command = event.getActionCommand();
        if(command == "게임 시작!"){
            startPlaying();
        }
        if(command == "멈추기"){
            stopPlaying();
        }
        if(command == "처음으로"){
            clearAllField();
        }
    }
 
    void startPlaying(){
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
        gui.stop.setEnabled(true);
        gui.reset.setEnabled(false);
        gui.quickpick.setEnabled(false);
        gui.personal.setEnabled(false);
 
    }
 
    void stopPlaying() {
        gui.stop.setEnabled(false);
        gui.play.setEnabled(true);
        gui.reset.setEnabled(true);
        gui.quickpick.setEnabled(true);
        gui.personal.setEnabled(true);
        playing = null;
    }
 
    void clearAllField() {
        for (int i = 0; i<6; i++){
            gui.numbers[i].setText(null);
            gui.winners[i].setText(null);
 
        }
        gui.got3.setText("0");
        gui.got4.setText("0");
        gui.got5.setText("0");
        gui.got6.setText("0");
        gui.drawings.setText("0");
        gui.years.setText("0");
    }
 
    public void itemStateChanged(ItemEvent event) {
        Object item = event.getItem();
        if(item ==gui.quickpick){
            for(int i=0; i<6; i++){
                int pick;
                do{
                    pick = (int)Math.floor(Math.random()*45 + 1);
                }while(numberGone(pick,gui.numbers,i)); 
                gui.numbers[i].setText(""+ pick);
            }
        }else{
            for(int i = 0; i<6; i++){
                gui.numbers[i].setText(null);  
            }
        }
    }
 
    void addOneToField(JTextField field){
        int num = Integer.parseInt("0"+field.getText());
        num++;
        field.setText(""+num);
 
    }
 
    boolean numberGone(int num, JTextField[] pastNums, int count){
        for(int i=0; i<count; i++){
            if(Integer.parseInt(pastNums[i].getText() )== num){
                return true;
            }
 
        }
        return false;
    }
 
    boolean matchedOne(JTextField win, JTextField[] allPicks){
        for(int i=0; i<6; i++){
            String winText = win.getText();
            if (winText.equals(allPicks[i].getText())){
                return true;
            }
        }
        return false;
    }
 
    public void run() {
        Thread thisThread = Thread.currentThread();  
        while(playing == thisThread){
            addOneToField(gui.drawings);
            int draw = Integer.parseInt(gui.drawings.getText());
            float numYears = (float)draw/52;  
            gui.years.setText(""+numYears);
 
            int matches = 0;
            for(int i= 0; i<6; i++){
                int ball;
                do{
                    ball = (int)Math.floor(Math.random()*45 +1 );
                }while(numberGone(ball, gui.winners, i));
                gui.winners[i].setText(""+ball);  
                if(matchedOne(gui.winners[i], gui.numbers)){
                    matches++;
                }
 
            }
 
            switch(matches) {
                case 3:
                    addOneToField(gui.got3);
                    break;
                case 4:
                    addOneToField(gui.got4);
                    break;
                case 5:
                    addOneToField(gui.got5);
                case 6:
                    addOneToField(gui.got6);
                    gui.stop.setEnabled(false);
                    gui.play.setEnabled(true);
                    playing = null;
 
            }
            try {
                Thread.sleep(100); // 로또 구매 속도 조절
            }catch(InterruptedException e){
 
            }
        } 
    }
}


