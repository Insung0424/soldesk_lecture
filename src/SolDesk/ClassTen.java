package SolDesk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class Circle {
//
//	private int r;
//	private String name;
//	//Circle내에서만 사용가능 (은닉화)
//	
//	double area() {
//		return 3.14*r*r;
//	}
//	
//	void show() {
//		System.out.println(name);
//	}
//}
//class Person{
//	int age;
//	String name;
//	boolean isMarried;
//	int children;
//	
//	void show() {
//		System.out.println("이름은 "+name+" 나이는 "+age+" 결혼여부 "+isMarried+" 아이는 "+children);
//	}
//}

//class Order{
//	Long orderNumber;//12자리이므로Long int 범위: –2,147,483,648 ~ 2,147,483,647
//	String orderId;
//	String orderDate;
//	String Name;
//	String orderObjectNumber;
//	String address;
//	
//}

//class Rectangle{
//	int width;
//	int height;
//	int getArea() {return width*height;}
//}

//class Pro{
//	String name;//필드
//	Pro(String n){//생성자
//		name = n;//생성자의 초기화 코드
//	}
//	void show() {
//		System.out.println(name);
//	}
//}

//class Profile{
//	String a;
//	String b;
//	Profile(String phoneNumber,String name){
//		a=phoneNumber;
//		b=name;
//	}
//	
//}



public class ClassTen {

	public static void main(String[] args) throws IOException {
			/*byte[]b = {7,38,36,29,64};
			FileOutputStream f=new FileOutputStream("test.txt");
//			for(int i=0;i<b.length;i++) {
//				f.write(b[i]);
//			}
			f.write(b);
			f.close();
			System.out.println("save");*/
		
//		byte a[]=new byte[5];
//		try {
//			FileInputStream in=new FileInputStream("test.txt");
//			int r;
////			int n=0;
//			in.read(a);
////			while((r=in.read())!=-1) {
////				b[n]=(byte)r; //읽은 바이트를 배열에 저장
////				n++;
////			}
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
////			for(int i=0;i<b.length;i++) {
////				System.out.print(b[i]+" ");
////			}
//			in.close();
//		}catch(Exception e) {}
		
//		BufferedReader br=new BufferedReader(new FileReader("amuguna.txt"));
//		try {
//			String n;
//			while((n=br.readLine()) != null)
//				System.out.println(n);
//			br.close();
//		}catch(Exception e) {}
		
//		FileWriter f =new FileWriter("system.dat");
//		BufferedWriter b=new BufferedWriter(f);
//		char[]c=new char[] {'목','요','일'};
//		b.write(c);
//		b.close();
		
//		객체 = 특성+행동
//		1.캡슐화(encapsulation)
//		객체를 캡슐로 감싸서 내부를 보호하고 볼 수 없게하는것-객체의가장본질적특성
		
//		Circle c1 = new Circle();
//		c1.r = 10; // error private 으로 접근불가
		
//		Person James = new Person();
//		James.name = "James";
//		James.age = 40;
//		James.isMarried = true;
//		James.children = 3;
//		
//		James.show();
		
//		Rectangle r=new Rectangle();
//		r.width=4;
//		r.height=10;
//		
//		System.out.println("면적 "+r.getArea());
		
		/*
		 * 클래스 :객체를 생성하기위한 설계도/틀
		 * 생성자 :객체가 생성될때 초기화를위해 실행되는 메소드
		 */
		
//		Pro p=new Pro("Tom");
//		p.show();
		
//		Profile p1=new Profile("010-1234-5678","상우");
//		Profile p2=new Profile("010-2345-7890","하성");
//		
//		System.out.println(p1.a + " " + p1.b);
//		System.out.println(p2.a + " " + p2.b);
		
//		1
//		FileOutputStream f = new FileOutputStream("test.txt");
//		byte b[]={4,6,7,8,-1,24};
//		try {
//			f.write(b);
//			f.close();
//		}catch(Exception e) {}
		
//		FileInputStream fin = new FileInputStream("test.txt");
//		ByteArrayOutputStream out = null;
//		try {
//			int a=0;
//			out = new ByteArrayOutputStream();
//			while((a=fin.read())!=-1) {
//				out.write(a);
//			}
//			byte c[]=out.toByteArray();
//			for(byte i:c) {
//				System.out.println(i);
//			}
//		}catch(Exception e) {}
		
		
//		2
//		int lotto[]={4,10,25,30,45,47};
//		int my[]={1,4,7,26,45,48};
//		int r;
//		r=same(lotto,my);
//		System.out.printf("일치하는 번호의 개수:%d\n", r);

//		3
//		int ary[]={6,2,8,4,9};
//		show(ary);
		
//		4
//		int [][]ary ={{43,97},{34,77,87},{100,95,38,89}}; 
//		int sum=0;
//		int c=0; // double count =0;
//		for(int i=0;i<ary.length;i++) {
//			for(int j=0;j<ary[i].length;j++) {
//				sum+=ary[i][j];
//				c++;
//			}
//			//count += ary[i].length; 
//			//열의 총 개수 - 생각도 못한 방법 avg 생성필요 없음
//		}
//		double avg=sum/c;
//		System.out.printf("합은 %d 이고 평균은 %.1f",sum,avg);
//		
//		5 
//		Scanner sc=new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		//평범하게 입력받기는 스캐너가편하고 
//		//다른거 쓰고싶은데 다른거는 입력에서 2번째줄이후 문제가생김
//		//다른결과 값이 나옴 
//		//아마\n또는 공백도 같이 포함되서 배열에 들어가는 모양
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		int[]a = new int[5];
//		int max=-1000000000;
//		int min=1000000000;
//		int hap=0;
//		for(int i=0;i<a.length;i++) {
////			a[i] = Integer.parseInt(br.readLine());
//			a[i] = br.read();
////			a[i] = sc.nextInt();
//			if(max<a[i]) {
//				max=a[i];
//			}
//			if(min>a[i]) {
//				min=a[i];
//			}
//		}
//		int c=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i] == max || a[i] == min) {
//				continue;
//			}
//			hap+=a[i];
//			c++;
//			sb.append(a[i]+" ");
//		}
//		System.out.println("유효점수는 "+sb);
//		//sb사용않고 "유효점수"+a[i] 같은줄에 어떻게 출력하는지 모르겠음
//		System.out.println("평균은 "+(double)(hap/c));
			
		
//		6
//		BufferedWriter bw = new BufferedWriter(new FileWriter("sampyo.txt"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String s;
//			while((s=br.readLine()) != null) {
//				bw.write(s);
//				bw.write("\n");
//			}
//			bw.close();
//			br.close();
//		}catch(Exception e) {}
//		
//		BufferedReader bbr = new BufferedReader(new FileReader("sampyo.txt"));
//		
//		try {
////			String s;
////			while((s=bbr.readLine()) != null) {
////				System.out.println(s);
////			}
//		String[] v=new String[3];
//		for (int i = 0; i < v.length; i++) {
//			v[i] = bbr.readLine();
//			System.out.println(v[i]);
//		}
//		}catch(Exception e) {}
		
//		Order order = new Order();
//		order.orderNumber = 202205190001L;
//		order.orderId = "abc123";
//		order.orderDate = "2022년 05월 19일";
//		order.Name = "홍길순";
//		order.orderObjectNumber = "PD0345-12";
//		order.address = "서울시 영등포구 여의도동 20번지";
//		
//		System.out.println("주문 번호 : "+order.orderNumber);
//		System.out.println("주문자 아이디 : "+order.orderId);
//		System.out.println("주문 날짜 : "+order.orderDate);
//		System.out.println("주문자 이름 : "+order.Name);
//		System.out.println("주문 상품 번호: "+order.orderObjectNumber);
//		System.out.println("배송 주소 : "+order.address);
//		
//		FileInputStream fis = new FileInputStream("test.txt");
//
//		byte[] a = new byte[6];
//		int n;
//		while ((n = fis.read(a, 0, a.length)) != -1)
//			for (int i = 0; i < a.length; i++) {
//				System.out.println(a[i]);
//			}
//		fis.close();

}

static class Order{
	Long orderNumber;//12자리이므로Long 
    //int 범위:  –2,147,483,648 ~ 2,147,483,647
	String orderId;
	String orderDate;
	String Name;
	String orderObjectNumber;
	String address;
}	
	
//static void show(int a[]) {
//	for(int i=a.length-1;i>=0;i--) {
//		System.out.println(a[i]);
//	}
//}
//static int same(int a[],int b[]) {
//	int c=0;
//	for(int i=0;i<a.length;i++) {
//		for(int j=0;j<b.length;j++) {
//			if(a[i] == b[j]) {
//				c++;
//			}	
//		}
//	}
//	return c;
//}
	
}
