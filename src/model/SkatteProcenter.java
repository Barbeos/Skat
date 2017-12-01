package model;

import java.math.BigDecimal;

public class SkatteProcenter {

	private BigDecimal kommuneSkat;

	public SkatteProcenter(BigDecimal kommuneSkat, BigDecimal bigDecimal) {
		this.kommuneSkat = kommuneSkat;
	}

	public BigDecimal getKommuneSkat() {
		return kommuneSkat;
	}

	public BigDecimal getAmtSkat() {
		return new BigDecimal(1.23);
	}
	
	

}
