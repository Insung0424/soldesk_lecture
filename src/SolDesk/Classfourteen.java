package SolDesk;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

//class Parent{
//	void a() {
//		pa();
//	}
//	void pa() {
//		pa();
//		System.out.println("Parent");
//	}
//}
//class Child extends Parent{
//	void a() {
//		super.a();
//	}
//	void pa() {
//		System.out.println("Child");
//	}
//}
//class Food{
//	void eat() {
//		System.out.println("eat");
//	}
//}
//class Noodle extends Food{
//	void eat() {
//		System.out.println("Noodle");
//	}
//}
//class friedRice extends Food{
//	void eat() {
//		System.out.println("friedRice");
//	}
//}
//class Egg extends Food{
//	void eat() {
//		System.out.println("egg");
//	}
//}
//class Parent{
//	int n;
//	void a() {
//		pa();
//	}
//	void pa() {
//		System.out.println(n);
//	}
//}
//class Child extends Parent{
//	int n;
//	
//	void pa() {
//		n=20;
//		super.n=39;	  //정적바인딩
//		super.pa();   //정적바인딩
//		System.out.println(n);
//	}
//}
//abstract class A{
//	abstract public void show();
//	void pr() {
//		show();
//	}
//}
//class B extends A{
//	int r;
//	B(int r){
//		this.r=r;
//	}
//	int get() {
//		return r;
//	}
//	public void show() {
//		System.out.println(r);
//	}
//}

//class St implements Serializable{
//	private String name;
//	private String major;
//	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMajor() {
//		return major;
//	}
//	public void setMajor(String major) {
//		this.major = major;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//		
//}

//abstract class Circle{
//	protected double r;
//	Circle(double r){
//		this.r = r;
//	}
//	abstract double get();
//}
//class Cir extends Circle{
//	Cir(double r){
//		super(r);
//	}
//	double get() {
//		return r;
//	}
//}
public class Classfourteen {
	
//	static void pr(Food f) {
//		f.eat();
//	}
	
//	static void show(Person p) {
//	if(p instanceof Person) {
//		System.out.println("person");
//	}
//	if(p instanceof Student) {
//		System.out.println("Student");
//	}
//	if(p instanceof Worker) {
//		System.out.println("Worker");
//	}
//	if(p instanceof ITWorker) {
//		System.out.println("ITWorker");
//	}
//}

