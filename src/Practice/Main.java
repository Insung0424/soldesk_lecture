package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(bf.readLine());
		if(a%4==0 && !(a%100==0)) {
			System.out.println(1);
		}
		else if(a%400==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}