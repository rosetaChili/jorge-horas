package com.gmail.jorge.jorgegmail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "horas")
public class Horas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @NotNull
	@Column(name = "anyo")
	private String anyo;

	@Column(name = "dia")
	private String dia;

	@Column(name = "numero_dia")
	private String numeroDia;

	// @NotNull
	@Column(name = "mes")
	private String mes;

	@Column(name = "hora_del_registro_de_horas")
	private String horaDelRegistroDeHoras;

	// @NotNull
	// @Size(min = 5, max = 30)
	@Column(name = "horas_dia")
	private String horasDia;

	// @NotNull
	@Column(name = "horas_semana")
	private String horasSemana;

	// @NotNull
	@Column(name = "horas_totales")
	private String horasTotales;
	
	@Column(name="horas_dias_trabajados")
	private String diasTrabajados;

	public String getNumeroDia() {
		return numeroDia;
	}

	public void setNumeroDia(String numeroDia) {
		this.numeroDia = numeroDia;
	}

	public String getDia() {
		return dia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHoraDelRegistroDeHoras() {
		return horaDelRegistroDeHoras;
	}

	public void setHoraDelRegistroDeHoras(String horaDelRegistroDeHoras) {
		this.horaDelRegistroDeHoras = horaDelRegistroDeHoras;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getHorasDia() {
		return horasDia;
	}

	public void setHorasDia(String horasDia) {
		this.horasDia = horasDia;
	}

	public String getHorasSemana() {
		return horasSemana;
	}

	public void setHorasSemana(String horasSemana) {
		this.horasSemana = horasSemana;
	}

	public String getHorasTotales() {
		return horasTotales;
	}

	public void setHorasTotales(String horasTotales) {
		this.horasTotales = horasTotales;
	}
	
	public String getDiasTrabajados() {
		return diasTrabajados;
	}

	public void setDiasTrabajados(String diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	public Horas() {
		super();
	}

	public Horas(String horasDia) {
		super();
		this.horasDia = horasDia;
	}

	public Horas(String anyo, String dia, String numeroDia, String mes, String horaDelRegistroDeHoras, String horasDia,
			String horasSemana, String horasTotales) {
		super();
		this.anyo = anyo;
		this.dia = dia;
		this.numeroDia = numeroDia;
		this.mes = mes;
		this.horaDelRegistroDeHoras = horaDelRegistroDeHoras;
		this.horasDia = horasDia;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
	}

	public Horas(String anyo, String mes, String horasDia, String horasSemana, String horasTotales) {
		super();
		this.anyo = anyo;
		this.mes = mes;
		this.horasDia = horasDia;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
	}

	public Horas(String anyo, String dia, String numeroDia, String mes, String horaDelRegistroDeHoras, String horasDia,
			String horasSemana, String horasTotales, String diasTrabajados) {
		super();
		this.anyo = anyo;
		this.dia = dia;
		this.numeroDia = numeroDia;
		this.mes = mes;
		this.horaDelRegistroDeHoras = horaDelRegistroDeHoras;
		this.horasDia = horasDia;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
		this.diasTrabajados = diasTrabajados;
	}
	

}
