package SolDesk;

import java.util.Scanner;

//class XY{
//	private int x,y;
//	public XY(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
//	public String toString() {
//		return x+" "+y;
//	}
//}

//class Book{
//	String name;
//	int won;
//	Book(String name){
//		this(name,40000);
//	}
//	Book(String name,int won){
//		this.name=name;
//		this.won=won;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getWon() {
//		return won;
//	}
//	public void title() {
//		System.out.println(getName()+" "+getWon()+"원");
//	}
//}

//class Box<T>{
//	Box<T> next;
//	T t;
//	void in(T t) {
//		this.t=t;
//	}
//	T out() {
//		return t;
//	}
//}

//class St1<T>{
//	int n;
//	Object[] st;
//	
//	St1(){
//		st=new Object[3];
//		n=0;
//	}
//	public void push(T item) {
//		if(n==3) { //stack full
//			return; //함수종료
//		}
//		st[n]=item;
//		n++;
//	}
//	
//	public T pop() {
//		if(n==0) { // stack 이 비어있음
//			return null;
//		}
//		n--; //하나감소
//		return (T) st[n]; // 마지막 반환 (오브젝트이므로 다운캐스팅)  
//	}
//}

public class classNineteen {

	public static void main(String[] args) {
//		ArrayList<Integer> ary = new ArrayList<>();
//		ary.add(1);
//		ary.add(new Integer(2)); //auto unboxing
//		ary.add(3);
//		ary.add(2,4);
//		for(int k:ary)
//			System.out.println(k);
		
//		ArrayList<XY> xyarr = new ArrayList<>();
//		xyarr.add(new XY(1,2));
//		xyarr.add(new XY(3,4));
//		xyarr.add(1,new XY(5,6));
//		xyarr.remove(1); //index 1 remove
//		for(XY i:xyarr) {
//			System.out.println(i);
//		}
		
//		ArrayList<String> ary = new ArrayList<>(/*배열크기설정가능*/);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("If you want to stop enter a 'stop'");
//		for(;;) {
//			String s = sc.nextLine();
//			if(s.equals("stop")) {
//				break;
//			}
//			ary.add(s);
//		}
//		for(String i:ary) {
//			System.out.println(i);
//		}
//		
//		int max=0;
//		for(int i=0;i<ary.size();i++) {
//			if(ary.get(max).length() < ary.get(i).length()) {
//				max = i;
//			}
//		}
//		System.out.println(ary.get(max));
		
////		1
//		Book b1=new Book("자바"); 
//		b1.title();            //자바는 40000원
//		Book b2=new Book("파이썬", 30000);
//		b2.title();           //파이썬 30000원
//		
////		2
//		Scanner sc = new Scanner(System.in);
////		StringBuilder st = new StringBuilder();
//		ArrayList<String> str = new ArrayList<>();
//		int i=sc.nextInt();
//		while(true) {
//			if(i==0) {
//				break;
//			}
//			int n = i%10;
//			int a = i/10;
//			if(n%3 != 0) {
//				if(a%3 != 0) {
//					System.out.print("땡");
//					break;
//				}
//			}
//			else {
////				st.append("짝");
//				str.add("짝");
//			}
//			i/=10;
//		}
////		System.out.println(st);
//		for(String k:str) {
//			System.out.print(k);
//		}
		
//		Box<Integer> box = new Box<>();
//		box.in(30);
//		box.next = new Box<Integer>();
//		box.next.in(40);
//		
//		box.next.next = new Box<Integer>(); 
//		box.next.next.in(50);
//		
//		Box<Integer> tmp;
//		tmp=box.next;
//		System.out.println(tmp.out());
		
//		St1<String> st1 = new St1<>();
//		st1.push("ha");
//		st1.push("hi");
//		st1.push("hu");
//		st1.push("he");
//		st1.push("ho");
//		for(int i=0;i<=st1.n+1;i++) {
//			System.out.println(st1.pop());
//		}
		
//		St1<Integer> s = new St1<>();
//		Scanner sc = new Scanner(System.in);
//		for(;;) {
//			int num = sc.nextInt();
//			s.push(num);
//			if(s.n == 3) {
//				break;
//			}
//		}
//		for(int i=0;i<=s.n+1;i++) {
//			System.out.println(s.pop());
//		}
			
//		ArrayList<Integer> ai = new ArrayList<>();
//		ai.add(33);
//		ai.add(66);
//		ai.add(99);
//		Iterator<Integer> it = ai.iterator();
//		//순서가 없는 클래스에서 사용
//		while(it.hasNext()) { //값이 있는동안
//			int n = it.next(); //다음값 반환
//			System.out.println(n);
//		}
		
////		3
//		Scanner sc = new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		Cal c= new Show();
//		System.out.println(c.cal(a,b));
//		
////		4
//		Gen<String> g=new Gen<String>("seoul","busan");
//		System.out.println(g.one());   //seoul 출력
//		System.out.println(g.two());   //busan 출력
//		System.out.println(g.three());  //false 출력 (두 문자열 비교) 
		
//		HashSet<Num> h = new HashSet<>(); 
//		// hashcode,equals 가 자동으로
//		h.add(new Num(30));
//		h.add(new Num(40));
//		h.add(new Num(50));
//		h.add(new Num(50)); //
//		Iterator<Num> it = h.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		TreeSet<Pro> t= new TreeSet<>();
//		t.add(new Pro("cc",128));
//		t.add(new Pro("aa",130));
//		t.add(new Pro("bb",125));
//	
//		Iterator<Pro> it=t.iterator();
//		while(it.hasNext()) {
//			it.next().show(); 
//		//객체의 다음값  출력 정수값기준 오름차순
//		}
		
//		HashSet<Student> set =new HashSet<Student>();
//		set.add(new Student("100","홍길동"));
//		set.add(new Student("200","강감찬"));
//		set.add(new Student("300","이순신"));
//		set.add(new Student("400","정약용"));
//		set.add(new Student("100","송중기"));
//		System.out.println(set);
		
//		TreeSet<Integer> grade = new TreeSet<>();
//		grade.add(30);
//		grade.add(100);
//		grade.add(50);
//		Iterator it = grade.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			//오름 차순으로 출력되는 이유 : 정수라서자동비교
//		}
//		Integer i;
//		i=grade.first();
//		System.out.println(i);
//		i=grade.last();
//		System.out.println(i);
//		i=grade.lower(new Integer(80)); 
//		//the greatest element less than e
//		System.out.println(i);
//		i=grade.higher(80);
//		//the least element greater than e
//		System.out.println(i);
		
////		5
//		Scanner sc = new Scanner(System.in);
//		System.out.println("5~10 중 입력");
//		Calcclass cal= new Calcclass();
//		while(true) {
//			int i = sc.nextInt();
//			if(i == 0) {
//				break;
//			}
//			if(i<5 || i>10) {
//				System.out.println("다시입력");
//				continue;
//			}
//			System.out.println(cal.claculate(i));
//			System.out.println("0입력하면 종료");
//		}
//		
////		6
//		System.out.println("숫자 9개 입력");
//		int[][] ary=new int[3][3];
//		for(int i=0;i<ary.length;i++) {
//			for(int j=0;j<ary[i].length;j++) {
//				ary[i][j] = sc.nextInt();
//			}
//		}
//		high(ary,3,3);
		
////		7
//		try {
//			FileOutputStream fos = new FileOutputStream("fi.txt");
//			byte[] b= {1,2,3,4,5};
//			try {
//				fos.write(b);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
////		7-1
//		try {
//			FileInputStream fis = new FileInputStream("fi.txt");
//			int a;
//			try {
//				while((a=fis.read()) != -1) {
//					System.out.print(a+" ");
//				}
//				System.out.println();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
////		8
//		int [] arr={1,2,3,4,5};
//		int r;
//		r=add(arr,5);
//		System.out.println(r);
		
//		10
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				System.out.println("넓이,높이 입력");
//				int w =sc.nextInt();
//				int h =sc.nextInt();
//				Rectangle rec = new Rectangle();
//				rec.setWidth(w);
//				rec.setHeigt(h);
//				System.out.println("면적은 "+ rec.area());	
//				break;
//			}catch(Exception e) {
//				System.out.println("int 가 아님,처음부터 다시 입력");
//				sc.next();
//				continue;
//			}
//		}
		
		
		
	}
//	static int add(int []a,int b) {
//		int sum=0;
//		for(int i=0;i<b;i++){
//			sum+=a[i];
//		}
//		return sum;
//	}
//	static void high(int[][]arr,int a,int b){
//		int max=arr[0][0];
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<b;j++) {
//				if(max < arr[i][j]) {
//					max = arr[i][j];
//				}
//			}
//		}
//		System.out.println("가장 큰수는 "+max);
//	}
	
}

