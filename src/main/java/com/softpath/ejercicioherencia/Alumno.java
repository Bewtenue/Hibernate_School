package com.softpath.ejercicioherencia;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

public class Alumno extends School{
	private String nombreAlumnos;
	
	public String getNombreAlumnos() {
		return nombreAlumnos;
	}

	public void setNombreAlumnos(String nombreAlumnos) {
		this.nombreAlumnos = nombreAlumnos;
	}
	
	
}
