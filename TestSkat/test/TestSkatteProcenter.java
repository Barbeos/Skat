package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSkatteProcenter {

	@Test
	public void KommuneSkat() {
		SkatteProcenter sp = new SkatteProcenter(24.9);
		
		assertEquals(24.9, sp.getKommuneSkat());
	}

}
