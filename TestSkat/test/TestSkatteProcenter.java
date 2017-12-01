package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import model.SkatteProcenter;

public class TestSkatteProcenter {

	@Test
	public void KommuneSkat() {
		SkatteProcenter sp = new SkatteProcenter(new BigDecimal(24.9));
		
		assertEquals(24.9, sp.getKommuneSkat());
	}

}
