package com.softpath.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.NamedQuery;

@Entity
//@NamedQuery(name="Administrador.administradoresLike",query = "from Empleado,Administrador where Empleado.idEmpleado = Administrador.idEmpleado and Administrador.administradorName like \"?\" ")
//@NamedQuery(name="Administrador.administradoresLike",query = "from Empleado,Administrador where Administrador.administradorName like ? ")
//@NamedQuery(name="Administrador.ByName", query = "from Administrador,Empleado where Empleado.idEmpleado = Administrador.idEmpleado AND Administrador.administradorName = ?")
@NamedQuery(name="Administrador.ByName",query = "select administradorName from Administrador")

public class Administrador extends Empleado{
	private String administradorName;

	public String getAdministradorName() {
		return administradorName;
	}

	public void setAdministradorName(String administradorName) {
		this.administradorName = administradorName;
	}
	
	
}
