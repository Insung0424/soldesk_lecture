package SolDesk;

import java.util.Scanner;

public class Classseven {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double arr[][] = new double[3][2];		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = sc.nextDouble();
//				System.out.println(arr[i][j]);
//			}
//		}
		
//		boolean[]b = {true,false,true,false};
//		for(boolean s : b) {
//			System.out.println(s);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int a[]=new int[10];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//			if(a[i]%5==0) {
//				System.out.println(a[i]);
//			}
//		}
		
//		byte b = 128; error
//		float f = 3.14f;
		
//		System.out.println(add(10,20));
		
//		1
//		int num1=10;
//		int num2=2;
//		char operator ='+';
//		if(operator == '+')
//			System.out.println(num1+num2);
//		else if(operator == '-')
//			System.out.println(num1-num2);
//		else if(operator == '*')
//			System.out.println(num1*num2);
//		else if(operator == '/')
//			System.out.println(num1/num2);
//		else
//			System.out.println("잘못입력하셨습니다");
//		
//		switch(operator) {
//		case '+':
//			System.out.println(num1+num2);
//		case '-':
//			System.out.println(num1-num2);
//		case '*':
//			System.out.println(num1*num2);
//		case '/':
//			System.out.println(num1/num2);
//		default:
//			System.out.println("잘못입력하셨습니다");
//		}
		
//		2
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<10;j++) {
//				if(i%2==0) {
//					System.out.println(i+"*"+j+"="+(i*j));
//				}
//			}
//		}
		
//		3
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<=i;j++) {
//				
//				System.out.println(i+"*"+j+"="+(i*j));
//				
//			}
//			System.out.println();
//		}
		
//		4 대칭
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<3-i;j++)
//				System.out.print(" ");
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		5 반나누고 아래층은 i를 줄여나가는 방식 
//		  한번에 만드는 법은 모르겠음
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<3-i;j++)
//				System.out.print(" ");
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=2;i>=0;i--) {
//			for(int j=0;j<3-i;j++)
//				System.out.print(" ");
//			for(int j=0;j<i*2+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		230-2
//		char alphabets[] = new char[26];
//		char ch='a';
//		
//		for(int i=0;i<alphabets.length;i++,ch++) {
//			alphabets[i]=ch;
//		}
//		for(int j=0;j<alphabets.length;j++) {
//			alphabets[j]= (char) (alphabets[j]-32);
//		}
//		for(int j=0;j<alphabets.length;j++) {
//			System.out.println(alphabets[j]);
//		}
		
//		230-3
//		int n[]=new int [5];
//		int sum=0;
//		for(int i=1;i<11;i++) {
//			if(i%2==0) {
//				n[i]=i;
//				sum+=n[i];
//			}
//		}
//		System.out.println(sum);
			
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.println(in(n));
//		System.out.println(in());
		
//		Scanner sc= new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		double avg=average(x,y);
//		System.out.println(avg);
		
//		double avg=average();
//		System.out.println(avg);
		
//		average();
		
//		int arr[]= {1,2,3,4,5};
//		System.out.println(total(arr));
		
//		int arr[][]= {{1,2,3},{4,5,6}};
//		System.out.println(total(arr));
		
//		1
//		int sum=1;
//		int i=1;
//		while(true) {
//			sum*=i;
//			if(i>=10)
//				break;
//			i++;
//		}
//		System.out.println(sum);

//		2
//		for(int i=2;i<9;i++) {
//			for(int j=1;j<9;j++) {
//				if(j>i) {
//					break;
//				}
//				if(i%2==0)
//					System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
//		3
//		int result=adder(10,20); //두 수의 합 출력
//		System.out.println(result);
//		System.out.println(exp(3.5)); //3.5의 제곱한 값 출력
	
//		4-1
//		System.out.println(size(5));
//		4-2
//		circle(5);
	
//		5
//		int n=1;
//		int arr[][]=new int [2][5];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = n;
//				n+=2;
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		6
//		String a="C++",b=", JAVA";
//		6-1
//		System.out.println(a.length());
//		6-2
//		String o = a.concat(b);
//		System.out.println(o);
//		6-3
//		System.out.println(o.substring(3)); 
//		6-4
//		String c = o.replace("JAVA", "C#");
//		System.out.println(o.replace("JAVA", "C#"));
//		6-5
//		String s[]=c.split(",");
//		for(String i:s) {
//			System.out.println(i);
//		}
		
		
	
	}
	
	
	
	
//
//	static void circle(double r) {
//		System.out.println(3.14*r*r);
//	}
//	
//	static double size(double r) {
//		return 3.14*r*r;
//	}
//	
//	static double exp(double a) {
//		return a *=a;
//	}
//	static int adder(int a, int b) {
//		return a+b;
//	}
//	static int total(int a[][]) {
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++)
//				sum+=a[i][j];
//		}
//		return sum;
//	}
	
//	static int total(int a[]) {
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum+=a[i];
//		}
//		return sum;
//	}
	
//	static void average() {
//		Scanner sc= new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		double result = (a+b)/2.0;
//		System.out.println(result);
//	}
	
//	static double average() {
//		Scanner sc= new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		return (a+b)/2;
//	}
	
//	static double average(int a,int b) {
//		return (a+b)/2;
//	}
	
//	static int in() {
//		Scanner sc= new Scanner(System.in);
//		int n = sc.nextInt();
//		return n;
//	}
//	static int in(int a) {
//		return a;
//	}
	
//	static int add(int a,int b) {
//		return a+b;
//	}

}