package SpringAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import SpringAopJava.AopBiz;
import UnitTestBase.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class SpringAopJunit extends UnitTestBase {

	public SpringAopJunit() {
		super("classpath:Springaop.xml");
	}

	@Test
	public void testSpringAop() {
		AopBiz aop = super.getBean("aopBiz");
		aop.biz();
		
	}
}
