package upgrad.movieapp.service.user.entity;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserEntity.class)
public abstract class UserEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<UserEntity, Boolean> subscriptionsConsent;
	public static volatile SingularAttribute<UserEntity, String> lastName;
	public static volatile SingularAttribute<UserEntity, ZonedDateTime> lastPasswordChangeAt;
	public static volatile SingularAttribute<UserEntity, RoleEntity> role;
	public static volatile SingularAttribute<UserEntity, String> salt;
	public static volatile SingularAttribute<UserEntity, Integer> failedLoginCount;
	public static volatile SingularAttribute<UserEntity, String> uuid;
	public static volatile SingularAttribute<UserEntity, String> firstName;
	public static volatile SingularAttribute<UserEntity, String> password;
	public static volatile SingularAttribute<UserEntity, ZonedDateTime> lastLoginAt;
	public static volatile SingularAttribute<UserEntity, String> mobilePhone;
	public static volatile SingularAttribute<UserEntity, Long> id;
	public static volatile SingularAttribute<UserEntity, String> email;
	public static volatile SingularAttribute<UserEntity, String> status;

	public static final String SUBSCRIPTIONS_CONSENT = "subscriptionsConsent";
	public static final String LAST_NAME = "lastName";
	public static final String LAST_PASSWORD_CHANGE_AT = "lastPasswordChangeAt";
	public static final String ROLE = "role";
	public static final String SALT = "salt";
	public static final String FAILED_LOGIN_COUNT = "failedLoginCount";
	public static final String UUID = "uuid";
	public static final String FIRST_NAME = "firstName";
	public static final String PASSWORD = "password";
	public static final String LAST_LOGIN_AT = "lastLoginAt";
	public static final String MOBILE_PHONE = "mobilePhone";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";

}

