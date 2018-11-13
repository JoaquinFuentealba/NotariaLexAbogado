/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.dato.config.NewHibernateUtil;
import com.lexAbogado.notaria.dato.entity.NotariaEstadoTramite;
import com.lexAbogado.notaria.dato.entity.NotariaTramite;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author jfuentealba
 */
public class TramiteControllers {
    
        public static NotariaTramite obtenerTramite(NotariaTramite tramite){

            NotariaTramite result= new NotariaTramite();
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from NotariaTramite where ID_TRMT = ?");
            query.setBigDecimal(0, tramite.getIdTrmt());
            result = (NotariaTramite) query.uniqueResult();
            return result;

    }
    
}
