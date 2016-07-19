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
public class Profesores {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idProfesores;
	private String nombreProfesor;
	@ManyToOne
	private Escuela escuela;
	@ManyToMany(mappedBy="profesores")
	private Collection<Alumnos> alumnos = new ArrayList<Alumnos>();
	
	public int getIdProfesores() {
		return idProfesores;
	}
	public void setIdProfesores(int idProfesores) {
		this.idProfesores = idProfesores;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public Escuela getEscuela() {
		return escuela;
	}
	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}
	public Collection<Alumnos> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Collection<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
