package calcolater;

import static org.junit.Assert.*;

import org.junit.Test;

public class clacolaterTest {
	
	
	

	@Test
	public void testMain() {
	
		
		
	}

	@Test
	public void testAdd() {
		double  a=  clacolater.sub(5, 1);
		assertTrue(a==4);
		
		
	}

	@Test
	public void testSub() {
		double  a=  clacolater.sub(5, 1);
		assertTrue(a==5);
		
	}

	@Test
	public void testMulti() {
		double  a=  clacolater.multi(5, 1);
		assertTrue(a==5);
		
	}

	@Test
	public void testDiv() {
		double  a=  clacolater.div(5, 1);
		assertTrue(a==5);
		
	}

}
