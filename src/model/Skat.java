package model;

import java.math.BigDecimal;
import java.util.ArrayList;

import fileimport.SkatteProcenterImportFile;

public class Skat {
	
	private BigDecimal loenIndkomst;
	private BigDecimal fradrag;
	private ArrayList<SkatteProcenter> skatteProcenter;

	public Skat(BigDecimal loenIndkomst, ArrayList<SkatteProcenter> skatteProcenter) {
		this.loenIndkomst = loenIndkomst;
		this.skatteProcenter = skatteProcenter;
	}
	
	public void setLoenIndkomst(BigDecimal loenIndkomst) {
	this.loenIndkomst = loenIndkomst;
	
	}

	public BigDecimal getLoenIndkomst() {		
		return loenIndkomst;
	}

	public void setFraDrag(BigDecimal fradrag) {
		this.fradrag = fradrag;	
	}

	public BigDecimal getLoenIndkomstEfterFradrag(BigDecimal loenIndkomst) {
		return loenIndkomst.subtract(this.fradrag);
	}
	
	public ArrayList<SkatteProcenter> getSkatteProcenter(){
		return skatteProcenter;
	}
}
