package juinttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuintTestTest {
    JuintTest juin;
	@Before
	public void setUp() throws Exception {
		juin=new JuintTest();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTriangle() {
		String rel=juin.triangle(1,3,4);
		assertEquals("wrong",rel,"scalene");
		
	}

}
