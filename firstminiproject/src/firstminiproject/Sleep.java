package firstMiniProject;

import java.awt.Toolkit;
import java.time.LocalDate;

public class Sleep {
    	
	Sleep(){
        Toolkit toolkit =  Toolkit.getDefaultToolkit();
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        int randomN = (int) (Math.random()*45+1);
        String teacher = "어디보자 오늘은 "+day+"일이니까 "+randomN+"번";
        
            try {
            	for(int i=0;i<teacher.length();i++) {
            		Thread.sleep(300);
                    System.out.print(teacher.charAt(i));
            	}
            	System.out.println();
            	Thread.sleep(500);
            	System.out.println("왜?");
            	Thread.sleep(1000);
            	System.out.println("그런게 어디 있어 내 맘이지");
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
	}
        
}
