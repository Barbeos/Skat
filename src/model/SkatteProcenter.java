package model;

import java.math.BigDecimal;

public class SkatteProcenter {
	private BigDecimal amtSkat;
	private BigDecimal kommuneSkat;
	private BigDecimal kirkeSkat;
	private BigDecimal sundhedsBidrag;
	private BigDecimal bundSkat;
	private String kommuneNavn;
	private int year;
	

	public SkatteProcenter(String kommuneNavn, int year, BigDecimal kommuneSkat, BigDecimal amtSkat, BigDecimal kirkeSkat, BigDecimal sundhedsBidrag, BigDecimal bundSkat) {
		this.kommuneSkat = kommuneSkat;
		this.amtSkat = amtSkat;
		this.kirkeSkat = kirkeSkat;
		this.sundhedsBidrag = sundhedsBidrag;
		this.bundSkat = bundSkat;
		this.kommuneNavn = kommuneNavn;
		this.year = year;
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
		return sundhedsBidrag;
	}

	public BigDecimal getBundSkat() {
		return bundSkat;
	}

	public String getKommuneNavn() {
		return kommuneNavn;
	}

	public int getYear() {
		return year;
	}
}