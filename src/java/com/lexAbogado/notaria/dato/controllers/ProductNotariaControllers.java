/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.dato.controllers;

import com.lexAbogado.notaria.bussines.convert.ConvertObjectDao;
import com.lexAbogado.notaria.dato.config.NewHibernateUtil;

import com.lexAbogado.notaria.domain.TramiteNotaria;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;

/**
 *
 * @author Joaquin
 */
public class ProductNotariaControllers {
    
    public static List<TramiteNotaria> getAllProductNotaria (){
        try{
            //List<Tramite> result = new ArrayList<Tramite>();
            
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();


            Query query = session.createSQLQuery("select T.ID_TRMT,T.NOMBRE_TRMT,V.ID_VLR,V.VALOR_VLR,C.NOM_CATEGORIA FROM NOTARIA_TRAMITE   T INNER JOIN NOTARIA_VALOR V ON V.ID_VLR = T.VALOR_ID_VLR INNER JOIN NOTARIA_CATEGORIA C ON T.ID_CTGR = C.ID_CATEGORIA ORDER BY C.NOM_CATEGORIA ASC");
            List<Object> result =  query.list(); 
            transaction.commit();

            session.close();

            
            List<TramiteNotaria> listTramiteNotaria = new ArrayList<TramiteNotaria>();
            for(Object obj: result){
              listTramiteNotaria.add(ConvertObjectDao.convertObjectToTramiteNotaria(obj));
            }
            return listTramiteNotaria;
        }
        catch(HibernateException e){
            return (List<TramiteNotaria>) new Throwable(e); 
        }
            
    }
    @Transactional
     public static TramiteNotaria getIdByProductNotaria (String stringId){
        //List<Tramite> result = new ArrayList<Tramite>();}
       
        Object result = new TramiteNotaria();
         
       
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createSQLQuery("select Tramite.ID_TRMT,Tramite.NOMBRE_TRMT,VALOR.ID_VLR,VALOR.VALOR_VLR FROM Tramite INNER JOIN Valor ON VALOR.ID_TRMT = Tramite.ID_TRMT where Tramite.ID_TRMT =?");
        
        stringId = stringId.replace( "{","");
        stringId = stringId.replace( "}","");
        stringId = stringId.replace( "\"","");
        stringId = stringId.replace( "\n","");
        stringId = stringId.replace( "\t","");
        stringId = stringId.split(":")[1];
        //BigDecimal idBigDecimal= new BigDecimal(stringId);
        result= query.setLong(0,Long.valueOf(stringId)).uniqueResult();
        transaction.commit();
        
        
        session.disconnect();
        session.close();
        NewHibernateUtil.getSessionFactory().close();

        //session.close();
//        TramiteNotaria tramiteNotaria = new TramiteNotaria();
//        TramiteNotaria tr =  ConvertObjectDao.convertObjectToTramiteNotaria(result);
        return ConvertObjectDao.convertObjectToTramiteNotaria(result);
    }
    
}
