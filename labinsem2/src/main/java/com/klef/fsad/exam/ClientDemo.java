package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo
{

public static void main(String[] args)
{

SessionFactory sf = new Configuration().configure().buildSessionFactory();

Session session = sf.openSession();

Transaction tx = session.beginTransaction();

movie m = new movie();
m.setId(1);
m.setName("RRR");
m.setDate("2022");
m.setStatus("Released");

session.save(m);

tx.commit();

Transaction tx2 = session.beginTransaction();

String hql="update Movie set name=?1, status=?2 where id=?3";

Query<?> q=session.createQuery(hql);
q.setParameter(1,"Salaar");
q.setParameter(2,"Upcoming");
q.setParameter(3,1);

q.executeUpdate();

tx2.commit();

session.close();
sf.close();

}

}