	public static void main(String[] args) throws IOException {
//		Parent c=new Child();
//		c.a(); //Child 
////		업캐스팅된후에는 재정의된메소드가있다면 해당메소드가 실행
		
//		Noodle N=new Noodle();
//		pr(N); // Food f = new Noodel(); upcasting
		//동적바인딩(dynamic binding)
		/* 실행할 메소드를 컴파일할 때 결정하지 않고
		 * 실행시(run time) 결정하는 것
		 * 자바에서는 동적 바인딩을 통해 
		 * 오버라이딩된 메소드가 항상 실행되도록 보장함
		 * 
		 * 동적바인딩에 의해 행상 자식 클래스에 오버라이딩한
		 * 메소드가 호출됨
		 * 
		 * 부모클래스의 메소드를 더 이상 사용할 수 없는것이 아님
		 * super키워드를 이용 정적바인딩을 하여 
		 * 부모클래스의 멤버에 접근이 가능하다
		 */
		
		/*
		 * 메소드 오버로딩
		 * 같은 클래스나 상속관계에서 동일한 이름의 메소드를
		 * 중복 작성
		 * 이름이 같은 여러개의 메소드를 중복 선언하여
		 * 사용 편리성 향상
		 * 메소드 이름은 반드시 동일해야하며
		 * 메소드의 매개변수의 개수,타입이 달라야 성립된다
		 * 정적바인딩이며, 컴파일 시에 중복된 메소드 중
		 * 호출되는 메소드를 결정한다
		 * 
		 * 메소드 오버라이딩
		 * 슈퍼클래스와 서브클래스로 이루어진 상속관계여야함
		 * 서브클래스에서 슈퍼클래스에 있는 메소드와
		 * 동일한 이름의 메소드를 제작성하는것
		 * 슈퍼클래스에 구현된 메소드를 무시하고 서브클래스에서
		 * 새로운 기능의 메소드를 재정의한다
		 * 메소드이름,매개변수타입,개수,리턴타입이 모두 동일해야함
		 * 동적바인딩이며,실행시간에 오버라이딩된메소드를 찾아 호출
		 * program run - method call - get method address
		 * - method run
		 */
		
//		Parent c=new Child(); //up
//		c.a();
		
//		B b=new B(5);
//		b.pr();
		
//		ObjectOutputStream os = null;
//		try {
//			os = new ObjectOutputStream(new FileOutputStream("ob.txt"));
//			St s = new St();
//			s.setName("Bob");
//			s.setMajor("math");
//			s.setAge(50);
//			os.writeObject(s);
//		}catch(Exception e) {}
//		os.close();
//		ObjectInputStream oin = null;
//		try {
//			oin = new ObjectInputStream(new FileInputStream("ob.txt"));
//			St s = (St) oin.readObject();
//			System.out.println(s.getName());
//			System.out.println(s.getMajor());
//			System.out.println(s.getAge());
//		}catch(Exception e) {}
//		oin.close();
		
//		Circle c[] = new Circle[5];//객체배열생성
//		Scanner sc =new Scanner(System.in);
//		for(int i=0;i<c.length;i++) {
//			double r =sc.nextDouble();
//			c[i] = new Cir(r);//객체생성 upcasting
//			System.out.println(c[i].get());
//		}
		
//		int arr1[] = {1,2,3,4};
//		int arr2[] = {5,6,7,8};
//		int arr3[] = Arr.con(arr1,arr2);
//		Arr.pr(arr3);
		
//		show(new Student());
//		System.out.println();
//		show(new Worker());
//		System.out.println();
//		show(new ITWorker());
		
//		1
//		Tv t = new Tv("samsung",2022,20);
//		t.show();
//		2
//		int math=0,eng=0,com=0;
//		Score s = new Score(math,eng,com);
//		System.out.println("평균은 "+s.avg());
		
//		3
//		Scanner sc = new Scanner(System.in);
//		Circle c[] =new Circle[5];
//		for(int i=0;i<c.length;i++) {
//			System.out.println((i+1)+"번 원의 반지름크기 입력");
//			double r=sc.nextDouble();
//			c[i] = new Circle(r);
//		}
//		double sum=0;
//		for(int i=0;i<c.length;i++) {
//			sum += c[i].area();
//		}
//		System.out.println("5개 원의 넓이 합은 " + sum);
		
//		4
//		XY x = new XY();
//		x.set(1, 2);
//		x.show(); // 1,2 출력
//		XYZ xy = new XYZ();
//		xy.set(4, 5);
//		xy.color("blue");
//		xy.show(); // 4,5,blue 출력 
		
//		5
//		Scanner sc = new Scanner(System.in);
//		System.out.println("왼손");
//		String I = sc.next();
//		System.out.println("오른손");
//		String You = sc.next();
//		System.out.println("왼손이 낸것: "+I);
//		System.out.println("오른손이 낸것: "+You);
//		if(I.equals("가위")) {
//			if(You.equals("가위")) {
//				System.out.println("비겼다");
//			}
//			else if(You.equals("바위")) {
//				System.out.println("오른손이 이겼다");
//			}
//			else if(You.equals("보")) {
//				System.out.println("왼손이 이겼다");
//			}
//			else {
//				System.out.println("잘못된값을 입력했습니다");
//			}
//		}
//		else if(I.equals("바위")) {
//			if(You.equals("바위")) {
//				System.out.println("비겼다");
//			}
//			else if(You.equals("가위")) {
//				System.out.println("왼손이 이겼다");
//			}
//			else if(You.equals("보")) {
//				System.out.println("오른손이 이겼다");
//			}
//			else {
//				System.out.println("잘못된값을 입력했습니다");
//			}		
//		}
//		else if(I.equals("보")) {
//			if(You.equals("보")) {
//				System.out.println("비겼다");
//			}
//			else if(You.equals("가위")) {
//				System.out.println("오른손이 이겼다");
//			}
//			else if(You.equals("바위")) {
//				System.out.println("왼손이 이겼다");
//			}
//			else {
//				System.out.println("잘못된값을 입력했습니다");
//			}		
//		}
//		else {
//			System.out.println("잘못된값을 입력했습니다");
//		}
		
//		6
//		Scanner sc = new Scanner(System.in);
//		int a[] = new int [10];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		int bin;
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					bin = a[j];
//					a[j] = a[i];
//					a[i] = bin;
//				}
//			}
//		}
//		for(int i : a) {
//			System.out.print(i + " ");
//		}
		/*
		 * 자바는 다중상속이 불가능하다
		 * 인터페이스를 통한 다중상속은 가능
		 * 
		 * 인터페이스 - 다른 클래스를 작성할 때 기본이 되는 틀을 제공
		 * 다른클래스 사이의 중간매개역할 담당하는 추상클래스
		 */
		
//		Add a=new Add();
//		System.out.println(a.add(1, 4));
//		System.out.println(a.add(10));

//		A a=new A();
//		a.bear();
//		a.swim();
	}
}

