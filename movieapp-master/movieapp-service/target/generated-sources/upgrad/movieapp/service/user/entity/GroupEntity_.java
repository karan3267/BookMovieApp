package upgrad.movieapp.service.user.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(GroupEntity.class)
public abstract class GroupEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<GroupEntity, String> name;
	public static volatile SingularAttribute<GroupEntity, String> description;
	public static volatile SingularAttribute<GroupEntity, Integer> id;
	public static volatile SingularAttribute<GroupEntity, Integer> uuid;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String UUID = "uuid";

}

