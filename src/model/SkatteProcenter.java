package model;

import java.math.BigDecimal;

public class SkatteProcenter {
	private BigDecimal amtSkat;
	private BigDecimal kommuneSkat;

	public SkatteProcenter(BigDecimal kommuneSkat, BigDecimal amtSkat) {
		this.kommuneSkat = kommuneSkat;
		this.amtSkat = amtSkat;
	}

	public BigDecimal getKommuneSkat() {
		return kommuneSkat;
	}

	public BigDecimal getAmtSkat() {
		return amtSkat;
	}
	
	

}
