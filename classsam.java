import java.util.Scanner;

public class classsam {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = sc.next();
//		System.out.println("Enter your address: ");
//		String address = sc.nextLine();
//		
//		System.out.println(name + " " + address);
//		
		// next 문자 또는 문자열을 공백기준으로 입력받음(공백입력 안됨)
		
		// nextLine 한 줄 단위로 입력받음(엔터치기전까지 입력받음 공백도입력)
		// nextline외에 다른 next방식으로 입력 받으면 enter후 버퍼에 \n이 
		// 남게되고 nextLine()은 공백과 개행문자(Enter)인 
		// 분리자를 포함시키기 때문에 \n만 가져오고 프로그램이 종료되는 것이다.
		
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
//		
//		if(score%10==0)
//			System.out.println("Pass");
//		else
//			System.out.println("Failed");
		
//		Math.random()*10+1 1~10
//		Math.random()*11+4 4~14
//		Math.random()*100+1 1~100
		
//		int n = (int)(Math.random()*100+1);
//		System.out.println(n);
//		if(n%5==0 && n%10!=0) 
//			System.out.println("A multiple of 5");
//		
//		else if(n%5==0 && n%10==0) 
//			System.out.println("A multiple of 10");
//		
//		else
//			System.out.println("Not a multiple of 5 or a multiple of 10 ");
//			
//		int n = (int)(Math.random()*20+81);
//		String grade;
//		if(n>=90) {
//			if(n>=95) {
//				grade = "A+";
//			}
//			else { // 90 ~ 94
//				grade = "A";
//			}
//		}
//		else
//			if(n>=85) { // 85 ~ 89
//				grade = "B+";
//			}
//			else  // 81 ~ 84
//				grade = "B";
//		
//		System.out.println(n + " " +grade);
		
//		for(int i = 0;i<11;i=i+2) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0;i<11;i++) {
//			if(i%2==0)
//				System.out.println(i);
//		}
		
//		for(int i = 1; i<100;i++)
//			if(i%5==0 && i%6==0)
//				System.out.println(i);
		
//		int sum = 0; //누적합구하기
//		for(int i = 0; i<101;i++)
//			sum += i;
//		System.out.println(sum);
		
//		int sum=0;
//		for(int i = 1;i<101;i++) {
//			if(i%2==0)
//				sum+=i;
//		}
//		System.out.println(sum);
		
//		for(int i = 1;i<16;i++) {
//			System.out.print("*");
//			if(i%5==0)
//				System.out.println();
//		}
		
//		Scanner sc = new Scanner(System.in); //구구단
//		System.out.println("What's multiplication table?");
//		int dan = sc.nextInt();
//		
//		for(int i = 9;i>=1;i--)
//			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		
//		for(int i=0;i<10;i++,System.out.println(i));
		// 1증가 후 출력됨
//		for(int i=0;true;i++) //true -> 무한반복
		
//		1.5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)
//		System.out.printf("%d / %d = %.2f",5,3,5/3.0);
		
//		2.키(double)를 하나 입력받아 160보다 작으면 “small”, 
//		170보다 작으면 “medium”, 180보다 작으면 “large”
//		Scanner sc = new Scanner(System.in);
//		double height =sc.nextDouble();
//		if(height<160)
//			System.out.println("small");
//		else if(height<170)
//			System.out.println("medium");
//		else
//			System.out.println("large");
		
		
//		3.n1을 50, n2를 100으로 초기화하여
//		두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
//		int n1=50,n2=100;
//		System.out.println(n1>n2? n1:n2);
		
//		4.나이를 기준으로 중첩if문을 사용하여 출력해라.(나이, 키, 사이즈 각각 변수를 선언)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 입력:");
//		int age = sc.nextInt();
//		System.out.println("키 입력:");
//		double height = sc.nextDouble();
//		char size = '0';
//		if(age<20) {
//			if(height<160) {
//				size = 'S';
//			}
//			else if(height<170){
//				size = 'M';
//			}
//			else if(height>=170){
//				size = 'L';
//			}
//		}
//		else {
//			if(height<165) {
//				size = 'S';
//			}
//			else if(height<175){
//				size = 'M';
//			}
//			else if(height>=175){
//				size = 'L';
//			}
//		}
//		System.out.println(size);
		
//		5.1부터 50까지의 정수를 출력해라.(for)
//		for(int i=1;i<51;i++)
//			System.out.println(i);
		
//		5-1.1~50 정수 중 6의 배수를 출력해라.(for, if)
//		for(int i=1;i<51;i++)
//			if(i%6==0) {
//				System.out.println(i);
//			}
		
//		5-2.1~50까지의 총합 출력해라.
//		int sum=0;
//		for(int i=1;i<51;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);

//		5-3.1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라.
//		System.out.println((int)(Math.random()*50+1));	
		
//		6.a=10, b=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다.
//				+이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
//		int a=10,b=20;
//		Scanner sc =new Scanner(System.in);
//		System.out.println("+,-,*,/ 중 하나를 입력해주세요");
//		String sign = sc.next();
//		switch(sign) {
//		case "+":
//			System.out.println(a+b);
//			break;
//		case "-":
//			System.out.println(a-b);
//			break;
//		case "*":
//			System.out.println(a*b);
//			break;
//		case "/":
//			System.out.println(a/b);
//			break;
//		}
		
//		int sum=0;
//		for(int i = 0;i<=10;i++) {
//			sum+=i;
//			System.out.print(i);
////			if(i<=9)System.out.print("+");
//			if(i==10) {
//				System.out.print("=");
//				System.out.print(sum);
//			}
//			else
//				System.out.print("+");
//		}

//		초기식
//		while(조건식) {
//			작업문
//			증감식
//		}
//		int i = 0;
//		while( i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		for(int i=0;i<10;i++)
//			System.out.println(i);
		
//		int i = 0;
//		while(i<100) {
//			if(i%2!=0)
//				System.out.println(i);
//			i++;
//		}
		
//		int i = 10;
//		while(i>0) {
//			System.out.print(i+" ");
//			i--;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = sc.nextInt();
//		
//		switch(n) {
//		case 2:
//			System.out.println("2dan");
//			int i = 1;
//			while(i<10) {
//				System.out.println(n+"*"+i+"="+n*i);
//				i++;
//			}
//			break;
//		case 3:
//			System.out.println("3dan");
//			i = 1;
//			while(i<10) {
//				System.out.println(n+"*"+i+"="+n*i);
//				i++;
//			}
//			break;
//			
//		default :
//			System.out.println("You entered it incorrectly");
//		}
		
//		int i = 1;
//		while(i<100) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 1;
//		while(i<100) {
//			if(i%2==0 && i%3==0)
//				System.out.println(i);
//			i++;
//		}
		
//		for(int i=2;i<=9;i++) { //바깥쪽for문을 기준으로 안쪽for문이 돈다
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//		}
		
//		for(int i=1;i<=3;i++) { //행
//			for(int j=1;j<=3;j++) { //열
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=2;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}
		
		//가변적일 경우 i값을 사용해 j값을 유도함
//*		for(int i=0;i<=4;i++) {
//**		for(int j=1;j<=i+1;j++) {
//***				// 열의 조건식 j<=i+1;
//****			System.out.print("*");
//*****		}
//			System.out.println();
//		}
		
//		for(int i=5;i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<9;i++) {
//			if(i<5) {
//				for(int j=4;j>i;j--) 
//					System.out.print(" ");
//				for(int j=0;j<=i;j++)
//					System.out.print("*");	
//				System.out.println();
//			}
//			else {
//				for(int j=4;j<i;j++)
//					System.out.print(" ");
//				for(int j=8;j>=i;j--)
//					System.out.print("*");
//				System.out.println();
//			}
//		}
		
	}
}