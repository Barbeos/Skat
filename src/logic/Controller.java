package logic;

import java.math.BigDecimal;
import java.util.ArrayList;

import fileimport.SkatteProcenterImportFile;
import model.Skat;
import model.SkatteProcenter;

public class Controller {

	public BigDecimal skatType(BigDecimal SkatType, BigDecimal loen) {
		return loen.divide(new BigDecimal(100)).multiply(SkatType);
	}

	public BigDecimal[] skatter(BigDecimal loen, String kommuneNavn, int aarsTal) {
		BigDecimal[] skatter = new BigDecimal[5];
		
		Skat skat = new Skat(new BigDecimal(10000), importSkatteProcenter());
		
		
		for (SkatteProcenter s : skat.getSkatteProcenter()) {
			if (s.getKommuneNavn().equals(kommuneNavn) && s.getYear() == aarsTal) {
				skatter[0] = skatType(s.getKommuneSkat(), loen);
				skatter[1] = skatType(s.getAmtSkat(), loen);
				skatter[2] = skatType(s.getKirkeSkat(), loen);
				skatter[3] = skatType(s.getSundhedsBidrag(), loen);
				skatter[4] = skatType(s.getBundSkat(), loen);
			}
		}
		return skatter;
	}
	
	protected ArrayList<SkatteProcenter> importSkatteProcenter() {
		return SkatteProcenterImportFile.cSVReader();
	}

}
