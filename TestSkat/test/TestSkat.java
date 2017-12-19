package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import model.Skat;

public class TestSkat {

	@Test
	public void testLoen1() {
		
		Skat skat = new Skat(new BigDecimal(10000), null);
		
		skat.setLoenIndkomst(new BigDecimal(10000));
		
		assertEquals(new BigDecimal(10000), skat.getLoenIndkomst());
	}
	@Test
	public void testLoen2() {
		Skat skat = new Skat(new BigDecimal(20000), null);
		
		skat.setLoenIndkomst(new BigDecimal(20000));
		
		assertEquals(new BigDecimal(20000), skat.getLoenIndkomst());
	}
	
	@Test
	public void testFradrag1() {
		Skat skat = new Skat(new BigDecimal(60000), null);
		
		skat.setFraDrag(new BigDecimal(42252));
		
		assertEquals(new BigDecimal(17748), skat.getLoenIndkomstEfterFradrag(skat.getLoenIndkomst()));
	}
	@Test
	public void testFradrag2() {
		Skat skat = new Skat(new BigDecimal(70000), null);
		
		skat.setFraDrag(new BigDecimal(42252));
		
		assertEquals(new BigDecimal(27748), skat.getLoenIndkomstEfterFradrag(skat.getLoenIndkomst()));
	}
	
	
}
