package com.gmail.jorge.jorgegmail.util;

public class HorasTotalesACalcular {

	private double horasRestantes;

	public HorasTotalesACalcular(double horasTotales) {
		this.horasRestantes = horasTotales;
	}

	public HorasTotalesACalcular() {
		super();
	}

	public HorasTotalesACalcular(double horasTotales, double horasRealizadas) {
		this.horasRestantes = metodo(horasTotales, horasRealizadas);
	}

	public double metodo(double horasTotales, double horasRealizadas) {
		return horasTotales - horasRealizadas;
	}

	public double getHorasRestantes() {
		return horasRestantes;
	}

	public void setHorasRestantes(double horasRestantes) {
		this.horasRestantes = horasRestantes;
	}

}
