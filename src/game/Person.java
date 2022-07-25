package game;

public class Person {
	private String name;
	private int id;
	
	public Person(String name,int id) {
		this.name=name;
		this.id=id;		
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if(this.name == p.getName() && p.getName().equals(this.name)) {
			return false;
		}
		return true;
	}
	
	
}
