package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> arr = new ArrayList<Person>(5);
	
	Game(){
		arr.add(new Person("Kim",153));
		arr.add(new Person("Lee",324));
		arr.add(new Person("Park",751));
		arr.add(new Person("Jung",468));
	}
	
	public void in() {
		while(true) {
			System.out.println("name :");
			String name = sc.next();
			if(name.equals("stop")) {
				break;
			}
			System.out.println("id :");
			int id = sc.nextInt();
			Person pp = new Person(name,id);
			if(arr.contains(pp)) {
				System.out.println(pp.getName()+
						"은 이미 잇스빈다");
			}
			else{
				arr.add(pp);
			}
		}
	}// ArrayList 에 값을 저장함
	
	public void out() {
		while(true) {
			System.out.println("게임 종료는 -1 입력");
			Random r = new Random();
			int n = r.nextInt(arr.size());// 0~size(5)
			Person p = arr.get(n);
			String str = p.getName();
			
			System.out.println(str+"'s id?");
			int id = p.getId();
			
			Scanner sc = new Scanner(System.in);
			int i=sc.nextInt();
			if(i == -1) {
				break;
			}
			
			if(i == id) {
				System.out.println("pass");
			}
			else {
				System.out.println("Fail");
			}
			
			
		}
		
	}
	
	public void end() {
		System.out.println("End");
		System.exit(0); // 자바프로그램 강제종료
	}
}
