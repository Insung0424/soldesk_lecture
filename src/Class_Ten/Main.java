package Class_Ten;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Worker {
	private int id;
	private String name;
	private String depart;
	private String address;
	private String bDate;
	
	private Worker() {} 
	
	public Worker(int id, String name, String depart, String address, String bDate) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.address = address;
		this.bDate = bDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Worker> aWork = new ArrayList<>();
		while(true) {
			System.out.println("사원 정보 관리 프로그램");
			System.out.println("1. 사원 정보 입력");
			System.out.println("2. 사원정보 개별 조회");
			System.out.println("3. 프로그램 종료");
			int i = sc.nextInt();
			
			switch (i){
			case 1 :
				System.out.println("새로운 사원 정보를 입력합니다");
				
				System.out.println("사번 :");
				int iNum = sc.nextInt();
				
				System.out.println("이름 : ");
				String name= sc.next();
				
				System.out.println("부서 : ");
				String part = sc.next();
				
				sc.nextLine();
				System.out.println("주소 : ");
				String address = sc.nextLine();
				
				System.out.println("생일 : ");
				String bDate = sc.next();
				
				aWork.add(new Worker(iNum,name,part,address,bDate));
				//사원이 계속 추가될 것을 생각해서 입력받은 값을 변수로 하는 
				//Worker 객체를 ArrayList에 추가한다
				//set을 이용할 경우 기본생성자로 객체를 생성하게되며 
				//생성된 객체마다 객체명을 지정해야 하므로
				//기본생성자는 private로 잠근다
				System.out.println("사원정보가 입력되었다");
				break;
				
			case 2 :
				System.out.println("검색하고자 하는 사원의 사번은? 예) 123(입력)");
				int id = sc.nextInt();
				Iterator<Worker> it = aWork.iterator();
				while(it.hasNext()) {
					Worker num = it.next();
					if(id == num.getId()) {
						System.out.println("이름 : "+num.getName());
						System.out.println("부서 : "+num.getDepart());
						System.out.println("주소 : "+num.getAddress());
						System.out.println("생일 : "+num.getbDate());
					}
					else {
						System.out.println("존재하지 않는사원 입니다");
					}
				}
				break;
				
			case 3 :
				System.out.println("프로그램 종료");
				System.exit(0); //jvm종료
				//return; //함수종료
			}
			
		}
	}

}
