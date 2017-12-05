package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import logic.Controller;
import model.Skat;

public class testController {

	@Test
	public void testAmtSkat() {
		Controller c = new Controller();
		Skat s = new Skat();
		
		s.setLoenIndkomst(new BigDecimal(10000));
		
		assertEquals(new BigDecimal(300), c.amtSkat(new BigDecimal(3), s.getLoenIndkomst()));
	}
	
	@Test
	public void testAmtSkat2() {
		Controller c = new Controller();
		Skat s = new Skat();
		
		s.setLoenIndkomst(new BigDecimal(1000));
		
		assertEquals(new BigDecimal(30), c.amtSkat(new BigDecimal(3), s.getLoenIndkomst()));
	}

}