////9
//class Rectangle{
//	private int width,heigt;
//
//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public int getHeigt() {
//		return heigt;
//	}
//
//	public void setHeigt(int heigt) {
//		this.heigt = heigt;
//	}
//	
//	public int area() {
//		return getWidth()*getHeigt();
//	}
//	
//}
//class Calcclass{
//	public int claculate(int n){
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			if(i%2 == 1) {
//				sum+=i;
//			}
//		}
//		return sum;
//	}
//}
//class Student{
//	String Num;
//	String name;
//	Student(String n,String m){
//		this.Num=n;
//		this.name=m;
//	}
//	public String toString() {
//		return Num+":"+name;
//	}
//	@Override
//	public int hashCode() {
//		return Integer.parseInt(Num); 
//		//기준이 되는 첫번째문자열을 정수로 변환
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Student student = (Student)obj;
//		if(student.Num == this.Num) {
//			return true;
//		}
//		return false;
//	}
//}

//class Pro implements Comparable<Pro>{
//	String n;
//	int m;
//	Pro(String n,int m){
//		this.n=n;
//		this.m=m;
//	}
//	void show() {
//		System.out.println(n+" "+m);
//	}
//	@Override
//	public int compareTo(Pro o) {//기준을 정수값으로함
//		return this.m - o.m; //반대로 하면 내림차순
//	}
//	
//}
//class Num{
//	int n;
//	Num(int a){
//		n=a;
//	}
//	public String toString() {
//		return n+"";
//	}
//	@Override
//	public int hashCode() {
//		return n%3; //기준을 정해서 그룹화
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Num num = (Num)obj; //다운캐스팅
//		if(num.n==n) {
//			return true;
//		}
//		return false;
//	}
//	
//}
//class Gen<T>{
//	T a,b;
//	Gen(T s1, T s2){
//		this.a=s1;
//		this.b=s2;
//	}
//	public T one() {
//		return a;
//	}
//	public T two() {
//		return b;
//	}
//			//	g.three(T t) 
//	public boolean three() {
//		if(a.equals(b)) {
//			return true;
//		}
//		return false;
//	}
//}
//
//interface Cal{
//	public int cal(int a,int b);
//}
//class Show implements Cal{
//	public int cal(int a,int b) {
//		int sum=0;
//		for(int i=a;i<=b;i++) {
//			sum+=i;
//		}
//		return sum;
//	}
//}