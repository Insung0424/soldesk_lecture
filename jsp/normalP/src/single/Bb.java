package single;

public class Bb {
	
	public static void main(String[] args) {
		Aa a = Aa.getInstance();
		Aa b = Aa.getInstance();
		//private으로 접근을 차단했으므로
		//Aa a = new Aa() 는 사용할 수 없다
		//static으로 생성된 getInstance()를 
		//사용해서 객체를 생성한다
		System.out.println(a==b);
	}
}
