package com.softpath.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.NamedQuery;
/*
 * existen 3 estrategias para abordar la herencia
 * es la single table donde se unen los atributos de cada uno en una sola tabla
 * la table per class donde hace una tabla con todas las caracteristicas que heredan de la superclase
 * y la joined
 * */
@Entity


@Inheritance(strategy=InheritanceType.JOINED)
public class Empleado {
	@Id @GeneratedValue
	private int idEmpleado;
	private String numEmpleado;
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	
	
}
