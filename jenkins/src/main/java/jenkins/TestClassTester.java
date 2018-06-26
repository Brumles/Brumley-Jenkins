package jenkins;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassTester {

	@Test
	public void test() {
		assertEquals("should return true",true,(new TestClass()).test());
	}
}
