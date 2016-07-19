package com.softpath.ejercicioherencia;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Salario{
	
	@Id @GeneratedValue()
	private int idSalario;
	private String salario;
	@ManyToMany
	private Collection<Profesor> profesor = new ArrayList<Profesor>();
	
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Collection<Profesor> getProfesor() {
		return profesor;
	}
	public void setProfesor(Collection<Profesor> profesor) {
		this.profesor = profesor;
	}
	public int getIdSalario() {
		return idSalario;
	}
	public void setIdSalario(int idSalario) {
		this.idSalario = idSalario;
	}

	

	
	
}
