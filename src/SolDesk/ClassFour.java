package SolDesk;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ClassFour {

	public static void main(String[] args) {
//		for(int i = 0;i<10; i++)
//			System.out.print(i);
//		int sum=0;
//		for(int i=0;i<101;i++) {
//			sum += i;//0~100
//		}
//		System.out.println(sum);
//		
//		int total=0;
//		for(int i=100; i>0;i--)
//			total += i;//100~0 
//		System.out.println(total);

//		for(int i=0;i<11;i++)
//			if(i%2==0){ //0~10 only even number
//				System.out.print(i);
//			}
//			else
//				System.out.print(" ");

//		for(int i=0;i<5;i++) {
//			for(int v=4;v>i;v--)
//				System.out.print(" ");
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}

//		for(int i=0;i<10;i++) { //구구단
//			for(int j=0;j<10;j++) {
//				System.out.println(i+" "+j);
//			}
//		}

//		for(int i=0;i<9;i++) { //행의 갯수
//			if(i<5) {
//			//공백이 먼저 생성 갯수는 i값에 따라 가변
//				for(int j=0;j<4-i;j++) {
//					System.out.print(" ");
//				}
//			//i가 증가 하면 *도 증가	 j의 범위는 i+1
//				for(int j=0;j<i+1;j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//			// i값과 4차이로 증가
//				for(int j=0;j<i-4;j++) {
//					System.out.print(" ");
//				}
//			// 9에서 i값을 빼면 *
//				for(int j=0;j<9-i;j++) {
//					System.out.print("*");
//				}
//			}
//			//if - else 종료
//			System.out.println(" ");//i값 증가
//		}

//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++)
//				System.out.print(" ");
//			for(int j=1;j<i*2+2;j++) {
//				System.out.print(j);
//			}
//		System.out.println(" ");
//		}

//		for(int i=0;i<5;i++) {
//			if(i<3) {
//				for(int j=0;j<2-i;i++) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<i*2+1;j++) {
//					System.out.print("*");
//				}
//			}System.out.println(" ");
//		}
////			else {
////				for(int j=0;j<i-2;i++) {
////					System.out.println(" ");
////				}
////				for(int j=0;j<=i-1;j++) {
////					System.out.println("*");
////				}
////			}
////			System.out.println(" ");
////		}

//		int i=0;
//		while(i<11) {
////			i++; 1부터 출력 ~10
//			System.out.println(i);
//			i++; //0부터 출력 ~10
//		}

//		int i=0;
//		while(i<11) {
//			if(i%2==0)
//				System.out.println(i);
//			i++; //0부터 출력 ~10 : even number
//		}

//		int sum=0,n=100; //while문 사용위한 초기화
//		Scanner sc= new Scanner(System.in);
//		while(n!=0) { //0이 아닐때까지
//			System.out.println("Enter a number");
//			// 0을 입력할 때 까지 계속 출력됨
//			n=sc.nextInt(); 
//			//정수 입력 0을 입력할 때 까지 계속 출력됨
//			sum+=n; 
//			//내가 입력한 수 계속 더함
//			
//		}
//		System.out.println(sum);

//		for(int i=0;i<5;i++) {
//			if(i<3) {
//				for(int j=0;j<2-i;j++) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<i*2+1;j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				for(int j=0;j<i-2;j++) {
//					System.out.print(" ");
//				}
//				for(int j=9;j>=i*2+1;j--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}

		// break 반복문 하나를 완전히 빠져나갈 때 사용
		// break문은 하나의 반복문만 벗어남
		// 중첩반복문의 안쪽에서 break가 실행됬다면
		// 안쪽반복문만 벗어나게됨

//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("Enter your name: ");
//			String name=sc.next();
//			if(name.equals("In")) { //문자열 비교 .equals()
//				break; //올바른 값이 입력되면 아래쪽은 실행되지 X
//						//반복문 실행되지 않음
//			}
//			System.out.println(name);
//		}

//		while(true) {
//			int n=(int)(Math.random()*6+1);
//			if(n==6) {
//				System.out.println(n + " break");
//				break;
//			}			
//			else
//				System.out.println(n);
//		}

//		Scanner s = new Scanner(System.in);
//		int n=0;
//		
//		while(true) {
//			if(s.nextInt() == -1) {
//				break;
//			}
//			n++;
//			//else 를 생략가능
//		}
//		System.out.println(n);
//		// s 를 입력받아서 -1과 같은지 확인후 같다면 break
//		// 다르다면 n을 +1 이후 다시 s 입력반복(n=count)

//		int s = 1;
//		while(s<100) {
//			if(s%2==0 && s%3==0) {
//				System.out.println(s);
//			}
//			s++;
//		}

//		continue 반복문을 빠져나가지 않는다
//		반복문 실행 도중 다음 반복을 실행

//		for(int i=1;i<=100;i++) { 
//			if(i%2==0) { // 짝수는 반복문실행되므로  i++
//				continue;
//			}
//			else {
//				System.out.println(i); //홀수출력
//			}
//		}

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter 5 integers");
//		int sum=0;
//		for(int i=0;i<5;i++) { //i=0 i<5 i->0,1,2,3,4 다섯번
//			int n=sc.nextInt(); 
//			if(n<0) {
//				continue; // 제외라고 생각하면 편함
//			}
//			else {
////				System.out.println(n);
//				sum+=n;
//			}
//		}
//		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		int math = sc.nextInt();
//		int english = sc.nextInt();
//		System.out.printf("%d + %d / 2 = %.1f\n", math, english, (math + english) / 2.0);
//		System.out.print(math + " + " + english + " / 2 = " + ((double) (math + english) / 2));

//		Scanner sc = new Scanner(System.in);
//		int money = 100000;
//		int price;
//		System.out.println("시간을 입력하시오");
//		int time = sc.nextInt();
//		System.out.println("갯수를 입력하시오");
//		int number = sc.nextInt();
//
//		if (time == 14 && number <= 3) {
//			System.out.println("5% 할인");
//			price = (int) ((money - (money * 0.05)) * number);
//			System.out.println(price);
//		} else if (time == 18 && number <= 5) {
//			System.out.println("10% 할인");
//			price = (int) ((money - (money * 0.1)) * number);
//			System.out.println(price);
//		} else if (time == 20 && number <= 10) {
//			System.out.println("20% 할인");
//			price = (int) ((money - (money * 0.20)) * number);
//			System.out.println(price);
//		} else {
//			System.out.println("남은 금액은 :" + money);
//		}

//		int i = 5;
//		while (i <= 9) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j);
//			}
//			i++;
//			System.out.println();
//		}
//
//		int n = 1;
//		int sum = 0;
//		while (n <= 100) {
//			if (n % 5 == 0) {
//				sum += n;
//			}
//			n++;
//		}
//		System.out.println(sum);

//		int x = 0, y = 0;
//		int a = 0;
//		while (true) {
//			x = (int) (Math.random() * 5 + 1);
//			y = (int) (Math.random() * 5 + 1);
//			a = x + y;
//			if (a == 5) {
//				break;
//			}
//			System.out.println(x + " " + y);
//		}
		
//		do while
//			조건이 안맞아도 최소 한번은 실행됨 , 순차적으로 실행되기때문
//		int i = 0; //초기화  
//		do {
//			System.out.println(i); 
//			i++; //증감식
//		}while(i<10); //조건부
		
//		int i = 1;  // 1~20까지의 합
//		int sum=0;
//		do {
//			sum+=i;
//			i++;
//		}while(i<21);
//		System.out.println(sum);
		
//		String str;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("Enter an String");
//			str=sc.next();
//			
//			if(str.equals("exit")) { // exit 이면 프로그램종료
//				System.out.println("Exit the program");
//			}
//			else { // exit 가 아닌 문자열 출력
//				System.out.println(str);
//			}
//		}while(!str.equals("exit")); //exit 가 아닌 동안
		
//		int ans=18;
//		Scanner sc=new Scanner(System.in);
//		int c = 0;
//		while(true) {
//			int my=sc.nextInt();
//			if(ans!=my) {
//				if(ans>my) {
//					System.out.println("ans > my");
//				}
//				else{
//					System.out.println("ans < my");
//				}
//			}
//			else {
//				System.out.println("ans = my");
//			}
//			c++;
//		}

//		Scanner sc=new Scanner(System.in);
//		System.out.println("한 문자를 입력해주세요");
//		char A = sc.next().charAt(0);
//		int n = (int)A;
//		for(int i=97;i<=n;i++) {
//			for(int j=i;j<n;j++) {
//				char ch= (char)j;
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//		int sum=0;
//		for(int i = 1;i<=10;i++) {
//			System.out.print(i + " ");
//			sum+=i;
//			if(sum>=30) {
//				System.out.println(sum);
//				break;
//			}
//		}

//		int i = 0;
//		while(i<=10) {
//			System.out.print(i + " ");
//			sum+=i;
//			if(sum>=30) {
//				System.out.println(sum);
//				break;
//			}
//			i++;
//		}

//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i%2==0) {
//					System.out.println(i+" "+j);
//				}
//				
//				else {
//					continue;
//				}
//			}
//			System.out.println();
//			
//		}
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i%2==1) { //i%2 != 0
//					continue;
//				}
//				
//				else {
//					System.out.println(i+" "+j);
//				}
//			}
//			System.out.println();
//			
//		}
//		int i=0;
//		while(i<=9) {
//			i++;			
//			if(i%2==0) {// 0에서 시작한다면 0에서 바로 continue
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
////			i++;
//		}

		
	
		
	}

}
