package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NotariaConvenio.class)
public abstract class NotariaConvenio_ {

	public static volatile SingularAttribute<NotariaConvenio, BigDecimal> idCnvn;
	public static volatile SingularAttribute<NotariaConvenio, String> nombreCnvn;
	public static volatile SetAttribute<NotariaConvenio, ?> notariaHistorialTramites;
	public static volatile SingularAttribute<NotariaConvenio, BigDecimal> descCnvn;

}

