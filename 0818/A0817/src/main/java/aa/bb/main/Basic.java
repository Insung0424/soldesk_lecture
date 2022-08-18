package aa.bb.main;

import lombok.Data;

@Data
public class Basic {

	private int pNum;
	private int amount;
	
	public Basic(int p,int a) {
		super();
		pNum=p;
		amount=a;
	}
	
	public Basic() {
		this(1,10);
	}
	
}
