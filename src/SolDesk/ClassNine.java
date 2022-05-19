package SolDesk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassNine {

	public static void main(String[] args) throws IOException {
		
//		int arr[]; //배열 레퍼런스(참조) 변수 선언
//		arr=make();// 배열 리턴
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		5
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				System.out.println("정수 입력:");
//				int A =sc.nextInt();
//				System.out.println("정수 입력:");
//				int B =sc.nextInt();
//				System.out.println("답은: "+(A+B));
//				break;
//			}catch(Exception e) {
//				System.out.println("실수는 안된다");
//				sc.next();
//				continue;//아래코드가없으므로 의미없음
//			}	
//		}
		
//		6
//		Scanner s=new Scanner(System.in);
//		int a=0,b=0;
//		func(a,b);
		
//		7
//		int score[] = {58,60,86,90,84};
//		pr(score,5);

//		8
//		System.out.println(show('$',10));

//		9. “공부는 어렵지만, 재밌네요”라는 문자열을 str에 
//		저장한 후,","를 기준으로 문자열을 구분해보고,
//		인덱스 6에 있는 한 글자를 출력, “공부는” 출력
//		String s = "공부는 어렵지만, 재밌네요";
//		String[] c = s.split(",");
//		System.out.println(s.charAt(6));
//		System.out.println(s.substring(0, 3));
		
		/*
		 *  입출력 스트림
		 *  응용프로그램과 입출력장치를 연결하는 소프트웨어모듈
		 *  입력-입력스트림-자바응용로그램-출력스트림-출력
		 */
		
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt"));
//			bw.write("안녕하세요");
//			bw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			BufferedReader br=new BufferedReader(new FileReader("hi.txt"));
//			String s;
//			while(true) {
//				try {
//					s=br.readLine();
//					if(s==null) {
//						break;
//					}
//					System.out.println(s);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		BufferedReader br=null;//입력하기위한 문자단위 스트림
//		PrintWriter pw=null;//출력하기위한 문자단위 스트림
//		
//		try {
//			InputStreamReader in = new InputStreamReader(System.in);
//			br = new BufferedReader(in);//콘솔에 입력하기위함
//			FileWriter fw = new FileWriter("c.txt");//파일생성
//			pw = new PrintWriter(fw);
//			
//			String str=null;
//			while((str=br.readLine()) != null){
//				pw.println(str);
//			}
//			br.close();//입력 닫음
//			
//		}catch(Exception e) {
//			
//		}finally {
//			pw.close(); //쓰기 닫음
//		}
		/*
		 * 콘솔창에서 ctrl + z 누르면 콘솔창상단상태바에서
		 * 문자열끝이 입력되며 terminated 로 바뀜 
		 */
		
//		FileOutputStream fos = new FileOutputStream("ouput2.txt", true);
//		try(fos) {
//			byte[] bs = new byte[26];
//			byte data = 65;
//			for(int i=0;i<bs.length;i++) {
//				bs[i]=data;
//				data++;
//			}
//			fos.write(bs);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("출력 완료");
		
//		ByteArrayInputStream in = null;
//		FileOutputStream out= null;
//		
//		try {
//			byte[] b=new byte[] {1,2,3};
//			in = new ByteArrayInputStream(b);
//			out = new FileOutputStream("g.dat");
//			
//			int r=-1;
//			while((r=in.read())!=-1) {
//				out.write(r);
//			}
//		}
//		catch(Exception e) {}
//		out.close();
//		in.close();
		
//		FileInputStream in=null;
//		ByteArrayOutputStream out = null;
//		
//		try {
//			in = new FileInputStream("g.dat");
//			// g.dat 를 읽어오는 객체
//			out = new ByteArrayOutputStream();
//			// 바이트배열저장을 위한 객체
//			int r = -1;
//			while((r=in.read()) != -1) {
//				out.write(r);
//			}
//			byte a[]=out.toByteArray();
//			//새로운 바이트배열을 생성
//			for(int i=0;i<a.length;i++) {
//				System.out.println(a[i]);
//			}
//			
//		}
//		catch(Exception e) {}
//		in.close();
//		out.close();
		
		
//		byte[]in= {1,2,3,4,5};
//		byte[]out=null;
//		
//		ByteArrayInputStream bin =null;
//		ByteArrayOutputStream bout = null;
//		
//		try {
//			bin= new ByteArrayInputStream(in);
//			bout= new ByteArrayOutputStream();
//			int r=0;
//			while((r=bin.read()) != -1 ) {
//				bout.write(r);//스트림에 저장
//			}
//			out = bout.toByteArray();
//			//바이트스트림을 바이트배열로 바꿔서 out에저장
////			for(int i=0;i<out.length;i++) {
////				System.out.println(out[i]);
////			}
//			System.out.println(Arrays.toString(in));
//			//toString : 객체를 문자열로 변환해주는 메서드
//			System.out.println();
//			System.out.println(Arrays.toString(out));
//			
//		}catch(Exception e){}
//		bin.close();
//		bout.close();
		
		
//		DataOutputStream dout = null;
//		try {
//			int a=5;
//			double b=1.5;
//			boolean c=true;
//			FileOutputStream fout = new FileOutputStream("h.txt");
//			dout =new DataOutputStream(fout);
//			
//			dout.writeInt(a);
//			dout.writeDouble(b);
//			dout.writeBoolean(c);
//			
//		}catch(Exception e) {}
//		dout.close();
//		
//		DataInputStream din =null;
//		try {
//			FileInputStream fin =new FileInputStream("h.txt");
//			din = new DataInputStream(fin);
//			int a = din.readInt();
//			double b = din.readDouble();
//			boolean c = din.readBoolean();
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
//		}catch(Exception e) {
//			
//		}
//		din.close();
		
//		InputStreamReader in =new InputStreamReader(System.in);
//		
//		FileWriter out = null;
//		try {
//			out = new FileWriter("save.txt");
//			int r;
//			while((r=in.read()) != -1) {
//				out.write(r);
//			}
//		}catch(Exception e) {}
//		in.close();
//		out.close();
		
//		InputStreamReader in =new InputStreamReader(System.in);
//		FileWriter out = null;
//		try {
//			out = new FileWriter("sample.txt");
//			int n;
//			while((n=in.read())!=-1) {
//				out.write(n);
//			}
//		}catch(Exception e) {}
// 		in.close();
// 		out.close();
 		
// 		BufferedReader fr=new BufferedReader(new FileReader("sample.txt"));
// 
// 		try {
// 			String n;
//			while((n=fr.readLine()) != null) {
//				System.out.println(n);
//			}
// 		}catch(Exception e) {}
// 		fr.close();
 		
		
	}
	
//	static void pr(int a[],int b) {
//		for(int i=0;i<a.length;i++) {
//			int s=a[i]/b;
//			for(int j=0;j<s;j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//	}
//	
//	static String show(char c,int a) {
//		String s="";
//		for(int i=0;i<a;i++) {
//			s += c;
//		}
//		return s;
//	}
	
//	(키보드로 입력한 양수를 5로 나누어 몫과 나머지를 변수에 저장하기)
//	static void func(int a,int b) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int i = s.nextInt();
//		a = i/5;
//		b = i%5;
//		System.out.println("몫: "+a+", "+"나머지: "+b);;
//	}
	
//	static int[] make() {
//		int arr[]=new int [4];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i;// 0 1 2 3
//		}
//		return arr;
//	}
}
