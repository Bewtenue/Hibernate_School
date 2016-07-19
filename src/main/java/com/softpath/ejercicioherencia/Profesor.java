package com.softpath.ejercicioherencia;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Embeddable
public class Profesor{
	
	@Id @GeneratedValue()
	private int idProfesor;
	private String nombreProfesores;
	@ManyToMany(mappedBy="profesor")
	private Collection<Salario> salario = new ArrayList<Salario>();
	
	public String getNombreProfesores() {
		return nombreProfesores;
	}

	public void setNombreProfesores(String nombreProfesores) {
		this.nombreProfesores = nombreProfesores;
	}

	public Collection<Salario> getSalario() {
		return salario;
	}

	public void setSalario(Collection<Salario> salario) {
		this.salario = salario;
	}
	
	
}
