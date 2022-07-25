package co.jis.sol.main;

import co.jis.sol.beans.HelloJava;
import co.jis.sol.beans.HelloJava2;
import co.jis.sol.beans.HelloJsp2;
import co.jis.sol.beans.helloWorld;

public class MainClass {

	public static void call(HelloJava h) {
		h.hello();
	}
	
	public static void call(helloWorld h) {
		h.hello();
	}
	
	public static void main(String[] args) {
//		HelloJava j = new HelloJava();
//		call(j);
//		HelloJava j1 = new HelloJava();
//		call(j1);
		
		helloWorld java = new HelloJava2();
		call(java);
		java = new HelloJsp2();
		call(java);
	}

}
