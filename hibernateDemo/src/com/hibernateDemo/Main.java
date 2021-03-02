package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//Unit of Work tasarým deseni
			session.beginTransaction();
			
			//CRUD => Create Read Update Delete
			
			//HQL => Hibernate query language
//			//SELECT
			List<City> cities = session.createQuery("from City").getResultList();
//			
//			for(City city: cities) {
//				System.out.println(city.getName());
//			}
			
			//INSERT
//			City city = new City();
//			city.setName("Denizli");
//			city.setCountryCode("TUR");
//			city.setDistrict("Pamukkale");
//			city.setPopulation(789512);
//			
//			session.save(city);
//			System.out.println(session.createQuery("Select c.district from City c where c.name='Denizli'").getResultList());
			
			//UPDATE
//			City city = session.get(City.class, 4093);
//			System.out.println(city.getDistrict());
//			
//			city.setPopulation(111111);
//			session.save(city);
			
			//DELETE
			City city = session.get(City.class, 4093);
			session.delete(city);
			
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}

	}

}
