/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.bussines.convert;

/**
 *
 * @author Joaquin
 */
public class MathUtils {
    public static int sumarPorcentaje(int valor,int porcentaje){
        int valorFinal = ((valor/100)*porcentaje)+valor;
        return valorFinal;
    }
}
