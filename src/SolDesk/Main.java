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
			if(year>9999 || month>12 || day>31) {
				System.out.println("#"+i+" -1");
			}
			if(year<1000) {
				sb.append("#"+i+" ");
				sb.append("0"+year);
				if(month == 10 || month == 12) {
					sb.append("/"+month);
					if(day>10) {
						sb.append("/0"+day);
					}
					if(day<=31) {
						sb.append("/"+day);
					}
				}
				else if(month == 11) {
					sb.append("/"+month);
				}
				else if(month == 1 ||month == 3 ||month == 5 ||
						month == 7 ||month == 8) {
					sb.append("/0"+month);
				}
				else if(month == 4 ||month == 6 ||month == 9) {
					sb.append("/0"+month);
				}
				else if(month == 2) {
					sb.append("/0"+month);
				}
			}
			else {
				sb.append("#"+i+" ");
			}
		}
		
	}
 
}