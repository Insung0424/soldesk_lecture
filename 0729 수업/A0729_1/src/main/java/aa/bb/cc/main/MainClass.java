package aa.bb.cc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aa.bb.cc.beans.Test;
import aa.bb.cc.beans.Test2;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aa/bb/cc/config/beans.xml");
		
		Test t1 = ctx.getBean(Test.class);
		t1.m1(77);
		
		Test2 t2 = ctx.getBean("t2",Test2.class);
		System.out.println("-----------");
		t2.m1();
		System.out.println("-----------");
		t1.m1();
		System.out.println("-----------");
		
		aa.bb.cc.beans2.Test t3 = ctx.getBean("t3",aa.bb.cc.beans2.Test.class);
		t3.m1();
		System.out.println("-----------");
		System.out.println(t1.m3());
		
	}
}
