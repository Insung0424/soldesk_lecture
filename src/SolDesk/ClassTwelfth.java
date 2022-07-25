package SolDesk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//class LCD{
//	private int size;
//	public LCD(int n) {
//		size = n;
//	}
//}
//
//class ColorLCD extends LCD{
//	int colorsize;
//	public ColorLCD(int colorsize, int n) {
//		super(n); // 부모생성자 호출 size = n; 첫줄에 적어야함
//		this.colorsize = colorsize;
//	}
//}

//class Person{
//	private String name;
//	public Person(String name) {
//		this.name = name;
//	}
//	void name() {
//		System.out.println(name);
//	}
//}
//
//class Student extends Person{
//	private String job;
//	private String major;
//	public Student(String name,String job,String major) {
//		super(name); // this.name = name;
//		this.job = job;
//		this.major = major;
//	}
//	void show() {
//		name();
//		System.out.println(job);
//		System.out.println(major);
//	}
//}

//class A{
//	A(){
//		System.out.println("A 생성자 호출");
//	}
//	A(int n){
//		System.out.println(n);
//	}
//}
//
//class B extends A{
//	B(){
//		System.out.println("B 생성자 호출");
//	}
//	B(int n){
//		System.out.println(n);
//	}
//}

//class Point{
//	private int x,y;
//	Point(){
//		this.x=0;
//		this.y=0;
//	}
//	Point(int x,int y){
//		this.x=x;
//		this.y=y;
//	}
//	void pr() {
//		System.out.println(x+" "+y);
//	}
//}
//class Color extends Point{
//	private String color;
//	Color(int x,int y,String color){
//		super(x,y);
//		this.color=color;
//	}
//	void show() {
//		pr();
//		System.out.println(color);
//	}
//}
//class Number{
//	static void show(int n) {
//		System.out.println(n);
//	}
//	void show(double n) { //오버로딩 : 함수명이같을때 
//						  // 매개변수타입 || 
////						  // 매개변수 개수가 다르면 상관없음
//		System.out.println(n);
//	}
//}
//class AAA{
//	void ride() {
//		System.out.println("오버라이딩 AAA");
//	}
//	void load() {
//		System.out.println("오버로드 AAA");
//	}
//}
//class BBB extends AAA{
//	void ride() { // 오버라이딩 - 메소드 재정의
//		System.out.println("오버라이딩 BBB");
//	}
//	void load(int n) { //오버로드 - 매개변수차이
//		System.out.println("오버로드 BBB");
//	}
//}
//class Score{
//	void show(int n[][]) {
//		double c=0;
//		int sum=0;
//		for(int i=0;i<n.length;i++) {
//			for(int j=0;j<n[i].length;j++) {
//				sum+=n[i][j];
//			}
//			c+=n[i].length;
//		}
//		System.out.println(sum/c); //12말고 개수 세는법
//	}
//}
//class Car{
//	public int gas; //field
//	public void up() {
//		gas+=1;
//		System.out.println(gas);
//	}
//	public final void stop() { // Cannot override - final
//		System.out.println("stop");
//		gas = 0;
//	}
//}
//class SportCar extends Car{
//	public void up() {
//		gas+=100;
//		System.out.println(gas);
//	}
//}
public class ClassTwelfth {
	public static void main(String[] args) {
//		Person p = new Person("that");
//		p.name();
		
//		Student s=new Student("Him","IT","Computer Science");
//		s.show();
		
//		protected 
//		같은 패키지 클래스 접근 가능
//		다른 패키지 클래스 접근 안됨
//		같은 패키지의 서브 클래스에 접근 가능
//		다른 패키지의 서브 클래스에 접근 가능(상속)
		
//		B b = new B(); //A 생성자 호출 B 생성자 호출
//		B b1 = new B(8); 
//		//A 생성자 호출 8
//		/*	A(int n){
//			System.out.println(n);
//			}
//		 * 	B(int n){
//			System.out.println(n);
//			}
//		 */
//		
//		B b2 = new B(8);
//		// 8 8
//	/*	A(int n){
//	 * 	super(n);
//		System.out.println(n);
//		}
//	 * 	B(int n){
//		System.out.println(n);
//		}
//	 */
		
//		Color color = new Color(3,6,"red");
//		color.show();
		
//		Number.show(20);
//		Number n = new Number();
//		n.show(3.14);
		
//		AAA a = new AAA();
//		a.ride();
//		a.load();
//		
//		BBB b = new BBB(); //b는 AAA의 load();도 사용가능
//		b.ride();
//		b.load(10);
		
//		int [][] grade= {{90,100,80},
//				  		{70,95,87},
//				  		{80,90,70},
//				  		{90,100,100}};
//		
//		Score s = new Score();
//		s.show(grade);
		
//		Car c = new Car();
//		c.gas=0;
//		c.stop();
//		c.up();
//		
//		SportCar spCar = new SportCar();
//		spCar.stop();
//		spCar.up();
		
//		int arr[][]=new int[3][4];
//		for(int i=0;i<arr.length;i++) {
//			int s=i; //i값을 따라감
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = s;
//				//arr[i][j] = i+j; 
//				s++; // j값이 증가하는 동안 s를 증가 시킴
//			}
//		}
		
//		try {
//			FileReader fr = new FileReader("f.txt");
//			// 파일리더가 내용을 int 로 읽어옴
//			int s = 0; 
//			// 읽어온 값을 저장하기 위한 변수
//			try {
//				while((s=fr.read()) != -1) {
//					// 읽을 값이 없으면 -1 을 반환하므로 아닌동안 반복
//					System.out.print((char)s);
//					// int 로 읽어온 값을 char로 형변환
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
//		1
//		Scanner sc =new Scanner(System.in);
//		int n;
//		double sum=0;
//		int c=0;
//		while(true) {
//			n=sc.nextInt();
//			sum+=n;
//			if(n == -1) {
//				break;
//			}
//			c++;
//		}
//		System.out.println(sum/c);

//		2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			FileWriter fw = new FileWriter("test01.txt");
//			String str;
//			while((str=br.readLine()) != null) {
//				fw.write(str);
//				fw.write("\n");
//			}
//			fw.close();
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		3
//		String stop = "그만";
//		Scanner sc =new Scanner(System.in);
//		String str;
//		try {
//			FileWriter fw =new FileWriter("test02.txt");
//			while(true) {
//				str = sc.nextLine();
//				if(str.equals(stop)) { //str.equals("그만")
//					break;
//				}
//				fw.write(str+"\n");
//			}
//			fw.close();
//			sc.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		3-1
//		try {
//			FileReader fr = new FileReader("test01.txt");
//			int n;
//			try {
//				while((n=fr.read()) != -1) {
//					System.out.print((char)n);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		4
//		Rectangle rec = new Rectangle();
//		rec.width = 5;
//		rec.height = 6;
//		System.out.println("사각형 면적 " + rec.area());

//		5
//		Song s1 = new Song("On");
//		Song s2 = new Song("Butter");
//		System.out.println("좋아하는 노래 " + s1.getSong());
//		System.out.println("내 노래 " + s2.getSong());
		
//		NCircle n = new NCircle(10,"red");
//		n.show();
		
//		int arr[] = new int[4];
//		Book arr1[]=new Book[3];
//		객체를 원소로 하는 배열을 만들 수 있다
//		객체 배열: 객체에 대한 레퍼런스를 원소로 갖는 배열
//		Book b[]; Book배열에 대한 레퍼런스변수 b선언
//		b=new Book[5]; 레퍼런스배열 생성
		
//		Circle []arr = new Circle[4];
//		//여러개의 객체를 배열형태로 묶어줌
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=new Circle(i);
//			// 객체4개를 생성해 배열 위치에 저장
//			System.out.println(arr[i].getarea());
//		}
//		
//		Scanner sc= new Scanner(System.in);
//		Song so[]=new Song[2];
//		for(int i=0;i<2;i++) {
//			System.out.println("singer");
//			String singer=sc.next();
//			System.out.println("title");
//			String title=sc.next();
//			so[i] = new Song(singer,title);
//		}
//		for(int i=0;i<2;i++) {
//			System.out.println(so[i].singer+" "+
//		so[i].title);
//		}
		
////		1
//		InputStreamReader in = new InputStreamReader(System.in);
//		try {
//			int i;
//			FileWriter out = new FileWriter("java.txt");
//			while((i=in.read()) != -1) {
//				out.write(i);
//			}
//			in.close();
//			out.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
////		2
//		Student s1=new Student("김길동","kim");
//		Student s2=new Student("이길동","lee");
//		s1.pr();
//		s2.pr();
		
		
//		객체배열 복사하기
//		Book[] brr1 = new Book[3];
//		Book[] brr2 = new Book[3];
//		brr1[0]= new Book("태백산맥","조정래");
//		brr1[1]= new Book("데미안","헤르만 헤세");
//		brr1[2]= new Book("어떻게 살 것인가","유시민");
//		System.arraycopy(brr1, 0, brr2, 0, 3);
////		arraycopy(brr1, 0, brr2, 0, 0)
//		/*	brr1 - 복사할 배열
//		 * 	첫번째 0 - 복사할 첫 위치
//		 *  brr2 - 복사한 내용을 붙여넣을 배열
//		 *  두번째 0 - 붙여넣을 배열의 붙여넣을 첫 위치
//		 *  세번째 0 - 복사할 요소의 개수
//		 */
////		인스턴스의 주소값만 복사 - 얕은 복사
//		brr1[1].setBookName("나목");
//		brr1[1].setAuthor("박완서");
////		brr2 도 영향을 받아서 주소값이 brr1의 주소값으로 따라감
//		for(int i=0;i<brr2.length;i++) {
//			brr2[i].showBookInfo();
//		}
		
		
		
	}
}
//class Book{
//	private String bookName;
//	private String author;
//	
//	public Book() {}
//	public Book(String bookName,String author) {
//		this.bookName = bookName;
//		this.author = author;
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
//class Student{
//	private String han;
//	private String eng;
//	Student(String han,String eng){
//		this.han = han;
//		this.eng = eng;
//	}
//	void pr() {
//		System.out.println(han + " " + eng);
//	}
//	
//}
//class Song{
//	String singer;
//	String title;
//	Song(String s,String t){
//		this.singer=s;
//		this.title=t;
//	}
//}
//class Circle {
//	int r;
//
//	Circle(int r) {
//		this.r = r;
//	}
//
//	double getarea() {
//		return r * r * 3.14;
//	}
//}
//class NCircle extends Circle{
//	private String color;
//	NCircle(int r, String color){
//		super(r); //부모생성자 호출
//		this.color=color; 
//	}
//	void show() {
//		System.out.println("반지름 "+getR()+" "+color);
//	}
//}
//class Circle{
//	private int r; //인스턴스변수(필드)
//	public Circle(int r) { //생성자
//		this.r = r;
//	}
//	int getR() { //메소드
//		return r;
//	}
//}
//class Song {
//	String song;
//
//	Song(String song) {
//		this.song = song;
//	}
//
//	public String getSong() {
//		return song;
//	}
//}
//
//class Rectangle {
//	int width;
//	int height;
//
//	public int area() {
//		return width * height;
//	}
//}
