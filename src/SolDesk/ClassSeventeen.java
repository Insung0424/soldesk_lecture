package SolDesk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

//class Java{
//	String title;
//	Java(String title){
//		this.title=title;
//	}
//	void show() {
//		System.out.println(title);
//	}
//}
//class DB{;
//	int n;
//	DB(int n){
//		this.n=n;
//	}
//	void pr() {
//		System.out.println(n);
//	}
//}
//class Program<T>{ //모형자 : 제네릭 기호
//	T t;
//	void in(T t) {
//		this.t=t;
//	}
//	T get() {
//		return t;
//	}
//}
//class AA{
//	public String toString() {
//		return "AA";
//	}
//}
//class BB{
//	public String toString() {
//		return "BB";
//	}
//}
//class In{
//	<T> void show(T t) { //제네릭 메소드
//		System.out.println(t);
//	}
//	void show() {
//		System.out.println("generic");
//	}
//}

//class Profile{
//	String id;
//	int age;
//	Profile(String a,int b){
//		id=a;
//		age=b;
//	}
//}
//class Dog{
//	private String name;
//	private String type;
//	public Dog(String name, String type) {
//		this.name = name;
//		this.type = type;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String showDogInfo() {
//		return name + " " + type;
//	}
//}
//abstract class Profile{
//	abstract void add(String name,String id);
//	abstract String check(String id);
//}
//class Person{
//	private String name;
//	private String id;
//	public Person(String name, String id) {
//		this.name = name;
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getId() {
//		return id;
//	}
//	
//}
//class Per extends Profile{
//	Person[] p;
//	int n;
//	Per(int n){
//		p=new Person[n];
////		n=0;
//	}
//	void add(String name,String id) {
//		p[n++] = new Person(name,id);
//	}
//	String check(String id) {
//		for(int i=0;i<n;i++) {
//			if(id.compareTo(p[i].getId()) == 0) {
//				return p[i].getName();
//			}
//		}
//		return null; //아니면 돌려받지 않겠다
//	}
//}

//class Person implements Serializable{
//	String name;
//	String device;
//	int age;
//	int id;
//	public Person(String name, String device, int age, int id) {
//		this.name = name;
//		this.device = device;
//		this.age = age;
//		this.id = id;
//	}
//	void show() {
//		System.out.println(name+" "+device+" "+ age+" "+ id);
//	}
//}

public class ClassSeventeen {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Program<Java> p = new Program<Java>();
//		p.in(new Java("java")); //T 는 클래스가 필요
//		Java a = p.get(); // get 을 사용하기위해서는 객체가 필요
//		a.show(); // 생성된 객체의 함수 사용
//		Program<DB> D = new Program<>();
//		D.in(new DB(20));
//		DB db = D.get();
//		db.pr();
		
//		AA a = new AA();
//		BB b = new BB();
//		In in = new In();
//		in.<AA>show(a);  //in.show(a); 도 가능 In<>show(T t);
//		in.<BB>show(b);  //in.show(b); 도 가능 In<>show(T t); 
//		in.show(); //In의 show()method
		//컬렉션 : 제네릭 기법으로 구현
		//컬렉션이 다룰 수 있는 원소의 타입을 여러종류로
		//변신할 수 있도록 일반화시키기위해 컬렉션을 생성하고 사용할때는
		//오직 한 타입값만 저장가능
		/*
		 * 컬렉션의 요소는 객체들만 가능하다
		 * int,double,char 등 기본타입의 데이터를 
		 * 컬렉션의 요소를 사용하는 것은 불가능하다
		 */
		
//		ArrayList<String> a = new ArrayList<>();
//		a.add("Java");
//		a.add("python");
//		a.add("ruby");
//		for(int i=0;i<a.size();i++) {
//			String b = a.get(i);
//			System.out.println(b);
//		}
		
//		ArrayList<Profile> p =new ArrayList<>();
//		p.add(new Profile("tom",20));
//		p.add(new Profile("kim",25));
//		p.add(new Profile("lee",30));
//		for(int i=0;i<p.size();i++) {
//			Profile p1 = p.get(i); //가져와서 객체에 저장
//			System.out.println(p1.age + " " + p1.id);
//			// p1 만 출력하면 toString
//		}
		
//		Dog[] dog = new Dog[5];
//		dog[0] = new Dog("jin","진돗개");
//		dog[1] = new Dog("pung","풍산개");
//		dog[2] = new Dog("si","시추");
//		dog[3] = new Dog("mal","말티즈");
//		dog[4] = new Dog("spi","스피츠");
//		for(Dog i : dog) {
//			System.out.println(i.showDogInfo());
//		}
//		ArrayList<Dog> doga= new ArrayList<>();
//		doga.add(new Dog("jin","진돗개"));
//		doga.add(new Dog("pung","풍산개"));
//		doga.add(new Dog("si","시추"));
//		doga.add(new Dog("mal","말티즈"));
//		doga.add(new Dog("spi","스피츠"));
//		for(int i=0;i<doga.size();i++) {
//			System.out.println(doga.get(i).showDogInfo());
//		}
		
//		Profile p = new Per(5);
//		p.add("kim","123");
//		p.add("lee","456");
//		p.add("park","344");
//		System.out.println(p.check("123"));
//		System.out.println(p.check("456"));
//		System.out.println(p.check("456"));
		
//		Vector<Integer> v = new Vector<>();
//		v.add(1); //v.add(new Integer(1)); autoboxing
//		v.add(2); //v.add(1,2); 앞의 1은 index
//		v.add(3);
//		v.add(4);
//		v.add(2,5);
//		System.out.println("vector count "+v.size());
//		for(int i=0;i<v.size();i++) {
//			int su = v.get(i);//AutoUnBoxing
//			System.out.println(su);
//		}
		
//////	1
////	int a=10,b=5;
////	Clacu c=new Clacu();
////	System.out.println(c.total(a,b));
////	System.out.println(c.big(a,b));
//
//		interface Cal{int total(int a,int b); // a부터 b까지의 합 리턴
//		int big(int a,int b);// a,b중 큰 값 리턴
//		}
//		class Clacu implements Cal {
//			public int total(int a, int b) {
//				int sum = 0;
//				for (int i = a; i <= b; i++) {
//					sum += i;
//				}
//				return sum;
//			}
//
//			public int big(int a, int b) {
//				return a > b ? a : b;
//			}
//		}
//
//////	2
////	Th t=new Th("쓰레드 1");
////	Thread th=new Thread(t);
////	th.start();
//
//		class Th implements Runnable {
//			String s;
//
//			public Th(String s) {
//				this.s = s;
//			}
//
//			public void run() {
//				System.out.println(s);
//			}
//		}
//
//////	3
////	Timer t1 = new Timer();
////	t1.start();
//
//		class Timer extends Thread {
//			public void run() { //
//				for (int i = 0; i < 10; i++) { // 1초마다
//					System.out.println(i);
//					try {
//						sleep(1000);
//					} catch (Exception e) {
//					}
//				}
//			}
//		}
//
//////	4
////	Total t=new Total();
////	AThread a=new AThread(t, 1, 50);
////	AThread b=new AThread(t, 51, 100);
////	a.start();
////	try {
////		a.join();
////	} catch (Exception e) {}
////	b.start();
//
//		class Total {
//			int sum;
//
//			Total() {
//				sum = 0;
//			}
//
//			void total(int n) {
//				sum += n;
//			}
//
//			int get() {
//				return sum;
//			}
//		}
//		class AThread extends Thread {
//			Total t;
//			int i, j;
//
//			public AThread(Total t, int i, int j) {//
//				this.t = t;
//				this.i = i;
//				this.j = j;
//			}
//
//			int sum;
//
//			public void run() { //
//				for (int k = i; k <= j; k++) {
//					t.total(k); // sum+=k;
//				}
//				sum = t.get();
//				System.out.println(sum);
//			}
//		}
//
//////	5
////	Figure f1=new Circle(5);
////	Figure f2=new Rec(2,5);
////	f1.circle_area();
////	f2.rec_area();
//
//		interface Figure{void circle_area();void rec_area();
//
//		}
//		class Circle implements Figure {
//			int i;
//
//			Circle(int i) {
//				this.i = i;
//			}
//
//			public void circle_area() {
//				System.out.println(3.14 * i * i);
//			}
//
//			public void rec_area() {
//			}
//		}
//		class Rec implements Figure {
//			int a, b;
//
//			public Rec(int i, int j) {
//				this.a = i;
//				this.b = j;
//			}
//
//			public void circle_area() {
//			}
//
//			public void rec_area() {
//				System.out.println(a * b);
//			}
//		}
		
////		6-1
//		boolean b =false;
//		String s = Boolean.toString(b);
		//valueOf 의 반환형은 객체
////		6-2
//		String s1 = "36.5";
//		double d = Double.parseDouble(s1);
////		6-3
//		String s2 = "35";
//		int i = Integer.parseInt(s2);
		
//		7
//		Person p=new Person("Jack", "computer", 20, 123);
//		ObjectOutputStream  oout = new ObjectOutputStream(new FileOutputStream("jack.txt"));
//		oout.writeObject(p);
//		oout.close();
//		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("jack.txt"));
//		Person n = (Person) oin.readObject();
//		n.show();
		
//		8
//		Circle[] carr =new Circle[3];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<carr.length;i++) {
//			double d1 = sc.nextDouble();
//			double d2 = sc.nextDouble();
//			int a = sc.nextInt();
//			carr[i] = new Circle(d1,d2,a);
//		}
//		for(int i=0;i<carr.length;i++) {
//			carr[i].show();
//		}
		
////		9
//		pr(new Worker()); // 일한다
//		pr(new Student()); // 공부한다 출력
//		
////		10
//		Ab c = new Cd();
//		System.out.println(c.total(new int[] { 1, 2, 3, 4, 5 }));

		Vector<Integer> v = new Vector<>();
		v.add(15);
		v.add(0, 30);
		v.add(45);
		v.add(2,60); 
		v.add(0, 0); 
		v.add(1,35);
		v.add(1,50);
		v.add(2,100);
		// 이런 줄 알았는데 아니네......
		// 가장 마지막을 기준으로 순서가 확정됨
		// 같은 인덱스의 삽입되는 자료가있다면 마지막 명령이
		// 우선권을 가지고 후순위 자료들은 인덱스가 하나씩 밀림
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
		
	}
//	static void pr(Person p) {
//		System.out.println(p.work());
//	}
}
//abstract class Ab{
//	abstract int total(int[] iary);
//}
//class Cd extends Ab{
//	int total(int[] iary) {
//		int sum=0;
//		for(int i=0;i<iary.length;i++) {
//			sum += iary[i];
//		}
//		return sum;
//	}
//}
//interface Person {
//	String work();
//}
//class Worker implements Person{
//	public String work() {
//		return "일한다";
//	}
//}
//class Student implements Person{
//	public String work() {
//		return "공부한다";
//	}
//}
//class Circle {
//	private double x, y;
//	private int r;
//	Circle(double x, double y, int r) {
//		this.x = x;
//		this.y = y;
//		this.r = r;
//	}
//	void show() {
//		System.out.println(x + " " + y + " " + r);
//	}
//}