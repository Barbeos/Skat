package model;

import java.math.BigDecimal;

public class SkatteProcenter {

	private BigDecimal kommuneSkat;

	public SkatteProcenter(BigDecimal kommuneSkat) {
		this.kommuneSkat = kommuneSkat;
	}

	public BigDecimal getKommuneSkat() {
		return kommuneSkat;
	}
	
	

}
