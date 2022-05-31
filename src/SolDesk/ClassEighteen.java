package SolDesk;

import java.util.Scanner;

//class Goods{
//	String name;
//	int price;
//	
//	void set(int p) {
//		price = p;
//		p++;
//	}
//}
//class A{
//	int n;
//	A(int n){
//		this.n=n;
//	}
//}
//class A{
//	int a;
//	A(){}
//	A(int i){
//		a=i;
//	}
//	void set(int j) {
//		a=j;
//	}
//	int get() {
//		return a;
//	}
//}
//class Book{
//	String a,b;
//	int c;
//	Book(){
//		this(null,null,10);
//	}
//	Book(String a,int c){
//		this.a=a;
//		this.b=b;
//	}
//	Book(String a,String b,int c){
//		this.a=a;
//		this.b=b;
//		this.c=c;
//	}
//}
//class Sample{
//	public int n; //인스턴스 변수
//	public void a() {
//		m=20;
//	}
//	public void b() {
//		m=30;
//	}
//	public static int m; // 클래스변수
//	public static void c() { // 클래스 메소드
//		m=40;
//	}
//}
public class ClassEighteen {
//		String name;
//		int m;
//		ClassEighteen(String name){
//			this.name=name;
//		}
//		void set(A a) {
//			m=a.n; // 22
//			a.n++; // 23
//		}
//
//		static void in(int []b) {
//			for(int i=0;i<b.length;i++) {
//				b[i]++;
//			}
//		}
	public static void main(String[] args) {
//		byte a = 127;
//		int b = 100;
//		System.out.println((byte)(a+b));//-29
//		227 -> 2 : 1 1 1 0 0 0 1 1 
//				   8 7 6 5 4 3 2 1
//			보수    0 0 0 1 1 1 0 1
//				   -    16+8+4+  1 -> -29
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println((sc.nextInt()%3==0) ? "Pass" : "NO");
		
//		switch(sc.next()) {
//		case "A":
//		case "B":
//			System.out.println("Perfect");
//			break;
//		case "C":
//		case "D":
//			System.out.println("Good");
//			break;
//		case "F":
//			System.out.println("Retry");
//			break;
//		}
		
//		int i=1,s=0;
//		while(i<11) {
//			s+=i;
//			i++;
//		}
//		System.out.println(s);
		
//		int s=0,in;
//		while((in = sc.nextInt()) != 0) {
//			s+=in;
//		}
//		System.out.println(s);
		
//		int i=1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<11);// 내부에서 i설정하면 여기서 사용불가
		
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<10;j++) {
//				System.out.println(i + "X" + j + "="+(i*j));
//			}
//			System.out.println();
//		}
		
//		int sum=0,num;
//		for(num=0;/*조건없음*/;num++) {
//			sum+=num;
//			if(sum>=100) {
//				break;
//			}
//		}
//		System.out.println("num " + num);
//		System.out.println("sum " + sum);
		
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
		
//		Goods goods = new Goods();
////		//goods.name="toy";
////		//goods.price=39900;
//		int a=3;
//		goods.set(a); //set함수가 호출되면 매개변수 p가 생성됨
//		System.out.println(a);
		
//		ClassEighteen t = new ClassEighteen("AA");
//		A a =new A(22);
//		t.set(a); //a의 값이 set함수의 매개변수에 있는 a에 전달
//		System.out.println(a.n);
		
//		int a[]= {1,2,3,4,5};
//		in(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		A a = new A(3);
//		int n=a.get();
//		System.out.println(n);
//		A a2 =new A();
//		a2.set(4);
//		System.out.println(a2.get());
		
//		Book b1 = new Book("aa","bb",33);
//		Book b2 = new Book("cc",33);
//		Book b3 = new Book();
		
//		Sample s1=new Sample();
//		s1.n=10;
//		s1.a();
//		s1.m=40;
//		System.out.println(s1.m);//40
//		Sample s2=new Sample();
//		s2.n=18;
//		s2.b();
//		s2.c();
//		System.out.println(s2.m);//40
		
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
		
		
	}

}
