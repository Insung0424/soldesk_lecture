package Class_Ten;

public class Student {
	//private -> 외부에서 접근차단
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	//멤버변수 혹은 field
	
	
	public String getStudentName() {
		return studentName;
	}

	public void showStudetnInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	

	public static void main(String[] args) {
		Student a;
		//Student a; 레퍼런스 변수를 선언
		//객체를 생성하기전에 객체를 가리킬 레퍼런스 변수선언이 필요
		a=new Student();
		//a=new Student(); Student 객체 생성
		//new연산자는 Student타입의 크기만한 메모리를 할당받아
		//메모리에 대한 주소를 리턴하고 주소값을 a에 대입한다
		
//      Student a = new Student(); 변수선언 동시 객체생성		
		
		a.studentName = "Tom";
		a.studentId = 2022051901;
		a.grade = 3;
		a.address = "Seoul";
		
		
		a.showStudetnInfo();
		
		
		
	}
	
	
}
