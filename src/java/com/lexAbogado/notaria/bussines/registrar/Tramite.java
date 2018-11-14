/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.bussines.registrar;

import com.lexAbogado.notaria.bussines.convert.MathUtils;
import com.lexAbogado.notaria.dato.controllers.ClientNotariaControllers;
import com.lexAbogado.notaria.dato.controllers.ConvenioControllers;
import com.lexAbogado.notaria.dato.controllers.EstadoControllers;
import com.lexAbogado.notaria.dato.controllers.HistorialTramiteControllers;
import com.lexAbogado.notaria.dato.controllers.ProductNotariaControllers;
import com.lexAbogado.notaria.dato.controllers.TramiteControllers;
import com.lexAbogado.notaria.dato.entity.NotariaCliente;
import com.lexAbogado.notaria.dato.entity.NotariaConvenio;
import com.lexAbogado.notaria.dato.entity.NotariaEstadoTramite;
import com.lexAbogado.notaria.dato.entity.NotariaHistorialTramite;
import com.lexAbogado.notaria.dato.entity.NotariaTramite;
import com.lexAbogado.notaria.domain.ClientTramiteNotaria;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class Tramite {
    
    public static ClientTramiteNotaria registrarTramite(ClientTramiteNotaria clienteTramiteNotaria){
        //consultamos si el clinete existe en nuestro sistema 
        NotariaCliente notariaCliente = new NotariaCliente();
        notariaCliente.setRutClnt(new BigDecimal(clienteTramiteNotaria.getRutCLiente()));
        notariaCliente.setDigitoRutClnt(new BigDecimal(clienteTramiteNotaria.getDigVerficador()));
        notariaCliente = ClientNotariaControllers.searchClientByRut(notariaCliente);
        NotariaHistorialTramite historialTramite = new NotariaHistorialTramite();
        //si el usuario Existe se cre el historial
        if(notariaCliente != null){
            Object obj = HistorialTramiteControllers.obtenerTramiteAbiertoByRutCliente(notariaCliente.getRutClnt().intValue(),Integer.parseInt(clienteTramiteNotaria.getIdTramite()));
            if( obj != null){
                ClientTramiteNotaria error = new ClientTramiteNotaria();
                error.setCodigo(-4);
                error.setMensaje("Cliente con un tramite pendiente");
                return error;
            }
            historialTramite = new NotariaHistorialTramite();
            historialTramite.setNotariaCliente(notariaCliente);
            historialTramite.setNotariaConvenio(ConvenioControllers.obtenerConvenio(new NotariaConvenio(BigDecimal.ONE)));
            historialTramite.setNotariaEstadoTramite(EstadoControllers.obtenerEstado(new NotariaEstadoTramite(BigDecimal.ONE)));
            historialTramite.setNotariaTramite(TramiteControllers.obtenerTramite(new NotariaTramite(new BigDecimal(clienteTramiteNotaria.getIdTramite()),null)));
            historialTramite.setFchCrcnHstrltrmt(new Date());
            HistorialTramiteControllers.registrarHitorialTramiteConvenioLex(historialTramite);
        }
        else{
            notariaCliente = new NotariaCliente();
            historialTramite = new NotariaHistorialTramite();
            notariaCliente.setNombre(clienteTramiteNotaria.getNombre());
            notariaCliente.setApellido(clienteTramiteNotaria.getApellido());
            notariaCliente.setRutClnt(new BigDecimal(clienteTramiteNotaria.getRutCLiente()));
            notariaCliente.setDigitoRutClnt(new BigDecimal(clienteTramiteNotaria.getDigVerficador()));
            ClientNotariaControllers.insertarNewClient(notariaCliente);
            notariaCliente = ClientNotariaControllers.searchClientByRut(notariaCliente);
            historialTramite.setNotariaCliente(notariaCliente);
            historialTramite.setNotariaConvenio(ConvenioControllers.obtenerConvenio(new NotariaConvenio(BigDecimal.ONE)));
            historialTramite.setNotariaEstadoTramite(EstadoControllers.obtenerEstado(new NotariaEstadoTramite(BigDecimal.ONE)));
            historialTramite.setNotariaTramite(TramiteControllers.obtenerTramite(new NotariaTramite(new BigDecimal(clienteTramiteNotaria.getIdTramite()),null)));
            historialTramite.setFchCrcnHstrltrmt(new Date());
            HistorialTramiteControllers.registrarHitorialTramiteConvenioLex(historialTramite);
        }
        clienteTramiteNotaria.setPrecioFinal(String.valueOf(MathUtils.sumarPorcentaje(historialTramite.getNotariaTramite().getNotariaValor().getValorVlr().intValue(),historialTramite.getNotariaConvenio().getDescCnvn().intValue())));
        clienteTramiteNotaria.setIdFolio(String.valueOf(historialTramite.getIdHstrltrmt()));
        clienteTramiteNotaria.setCodigo(0);
        return clienteTramiteNotaria;
    }
    
}
