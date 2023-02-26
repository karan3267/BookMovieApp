package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TheatreEntity.class)
public abstract class TheatreEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<TheatreEntity, String> postalAddress;
	public static volatile ListAttribute<TheatreEntity, ShowEntity> shows;
	public static volatile SingularAttribute<TheatreEntity, String> cityCode;
	public static volatile SingularAttribute<TheatreEntity, String> name;
	public static volatile SingularAttribute<TheatreEntity, Boolean> active;
	public static volatile SingularAttribute<TheatreEntity, Long> id;
	public static volatile SingularAttribute<TheatreEntity, String> uuid;

	public static final String POSTAL_ADDRESS = "postalAddress";
	public static final String SHOWS = "shows";
	public static final String CITY_CODE = "cityCode";
	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String UUID = "uuid";

}

