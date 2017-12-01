package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSkat {

	@Test
	public void testLoen1() {
		
		Skat skat = new Skat();
		
		skat.setLoen(10000);
		
		assertArrayEquals(10000, skat.getLoen());
	}
}
