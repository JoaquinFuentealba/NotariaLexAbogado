package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NotariaTramite.class)
public abstract class NotariaTramite_ {

	public static volatile SingularAttribute<NotariaTramite, String> nombreTrmt;
	public static volatile SingularAttribute<NotariaTramite, BigDecimal> idTrmt;
	public static volatile SetAttribute<NotariaTramite, ?> notariaHistorialTramites;
	public static volatile SingularAttribute<NotariaTramite, NotariaValor> notariaValor;

}

