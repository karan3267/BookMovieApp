package upgrad.movieapp.service.user.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RoleEntity.class)
public abstract class RoleEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile ListAttribute<RoleEntity, RolePermissionEntity> permissions;
	public static volatile SingularAttribute<RoleEntity, String> name;
	public static volatile SingularAttribute<RoleEntity, String> description;
	public static volatile SingularAttribute<RoleEntity, Boolean> active;
	public static volatile SingularAttribute<RoleEntity, Integer> id;
	public static volatile SingularAttribute<RoleEntity, Integer> uuid;

	public static final String PERMISSIONS = "permissions";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String UUID = "uuid";

}

