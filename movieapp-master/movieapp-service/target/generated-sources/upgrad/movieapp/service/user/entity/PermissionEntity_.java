package upgrad.movieapp.service.user.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PermissionEntity.class)
public abstract class PermissionEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<PermissionEntity, String> name;
	public static volatile SingularAttribute<PermissionEntity, String> description;
	public static volatile SingularAttribute<PermissionEntity, Integer> id;
	public static volatile SingularAttribute<PermissionEntity, Integer> uuid;
	public static volatile SingularAttribute<PermissionEntity, GroupEntity> group;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String UUID = "uuid";
	public static final String GROUP = "group";

}

