package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NotariaValor.class)
public abstract class NotariaValor_ {

	public static volatile SingularAttribute<NotariaValor, BigDecimal> idTrmt;
	public static volatile SingularAttribute<NotariaValor, BigDecimal> idVlr;
	public static volatile SetAttribute<NotariaValor, ?> notariaTramites;
	public static volatile SingularAttribute<NotariaValor, BigDecimal> valorVlr;

}

