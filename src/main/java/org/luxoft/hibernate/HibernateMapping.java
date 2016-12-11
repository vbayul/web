package org.luxoft.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.luxoft.object.File;
import org.luxoft.object.Line;

public class HibernateMapping {

	// метод для получения списка массива файлов
	public List<File> files()
	{
		// получаем сессию
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    // начинаем транзакцию
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<File> result = session.createQuery("from File").list();
		session.getTransaction().commit();// подтвержение транзакции
		return result;	
	}
	
	// метод для получения массима встрок из базы для конкретного файла
	public List<Line> lines(int id)
	{
		// получаем сессию для подключения
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    // начинаем транзакцию
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Line> result = session.createCriteria(Line.class).add(Restrictions.eq("idfile", id)).list();
		session.getTransaction().commit();
		return result;	
	}
}
