package com.softpath.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softpath.entity.Pelicula;

public class PeliculaMain {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		/*for(int i = 1; i<10;i++)
		{
			Pelicula pelicula = new Pelicula();
			pelicula.setName("Harry Potter : " + i);
			pelicula.setGenre("Fantasia");
			session.save(pelicula);
		}*/
		
		Pelicula pelicula = (Pelicula)session.get(Pelicula.class, 3);
		//System.out.println(pelicula.getName());
		
		//session.delete(pelicula);
		//pelicula.setName("Rambo");
		//pelicula.setName("Rocky Balboa");
		//session.update(pelicula);//usar el update es opcional
		//hibernate ya sabe cuando y como hacer el update del objeto
		
		session.getTransaction().commit();
		session.close();
		
		pelicula.setName("Los dinosaurios");
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(pelicula);
		session.getTransaction().commit();
		session.close();
		
		
		
	}
}
