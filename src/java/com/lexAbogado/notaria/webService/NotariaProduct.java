/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.webService;

import com.lexAbogado.notaria.bussines.convert.DaoToJpa;
import com.lexAbogado.notaria.bussines.convert.JpaToDaoUtil;
import com.lexAbogado.notaria.bussines.registrar.Tramite;
import com.lexAbogado.notaria.dato.controllers.ClientNotariaControllers;
import com.lexAbogado.notaria.dato.controllers.ProductNotariaControllers;
import com.lexAbogado.notaria.dato.entity.NotariaCliente;
import com.lexAbogado.notaria.dato.entity.NotariaTramite;
import com.lexAbogado.notaria.domain.ClientTramiteNotaria;
import com.lexAbogado.notaria.domain.ClienteNotaria;
import com.lexAbogado.notaria.domain.TramiteNotaria;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import org.hibernate.HibernateException;


/**
 * REST Web Service
 *
 * @author Joaquin
 */
@Path("notariaProduct")
public class NotariaProduct {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of NotariaProduct
     */
    public NotariaProduct() {
    }

    /**
     * Retrieves representation of an instance of com.lexAbogado.notaria.NotariaProduct
     * @param 
     * @return an instance of java.lang.String
     */
    @POST
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("getProductNotaria")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public TramiteNotaria getProductNotaria(String id) {
        System.out.println("1");
        //TODO return proper representation object
        TramiteNotaria tr = new TramiteNotaria();
        tr.setIdTramite(id);
        tr.setNombreTramite("Prueba");
        tr.setValorTramite("1000");
        tr.setValorTramite("funciona");
        return tr;
        //throw new UnsupportedOperationException();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("getAllTramiteNotaria")
    public List<TramiteNotaria> getAllTramiteNotaria() {
        List<TramiteNotaria>  result = new ArrayList<TramiteNotaria>();

        result=ProductNotariaControllers.getAllProductNotaria();
        return result;
        //throw new UnsupportedOperationException();
    }
    
    @POST
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("getIdProductNotaria")
    public TramiteNotaria getIdProductNotaria(String id) {
        TramiteNotaria  result = new TramiteNotaria();
        try{
            //TramiteNotaria  result = new TramiteNotaria();
            result=ProductNotariaControllers.getIdByProductNotaria(id);
            return result;
        }
        catch(NullPointerException e){
            System.out.println("Notaria no encontrada");
            result.setCodigo(-1);
            result.setMensaje("Error" + e);
            return  result;
        }
        catch(HibernateException e){
            System.out.println("Hibernet error:" +e);
            result.setCodigo(-2);
            result.setMensaje("Error: " + e);
            return  result;
        }
        catch(Exception e){
            System.out.println("Error desconocido");
            result.setCodigo(-3);
            result.setMensaje("Error" + e);
            return  result;
        }
        //throw new UnsupportedOperationException();
    }

    @POST
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("RegistrarTremite")
    public ClientTramiteNotaria setRegistrarTramite(ClientTramiteNotaria clienteNotaria){
        ClientTramiteNotaria result = new ClientTramiteNotaria();
        try{
            clienteNotaria = Tramite.registrarTramite(clienteNotaria);
            return result;
        }
        catch(NullPointerException e){
            System.out.println("Notaria no encontrada: "+e.toString());
            result.setCodigo(-1);
            result.setMensaje("Error" + e);
            return  result;
        }
        catch(HibernateException e){
             System.out.println("Hibernet error:" +e.toString());
            result.setCodigo(-2);
            result.setMensaje("Error: " + e);
            return  result;
        }
        catch(Exception e){
            System.out.println("Error desconocido: "+e.toString());
            result.setCodigo(-3);
            result.setMensaje("Error" + e);
            return  result;
        }
        //throw new UnsupportedOperationException()
        
    }
    

}
