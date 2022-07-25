package game;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1 : 목록추가");
			System.out.println("2 : 게임시작");
			System.out.println("3 : 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}
	}

}
