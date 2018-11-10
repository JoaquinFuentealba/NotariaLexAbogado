package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NotariaCliente.class)
public abstract class NotariaCliente_ {

	public static volatile SingularAttribute<NotariaCliente, BigDecimal> rutClnt;
	public static volatile SingularAttribute<NotariaCliente, BigDecimal> digitoRutClnt;
	public static volatile SingularAttribute<NotariaCliente, BigDecimal> idClnt;
	public static volatile SingularAttribute<NotariaCliente, String> apellido;
	public static volatile SingularAttribute<NotariaCliente, String> nombre;
	public static volatile SetAttribute<NotariaCliente, ?> notariaHistorialTramites;

}

