package single;

public class Aa {
	
	private Aa() {}
	
	private static Aa a = new Aa();
	
	public static Aa getInstance() {
		if(a == null) {
			a = new Aa();
		}
		return a;
	}
}
