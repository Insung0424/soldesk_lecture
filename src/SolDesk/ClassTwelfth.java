package SolDesk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		
		try {
			FileReader fr = new FileReader("f.txt");
			// 파일리더가 내용을 int 로 읽어옴
			int s = 0; 
			// 읽어온 값을 저장하기 위한 변수
			try {
				while((s=fr.read()) != -1) {
					// 읽을 값이 없으면 -1 을 반환하므로 아닌동안 반복
					System.out.print((char)s);
					// int 로 읽어온 값을 char로 형변환
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
