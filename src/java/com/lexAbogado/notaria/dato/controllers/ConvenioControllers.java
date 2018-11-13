/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.dato.config.NewHibernateUtil;
import com.lexAbogado.notaria.dato.entity.NotariaCliente;
import com.lexAbogado.notaria.dato.entity.NotariaConvenio;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author jfuentealba
 */
public class ConvenioControllers {
    
    public static void insertarNewConvenio(NotariaConvenio convenio){
        try{
            //NotariaCliente newCliente = new NotariaCliente ();
            //SessionFactory sessionFactory = ;
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(convenio);
            transaction.commit();
            session.close();
        }
        catch(Exception e){
            System.out.println("Error en insertar convenio: "+ e.toString());
        }
    }
    
    public static NotariaConvenio obtenerConvenio(NotariaConvenio convenio){
        try{
            NotariaConvenio result= new NotariaConvenio();
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from NotariaConvenio where ID_CNVN = ?");
            query.setBigDecimal(0, convenio.getIdCnvn());
            result = (NotariaConvenio) query.uniqueResult();
            return result;
        }catch(Exception e){
            System.out.println("Error en obtener convenio: "+ e.toString());
            return null;
        }
    }
    
}
