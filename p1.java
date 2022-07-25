package practice;

public class p1 {

	public static void main(String[] args) {
//		for(int i = 1;i<=5;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" : "+i);
//		} 
		
//		for(int i = 5;i>=1;i--) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" : "+i);
//		} 
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" i:"+i);
//		} 
		// 지금까지 이해한 for문은 조건부가 횟수와 갯수를 결정함
		// 조건부에서 횟수를 유지하는것뿐아니라 줄이고 늘릴 수 있음
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j)
//				System.out.println(" ");
//			for(int j=0)
//				System.out.println("*");
//				
//		}
		
		for(int i=0;i<5;i++) {
			if(i<3) {
				for(int j=0;j<3-i;i++) {
					System.out.println(" ");
				}
				for(int j=0;j<i*2+1;j++) {
					System.out.println();
				}
			}
			else {
				for(int j=0;j<i-2;i++) {
					System.out.println(" ");
				}
				for(int j=9;j>=i*2+1;j--) {
					System.out.println("*");
				}
			}
			System.out.println(" ");
		}
		
	}

}
