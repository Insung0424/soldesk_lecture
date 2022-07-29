package aa.bb.cc.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Ad {

	public void beforeMethod() {
		System.out.println("before");
	}
	public void afterMethod() {
		System.out.println("after");
	}
	public Object aroundmethod(ProceedingJoinPoint p) throws Throwable {
		System.out.println("around1");
		
		Object obj = p.proceed();
		
		System.out.println("around2");
		
		return obj;
	}
	
	public void afterReturningmethod() {
		System.out.println("after Return");
	}
	public void afterthrowingmethod(Throwable e) {
		System.out.println("throw");
		System.out.println(e);
	}
	
}
