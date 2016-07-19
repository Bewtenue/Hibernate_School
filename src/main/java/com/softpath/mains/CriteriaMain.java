package com.softpath.mains;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.softpath.entity.Pelicula;

public class CriteriaMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Pelicula.class);
		criteria.setMaxResults(4);//solo muestra 4 resultados
		criteria.setFirstResult(4);//apartir del 4 resultado
		
		
		//criteria.add((Restrictions.eq("name", "Harry Potter : 7")))
		criteria
		//.add(Restrictions.gt("idPelicula", 5))
		.add(Restrictions.ge("idPelicula", 2))
		.add(Restrictions.like("name", "%a%"))
		//.add(Restrictions.between("idPelicula", 3, 6))
		//.add(Restrictions.lt("idPelicula", 7))
		.add(Restrictions.le("idPelicula", 7))
		.add(Restrictions.isNull("name"))
		;
		
		Criteria criteria2 = session.createCriteria(Pelicula.class);
		criteria2.add(Restrictions.or(Restrictions.between("idPelicula", 3, 5),
				Restrictions.like("name", "%a%")));
		
		
		
		List<Pelicula>list = (List<Pelicula>) criteria.list();
		session.getTransaction().commit();
		session.close();
		
		for (Pelicula pelicula : list) {
			System.out.println(pelicula.getName());
		}
		
		
	}
}
