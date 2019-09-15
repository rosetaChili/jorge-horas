package com.gmail.jorge.jorgegmail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.gmail.jorge.jorgegmail.enums.RetrasoType;

@Entity
@Table(name = "monigote")
public class Monigote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "grado_retraso")
	private RetrasoType retrasoType;
	
	@Column(name = "nombre")
	private String nombre;

	public Monigote(String apellido) {
		super();
		this.apellido = apellido;
	}
	
	
	
	public Monigote(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
	}



	public Monigote() {
		super();
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RetrasoType getRetrasoType() {
		return retrasoType;
	}

	public void setRetrasoType(RetrasoType retrasoType) {
		this.retrasoType = retrasoType;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
