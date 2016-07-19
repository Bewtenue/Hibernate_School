package com.softpath.hibernateschool;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Salones {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idSalones;
	private String nombreSalones;
	@ManyToOne
	private Escuela escuela;
	
	public int getIdSalones() {
		return idSalones;
	}
	public void setIdSalones(int idSalones) {
		this.idSalones = idSalones;
	}
	public String getNombreSalones() {
		return nombreSalones;
	}
	public void setNombreSalones(String nombreSalones) {
		this.nombreSalones = nombreSalones;
	}
	public Escuela getEscuela() {
		return escuela;
	}
	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}
	
	
	
}
