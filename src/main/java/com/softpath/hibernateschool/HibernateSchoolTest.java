package com.softpath.hibernateschool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSchoolTest {
	public static void main(String[] args) {
		Escuela escuela = new Escuela();
		Profesores prof1 = new Profesores();
		Profesores prof2 = new Profesores();
		Profesores prof3 = new Profesores();
		Alumnos alumn1 = new Alumnos();
		Alumnos alumn2 = new Alumnos();
		Alumnos alumn3 = new Alumnos();
		Salones sal1 = new Salones();
		Salones sal2 = new Salones();
		Salones sal3 = new Salones();
		
		escuela.setNombreEscuela("CUCEI");
		prof1.setNombreProfesor("Michelle");
		prof2.setNombreProfesor("Rafael");
		prof3.setNombreProfesor("Rocio");
		alumn1.setNombreAlumnos("Jesus");
		alumn2.setNombreAlumnos("Alfonso");
		alumn3.setNombreAlumnos("Aldo");
		sal1.setNombreSalones("A1");
		sal2.setNombreSalones("B2");
		sal3.setNombreSalones("C4");
		
		escuela.getProfesores().add(prof1);
		escuela.getProfesores().add(prof2);
		escuela.getProfesores().add(prof3);
		escuela.getAlumnos().add(alumn1);
		escuela.getAlumnos().add(alumn2);
		escuela.getAlumnos().add(alumn3);
		escuela.getSalones().add(sal1);
		escuela.getSalones().add(sal2);
		escuela.getSalones().add(sal3);
		
		prof1.setEscuela(escuela);
		prof2.setEscuela(escuela);
		prof3.setEscuela(escuela);
		prof1.getAlumnos().add(alumn1);
		prof1.getAlumnos().add(alumn2);
		prof2.getAlumnos().add(alumn2);
		prof2.getAlumnos().add(alumn3);
		prof3.getAlumnos().add(alumn1);
		prof3.getAlumnos().add(alumn3);
		
		alumn1.setEscuela(escuela);
		alumn2.setEscuela(escuela);
		alumn3.setEscuela(escuela);
		alumn1.getProfesores().add(prof1);
		alumn1.getProfesores().add(prof3);
		alumn2.getProfesores().add(prof1);
		alumn2.getProfesores().add(prof2);
		alumn3.getProfesores().add(prof2);
		alumn3.getProfesores().add(prof3);
		
		sal1.setEscuela(escuela);
		sal2.setEscuela(escuela);
		sal3.setEscuela(escuela);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(escuela);
		session.save(prof1);
		session.save(prof2);
		session.save(prof3);
		session.save(alumn1);
		session.save(alumn2);
		session.save(alumn3);
		session.save(sal1);
		session.save(sal2);
		session.save(sal3);
		session.getTransaction().commit();
		session.close();
		
	}
}
