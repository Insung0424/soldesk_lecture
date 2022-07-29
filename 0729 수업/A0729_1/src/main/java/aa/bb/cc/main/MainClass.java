package aa.bb.cc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aa.bb.cc.beans.Test;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aa/bb/cc/config/beans.xml");
		
		Test t1 = ctx.getBean(Test.class);
		t1.m1(77);
		
		
	}
}
