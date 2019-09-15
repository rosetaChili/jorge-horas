package com.gmail.jorge.jorgegmail.entity;

public class BillionairesMonigote {

	private Billionaires billionaires;
	private Monigote monigote;

	public Billionaires getBillionaires() {
		return billionaires;
	}

	public void setBillionaires(Billionaires billionaires) {
		this.billionaires = billionaires;
	}

	public Monigote getMonigote() {
		return monigote;
	}

	public void setMonigote(Monigote monigote) {
		this.monigote = monigote;
	}

	public BillionairesMonigote(Billionaires billionaires, Monigote monigote) {
		super();
		this.billionaires = billionaires;
		this.monigote = monigote;
	}
	
	public BillionairesMonigote(String nombreBilli, String apellidoBilli, String nombreMono, String apellidoMono) {
		super();
		this.billionaires = new Billionaires();
		this.monigote = new Monigote();
		this.billionaires.setFirstName(nombreBilli);
		this.billionaires.setLastName(apellidoBilli);
		this.monigote.setNombre(nombreMono);
		this.monigote.setApellido(apellidoMono);
		
	}
	
	

	public BillionairesMonigote() {
		super();
	}

	@Override
	public String toString() {
		return "BillionairesMonigote [billionaires=" + billionaires + ", monigote=" + monigote + "]";
	}
	
	

}
