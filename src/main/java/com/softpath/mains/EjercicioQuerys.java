package com.softpath.mains;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softpath.entity.Administrador;
import com.softpath.entity.Desarrollador;
import com.softpath.entity.Empleado;

public class EjercicioQuerys {
	public static void main(String[] args) {
		//String id = "5 or 1=1";//esto manda a volar el where y ejecuta el from Pelicula mostrando todos los registros
		//String nomAdmin = "Jose";
		//String nomDesarrollador = "Pepe";
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		Query query = session.getNamedQuery("Administrador.ByName");
		//query.setString(0, nomAdmin);
		Query query2 = session.getNamedQuery("Desarrollador.ByName");
		//query2.setString(0, nomDesarrollador);
		
		
		
		//List<Object> list = (List<Object>)query.list();
		//List<Object> list2 = (List<Object>)query2.list();
		List<String> list = (List<String>)query.list();
		
		
		session.getTransaction().commit();
		session.close();
		
		
		System.out.println("Administradores");
		for (String adm : list) {
			System.out.println(adm);
		}
		
		/*System.out.println("Desarrolladores");
		for (Object des : list2) {
			System.out.println(des);
		}*/
		
		
	}
}
