/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.bussines.registrar;

import com.lexAbogado.notaria.dato.controllers.ClientNotariaControllers;
import com.lexAbogado.notaria.dato.entity.NotariaCliente;
import com.lexAbogado.notaria.domain.ClientTramiteNotaria;
import java.math.BigDecimal;

/**
 *
 * @author Joaquin
 */
public class Tramite {
    
    public static ClientTramiteNotaria registrarTramite(ClientTramiteNotaria clienteTramiteNotaria){
        //consultamos si el clinete existe en nuestro sistema 
        NotariaCliente notariaCliente = new NotariaCliente();
        notariaCliente.setRutClnt(new BigDecimal(clienteTramiteNotaria.getRutCLiente()));
        notariaCliente = ClientNotariaControllers.searchClientByRut(notariaCliente);
        return null;
    }
    
}
