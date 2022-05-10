public class classdul {

	public static void main(String[] args) {

//		if(조건식){
//		실행문장
//		}
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("정수를 입력해주세요");
//		int score = sc.nextInt();
//		if(score>=80) 
//			System.out.println("Pass");
//		
//		else
//			System.out.println("Failed");
		
//		int a=10,b=4;
//		if(a==10) {
//			System.out.println("A");
//		}
//		if(a>b) {
//			System.out.println("C");
//		}
		// 각각의 if문이 독립적이므로 둘 모두 실행되며
		// 조건이 전부 '참(true)'으로 두 조건문 다 동작한다
		
//		if(조건식){
//		실행문장1
//		}
//		else {
//		실행문장2	
//		}
//		조건식이 true이면 실행문장1 실행 후 if-else 벗어남
//		false 이면 실행문장2 실행 후 if-else 벗어남
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = sc.nextInt();
//		//입력한 수가 9의 배수인지 알고싶다.
//		if(n%9==0) {
//			System.out.println("It's a multiple of 9");
//		}
//		else {
//			System.out.println("It's not a multiple of 9");
//		}
		
//		int a=10,b=4;
//		
//		if(a==10) {
//			System.out.println("A");
//		}
//		else if(a>b) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("C");
//		}
//		if(조건식1){
//		실행문장1
//		}
//		else if(조건식2){
//		실행문장2	
//		}
//		else){
//		실행문장3	
//		}
//		if 조건식이 true이면 실행문장1 실행 후 if-else 벗어남
//		if 조건식이 false 이면 
//		else if의 조건식 확인 true이면 실행문장2 실행 후 if-else 벗어남
//		else if의 조건식이 false 이면 
//		else 를 실행
//		
//		Scanner sc = new Scanner(System.in);
//		char grade;
//		System.out.println("Enter a number : ");
//		int score = sc.nextInt();
//		if(score>=90) {	// 90 <= score
//			grade = 'A';
//		}
//		else if (score>=80) { // 80 <= score < 90
//			grade = 'B';
//		}
//		else if (score>=70) { // 70 <= score < 80
//			grade = 'C';
//		}
//		else {	// score < 70
//			grade = 'F';
//		}
//		
//		System.out.println("your grade is: "+grade);
//		
//		i = a>b ? a-b : b-a; 삼항조건연산자
//		if(a>b)
//			i=a-b;
//		else
//			i=b-a;
		
//		int score = 85;
//		if(score>=90) 
//			System.out.println("A");
//		else
//			System.out.println("B");
//		
//		int score = 85;
//		char grade = score>90 ? 'A':'B'; //삼항조건연산자
//		System.out.println(grade);
		
//		int total = 300;
//		double avg = total/3;
//		
//		if(avg>=90) {	// 90 <= avg
//			System.out.println("A");
//		}
//		else if (avg>=80 && avg<90) { // 80 <= avg < 90
//			System.out.println("B");
//		}
//		else if (avg>=70) { // 70 <= avg < 80
//			System.out.println("C");
//		}
//		else {	// avg < 70
//			System.out.println("F");
//		}
		
//		int a=20,b=10;
//		if(a>10) { //선행조건 바깥쪽 if문 조건이 참이어야 안쪽 if esle확인 가능
//			if(b>=0) {
//				b=1;
//			}
//			else {
//				b=-1;
//			}
//		}
//		System.out.println(a+" "+b);
		
//		int age=25,kg=60;
//		char size;
//		
//		if(age<20) {
//			if(kg<50) 
//				size = 'S';
//			else if (kg<60)
//				size = 'M';
//			else 
//				size = 'L';
//		}
//		else { //age>=20
//			if(kg<60)
//				size = 'S';
//			else if(kg<70)
//				size = 'M';
//			else
//				size = 'L';
//		}
//		System.out.println(size);
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a score: ");
//		int score = s.nextInt();
//		
//		System.out.println("Enter the grade");
//		int year = s.nextInt();
//		
//		// score >= 60 && year != 3
//		if(score>=60) {
//			if(year!=3) {
//				System.out.println("Pass");
//			}
//			else if(score>=70) { // score >= 60 && year == 3 && score >= 70
// 				System.out.println("Pass");
//			}
//			else { // score >= 60 && year == 3 && score < 70
//				System.out.println("Failed");
//			}
//		}
//		else { // score < 60
//			System.out.println("Failed");
//		}
		
//		// switch ~ case 중 case 에는 상수값만 올 수 있다(문자,문자열,정수)
		// switch(조건식)  (조건식)에는 다른값가능
		// switch문은 식의 결과값을 case문과 비교해줘야한다
//		char grade = 'C';
//		switch (grade) {
//			case 'A':
//			case 'B':
//				System.out.println("Good");
//				break; //escape
//			case 'C':
//				System.out.println("Not bad");
//				break;
//			case 'F':
//				System.out.println("Bad");
//				break;
//		} 
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("What day is it today?");
//		String day = s.next();
//		switch(day) {
//		case "Monday":
//			System.out.println("Monday");
//			break;
//		case "Tuesday":
//			System.out.println("Tuesday");
//			break;
//		default :
//			System.out.println("Not Monday or Tuesday");
//			break;
//		}
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the grade");
//		String grade = s.next();
//		switch(grade) {
//		case "A":
//		case "B":
//			System.out.println("Excellent");
//			break;
//		case "C":
//			System.out.println("Good");
//			break;
//		case "D":
//			System.out.println("Good");
//			break;
//		case "F":
//			System.out.println("Bad");
//			break;
//		}
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("What do you do on weekends?");
//		System.out.println("You can choose one of these: movie, sing, book or other");
//		String hobby = s.next();
//		switch(hobby) {
//		case "movie":
//			System.out.println("Watch a movie");
//			break;
//		case "sing":
//			System.out.println("Sing a song");
//			break;
//		case "book":
//			System.out.println("Read a book");
//			break;
//		default:
//			System.out.println("etc.");
//			break;
//		}
		
		//Math.random();
		// 0.0 <= Math.random() < 1

		//		Math.random()*100
		// 0.0 <= Math.random() < 100

		//		Math.random() + 1
		// 1.0 <= Math.random() < 2

		//		(int)(Math.random()*100)+1
		//		1 <= Math.random() < 100  1부터 100까지 랜덤한범위를 지정할 때 

	}
}