//interface Animal {
//	void bear();
//}
//interface Fish {
//	public void swim();
//}
//class A implements Animal,Fish{ //다중상속
//	public void bear() {
//		System.out.println("낳는다");
//	}
//	public void swim() {
//		System.out.println("수영한다");
//	}
//}
//interface Addin{
//	public int add(int a,int b);
//	public int add(int a);
//	
//	default void pr() { //java8에 추가된 디폴트메소드
//		System.out.println("hehe");
//	}
////	default라는 예약어를 적지않으면 추상메소드로 인식한다
//}
//class Add implements Addin{
//	public int add (int a,int b) {
//		return a+b;
//	}
//	public int add(int a) {
//		int sum=0;
//		for(int i=1;i<=a;i++) {
//			sum+=i;
//		}
//		return sum;
//	}
//}
//interface Food{
//	int price=30000;
//	void eat();
//}
//class Pizza implements Food{
//	public void eat() {
//		System.out.println("pizza");
//	}
//}

//class XY {
//	int x, y;
//	void set(int i, int j) {
//		this.x = i;
//		this.y = j;
//	}
//	void show() {
//		System.out.println(x + "," + y);
//	}
//}
//class XYZ extends XY {
//	String color;
//	void color(String color) {
//		this.color = color;
//	}
//	void show() {
//		System.out.println(x + "," + y + "," + color);
//	}
//}
//class Circle {
//	private double r;
//	Circle(double r) {
//		this.r = r;
//	}
//	double area(){
//	return 3.14*r*r;
//	}
//}
//class Tv{
//	private String made;
//	private int year;
//	private int inch;
//	Tv(String made,int year,int inch){
//		this.made=made;
//		this.year=year;
//		this.inch=inch;
//	}
//	void show() {
//		System.out.println(year+"년에 "+made+"에서 나온 "+inch+"인치 Tv");
//	}
//}

//class Score{
//	private int math;
//	private int eng;
//	private int com;
//	Score(int math,int eng,int com){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수입력");
//		math = sc.nextInt();
//		this.math = math;
//		System.out.println("점수입력");
//		eng = sc.nextInt();
//		this.eng = eng;
//		System.out.println("점수입력");
//		com = sc.nextInt();
//		this.com = com;
//	}
//	double avg() {
//		int sum = math+eng+com;
//		return sum/3.0;
//	}
//}
//class Person{}
//class Student extends Person{}
//class Worker extends Person{}
//class ITWorker extends Worker{}

//class Arr{
//	static int[] con(int a[],int b[]){
//		int c[]=new int [a.length+b.length];
//		for(int i=0;i<a.length;i++) {
//			c[i] = a[i]; // 1,2,3,4
//			for(int j=a.length;j<a.length+b.length;j++) {
//				c[j] = b[j-a.length];
//			}
//		}
//		return c;
//	}
//	static int[] con(int a1[],int a2[]){
//		int c[]=new int [a1.length+a2.length];
//		for(int i=0;i<a1.length;i++) {
//			c[i] = a1[i]; // 1,2,3,4
//			c[i+a1.length] = a2[i]; // 5,6,7,8
//		}
//		return c;
//	}
//	static void pr(int a[]) {
//		for(int i=0;i<a.length;i++)
//			System.out.print(a[i] + " ");
//	}
//}