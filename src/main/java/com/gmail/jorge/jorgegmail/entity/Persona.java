package com.gmail.jorge.jorgegmail.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "persona_apellido1")
	private String apellido1;

	@Column(name = "persona_apellido2")
	private String apellido2;

	@Column(name = "persona_nombre")
	private String nombre;

	@Column(name = "persona_horas_semana")
	private String horasSemana;

	@Column(name = "persona_horas_totales")
	private String horasTotales;

	@Column(name = "persona_media_horas")
	private String mediaHoras;

	@Column(name = "persona_totales_restantes")
	private String horasTotalesRestantes;
	
	@Column(name="persona_dias_trabajados")
	private String diasTrabajados = "0";
	
	@Column(name = "horas_dia")
	private String horasDia;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Horas> horas = new ArrayList<Horas>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getMediaHoras() {
		return mediaHoras;
	}

	public void setMediaHoras(String mediaHoras) {
		this.mediaHoras = mediaHoras;
	}

	public String getHorasTotalesRestantes() {
		return horasTotalesRestantes;
	}

	public void setHorasTotalesRestantes(String horasTotalesRestantes) {
		this.horasTotalesRestantes = horasTotalesRestantes;
	}
	
	public String getDiasTrabajados() {
		return diasTrabajados;
	}

	public void setDiasTrabajados(String diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	public String getHorasDia() {
		return horasDia;
	}

	public void setHorasDia(String horasDia) {
		this.horasDia = horasDia;
	}
	
	public List<Horas> getHoras() {
		return horas;
	}

	public void setHoras(List<Horas> subtipoPuesto) {
		this.horas = subtipoPuesto;
	}

	public Persona() {
		super();
	}

	public Persona(String apellido1, String apellido2, String nombre, String horasSemana, String horasTotales) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
	}

	public Persona(String apellido1, String apellido2, String nombre, String horasSemana, String horasTotales,
			String mediaHoras) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
		this.mediaHoras = mediaHoras;
	}

	public Persona(String apellido1, String apellido2, String nombre, String horasSemana, String horasTotales,
			String mediaHoras, String horasTotalesRestantes) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
		this.mediaHoras = mediaHoras;
		this.horasTotalesRestantes = horasTotalesRestantes;
	}

	public Persona(String apellido1, String apellido2, String nombre, String horasSemana, String horasTotales,
			String mediaHoras, String horasTotalesRestantes, String diasTrabajados) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
		this.mediaHoras = mediaHoras;
		this.horasTotalesRestantes = horasTotalesRestantes;
		this.diasTrabajados = diasTrabajados;
	}

	public Persona(String apellido1, String apellido2, String nombre, String horasSemana, String horasTotales,
			String mediaHoras, String horasTotalesRestantes, String diasTrabajados, String horasDia) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.horasSemana = horasSemana;
		this.horasTotales = horasTotales;
		this.mediaHoras = mediaHoras;
		this.horasTotalesRestantes = horasTotalesRestantes;
		this.diasTrabajados = diasTrabajados;
		this.horasDia = horasDia;
	}
	

}
