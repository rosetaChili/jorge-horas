package com.gmail.jorge.jorgegmail.enums;

public enum RetrasoType {
	
	INTENSO("INTENSO"), ESTILO_TERRA("ESTILO_TERRA"), PORDIOSERO("PORDIOSERO"), NORMAL("NORMAL");
	
	private RetrasoType(String label) {
		this.label = label;
	}
	
	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
