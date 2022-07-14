package hund;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class exec {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer stk;
		
		stack st = new stack();
				
		for(int i=0;i<N;i++) {
			String S = br.readLine();
			stk = new StringTokenizer(S);
			String s1 = stk.nextToken();
			
			if(s1.equals("push")) {
				int i1 = Integer.parseInt(stk.nextToken());
				st.push(i1);
				continue;
			}
			
			if(s1.equals("empty")) {
				bw.write(st.isEmpty()+"\n");
			}
			else if(s1.equals("top")) {
				if(st.isEmpty() == 1) {
					bw.write("-1\n");
				}
				else {
					bw.write(st.top()+"\n");
				}
			}
			else if(s1.equals("size")) {
				bw.write(st.size()+"\n");
			}
			else {
				if(st.isEmpty() == 1) {
					bw.write("-1\n");
				}
				else {
					bw.write(st.pop()+"\n");
				}
			}
		}
		bw.flush();
	}
	
}
