package jd.junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class FirstTestClass {
	
	int o;
	
	@Before
	public void testPrep() {
		o = 5;
	}
	
	@Test
	public void FirstTestCase() {
		int x = 2 + 2;
		assertEquals(o, x);
		assertThat(0, equalTo(x));
	}
	
	@Test
	public void FirstTestCase1() {
		int x = 2 + 4;
		assertEquals(o, x);
	}
	
	@After
	public void afterTest() {
		o = 0;
	}
}
