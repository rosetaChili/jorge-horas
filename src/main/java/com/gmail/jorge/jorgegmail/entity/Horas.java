package com.gmail.jorge.jorgegmail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Column(name = "horas_dia")
	private String horasDia;

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

	public Horas() {
		super();
	}

	public Horas(String horasDia) {
		super();
		this.horasDia = horasDia;
	}

	public Horas(String anyo, String dia, String numeroDia, String mes, String horaDelRegistroDeHoras,
			String horasDia) {
		super();
		this.anyo = anyo;
		this.dia = dia;
		this.numeroDia = numeroDia;
		this.mes = mes;
		this.horaDelRegistroDeHoras = horaDelRegistroDeHoras;
		this.horasDia = horasDia;
	}

	public Horas(String anyo, String mes, String horasDia) {
		super();
		this.anyo = anyo;
		this.mes = mes;
		this.horasDia = horasDia;
	}
}
