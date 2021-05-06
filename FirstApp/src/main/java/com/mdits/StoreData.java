package com.mdits;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=null;
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
				
				
				try {
					
					sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
					
				}
				
				
				catch(Exception ex){
					
					StandardServiceRegistryBuilder.destroy(registry);
					
					
			
				}
				
				
				Employee e1 = new Employee();
				e1.setId(101);
				e1.setFirstName("NAGA");
				e1.setLastName("CH");
				
				Session session = sessionFactory.openSession();
				
				session.persist(e1);//persisting the object;
				
				session.beginTransaction();
				
				
	}
	

}
