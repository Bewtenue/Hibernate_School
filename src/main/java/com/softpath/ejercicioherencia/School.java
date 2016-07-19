package com.softpath.ejercicioherencia;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)
public class School {
	@Id @GeneratedValue
	private int idEscuela;
	private String nombreEscuela;
	
	@ElementCollection
	private Set<Profesor> profesores = new HashSet<Profesor>();
	
	public int getIdEscuela() {
		return idEscuela;
	}
	public void setIdEscuela(int idEscuela) {
		this.idEscuela = idEscuela;
	}
	public String getNombreEscuela() {
		return nombreEscuela;
	}
	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}
	public Collection<Profesor> getProfesores() {
		return profesores;
	}
	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	
	
	
}
