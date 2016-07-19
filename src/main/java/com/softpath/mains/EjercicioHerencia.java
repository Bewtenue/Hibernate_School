package com.softpath.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softpath.ejercicioherencia.Alumno;
import com.softpath.ejercicioherencia.Profesor;
import com.softpath.ejercicioherencia.Salario;
import com.softpath.ejercicioherencia.School;

public class EjercicioHerencia {
	public static void main(String[] args) {
		School esc = new School();
		Profesor prof1 = new Profesor();
		Profesor prof2 = new Profesor();
		Alumno al1 = new Alumno();
		Alumno al2 = new Alumno();
		Salario sal = new Salario();
		
		esc.setNombreEscuela("CUCEI");
		prof1.setNombreProfesores("Rafael");
		prof2.setNombreProfesores("Michelle");
		al1.setNombreAlumnos("Jesus");
		al2.setNombreAlumnos("Isabel");
		sal.setSalario("3000");
		
		prof1.getSalario().add(sal);
		prof2.getSalario().add(sal);
		al1.setNombreEscuela("CUCEI");
		al2.setNombreEscuela("CUCEI");
		sal.getProfesor().add(prof1);
		sal.getProfesor().add(prof2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(esc);
		session.save(al1);
		session.save(al2);
		session.save(prof1);
		session.save(prof2);
		session.save(sal);
		session.getTransaction().commit();
		session.close();
	}
}
