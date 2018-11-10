/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.bussines.convert;

import com.lexAbogado.notaria.dato.entity.NotariaTramite;
import com.lexAbogado.notaria.domain.TramiteNotaria;
import java.math.BigDecimal;

/**
 *
 * @author Joaquin
 */
public class JpaToDaoUtil {
    
    public static TramiteNotaria convertTramiteToTramiteNotaria(NotariaTramite tramite){
        TramiteNotaria result = new TramiteNotaria();
        result.setIdTramite(String.valueOf(tramite.getIdTrmt()));
        result.setNombreTramite(tramite.getNombreTrmt());
        result.setValorTramite("0");
        result.setDescuentoTramite("0");
        return result;
    }
    
}
