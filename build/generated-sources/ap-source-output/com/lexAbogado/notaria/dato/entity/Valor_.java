package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Valor.class)
public abstract class Valor_ {

	public static volatile SingularAttribute<Valor, BigDecimal> idTrmt;
	public static volatile SetAttribute<Valor, ?> tramites;
	public static volatile SingularAttribute<Valor, BigDecimal> idVlr;
	public static volatile SingularAttribute<Valor, BigDecimal> valorVlr;

}

