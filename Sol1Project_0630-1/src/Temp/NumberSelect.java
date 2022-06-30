package Temp;

import java.util.Random;

public class NumberSelect {
	//중복없는 로또 번호 생성기였지만 
	//상위 기능이 대체함으로써 Temp로 이동하였습니다
	
	Random random = new Random();
	int com[] = new int[6];
	
	public NumberSelect(){
		
		for(int i=0;i<6;i++) {
			com[i] = random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
				}
			}
		}
		
	}

	public int[] getCom() {
		return com;
	}

}
