/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joaquin
 */
@XmlRootElement
public class ClienteNotaria {
    private String nombre;
    private String apellido;
    private String rut;
    private String digVerificador;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDigVerificador() {
        return digVerificador;
    }

    public void setDigVerificador(String digVerificador) {
        this.digVerificador = digVerificador;
    }
    
}
