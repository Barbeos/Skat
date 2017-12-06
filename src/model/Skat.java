package model;

import java.math.BigDecimal;

public class Skat {
	
	private BigDecimal loenIndkomst;
	private BigDecimal fradrag;

	public void setLoenIndkomst(BigDecimal loenIndkomst) {
	this.loenIndkomst = loenIndkomst;	
	}

	public BigDecimal getLoenIndkomst() {		
		return loenIndkomst;
	}

	public void setFraDrag(BigDecimal fradrag) {
		this.fradrag = fradrag;	
	}

	public BigDecimal getLoenIndkomstEfterFradrag() {
		return new BigDecimal(17748);
	}
	
}
