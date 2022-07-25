package Class_Ten;

public class Profile {
	
	int age;
	String name;
	
	void show() {
		System.out.println(name + " " + age);
	}
	

	public static void main(String[] args) {
		Profile p1 = new Profile();
		p1.age=22;
		p1.name="Tom";
		p1.show();
		
	}
}

