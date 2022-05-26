package SolDesk;

import java.util.StringTokenizer;

//class Pizza implements Food{
//	public String name() { // 오버라이딩
//		return "Pizza";
//	}
//}
//class Steak implements Food{
//	public String name() { // 오버라이딩
//		return "Steak";
//	}
//}
//interface A{
//	public void funcA(); 
//}
//interface B{
//	public void funcB(); 
//}
//interface C extends A,B{
//	public void funcC(); 
//	//extends를 사용한다면 추상메소드를 구현
//	//일반적인 메소드는 안됨
//	//인터페이스 끼리 상속은 extends (implements아님)
//}
//class D implements C{
//	public void funcB() {
//		System.out.println("funcB");
//	}
//	public void funcA() {
//		System.out.println("funcA");
//	}
//	public void funcC() {
//		System.out.println("funcC");
//	}
//}

//class Tv{
//	public void on() {
//		System.out.println("Tv on");
//	}
//}
//interface Computer{
//	public void m(); //abstract method
//}
//class Com{
//	public void m() {
//		System.out.println("Com");
//	}
//}
//class Ipad extends Tv implements Computer{
//	Com c=new Com();
//	public void m() { //Computer
//		c.m(); //Com
//	}
//	public void ip() {
//		m(); //Com
//		on(); //Tv
//	}
//}
//interface IT{
//	public void java();
//}
//class Student{
//	public void study(IT it) {
//		//자체클래스에 메소드가 파라미터를 인터페이스IT로 받음
//		//인터페이스자체는 아무것도 할 수 없고 인터페이스를 상속한
//		//클래스의 메소드를 구현해낸 클래스가 들어오고
//		//그 클래스에따라 메소드가 실행됨
//		it.java();
//	}
//}
//class ITStudent implements IT{ 
//	//인터페이스 IT를 받아서 그안의 추상메소드 java를 구현
//	public void java() {
//		System.out.println("learn java");
//	}
//}
//class DBStudent implements IT{ 
//	//인터페이스 IT를 받아서 그안의 추상메소드 java를 구현
//	public void java() {
//		System.out.println("learn DB");
//	}
//}
//class In{
//	private int n;
//	In(int num){
//		n=num;
//	}
//	public String toString() {
//		return n+" , ";
//	}
//}
//class Po{
//	private int a,b;
//	Po(int n,int m){
//		a=n;
//		b=m;
//	}
//	void show() {
//		System.out.println(a+" "+b);
//	}
////	public String toString() {
////		return a+" "+b;
////	}
//	public boolean equals(Po p) {
//		if(a==p.a && b==p.b) {
//			return true;
//		}
//		else
//			return false;
//	}
//}
public class ClassFifteen {
//	static void pr(Food f) {
//		System.out.println(f.name());
//	}

