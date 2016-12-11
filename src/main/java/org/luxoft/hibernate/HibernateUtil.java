package org.luxoft.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;
import org.luxoft.object.File;
import org.luxoft.object.Line;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try 
		{
			//return new Configuration().configure().buildSessionFactory();
			return new AnnotationConfiguration().
	                   configure().
	                   addAnnotatedClass(File.class).
	                   addAnnotatedClass(Line.class).
	                   buildSessionFactory();
		} 
		catch (Throwable ex) 
		{
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}	
}
