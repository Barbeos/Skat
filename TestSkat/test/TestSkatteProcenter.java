package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import model.SkatteProcenter;

public class TestSkatteProcenter {

	@Test
	public void testKommuneSkat() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(24.9), new BigDecimal(1.23), null);
		
		BigDecimal kommuneSkat = new BigDecimal(24.9);
		
		assertEquals(kommuneSkat, sp.getKommuneSkat());
	}
	
	@Test
	public void testKommuneSkat2() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(23.9), new BigDecimal(1.23), null);
		
		BigDecimal kommuneSkat = new BigDecimal(23.9);
		
		assertEquals(kommuneSkat, sp.getKommuneSkat());
	}
	
	@Test
	public void testAmtSkat() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(23.9), new BigDecimal(1.23), null);
		
		BigDecimal amtSkat = new BigDecimal(1.23);
		
		assertEquals(amtSkat, sp.getAmtSkat());
	}
	
	@Test
	public void testAmtSkat2() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(23.9), new BigDecimal(2.23), null);
		
		BigDecimal amtSkat = new BigDecimal(2.23);
		
		assertEquals(amtSkat, sp.getAmtSkat());
	}
	
	@Test
	public void testKirkeSkat() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.2));
		
		BigDecimal kirkeSkat = new BigDecimal(0.2);
		
		assertEquals(kirkeSkat, sp.getKirkeSkat());
	}

	@Test
	public void testKirkeSkat2() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1));
		
		BigDecimal kirkeSkat = new BigDecimal(0.1);
		
		assertEquals(kirkeSkat, sp.getKirkeSkat());
	}
}
