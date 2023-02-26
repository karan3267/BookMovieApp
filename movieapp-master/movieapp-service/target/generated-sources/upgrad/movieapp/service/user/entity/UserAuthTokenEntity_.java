package upgrad.movieapp.service.user.entity;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserAuthTokenEntity.class)
public abstract class UserAuthTokenEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<UserAuthTokenEntity, ZonedDateTime> logoutAt;
	public static volatile SingularAttribute<UserAuthTokenEntity, Long> id;
	public static volatile SingularAttribute<UserAuthTokenEntity, ZonedDateTime> loginAt;
	public static volatile SingularAttribute<UserAuthTokenEntity, String> accessToken;
	public static volatile SingularAttribute<UserAuthTokenEntity, UserEntity> user;
	public static volatile SingularAttribute<UserAuthTokenEntity, ZonedDateTime> expiresAt;

	public static final String LOGOUT_AT = "logoutAt";
	public static final String ID = "id";
	public static final String LOGIN_AT = "loginAt";
	public static final String ACCESS_TOKEN = "accessToken";
	public static final String USER = "user";
	public static final String EXPIRES_AT = "expiresAt";

}

