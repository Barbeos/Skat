package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Skat;

public class TestSkat {

	@Test
	public void testLoen1() {
		
		Skat skat = new Skat();
		
		skat.setLoenIndkomst(10000);
		
		assertEquals(10000, skat.getLoenIndkomst());
	}
	@Test
	public void testLoen2() {
		Skat skat = new Skat();
		
		skat.setLoenIndkomst(20000);
		
		assertEquals(20000, skat.getLoenIndkomst());
	}
	
	
}
