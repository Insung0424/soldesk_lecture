package aa.bb.cc.beans;

public class Test {
	
	public void m1() {
		System.out.println("m1");
	}
	public void m1(int n1) {
		System.out.println("int n1 "+n1);
	}
	public void m1(int n1,int n2) {
		System.out.println("int, int ");
	}
	public void m1(int n1,String n2) {
		System.out.println("int, String ");
	}
	public void m2() {
		System.out.println("m2");
	}
	public int m3() {
		System.out.println("m3");
		return 10;
	}
	
}
