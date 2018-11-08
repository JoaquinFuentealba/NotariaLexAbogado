package com.lexAbogado.notaria.dato.entity;
// Generated 08-11-2018 0:07:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Convenio generated by hbm2java
 */
@Entity
@Table(name="CONVENIO"
    ,schema="DUOC_USER2"
)
public class Convenio  implements java.io.Serializable {


     private BigDecimal idCnvn;
     private String nombreCnvn;
     private BigDecimal descCnvn;
     private Set historialTramites = new HashSet(0);

    public Convenio() {
    }

	
    public Convenio(BigDecimal idCnvn) {
        this.idCnvn = idCnvn;
    }
    public Convenio(BigDecimal idCnvn, String nombreCnvn, BigDecimal descCnvn, Set historialTramites) {
       this.idCnvn = idCnvn;
       this.nombreCnvn = nombreCnvn;
       this.descCnvn = descCnvn;
       this.historialTramites = historialTramites;
    }
   
     @Id 

    
    @Column(name="ID_CNVN", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdCnvn() {
        return this.idCnvn;
    }
    
    public void setIdCnvn(BigDecimal idCnvn) {
        this.idCnvn = idCnvn;
    }

    
    @Column(name="NOMBRE_CNVN", length=4000)
    public String getNombreCnvn() {
        return this.nombreCnvn;
    }
    
    public void setNombreCnvn(String nombreCnvn) {
        this.nombreCnvn = nombreCnvn;
    }

    
    @Column(name="DESC_CNVN", precision=22, scale=0)
    public BigDecimal getDescCnvn() {
        return this.descCnvn;
    }
    
    public void setDescCnvn(BigDecimal descCnvn) {
        this.descCnvn = descCnvn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="convenio")
    public Set getHistorialTramites() {
        return this.historialTramites;
    }
    
    public void setHistorialTramites(Set historialTramites) {
        this.historialTramites = historialTramites;
    }




}


