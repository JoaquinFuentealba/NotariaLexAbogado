/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.dato.config.NewHibernateUtil;
import com.lexAbogado.notaria.dato.entity.NotariaHistorialTramite;
import com.lexAbogado.notaria.domain.ClientTramiteNotaria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jfuentealba
 */
public class HistorialTramiteControllers {
    public static NotariaHistorialTramite registrarHitorialTramiteConvenioLex(NotariaHistorialTramite historialTramite){
      
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(historialTramite);
        transaction.commit();
        session.close();
        return historialTramite;
            
    }
}
