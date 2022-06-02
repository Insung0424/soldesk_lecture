package GradeManagement;

public class School {
	private static School instance = new School();

	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	public void addSubject(Subject subject) {
		
	}
	
	public void addStudent(Student student) {
		
	}
	
	
}
