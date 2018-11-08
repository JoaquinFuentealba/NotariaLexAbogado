package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistorialTramite.class)
public abstract class HistorialTramite_ {

	public static volatile SingularAttribute<HistorialTramite, Date> fchCrrHstrltrmt;
	public static volatile SingularAttribute<HistorialTramite, Cliente> cliente;
	public static volatile SingularAttribute<HistorialTramite, Date> fchCrcnHstrltrmt;
	public static volatile SingularAttribute<HistorialTramite, Date> fchJcnHstrltrmt;
	public static volatile SingularAttribute<HistorialTramite, EstadoTramite> estadoTramite;
	public static volatile SingularAttribute<HistorialTramite, Tramite> tramite;
	public static volatile SingularAttribute<HistorialTramite, Convenio> convenio;
	public static volatile SingularAttribute<HistorialTramite, BigDecimal> idHstrltrmt;

}

