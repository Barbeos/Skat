package model;

import java.math.BigDecimal;

public class SkatteProcenter {
	private BigDecimal amtSkat;
	private BigDecimal kommuneSkat;
	private BigDecimal kirkeSkat;
	

	public SkatteProcenter(BigDecimal kommuneSkat, BigDecimal amtSkat, BigDecimal kirkeSkat, BigDecimal sundhedsBidrag) {
		this.kommuneSkat = kommuneSkat;
		this.amtSkat = amtSkat;
		this.kirkeSkat = kirkeSkat;
	}

	public BigDecimal getKommuneSkat() {
		return kommuneSkat;
	}

	public BigDecimal getAmtSkat() {
		return amtSkat;
	}

	public BigDecimal getKirkeSkat() {
		return kirkeSkat;
	}

	public BigDecimal getSundhedsBidrag() {
		return new BigDecimal(1.00);
	}
	
	

}
