/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.dato.config.NewHibernateUtil;
import com.lexAbogado.notaria.dato.entity.NotariaEstadoTramite;
import com.lexAbogado.notaria.dato.entity.NotariaHistorialTramite;
import com.lexAbogado.notaria.domain.ClientTramiteNotaria;
import java.math.BigDecimal;
import org.hibernate.Query;
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
     public static Object obtenerTramiteAbiertoByRutCliente(int rutCliente, int idTramite ){
        Object result = new NotariaHistorialTramite();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        //Transaction transaction = session.beginTransaction();
        Query query = session.createSQLQuery("SELECT H.ID_CLNT,H.ID_TRMT FROM Notaria_Historial_Tramite H  INNER JOIN NOTARIA_CLIENTE C ON C.ID_CLNT = H.ID_CLNT  INNER JOIN NOTARIA_TRAMITE T ON T.ID_TRMT = H.ID_TRMT  WHERE C.RUT_CLNT = ? AND  T.ID_TRMT = ? AND  H.ID_STD_TRMT = 1");
        query.setBigDecimal(0, new BigDecimal(rutCliente));
        query.setBigDecimal(1, new BigDecimal(idTramite));
        result = query.uniqueResult();
        
        session.close();
        return result;
    }
}
