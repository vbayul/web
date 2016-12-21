package org.luxoft.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.luxoft.object.File;
import org.luxoft.object.Line;

public class HibernateMapping {

	public List<File> files()
	{
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<File> result = session.createQuery("from File").list();
		session.getTransaction().commit();
		return result;	
	}
	
	public List<Line> lines(int id)
	{
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Line> result = session.createCriteria(Line.class).add(Restrictions.eq("idfile", id)).list();
		session.getTransaction().commit();
		return result;	
	}
}
