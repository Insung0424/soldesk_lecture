package lottomaxrecord;

import java.util.ArrayList;

public class NoneNum{
	
	//사용자가 찾는 통계기록에서 기간동안 한 번도 나온적 없는 숫자가 있는지 확인과 반환
	
	private String none = "";
	
	public NoneNum(ArrayList<Integer> nlist){
        
        int narr[]=new int[46];
        for(int i=1;i<narr.length;i++) {
        	narr[i]=i;
        }
        
        for(int j=1;j<narr.length;j++) {
        	if(nlist.contains(j)) {
        		continue;
        	}
        	else {
        		none+=" ";
        		none+=j;
        		none+=" ";
        	}
        }
	}
	
	public String getNoneNum() {
		return none;
	}
}
