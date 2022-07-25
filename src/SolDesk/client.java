package SolDesk;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class client {

	public static void main(String[] args) {
//		Socket so;
//		try {
//			so = new Socket();
//			System.out.println("연결 요청");
//			
//			so.connect(new InetSocketAddress("localhost",8080));
//			System.out.println("연결 성공");
//			
//			byte[] b =null;
//			String msg = null;
//			
//			OutputStream out = so.getOutputStream();
//			msg = "Hi Server";
//			b = msg.getBytes("UTF-8");
//			//문자열을 바이트로 변경해서 전송하겠다
//			
//			out.write(b);
//			System.out.println("데이터 보내기 성공");
//			
//			InputStream in = so.getInputStream();
//			b = new byte[100];
//			int r = in.read(b);
//			//메세지 바이트배열을 읽는다
//			msg = new String(b,0,r,"UTF-8");
//			//바이트 배열을 문자로 바꾸는 작업
//			System.out.println("데이터 받기 성공");
//			
//			in.close();
//			out.close();
//			so.close();
//			
//		}catch(Exception e) {}
	}

}
