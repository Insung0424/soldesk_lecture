package SolDesk;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			int num = sc.nextInt();
			int year = num/10000;
			int month = (num%10000)/100;
			int day = (num%10000)%100;
			if(year>10000 || month>12 || day>31) {
				System.out.println("#"+i+" -1");
			}
			if(year<1000) {
				sb.append("#"+i+" ");
				sb.append("0"+year);
			}
			else {
				sb.append("#"+i+" ");
			}
		}
		
	}
 
}