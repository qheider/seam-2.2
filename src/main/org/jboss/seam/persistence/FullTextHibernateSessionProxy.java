package org.jboss.seam.persistence;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.type.Type;

/**
 * Wraps a Hibernate Search session
 * 
 * @author Gavin King
 *
 */
@SuppressWarnings("deprecation")
public class FullTextHibernateSessionProxy extends HibernateSessionProxy implements FullTextSession
{
   private FullTextSession fullTextSession;
   
   public FullTextHibernateSessionProxy(FullTextSession fullTextSession)
   {
      super(fullTextSession);
      this.fullTextSession = fullTextSession;
   }

   public void index(Object arg0)
   {
      fullTextSession.index(arg0);
   }

   public FullTextQuery createFullTextQuery(org.apache.lucene.search.Query arg0, Class... arg1)
   {
      return fullTextSession.createFullTextQuery(arg0, arg1);
   }

   public Query createSQLQuery(String arg0, String arg1, Class arg2)
   {
      return fullTextSession.createSQLQuery(arg0, arg1, arg2);
   }

   public Query createSQLQuery(String arg0, String[] arg1, Class[] arg2)
   {
      return fullTextSession.createSQLQuery(arg0, arg1, arg2);
   }

   public int delete(String arg0, Object arg1, Type arg2) throws HibernateException
   {
      return fullTextSession.delete(arg0, arg1, arg2);
   }

   public int delete(String arg0, Object[] arg1, Type[] arg2) throws HibernateException
   {
      return fullTextSession.delete(arg0, arg1, arg2);
   }

   public int delete(String arg0) throws HibernateException
   {
      return fullTextSession.delete(arg0);
   }

   public Collection filter(Object arg0, String arg1, Object arg2, Type arg3) throws HibernateException
   {
      return fullTextSession.filter(arg0, arg1, arg2, arg3);
   }

   public Collection filter(Object arg0, String arg1, Object[] arg2, Type[] arg3) throws HibernateException
   {
      return fullTextSession.filter(arg0, arg1, arg2, arg3);
   }

   public Collection filter(Object arg0, String arg1) throws HibernateException
   {
      return fullTextSession.filter(arg0, arg1);
   }

   public List find(String arg0, Object arg1, Type arg2) throws HibernateException
   {
      return fullTextSession.find(arg0, arg1, arg2);
   }

   public List find(String arg0, Object[] arg1, Type[] arg2) throws HibernateException
   {
      return fullTextSession.find(arg0, arg1, arg2);
   }

   public List find(String arg0) throws HibernateException
   {
      return fullTextSession.find(arg0);
   }


   public SearchFactory getSearchFactory()
   {
      return fullTextSession.getSearchFactory();
   }

   public void purge(Class aClass, Serializable serializable)
   {
      fullTextSession.purge(aClass, serializable);
   }

   public void purgeAll(Class aClass)
   {
      fullTextSession.purgeAll(aClass);
   }

   public Iterator iterate(String arg0, Object arg1, Type arg2) throws HibernateException
   {
      return fullTextSession.iterate(arg0, arg1, arg2);
   }

   public Iterator iterate(String arg0, Object[] arg1, Type[] arg2) throws HibernateException
   {
      return fullTextSession.iterate(arg0, arg1, arg2);
   }

   public Iterator iterate(String arg0) throws HibernateException
   {
      return fullTextSession.iterate(arg0);
   }

   public void save(Object arg0, Serializable arg1) throws HibernateException
   {
      fullTextSession.save(arg0, arg1);
   }

   public void save(String arg0, Object arg1, Serializable arg2) throws HibernateException
   {
      fullTextSession.save(arg0, arg1, arg2);
   }

   public Object saveOrUpdateCopy(Object arg0, Serializable arg1) throws HibernateException
   {
      return fullTextSession.saveOrUpdateCopy(arg0, arg1);
   }

   public Object saveOrUpdateCopy(Object arg0) throws HibernateException
   {
      return fullTextSession.saveOrUpdateCopy(arg0);
   }

   public Object saveOrUpdateCopy(String arg0, Object arg1, Serializable arg2) throws HibernateException
   {
      return fullTextSession.saveOrUpdateCopy(arg0, arg1, arg2);
   }

   public Object saveOrUpdateCopy(String arg0, Object arg1) throws HibernateException
   {
      return fullTextSession.saveOrUpdateCopy(arg0, arg1);
   }

   public void update(Object arg0, Serializable arg1) throws HibernateException
   {
      fullTextSession.update(arg0, arg1);
   }

   public void update(String arg0, Object arg1, Serializable arg2) throws HibernateException
   {
      fullTextSession.update(arg0, arg1, arg2);
   }
   
}
