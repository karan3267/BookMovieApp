package upgrad.movieapp.service.common.entity;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImmutableEntity.class)
public abstract class ImmutableEntity_ {

	public static volatile SingularAttribute<ImmutableEntity, ZonedDateTime> createdAt;
	public static volatile SingularAttribute<ImmutableEntity, String> createdBy;

	public static final String CREATED_AT = "createdAt";
	public static final String CREATED_BY = "createdBy";

}

