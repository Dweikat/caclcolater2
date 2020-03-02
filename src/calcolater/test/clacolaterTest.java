package calcolater.test;

import static org.junit.Assert.*;
import calcolater.java.*;

import org.junit.Test;

//import calcolater.clacolater;

public class clacolaterTest {	
	@Test
	public void testMain() {					
	}
	@Test
	public void testAdd() {
		double  a=  clacolater.add(5, 1);
		assertTrue(a==6);				
	}

	@Test
	public void testSub() {
		double  a=  clacolater.sub(5, 1);
		assertTrue(a==4);		
	}

	@Test
	public void testMulti() {
		double  a=  clacolater.multi(5, 1);
		assertTrue(a==5);		
	}

//	@Test
//	public void testDiv() {
//		double  a=  clacolater.div(5, 1);
//		assertTrue(a==5);		
//	}
}
