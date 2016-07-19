package com.softpath.hibernateschool;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Escuela {
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idEscuela;
	private String nombreEscuela;
	@OneToMany(mappedBy="escuela")
	private Collection<Profesores> profesores = new ArrayList<Profesores>();
	
	@OneToMany(mappedBy="escuela")
	private Collection<Alumnos> alumnos = new ArrayList<Alumnos>();
	
	@OneToMany(mappedBy="escuela")
	private Collection<Salones> salones = new ArrayList<Salones>();
	
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
	public Collection<Profesores> getProfesores() {
		return profesores;
	}
	public void setProfesores(Collection<Profesores> profesores) {
		this.profesores = profesores;
	}
	public Collection<Alumnos> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Collection<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}
	public Collection<Salones> getSalones() {
		return salones;
	}
	public void setSalones(Collection<Salones> salones) {
		this.salones = salones;
	}
	
	
}