	public static void main(String[] args) {
//		pr(new Pizza()); 
//		pr(new Steak());
		
//		D d1=new D();
//		A a1=d1; //upcasting
//		a1.funcA(); //ok
//		B b1=d1; //upcasting
//		b1.funcB(); //ok
//		C c1=d1; //upcasting
//		c1.funcA(); //ok
//		c1.funcB(); //ok
//		c1.funcC(); //ok
		//인터페이스에서 객채생성 불가능하기때문에
		//상속받은 클래스 D에서 객체생성해줌
		
//		Ipad i = new Ipad();
//		Tv t = i; // up
//		Computer c = i; // up
//		i.ip(); 
		
//		Student s=new Student();
//		ITStudent i=new ITStudent();
//		DBStudent d=new DBStudent();
//		s.study(i);
//		s.study(d);
		
//		In i = new In(4);
//		System.out.println(i);// toString을 재정의 하기전
//		//SolDesk.In@7d6f77cc 인스턴스의 정보
		
//		Po p = new Po(3,4);
//		System.out.println(p.getClass().getName());
//						// 객체의 클래스 이름 출력
//		System.out.println(p.hashCode()); // 16진수값
//		System.out.println(p.toString());
//		//toString 재정의 전 클래스명 + 주소값
//		//toString 재정의 후 a+" "+b
//		Po q = new Po(2,3);
//		Po r = new Po(3,4);
//		if(p==q) {
//			System.out.println("p==q");
//		}
//		if(p.equals(q)) {
//			System.out.println("p and q are the equal");
//		}
//		if(p.equals(r)) {
//			System.out.println("p and r are the equal");
//		}
		
//		String a=new String("Java");
//		String a1=new String("Java");
//		String a2=a;
//		if(a==a1) {
//			System.out.println("A");
//		}
//		if(a==a2) {
//			System.out.println("B");
//		}
//		if(a.equals(a1)) {
//			System.out.println("C");
//		}
		
//		MyDog dog = new MyDog("멍멍이","진돗개");
//		System.out.println(dog);//진돗개 멍멍이
		
//		기본형의 객체화
//		Integer i = new Integer(10);//Integer i = 10;
//		Character c = new Character('c');
//		Boolean b = true;
//		Integer i1 = new Integer("10");
		
//		Integer i = new Integer(10);//boxing
//		int i1=i.intValue();//unboxing
//		Character c=new Character('a');//boxing
//		char c1=c.charValue();//unboxing
//		Boolean b=new Boolean(true);//boxing
//		boolean b1=b.booleanValue();//unboxing
//		//문자열을 기본타입으로 변환
//		int i2 = Integer.parseInt("123");
//		boolean b2=Boolean.parseBoolean("true");
//		double d2=Double.parseDouble("3.14");
//		// parse~ 의 반환형은 기본자료형
//		int i3=Integer.valueOf("123");
//		int i4=Integer.valueOf("10")+Integer.valueOf("20");
//		// valueOf 의 반환형은 객체
//		String s=Integer.toString(123);
//		System.out.println(s);
//		Integer i11=100; // autoBoxing
//		int n1=i11+200; //i11을 사용할 수 있는이유 autoUnBoxing
		
////		1
//		Point p = new Point(3,4);
//		System.out.println(p);
//		
////		2
//		String n = "841111-1234560";
//		switch(n.charAt(7)) {
//			case '1':
//				System.out.println("male");
//				break;
//			case '2':
//				System.out.println("female");
//				break;
//			case '3':
//				System.out.println("male");
//				break;
//			case '4':
//				System.out.println("female");
//				break;
//			default:
//				System.out.println("Not human");
//				break;
//		int a = Integer.valueOf(n.substring(7,8));
//		}
			
////		3
//		Tv1 t = new Tv1(20,"samsung");
//		t.show(); //samsung 20inch Tv 
		
//		4
//		Shape s=new Shape();
//		Shape s1 = new Shape(2,5); 
//		//변수로받은 값이 행과 열이됨
//		s.pr("@");
//		//어떤문자를 출력할지 set 하는 부분
//		s1.pr("#");
//		s.show();
//		// for문 반복
//		s1.show();
		
//		5
//		XYZ xyz=new XYZ(10,10,"red");
//		xyz.setxy(20,30);
//		xyz.setcolor("blue");
//		xyz.show();
		
////		6
//		Re r=new Rec(10,20);
//		r.show();         //"사각형!!" 출력
//		System.out.println("면적 " + r.area());
		
//		String x=null,y=null;
//		Scanner sc=new Scanner(System.in);
//		Profile[] p = new Profile[2];
//		for(int i=0;i<p.length;i++) {
//			x = sc.next();
//			y = sc.next();
//			p[i] = new Profile(x,y);
//		}
//		for(Profile i:p) {
//			System.out.println(i.name+ " " + i.id);
//		}
		
//		String str="id=123#name=gildong#addr=seoul";
//		StringTokenizer st = new StringTokenizer(str,"#");
//		int n=st.countTokens(); // 갯수
//		System.out.println(n);
//		while(st.hasMoreTokens()) {
//			String a=st.nextToken();
//			System.out.println(a);
//		}
//		String[] a = str.split("#");
//		for(String i:a) {
//			System.out.println(i+" ");
//		}
		
		//StringBuffer
		//문자의 개수에따라서 버퍼크기를 자동으로 조절할 수 있다
		//문자열이 길거나 문자열 작업이 많은 경우
//		StringBuffer sb = new StringBuffer("java");
//		sb.append(" is fine");//맨 끝에 추가
//		sb.insert(0, "The ");//(x위치에서 ""를 추가함)
//		sb.replace(4, 8, "Html");
//		System.out.println(sb);
		
//		Num n = new Num(1);
//		Num[] arr = new Num[] {new Num(1),new Num(2),new Num(3)};
//		for(Num i: arr) {
//			System.out.println(i.get());
//		}
		
//		Animal a1=new Dog("강아지","푸들");
//		System.out.println(a1.ani());   
		
		
	}
}
//class Animal{
//	String a;
//	Animal(String a){
//		this.a=a;
//	}
//	String ani(){
//		return a;
//	}
//}
//class Dog extends Animal{
//	String b;
//	Dog(String a,String b){
//		super(a);
//		this.b=b;
//	}
//	String ani() {
//		return super.ani()+" "+b;
//	}
//}
//class Num{
//	int n;
//	Num(int n){
//		this.n=n;
//	}
//	int get() {
//		return n;
//	}
//}
//class Profile{
//	String name,id;
//	Profile(String name,String id){
//		this.name=name;
//		this.id=id;
//	}
//}
//interface Re{
//	default void show() {
//		System.out.println("사각형!!");
//	}
//	public abstract int area();
//}
//class Rec implements Re{
//	int x,y;
//	Rec(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//	public int area() {
//		return x*y;
//	}
//}
//class XY{
//	private int x,y;
//	XY(int x,int y){
//		this.x=x;
//		this.y=y;
//	}
//	int getx() {
//		return x;
//	}
//	int gety() {
//		return y;
//	}
//	protected void move(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
//}
//class XYZ extends XY{
//	String color;
//	XYZ(int x,int y,String z){
//		super(x,y);
//		this.color=z;
//	}
//	void setxy(int x,int y){
//		move(x,y);
//	}
//	void setcolor(String z) {
//		this.color = z;
//	}
//	void show() {
//		System.out.println(getx()+" "+gety()+" "+color);
//	}
//}
//class Shape{
//	int a,b;
//	String s;
//	Shape(){
//		a=1;
//		b=3;
//	}
//	Shape(int a,int b){
//		//this(1,3);
//		this.a=a;
//		this.b=b;
//	}
//	void pr(String s) {
//		this.s=s;
//	}
//	void show() {
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<b;j++) {
//				System.out.print(s);
//			}
//			System.out.println();
//		}
//	}
//}
//class Tv{
//	private int size;
//	Tv(int size){
//		this.size = size;
//	}
//	protected int getsize() {
//		return size;
//	}
//}
//class Tv1 extends Tv{
//	private String made;
//	Tv1(int size,String made){
//		super(size);
//		this.made=made;
//	}
//	void show() {
//		System.out.println(made+" "+getsize()+"inch Tv");
//	}
//}
//class Point{
//	int a,b;
//	Point(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
//	public String toString() {
//		return a+" , "+b;
//	}
//}
//class MyDog{
//	String name;
//	String type;
//	MyDog(String a,String b){
//		name=a;
//		type=b;
//	}
//	public String toString() {
//		return type+" "+name;
//	}
//}