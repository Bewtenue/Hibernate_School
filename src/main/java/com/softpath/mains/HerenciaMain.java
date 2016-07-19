package com.softpath.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softpath.entity.Administrador;
import com.softpath.entity.Desarrollador;
import com.softpath.entity.Empleado;



public class HerenciaMain {
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		empleado.setNumEmpleado("001");
		
		Administrador admin = new Administrador();
		admin.setNumEmpleado("002");
		admin.setAdministradorName("Rodrigo");		
		Administrador admin2 = new Administrador();
		admin2.setNumEmpleado("004");
		admin2.setAdministradorName("Rafael");	
		Administrador admin3 = new Administrador();
		admin3.setNumEmpleado("005");
		admin3.setAdministradorName("Ignacio");	
		Administrador admin4 = new Administrador();
		admin4.setNumEmpleado("006");
		admin4.setAdministradorName("Jose");	
		
		Desarrollador des = new Desarrollador();
		des.setNumEmpleado("003");
		des.setDesarrolladorName("Pepe");
		Desarrollador des2 = new Desarrollador();
		des2.setNumEmpleado("007");
		des2.setDesarrolladorName("Ricardo");
		Desarrollador des3 = new Desarrollador();
		des3.setNumEmpleado("008");
		des3.setDesarrolladorName("Emigdio");
		Desarrollador des4 = new Desarrollador();
		des4.setNumEmpleado("009");
		des4.setDesarrolladorName("Misael");
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		/*session.save(empleado);
		session.save(admin);
		session.save(admin2);
		session.save(admin3);
		session.save(admin4);
		session.save(des);
		session.save(des2);
		session.save(des3);
		session.save(des4);*/
		session.getTransaction().commit();
		session.close();
		
		
	}
}
