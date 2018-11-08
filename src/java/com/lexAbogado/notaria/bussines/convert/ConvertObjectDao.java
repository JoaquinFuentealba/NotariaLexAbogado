/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.bussines.convert;

import com.lexAbogado.notaria.domain.TramiteNotaria;
import java.util.List;

/**
 *
 * @author Joaquin
 */
public class ConvertObjectDao {
    
    public static TramiteNotaria convertObjectToTramiteNotaria(Object object){
        TramiteNotaria result = new TramiteNotaria();
        Object[] objetos = (Object[]) object;
        result.setIdTramite(String.valueOf( objetos[0]));
        result.setNombreTramite((String) objetos[1]);
        result.setValorTramite(String.valueOf(objetos[3]));
        result.setCategoria((String) objetos[4]);
        return result;
    }
    
}
