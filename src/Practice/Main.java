package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		int n = N;
		int c=0;
		for(int i=0;i<N;i++) {
			N = ((N%10)*10)+(((N%10)+(N/10))%10);
			c++;
			if(N == n) {
				break;
			}
		}
		System.out.println(c);
		bw.flush();
		bw.close();
		br.close();
		
	}
}