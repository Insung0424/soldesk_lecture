package SolDesk;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class St implements Serializable{
private String name;
private String major;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	
}

public class Main {
    public static void main(String[] args) throws IOException {
		ObjectInputStream oin = null;
		try {
			oin = new ObjectInputStream(new FileInputStream("ob.txt"));
			St s = (St) oin.readObject();
			System.out.println(s.getName());
			System.out.println(s.getMajor());
			System.out.println(s.getAge());
		}catch(Exception e) {}
		oin.close();
		
	}
 
}