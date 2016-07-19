package com.softpath.entity;

import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;

@Entity
//@NamedNativeQuery(name="Desarrollador.desarrolladoresLike", query ="select * from Empleado,Desarrollador where Empleado.idEmpleado = Desarrollador.idEmpleado and Desarrollador.desarrolladorName like \"?\"",
//resultClass = Desarrollador.class)
//@NamedNativeQuery(name="Desarrollador.desarrolladoresLike", query ="select * from Empleado,Desarrollador where Desarrollador.desarrolladorName like \"?\"",
//resultClass = Desarrollador.class)
//@NamedNativeQuery(name="Desarrollador.ByName", query ="select * from Desarrollador,Empleado where Empleado.idEmpleado = Desarrollador.idEmpleado AND Desarrollador.desarrolladorName = ?",
//resultClass = Desarrollador.class)
@NamedNativeQuery(name="Desarrollador.ByName", query ="select * from Desarrollador",
resultClass = Desarrollador.class)
public class Desarrollador extends Empleado{
	private String desarrolladorName;

	public String getDesarrolladorName() {
		return desarrolladorName;
	}

	public void setDesarrolladorName(String desarrolladorName) {
		this.desarrolladorName = desarrolladorName;
	}
	
	
}
