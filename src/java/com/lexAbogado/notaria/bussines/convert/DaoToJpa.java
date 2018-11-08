/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.bussines.convert;

import com.lexAbogado.notaria.dato.entity.Cliente;
import com.lexAbogado.notaria.domain.TramiteNotaria;
import com.lexAbogado.notaria.dato.entity.HistorialTramite;
import com.lexAbogado.notaria.domain.ClienteNotaria;
import java.math.BigDecimal;

/**
 *
 * @author Joaquin
 */
public class DaoToJpa {
    
    public static Cliente convertClienteNotariaToCliente(ClienteNotaria cln){
        Cliente result = new Cliente();
        result.setRutClnt(new BigDecimal(cln.getRut()!=null?cln.getRut():"0"));
        result.setApellido(cln.getApellido() != null?cln.getApellido():"");
        result.setNombre(cln.getNombre()!= null?cln.getNombre():"");
        result.setDigitoRutClnt(new BigDecimal(cln.getDigVerificador()!=null?cln.getDigVerificador():"0"));
        return result;
    }
    
}
