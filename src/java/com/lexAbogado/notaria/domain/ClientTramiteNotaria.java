/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.domain;

/**
 *
 * @author Joaquin
 */
public class ClientTramiteNotaria extends Control{
    private String rutCLiente;
    private String digVerficador;
    private String nombre;
    private String apellido;
    private String idTramite;
    private String nombreTramite;
    private String estado;
    private String precio;
    private String precioFinal;
    private String idFolio;

    public String getRutCLiente() {
        return rutCLiente;
    }

    public void setRutCLiente(String rutCLiente) {
        this.rutCLiente = rutCLiente;
    }

    public String getDigVerficador() {
        return digVerficador;
    }

    public void setDigVerficador(String digVerficador) {
        this.digVerficador = digVerficador;
    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(String precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getIdFolio() {
        return idFolio;
    }

    public void setIdFolio(String idFolio) {
        this.idFolio = idFolio;
    }
    
}
