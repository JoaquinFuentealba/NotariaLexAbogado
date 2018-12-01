package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NotariaHistorialTramite.class)
public abstract class NotariaHistorialTramite_ {

	public static volatile SingularAttribute<NotariaHistorialTramite, Date> fchCrrHstrltrmt;
	public static volatile SingularAttribute<NotariaHistorialTramite, NotariaCliente> notariaCliente;
	public static volatile SingularAttribute<NotariaHistorialTramite, Date> fchCrcnHstrltrmt;
	public static volatile SingularAttribute<NotariaHistorialTramite, Date> fchJcnHstrltrmt;
	public static volatile SingularAttribute<NotariaHistorialTramite, NotariaEstadoTramite> notariaEstadoTramite;
	public static volatile SingularAttribute<NotariaHistorialTramite, NotariaConvenio> notariaConvenio;
	public static volatile SingularAttribute<NotariaHistorialTramite, BigDecimal> idHstrltrmt;
	public static volatile SingularAttribute<NotariaHistorialTramite, NotariaTramite> notariaTramite;

}

