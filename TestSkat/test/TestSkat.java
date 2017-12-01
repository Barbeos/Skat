package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Skat;

public class TestSkat {

	@Test
	public void testLoen1() {
		
		Skat skat = new Skat();
		
		skat.setLoen(10000);
		
		assertEquals(10000, skat.getLoen());
	}
	@Test
	public void testLoen2() {
		Skat skat = new Skat();
		
		skat.setLoen(20000);
		
		assertEquals(20000, skat.getLoen());
	}
	
	
}
