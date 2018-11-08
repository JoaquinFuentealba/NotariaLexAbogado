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
public class TramiteNotaria extends Control{
    
    private String idTramite;
    private String nombreTramite;
    private String valorTramite;
    private String descuentoTramite;
    private String categoria;
    private String convenioId;
    private String descuento;

    public String getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(String idTramite) {
        this.idTramite = idTramite;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public String getValorTramite() {
        return valorTramite;
    }

    public void setValorTramite(String valorTramite) {
        this.valorTramite = valorTramite;
    }

    public String getDescuentoTramite() {
        return descuentoTramite;
    }

    public void setDescuentoTramite(String descuentoTramite) {
        this.descuentoTramite = descuentoTramite;
    }

    public void setDescuentoTramite(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getConvenioId() {
        return convenioId;
    }

    public void setConvenioId(String convenioId) {
        this.convenioId = convenioId;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    
    
    
}
