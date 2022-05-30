package Practice;


public class Main {

	public static void main(String[] args) {
		man<men> m = new man<>(); 
		//제네릭으로 어떤 클래스를 사용할지 결정
		m.input(new men(20));
		//위에서 생성한 객체를 이용 만들고자하는 클래스의 객체 생성
		
		man<women> wm = new man<>();
		wm.input(new women("J"));
		
		
		
		
	}
}