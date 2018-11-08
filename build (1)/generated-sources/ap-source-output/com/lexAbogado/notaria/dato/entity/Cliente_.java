package com.lexAbogado.notaria.dato.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, BigDecimal> rutClnt;
	public static volatile SetAttribute<Cliente, ?> historialTramites;
	public static volatile SingularAttribute<Cliente, BigDecimal> digitoRutClnt;
	public static volatile SingularAttribute<Cliente, BigDecimal> idClnt;
	public static volatile SingularAttribute<Cliente, String> apellido;
	public static volatile SingularAttribute<Cliente, String> nombre;

}

