package GradeManagement;

public class Student {
	private int studentId;
	private String name;
	private Subject major;
	
	public Student(int studentId,String name,Subject major) {
		this.studentId=studentId;
		this.name=name;
		this.major=major;	
	}
	
	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public Subject getMajor() {
		return major;
	}

	public void addSubjectScore(Score score) {
		
	}


}
