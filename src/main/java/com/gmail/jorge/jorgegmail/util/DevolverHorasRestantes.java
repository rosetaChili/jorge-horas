package com.gmail.jorge.jorgegmail.util;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.Horas;
import com.gmail.jorge.jorgegmail.entity.Persona;

public class DevolverHorasRestantes {

	private double horasRestantes;

	private HorasTotalesACalcular horasTotalesACalcular;

	public DevolverHorasRestantes() {
		super();
	}

	public double devolverHoras(Persona personas, List<Horas> hora) {
		horasTotalesACalcular = new HorasTotalesACalcular();
		double res = 0;
		double horasCalculadas = 0;

		if (hora != null)
			for (Horas horas : hora) {
				double horasPorDiua = Double.parseDouble(horas.getHorasDia());
				double a = 0;
				horasCalculadas += a + horasPorDiua;
			}

		if (hora != null)
			res = horasTotalesACalcular.metodo(Double.parseDouble(personas.getHorasTotales().toString()),
					horasCalculadas);
		else
			res = horasTotalesACalcular.metodo(Double.parseDouble(personas.getHorasTotales().toString()),
					Double.parseDouble("0"));

		return res;
	}

	public double calcularMediaHoras(String horasxDia) {

		return 0;
	}

	public double getHorasRestantes() {
		return horasRestantes;
	}

	public void setHorasRestantes(double horasRestantes) {
		this.horasRestantes = horasRestantes;
	}

	public HorasTotalesACalcular getHorasTotalesACalcular() {
		return horasTotalesACalcular;
	}

	public void setHorasTotalesACalcular(HorasTotalesACalcular horasTotalesACalcular) {
		this.horasTotalesACalcular = horasTotalesACalcular;
	}

}
