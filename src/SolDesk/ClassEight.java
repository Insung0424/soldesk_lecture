package SolDesk;

import java.util.Scanner;

public class ClassEight {

	public static void main(String[] args) {
//		int arr[]= {4,6,7,5,4};
//		show(arr);
		
//		int a[] = {3,2,1,6,5};  이건 선택정렬
//		int temp;//빈공간
//		for(int i=0;i<4;i++) { 
//		//i의 범위가 a.length -1 이유 : 마지막은 j값이 되야하므로
//			for(int j=i+1;j<5;j++) {
//				if(a[i]>a[j]) {
//					temp = a[i]; //두개의 값교환 코드
//					a[i] = a[j]; //
//					a[j] = temp; //	 
//				}
//			}
//		}
//		for(int i:a)
//			System.out.print(i + " ");
		
//		int ary[]= {3,2,1,6,5}; 이게버블정렬
//		int temp; //빈공간
//
//		for(int i=0;i<ary.length;i++) { //i=0
//		for(int j=0;j<ary.length-i-1;j++) { //j=0,1,2,3
//		if(ary[j]>ary[j+1]) {
//		temp=ary[j+1];
//		ary[j+1]=ary[j];
//		ary[j]=temp; //두개값 교환 코드
//		}
//		}
//		}
//		for(int i=0;i<5;i++) {
//		System.out.println(ary[i]);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int a,b;
//		try { //예외 발생가능성 있는 출력문
//		System.out.println("입력");
//		a=sc.nextInt();
//		System.out.println("입력");
//		b=sc.nextInt();
//		// b=0 -> java.lang.ArithmeticException: / by zero
//		System.out.println(a/b);
//		}catch(Exception e) { //예외처리문
//			System.out.println(e);
//		}finally {// 예외 상관없이 실행
//			System.out.println("end");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력");
//		int n=0;
//		int sum=0;
//		for(int i=0;i<5;i++) { 
//			try { 
//				n = sc.nextInt(); // i<5 -> 5번입력
//			}catch(Exception e) {
//				System.out.println("정수아님");
//				System.out.println(e);
//				//이대로사용하면 에러 발생시  
//				//남은 for문 반복작동X 직접입력 불가
//				sc.next();//입력스트림에 있는 토큰을 버림
//				i--; // 인덱스증가를 방지하기위해 감소
//				continue; //빠져나오지않고 반복문 실행
//			}
//			sum+=n;
		
		/* 바이트 스트림
		 * 1 입력스트림 inputstream으로 끝남
		 * 2 출력스트림 outputsream으로 끝남
		 * 
		 * 문자스트림
		 * 1 입력 Reader
		 * 2 출력 Writer
		 * 
		 * 파일생성(출력)
		 * 문자단위파일생성( Writer )
		 * 바이트단위파일생성( OutputStream )
		 * 
		 * 주인공(기반스트림), 장식 판단법(보조스트림)
		 * 생성자의 매개변수 안에 inputstream,outputsream,
		 * Reader,Writer 가 필요하면 장식
		 * 필요하지 않으면 주인공
		 * 
		 * 생성된파일에 값 저장
		 * write 메서드
		 * 
		 * 파일 읽어오기
		 * Reader,inputstream
		 * 
		 * 파일닫기
		 * .close()
		 * 
		 * 교재 534~538
		 */
//		char a = 'S';
//		char b = 'W';
//		// a.txt 생성
//		try {
//			FileWriter fw = new FileWriter("a.txt");
//			// FileWriter 단독으로 파일생성 가능
//			fw.write(a);
//			fw.write(b);
//			fw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		방금 저장한 sw 를 읽어오기
//		char arr[] =new char[10];
//		int r;
//		try {
//			FileReader fr = new FileReader("a.txt");
//			//파일에 저장한 문자읽기
//			try {
//				r=fr.read(arr,0,arr.length);
//				for(int i=0;i<arr.length;i++) {
//					System.out.println(arr[i]);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			FileWriter fw= new FileWriter("b.txt");
////			b.txt 파일생성
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("Hi");
//			bw.newLine();//줄바꿈
//			bw.write("today is tuseday");
//			bw.newLine();
//			bw.write("My email address is ~");
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			BufferedReader bf = new BufferedReader(new FileReader("b.txt"));
//			while(true)
//			{		
//				String s;// 한줄을 읽어와서 저장하기위한 s 
//				try { 
//					s = bf.readLine(); 
//					if(s == null) {
//						break;
//					}
//					System.out.println(s);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			try {
//				bf.close();//while 문 밖 종료
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		1
//		Scanner sc = new Scanner(System.in);
//		int a[] = new int [10];
//		for(int i=0;i<a.length;i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%4 == 0) {
//				System.out.println(a[i]);
//			}
//		}

//		2
//		int a=50,b=150;
//		System.out.println(a>b? a*b : a%b);

//		3
//		int i=0;
//		int sum=0;
//		while(i<=100) {
//			if(i%2 == 0 && i%7 == 0) {
//				System.out.println(i);
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);

//		4
//		Scanner sc = new Scanner(System.in);
//		try{
//			int num = sc.nextInt();
//			if(num%2 != 0) {
//				System.out.println("홀수");
//			}
//			else {
//				System.out.println("짝수");
//			}
//		}catch(Exception e) {
//			System.out.println("정수아님");
//			System.out.println(e);
//		}
	
		
		
		
		
	}
	
	/*
	 *  버블정렬
	 *  3 2 1 6 5
	 *  2 3 1 6 5
	 *  2 1 3 6 5
	 *  2 1 3 5 6 -> 1회전
	 *  --------------------
	 *  1 2 3 5 6 -> 2회전 완료
	 */
	
//	static void show(int a[]) {
//		for(int i:a) {
//			System.out.println(i);
//		}
//	}
	

}
