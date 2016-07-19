package com.softpath.mains;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;

import com.softpath.entity.Pelicula;

public class HQLMain {
	public static void main(String[] args) {
		
		//tener cuidado con las SQL inyections
		//String id = "5 or 1=1";//esto manda a volar el where y ejecuta el from Pelicula mostrando todos los registros
		String id = "5";
		String name = "Harry Potter : 7";
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		//NAMED QUERY
		//Query query = session.getNamedQuery("Pelicula.byId");
		//query.setInteger(0, Integer.parseInt(id));
		
		//NAMED NATIVE QUERY
		//esta diseñado para que sea usado con SQL y no HQL por eso se especifica el nombre de la clase
		Query query = session.getNamedQuery("Pelicula.byName");
		query.setString(0, name);
		
		
		//OTRA MANERA PARA EVITAR SQL INYECTION
		//los : en el query significa que es una variable
		//Query query = session.createQuery("from Pelicula where id > :peliculaID and name = :userName");
		//query.setInteger("peliculaID", Integer.parseInt(id));
		//query.setString("userName", name);
		
		//en HQL se extrae apartir del nombre de la clase y no del nombre de la tabla
		//Query query = session.createQuery("from Pelicula");
		//Query query = session.createQuery("select name from Pelicula");//se selecciona un elemento particular
		//Query query = session.createQuery("from Pelicula where id > "+ id);
		
		//MANERA PARA EVITAR SQL INYECTION
		//Query query = session.createQuery("from Pelicula where id > ? and name = ?");
		//query.setInteger(0, Integer.parseInt(id));//con esto evitamos la inyeccion de datos
		//query.setString(1, name);//esto tambien, pero para String
		
		
		//query tambien ofrece mecanismos de paginacion
		//query.setFirstResult(5);//te regresa a partir del resultado 5
		//query.setMaxResults(3);//regresa los siguientes 3
		
		List<Pelicula> list = (List<Pelicula>)query.list();
		//List<String> list = (List<String>)query.list();
		session.getTransaction().commit();
		session.close();
		System.out.println(list.size());
		
		//aqui se ejecuta el query donde se obtiene un objeto
		for (Pelicula pelicula : list) {
			System.out.println(pelicula.getName());
		}
		//se ejecuta el query donde se obtiene un String
		/*for (String pelicula : list) {
			System.out.println(pelicula);
		}*/
	}
}
