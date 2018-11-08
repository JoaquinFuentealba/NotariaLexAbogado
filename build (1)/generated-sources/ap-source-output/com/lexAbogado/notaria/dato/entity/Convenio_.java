package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Convenio.class)
public abstract class Convenio_ {

	public static volatile SingularAttribute<Convenio, BigDecimal> idCnvn;
	public static volatile SetAttribute<Convenio, ?> historialTramites;
	public static volatile SingularAttribute<Convenio, String> nombreCnvn;
	public static volatile SingularAttribute<Convenio, BigDecimal> descCnvn;

}

