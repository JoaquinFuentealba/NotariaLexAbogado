/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.dato.config.NewHibernateUtil;
import com.lexAbogado.notaria.dato.entity.NotariaConvenio;
import com.lexAbogado.notaria.dato.entity.NotariaEstadoTramite;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jfuentealba
 */
public class EstadoControllers {
        public static void insertarNewEstado(NotariaEstadoTramite estado){
        try{
            //NotariaCliente newCliente = new NotariaCliente ();
            //SessionFactory sessionFactory = ;
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(estado);
            transaction.commit();
            session.close();
        }
        catch(Exception e){
            System.out.println("Error en insertar convenio: "+ e.toString());
        }
    }
    
    public static NotariaEstadoTramite obtenerEstado(NotariaEstadoTramite estado){
        try{
            NotariaEstadoTramite result= new NotariaEstadoTramite();
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from NotariaEstadoTramite where ID_STD_TRMT = ?");
            query.setBigDecimal(0, estado.getIdStdTrmt());
            result = (NotariaEstadoTramite) query.uniqueResult();
            return result;
        }catch(Exception e){
            System.out.println("Error en obtener convenio: "+ e.toString());
            return null;
        }
    }
}
