package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import model.SkatteProcenter;

public class TestSkatteProcenter {

	@Test
	public void testKommuneSkat() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(24.9));
		
		BigDecimal kommuneSkat = new BigDecimal(24.9);
		
		assertEquals(kommuneSkat, sp.getKommuneSkat());
	}
	
	@Test
	public void testKommuneSkat2() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(23.9));
		
		BigDecimal kommuneSkat = new BigDecimal(23.9);
		
		assertEquals(kommuneSkat, sp.getKommuneSkat());
	}

}
