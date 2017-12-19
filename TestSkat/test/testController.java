package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import fileimport.SkatteProcenterImportFile;
import logic.Controller;
import model.Skat;
import model.SkatteProcenter;

public class testController {

	@Test
	public void testSkatType() {
		Controller c = new Controller();
		Skat s = new Skat(new BigDecimal(10000), null);
		
		assertEquals(new BigDecimal(300), c.skatType(new BigDecimal(3), s.getLoenIndkomst()));
	}
	
	@Test
	public void testSkatType2() {
		Controller c = new Controller();
		Skat s = new Skat(new BigDecimal(1000), null);
		
		
		assertEquals(new BigDecimal(30), c.skatType(new BigDecimal(3), s.getLoenIndkomst()));
	}
	
	@Test
	public void testSkatter() {
		Controller c = new TestController();
		Skat s = new Skat(new BigDecimal(100000), null);
		//SkatteProcenter sp = new SkatteProcenter("Herning", 2010, new BigDecimal(10), new BigDecimal(5), new BigDecimal(15), new BigDecimal(8), new BigDecimal(6));
		
		BigDecimal[] skatter = {new BigDecimal(10000), new BigDecimal(5000), new BigDecimal(15000), new BigDecimal(8000), new BigDecimal(6000)};
		
		assertArrayEquals(skatter, c.skatter(s.getLoenIndkomst() , "Herning", 2010));
	}
	
	private class TestController extends Controller {
		@Override 
		protected ArrayList<SkatteProcenter> importSkatteProcenter() {
			ArrayList<SkatteProcenter> sps = new ArrayList<SkatteProcenter>();
			SkatteProcenter sp = new SkatteProcenter("Herning", 2010, new BigDecimal(10), new BigDecimal(5), new BigDecimal(15), new BigDecimal(8), new BigDecimal(6));
			sps.add(sp);
			return sps;
		}
	}
	
}
