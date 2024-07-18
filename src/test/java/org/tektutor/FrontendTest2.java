package org.tektutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class FrontendTest2 {
	String actualResponse;
	String expectedResponse;
	Frontend fe;

	@Before
	public void init() {
		fe = new Frontend();	
	}

	@Test
	public void testGetModuleName() throws Exception{
		actualResponse   = fe.getModuleName();
		expectedResponse = "Frontend";

		assertEquals ( expectedResponse, actualResponse );
		Thread.sleep(45 * 1000);
	}

	@After
	public void cleanup() {
		fe = null;	
	}
}
