package Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import UnitTestBase.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class ResourceJunit extends UnitTestBase {

	public ResourceJunit() {
		super("classpath:Resource.xml");
	}

	@Test
	public void testResource() {
		ResourceService resourceService = getBean("resourceService");
		resourceService.save();
	}
}
