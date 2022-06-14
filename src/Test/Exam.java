package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


//class JavaTest1 {
//	JavaTest1(){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 i 입력");
//		int i = sc.nextInt();
//		System.out.println("정수 j 입력");
//		int j = sc.nextInt();
//		System.out.println("합은 : "+ (i+j));
//	}
//}


//class Circle {
//	private double r;
//	Circle(double r) {
//		this.r = r;
//	}
//	double area() {
//		return 3.14 * r * r;
//	}
//}
//class JavaTest2 {
//	JavaTest2(){
//		Circle[] cary = new Circle[5];
//		double sum=0;
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<cary.length;i++) {
//			System.out.println((i+1)+"번 원의 반지름 입력");
//			cary[i] = new Circle(sc.nextDouble());
//		}
//		for(Circle i : cary) {
//			sum+=i.area();
//		}
//		System.out.println("5개 원의 면적 합은 "+sum);
//	}
//}

//class JavaTest3{
		class Num{
			int n;
			int sum=0;
			int max=0;
			void add(int n) {
				sum += n;
				if(max<n) {
					max = n;
				}
			}
			public int getSum() {
				return sum;
			}
			public int getMax() {
				return max;
			}
			
			public int getSum(int n) {
				sum += n;
				return sum;
			}
			
			public int getMax(int n) {
				if(max<n) {
					max = n;
				}
				return max;
			}
			
			Num(){
				this(0);
			}
			Num(int n){
				this.n=n;
				sum += n;
				if(max<n) {
					max = n;
				}
			}
		}
//}

//class JavaTest4{
//	HashMap<String,Double> hm = new HashMap<>();
//	Scanner sc = new Scanner(System.in);
//	JavaTest4(){
//		hm.put("Kim", 11.1);
//		hm.put("Lee", 22.2);
//		for(int i=0;i<hm.size();i++) {
//			System.out.println("Kim, Lee 중 하나 입력");
//			String s = sc.next();
//			if(s.equals("Kim") || s.equals("Lee")) {
//				System.out.println(hm.get(s));
//			}
//		}
//	}
//}

//class JavaTest5 extends JFrame{
//	JavaTest5(){
//		Container c = getContentPane();
//		c.setLayout(null);
//		JPanel j = new JPanel();
//		j.setBounds(22,10,240,200);
//		j.setLayout(new GridLayout(3,3,10,10));
//		JButton[] jary=new JButton[9];
//		for(int i=0;i<jary.length;i++) {
//			jary[i] = new JButton((i+1)+"");
//			j.add(jary[i]);
//		}
//		
//		c.add(j);
//		setTitle("Dial");
//		setSize(300,300);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//}

//class JavaTest6 implements Serializable{
//	class Student implements Serializable{
//		String a,b;
//		int i;
//		public Student(String a, String b, int i) {
//			this.a = a;
//			this.b = b;
//			this.i = i;
//		}
//		void show() {
//			System.out.println(a + " " + b + " " + i);
//		}
//	}
//	JavaTest6(){
//		Student s= new Student("jack","123",20);
//		try {
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("java.txt"));
//			out.writeObject(s);
//			out.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			ObjectInputStream in = new ObjectInputStream(new FileInputStream("java.txt"));
//			Student b = (Student) in.readObject();
//			b.show();
//			in.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

public class Exam {

	public static void main(String[] args) {
//		JavaTest1 j = new JavaTest1();
		
//		JavaTest2 j = new JavaTest2();
		
//		Num nb = new Num();
//		nb.add(7); nb.add(-1); nb.add(20); nb.add(5); // 4개 숫자를 입력
//		System.out.println("Sum = " + nb.getSum());   // 4개 숫자의 합계
//		System.out.println("Max = " + nb.getMax());   // 4개 숫자 중 최대값
//		System.out.println("======구분선======");
//		Num nb2 = new Num(8);
//		System.out.println("Sum = " + nb2.getSum(22));
//		System.out.println("Max = " + nb2.getMax(12));
		
//		JavaTest4 j = new JavaTest4();
		
//		JavaTest5 j = new JavaTest5();
		
//		JavaTest6 j = new JavaTest6();
		
		Scanner sc =new Scanner(System.in);
		ArrayList<Worker> aWork = new ArrayList<>();
		while(true) {
			System.out.println("사원 정보 관리 프로그램");
			System.out.println("1. 사원 정보 입력");
			System.out.println("2. 사원정보 개별 조회");
			System.out.println("3. 프로그램 종료");
			int i = sc.nextInt();
			
			switch (i){
			case 1 :
				System.out.println("새로운 사원 정보를 입력합니다");
				
				System.out.println("사번 :");
				int iNum = sc.nextInt();
				
				System.out.println("이름 : ");
				String name= sc.next();
				
				System.out.println("부서 : ");
				String part = sc.next();
				
				sc.nextLine();
				System.out.println("주소 : ");
				String address = sc.nextLine();
				
				System.out.println("생일 : ");
				String bDate = sc.next();
				
				aWork.add(new Worker(iNum,name,part,address,bDate));
				//사원이 계속 추가될 것을 생각해서 입력받은 값을 변수로 하는 
				//Worker 객체를 ArrayList에 추가한다
				//set을 이용할 경우 기본생성자로 객체를 생성하게되며 
				//생성된 객체마다 객체명을 지정해야 하므로
				//기본생성자는 private로 잠근다
				System.out.println("사원정보가 입력되었다");
				break;
				
			case 2 :
				System.out.println("검색하고자 하는 사원의 사번은? 예) 123(입력)");
				int id = sc.nextInt();
				Iterator<Worker> it = aWork.iterator();
				while(it.hasNext()) {
					Worker num = it.next();
					if(id == num.getId()) {
						System.out.println("이름 : "+num.getName());
						System.out.println("부서 : "+num.getDepart());
						System.out.println("주소 : "+num.getAddress());
						System.out.println("생일 : "+num.getbDate());
					}
					else {
						System.out.println("존재하지 않는사원 입니다");
					}
				}
				break;
				
			case 3 :
				System.out.println("프로그램 종료");
				System.exit(0); //jvm종료
				return; //함수종료
			}
			
		}
	}

}
