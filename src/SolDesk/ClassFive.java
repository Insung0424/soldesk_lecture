package SolDesk;
import java.util.Scanner;

public class ClassFive {

	public static void main(String[] args) {
//		int sum=0;
//		for(int i=0;i<=100;i++) {
//			if(i%2==1) {
//				continue; //break로 하면 1에서 멈춤 sum=0
		// break 는 반복문을 탈출할때 쓰인다
//			}
//			else {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);//짝수합

//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		double sum=0;
//		int i=0;
//		
//		while((i=sc.nextInt())!=0) {
//			sum+=i;
//			num++;
//		}// 0을 입력받을때까지 입력받은값을 sum에계속더하며 num에 입력횟수를 넣는다
//		System.out.println(num+" "+(sum/num));

//		int i=1;
////		int sum=0;
//		do {
////			sum+=i;
//			System.out.println(i);
//			i++;
//		}while(i<=20);
////		System.out.println(sum);

//		char a='a'; //97
//		do {
//			System.out.println(a);
//			a=(char)(a+1); // 아스키코드상에서 a에게 1을더해주고 케릭터로변환
//		}while(a<='z'); // a~z까지 출력
		
//		배열(array)
//		한번에 많은 메모리 공간 선언 가능
//		같은 타입의 데이터들이 순차적으로 저장됨
//		배열 인덱스는 0부터 시작	
//		int  	ary[]  =  new  int[n];
//		자료형 배열명인덱스 	새로생성 자료형[갯수]
//			배열 선언    =    배열 생성
		
//		int a[] = new int[5];
//		double b[] = new double[10];
//		int c[] = new int[3];
//		char d[]=new char[5];
		
		int a[] = {1,2,3};  //배열초기화  초기화 할 때는 갯수작성X
		System.out.println(a[2]); // 3
		
		float b[]= {0.1f,0.2f,0.3f,0.4f,0.5f};
		System.out.println(b[3]); // 0.4
		
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++) {
			System.out.println(c[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		double arr[] = new double[3];
		for(int i=0;i<=2;i++) {
			arr[i]=sc.nextDouble(); //실수를 3번 입력함
		}
		
	 	
		
		
	}

}
