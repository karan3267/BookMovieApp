package upgrad.movieapp.service.user.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RolePermissionEntity.class)
public abstract class RolePermissionEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<RolePermissionEntity, RoleEntity> role;
	public static volatile SingularAttribute<RolePermissionEntity, PermissionEntity> permissionEntity;
	public static volatile SingularAttribute<RolePermissionEntity, Integer> id;

	public static final String ROLE = "role";
	public static final String PERMISSION_ENTITY = "permissionEntity";
	public static final String ID = "id";

}

