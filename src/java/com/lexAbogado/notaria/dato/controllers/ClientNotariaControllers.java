/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.dato.config.NewHibernateUtil;
import com.lexAbogado.notaria.dato.entity.NotariaCliente;
import java.sql.SQLException;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Joaquin
 */
public class ClientNotariaControllers {
    public static void insertarNewClient(NotariaCliente cliente){
        try{
            NotariaCliente newCliente = new NotariaCliente ();
            SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(cliente);
            transaction.commit();
            session.close();
            sessionFactory.close();
            
        }catch(HibernateException e){
            System.out.println("Error al insertar Cliente: "+e);
        }
    }
     public static NotariaCliente searchClientByRut(NotariaCliente cliente){
        NotariaCliente newCliente = new NotariaCliente ();
        //try{
            SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Cliente WHERE  RUT_CLNT = ? AND DIGITO_RUT_CLNT =?");
            query.setBigDecimal(0, cliente.getRutClnt());
            query.setBigDecimal(1, cliente.getDigitoRutClnt());
            newCliente = (NotariaCliente) query.uniqueResult();
            transaction.commit();
            session.disconnect();
            session.close();
            sessionFactory.close();
        //}catch(HibernateException e){
          //  System.out.println("Error al buscar Cliente: "+e);
        //}
        return newCliente;
    }
            
}
