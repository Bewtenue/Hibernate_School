package com.softpath.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.NamedQuery;

@SuppressWarnings("deprecation")
@Entity
/*Namedquery es para darle un nombre al query y usarlo donde queramos*/
@NamedQuery(name="Pelicula.byId",query = "from Pelicula where id = ?")
/**/
@NamedNativeQuery(name="Pelicula.byName", query ="select * from Pelicula where name = ?",
resultClass = Pelicula.class)

//sirve para verificar los cambios del objeto antes del update, si no hay cambios, no se hace el update
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class Pelicula {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idPelicula;
	private String name;
	private String genre;
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
