package fun1;

import java.time.LocalDate;

import javax.swing.JTextArea;

public class Sleep extends Thread{
	
	//통계기록을 제공하는 콤보박스의 실없는 개그 1번
	
	JTextArea jt;
	
	public Sleep(JTextArea jt) {
		this.jt = jt;
	}

	public void run() {
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        int randomN = (int) (Math.random()*45+1);
        String teacher = "어디보자 오늘은 "+day+"일이니까 "+randomN+"번";
        
            try {
            	Thread.sleep(700);
            	jt.append(teacher);
            	Thread.sleep(700);
            	jt.append("\n왜?");
            	Thread.sleep(1400);
            	jt.append("\n그런게 어디 있어 선생님 마음이지");
            	jt.append("\n");
            } 
            catch (InterruptedException er) {
                er.printStackTrace();
                return;
            }
		
	}

}
