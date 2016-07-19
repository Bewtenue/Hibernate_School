package com.softpath.hibernateschool;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Alumnos {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idAlumnos;
	private String nombreAlumnos;
	@ManyToOne
	private Escuela escuela;
	@ManyToMany
	private Collection<Profesores> profesores = new ArrayList<Profesores>();
	
	public int getIdAlumnos() {
		return idAlumnos;
	}
	public void setIdAlumnos(int idAlumnos) {
		this.idAlumnos = idAlumnos;
	}
	public String getNombreAlumnos() {
		return nombreAlumnos;
	}
	public void setNombreAlumnos(String nombreAlumnos) {
		this.nombreAlumnos = nombreAlumnos;
	}
	public Escuela getEscuela() {
		return escuela;
	}
	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}
	public Collection<Profesores> getProfesores() {
		return profesores;
	}
	public void setProfesores(Collection<Profesores> profesores) {
		this.profesores = profesores;
	}
	
	
}
