package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tramite.class)
public abstract class Tramite_ {

	public static volatile SetAttribute<Tramite, ?> historialTramites;
	public static volatile SingularAttribute<Tramite, String> nombreTrmt;
	public static volatile SingularAttribute<Tramite, BigDecimal> idTrmt;
	public static volatile SingularAttribute<Tramite, Categoria> categoria;
	public static volatile SingularAttribute<Tramite, Valor> valor;

}

