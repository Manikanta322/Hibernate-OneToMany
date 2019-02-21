package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory()
	{
		if(factory==null) {
	ServiceRegistry reg= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	
	Metadata metadata= new MetadataSources(reg).getMetadataBuilder().build();
	
	factory=metadata.getSessionFactoryBuilder().build();
	}
	 return factory;	
	}
public static void getClose()
{
	factory.close();
}
}
