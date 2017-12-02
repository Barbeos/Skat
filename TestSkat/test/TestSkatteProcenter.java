package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import model.SkatteProcenter;

public class TestSkatteProcenter {

	@Test
	public void testKommuneSkat() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(24.9), new BigDecimal(1.23), null, null, null);
		
		BigDecimal kommuneSkat = new BigDecimal(24.9);
		
		assertEquals(kommuneSkat, sp.getKommuneSkat());
	}
	
	@Test
	public void testKommuneSkat2() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), null, null, null);
		
		BigDecimal kommuneSkat = new BigDecimal(23.9);
		
		assertEquals(kommuneSkat, sp.getKommuneSkat());
	}
	
	@Test
	public void testAmtSkat() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), null, null, null);
		
		BigDecimal amtSkat = new BigDecimal(1.23);
		
		assertEquals(amtSkat, sp.getAmtSkat());
	}
	
	@Test
	public void testAmtSkat2() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(2.23), null, null, null);
		
		BigDecimal amtSkat = new BigDecimal(2.23);
		
		assertEquals(amtSkat, sp.getAmtSkat());
	}
	
	@Test
	public void testKirkeSkat() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.2), null, null);
		
		BigDecimal kirkeSkat = new BigDecimal(0.2);
		
		assertEquals(kirkeSkat, sp.getKirkeSkat());
	}

	@Test
	public void testKirkeSkat2() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), null, null);
		
		BigDecimal kirkeSkat = new BigDecimal(0.1);
		
		assertEquals(kirkeSkat, sp.getKirkeSkat());
	}
	
	@Test
	public void testSundhedsBidragSkat() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.00), null);
		
		BigDecimal sundhedsBidrag = new BigDecimal(1.00);
		
		assertEquals(sundhedsBidrag, sp.getSundhedsBidrag());
	}
	
	@Test
	public void testSundhedsBidragSkat2() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), null);
		
		BigDecimal sundhedsBidrag = new BigDecimal(1.02);
		
		assertEquals(sundhedsBidrag, sp.getSundhedsBidrag());
	}
	
	@Test
	public void testBundSkat() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), new BigDecimal(9.08));
		
		BigDecimal bundSkat = new BigDecimal(9.08);
		
		assertEquals(bundSkat, sp.getBundSkat());
	}
	
	@Test
	public void testBundSkat2() {
		SkatteProcenter sp = new SkatteProcenter(null, 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), new BigDecimal(9.06));
		
		BigDecimal bundSkat = new BigDecimal(9.06);
		
		assertEquals(bundSkat, sp.getBundSkat());
	}
	
	@Test
	public void testKommuneNavn() {
		SkatteProcenter sp = new SkatteProcenter("Herning", 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), new BigDecimal(9.06));
		
		String kommuneNavn = "Herning";
		
		assertEquals(kommuneNavn, sp.getKommuneNavn());
	}
	
	@Test
	public void testKommuneNavn2() {
		SkatteProcenter sp = new SkatteProcenter("Aalborg", 0, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), new BigDecimal(9.06));
		
		String kommuneNavn = "Aalborg";
		
		assertEquals(kommuneNavn, sp.getKommuneNavn());
	}
	
	@Test
	public void testYear() {
		SkatteProcenter sp = new SkatteProcenter("Aalborg", 1998, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), new BigDecimal(9.06));
		
		int year = 1998;
		
		assertEquals(year, sp.getYear());
	}
	
	@Test
	public void testYear2() {
		SkatteProcenter sp = new SkatteProcenter("Aalborg", 2000, new BigDecimal(23.9), new BigDecimal(1.23), new BigDecimal(0.1), new BigDecimal(1.02), new BigDecimal(9.06));
		
		int year = 2000;
		
		assertEquals(year, sp.getYear());
	}
}