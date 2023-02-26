package upgrad.movieapp.service.common.entity;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MutableEntity.class)
public abstract class MutableEntity_ {

	public static volatile SingularAttribute<MutableEntity, ZonedDateTime> createdAt;
	public static volatile SingularAttribute<MutableEntity, String> createdBy;
	public static volatile SingularAttribute<MutableEntity, ZonedDateTime> modifiedAt;
	public static volatile SingularAttribute<MutableEntity, String> modifiedBy;
	public static volatile SingularAttribute<MutableEntity, Long> version;

	public static final String CREATED_AT = "createdAt";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_AT = "modifiedAt";
	public static final String MODIFIED_BY = "modifiedBy";
	public static final String VERSION = "version";

}

