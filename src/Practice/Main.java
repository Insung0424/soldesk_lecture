package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//입력을 위한 버퍼리더
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		//버퍼리더에서 읽어온 값에서 공백을 기준으로 나누기위한 StringTokenizer
		int N = Integer.parseInt(st.nextToken());
		//첫번째 기준 n을 만들기 위해 StringTokenizer.nextToken
		int X = Integer.parseInt(st.nextToken());
		//공백기준으로 2번째 , st의 첫번째 입력값 사용 완료
		StringBuilder sb = new StringBuilder();
		//문자열을 조합하기 위한 StringBuilder
		st = new StringTokenizer(bf.readLine());
		// 두번째 입력을 위한 StringTokenizer
		for(int i=0;i<N;i++) {
		// 입력받은 값을 쪼개기 위한 for
			int v = Integer.parseInt(st.nextToken()); //
			// 값을 저장하는게 아니라 비교한후 조건에 맞는 것만 출력을 위해 임시적 저장변수
			if(v<X) {
			// 문제의 조건
				sb.append(v+" ");
				// StringBuilder에서 문자열을 연결시키는 함수
			}
		}
		
		System.out.println(sb);
		//결과물
	}

}
