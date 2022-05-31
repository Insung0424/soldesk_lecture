package Practice;

////p157
//class Person{
//	String name;
//	float height;
//	float weight;
//	public Person() {}
//	public Person(String name) {
//		this.name = name;
//	}
//	public Person(String name,float height,float weight) {
//		this.name=name;
//		this.height=height;
//		this.weight=weight;
//	}
//}

//// p172,p173
//class Person{
//	String name;
//	int age;
//	Person(){
//		this("이름없음",1); // 다른생성자 호출,항상 생성자내의 첫부분 
//	}
//	Person(String name,int age){
//		this.name=name;
//		this.age=age;
//	}
//	Person returnItSelf() {
//		return this;
//	}
//}

////p182
//class Student{
//	public static int serialNum=1000;
//	public int studentId;
//	public String studentName;
//	public int grade;
//	public String address;
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String s) {
//		this.studentName=s;
//	}
//}

////p207~210
//class Book{
//	private String bookName;
//	private String author;
//	Book(){}
//	Book(String bookName,String author){
//		this.bookName=bookName;
//		this.author=author;
//	}
//	public String getBookName() {
//		return bookName;
//	}
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public void showBookInfo() {
//		System.out.println(bookName+" "+author);
//	}
//}

////p260
//class Animal{
//	void move() {
//		System.out.println("animal");
//	}
//}
//class Human extends Animal{
//	void move() {
//		System.out.println("Human");//override
//	}
//}
//class Tiger extends Animal{
//	void move() {
//		System.out.println("Tiger");
//	}
//}
//class Eagle extends Animal{
//	void move() {
//		System.out.println("Eagle");
//	}
//}

//abstract class PlayerLevel{
//	abstract void run();
//	abstract void jump();
//	abstract void turn();
//	abstract void showLevelMessage();
//	final void go(int a) {
//		run();
//		for(int i=0;i<a;i++) {
//			jump();
//		}
//		turn();
//	}
//}
//class BeginnerLevel extends PlayerLevel{
//	@Override
//	void run() {
//		System.out.println("br");
//	}
//	@Override
//	void jump() {
//		System.out.println("bj");
//	}
//	@Override
//	void turn() {
//		System.out.println("bt");
//	}
//	@Override
//	void showLevelMessage() {
//		System.out.println("b");
//	}
//}
//class AdvancedLevel extends PlayerLevel{
//	@Override
//	void run() {
//		System.out.println("ar");
//	}
//	@Override
//	void jump() {
//		System.out.println("aj");
//	}
//	@Override
//	void turn() {
//		System.out.println("at");
//	}
//	@Override
//	void showLevelMessage() {
//		System.out.println("a");
//	}
//}
//class SuperLevel extends PlayerLevel{
//	@Override
//	void run() {
//		System.out.println("sr");
//	}
//	@Override
//	void jump() {
//		System.out.println("sj");
//	}
//	@Override
//	void turn() {
//		System.out.println("st");
//	}
//	@Override
//	void showLevelMessage() {
//		System.out.println("s");
//	}
//}
//class Player{
//	private PlayerLevel level;
//	Player(){
//		level = new BeginnerLevel();
//		level.showLevelMessage();
//	}
//	public PlayerLevel getLevel() {
//		return level;
//	}
//	void upgradeLevel(PlayerLevel level){
//		this.level = level;
//		level.showLevelMessage();
//	}
//	void play(int i) {
//		level.go(i);
//	}
//}
public class Main {
////	p260
//	public void moveAnimal(Animal animal) {
//		animal.move();
//	}

	public static void main(String[] args) {
		
//		for(int i=0;i<4;i++) { //상단
//			for(int j=3;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<3;i++) { //하단
//			for(int j=0;j<i+1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=6;j>i*2+1;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Player player = new Player();
//		player.play(1);
//		System.out.println();
//		AdvancedLevel adplayer = new AdvancedLevel();
//		player.upgradeLevel(adplayer);
//		player.play(2);
//		System.out.println();
//		SuperLevel splayer = new SuperLevel();
//		player.upgradeLevel(splayer);
//		player.play(3);
		
//		String [] str = {"33","56","996","3.14"};
//		try {
//			for(int i=0;i<str.length;i++) {
//				int j=Integer.parseInt(str[i]);
//				System.out.println(j);
//			}
//		}catch(Exception e) {
//			System.out.println("ERROR");
//		}
		
//		IDFormat test = new IDFormat();
//		String userId = null;
//		try {
//			test.setUserId(userId);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		userId = "1234567";
//		try {
//			test.setUserId(userId);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
////		p53
//		char ch1 ='A';
//		System.out.println(ch1);//A
//		System.out.println((int)ch1);//65
//		char ch2 =66;
//		System.out.println(ch2);//B
//		System.out.println((int)ch2);//66
//		char ch3 =67;
//		System.out.println(ch3);//C
//		System.out.println((int)ch3);//67
		
////		p65
//		byte bNum=10;
//		int iNum=bNum; //자동
//		System.out.println(bNum);//10
//		System.out.println(iNum);//10
//		int iNum2=20;
//		float fNum = iNum2;
//		System.out.println(iNum);//10
//		System.out.println(fNum);//20.0
//		double dNum;
//		dNum=fNum+iNum;
//		System.out.println(dNum);//30.0
		
////		p68
//		double dNum1 = 1.2;
//		float fNum2 = 0.9F;//float은 F붙여줘야함
//		int iNum3=(int)dNum1+(int)fNum2;
//		int iNum4=(int)(dNum1+fNum2);
//		System.out.println(iNum3); //1 -> 1+0
//		System.out.println(iNum4); //2 -> 1.2+0.9
		
////	3
//		byte a = 127;
//		int b = 100;
//		System.out.println((byte)(a+b));//-29
//		227 -> 2 : 1 1 1 0 0 0 1 1 
//			맨앞의1은 부호비트
//				   8 7 6 5 4 3 2 1
//			보수    0 0 0 1 1 1 0 1
//				   -    16+8+4+  1 -> -29

////	4
//		Scanner sc = new Scanner(System.in);
//		int s=0,in;
//		while((in = sc.nextInt()) != 0) {
//			s+=in;
//		}
//		System.out.println(s);
		
////	p117
//		for(int i=2;i<10;i++) { // < 과 <= 의 차이 알아보기
//			for(int j=1;j<10;j++) {
//				System.out.println(i + "X" + j + "="+(i*j));
//			}
//			System.out.println();
//		}
		
////	p121
//		int sum=0,num;
//		for(num=0;/*조건없음*/;num++) {
//			sum+=num;
//			if(sum>=100) {
//				break;
//			}
//		}
//		System.out.println("num " + num);
//		System.out.println("sum " + sum);
		
////	p123
////	Q1
//		int num1=10;
//		int num2=2;
//		char operator='+';
//		switch(operator) {
//		case '+':
//			System.out.println(num1+num2);
//			break;
//		case '-':
//			System.out.println(num1-num2);
//			break;
//		case '*':
//			System.out.println(num1*num2);
//			break;
//		case '/':
//			System.out.println(num1/num2);
//			break;
//		}
////	Q2
//		for(int i=2;i<10;i++) { 
//			for(int j=1;j<10;j++) {
//				if(i%2==1) {
//					continue;
//				}
//				System.out.println(i + "X" + j + "="+(i*j));
//			}
//			System.out.println();
//		}
////	Q3
//		for(int i=2;i<10;i++) { 
//			for(int j=1;j<10;j++) {
//				if(j == i) { 
//					System.out.println(i + "X" + j + "="+(i*j));
//					break;
//				}
//				System.out.println(i + "X" + j + "="+(i*j));
//			}
//			System.out.println();
//		}
////	Q4
//		for(int i=0;i<4;i++) { 
//			for(int j=3;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
////	Q5 - Q4재탕
//		for(int i=0;i<4;i++) { //상단
//			for(int j=3;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<3;i++) { //하단
//			for(int j=0;j<i+1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=6;j>i*2+1;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		5
//		int c=0;
//		int i;
//		while(true) {
//			i=sc.nextInt();
//			if(i == 0) {
//				break;
//			}
//			c++;
//		}
//		System.out.println(c);
		
////	p158
//		Person personKim = new Person(); //기본생성자필요
//		personKim.name = "김유신";
//		personKim.height = 85.5F;
//		personKim.weight = 180.0F;
//		
//		Person personLee = new Person("이순신",175,75);
		
////		p172,p173
//		Person noName=new Person();
//		System.out.println(noName.name);//이름없음
//		System.out.println(noName.age);//1
//		Person p = noName.returnItSelf();
//		System.out.println(p);
//		//Practice.Person@7d6f77cc 
//		System.out.println(noName);
//		//Practice.Person@7d6f77cc
		
////		p183
//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum);//1000
//		studentLee.serialNum++;// 1000 ++ 
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		System.out.println(studentSon.serialNum);//1001
//		System.out.println(studentLee.serialNum);//1001
//		//공유되기 때문에 같은 값을 가짐
		
////	6
//		Scanner sc = new Scanner(System.in);
//		int ar[]=new int[5];
//		int max = ar[0];
//		for(int i=0;i<ar.length;i++) {
//			int num = sc.nextInt();
//			ar[i] = num;
//			if(max < ar[i]) {
//				max = ar[i];
//			}
//		}
//		System.out.println(max);
		
////		p207~210
//		Book[] library=new Book[5];//객체배열생성
//		for(int i=0;i<library.length;i++) {
//			System.out.println(library[i]); // null X 5
//		}
//		library[0]=new Book("태백산맥","조정래");
//		library[1]=new Book("데미안","헤르만 헤세");
//		library[2]=new Book("어떻게 살 것인가","유시민");
//		library[3]=new Book("토지","박경리");
//		library[4]=new Book("어린왕자","생텍쥐페리");
//		for(int i=0;i<library.length;i++) {
//			library[i].showBookInfo();// 책 5권 정보출력
//		}
//		for(int i=0;i<library.length;i++) {
//			System.out.println(library[i]); //주소값출력
//		}
		
//// 	p218
//		String[] strArray = {"Java","Android","C","JavaScript","python"};
//		for(String s:strArray) {
//			System.out.println(s); // 배열과 같은 자료형?
//		}
		
////		p260
//		Main aTest = new Main(); 
//		aTest.moveAnimal(new Human());
//		aTest.moveAnimal(new Tiger());
//		aTest.moveAnimal(new Eagle());
		
		
	}
}
//class IDFormat{
//	private String userId;
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String id) throws IDFormatException{
//		if(id == null) {
//			throw new IDFormatException("null");
//		}
//		else if(id.length() < 8 || id.length() > 20) {
//			throw new IDFormatException("over 7 and under 20");
//		}
//		this.userId = id;
//	}
//}
//class IDFormatException extends Exception{
//	IDFormatException(String m){
//		super(m);
//	}
//}