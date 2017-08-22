package SpringAopJava;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopBefore {
	public void before() {
		System.out.println("before");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning");
	}
	
	public void after() {
		System.out.println("after");
	}
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("around before");
			obj = pjp.proceed();
			System.out.println("around after");
		} catch (Throwable e) {
			
		}
		
		return obj;
	}
}
