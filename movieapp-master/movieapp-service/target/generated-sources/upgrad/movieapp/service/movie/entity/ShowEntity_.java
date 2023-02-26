package upgrad.movieapp.service.movie.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ShowEntity.class)
public abstract class ShowEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<ShowEntity, TheatreEntity> theatre;
	public static volatile SingularAttribute<ShowEntity, BigDecimal> unitPrice;
	public static volatile SingularAttribute<ShowEntity, MovieEntity> movie;
	public static volatile SingularAttribute<ShowEntity, Integer> availableSeats;
	public static volatile SingularAttribute<ShowEntity, Boolean> active;
	public static volatile SingularAttribute<ShowEntity, ZonedDateTime> startTime;
	public static volatile SingularAttribute<ShowEntity, String> language;
	public static volatile SingularAttribute<ShowEntity, Long> id;
	public static volatile SingularAttribute<ShowEntity, ZonedDateTime> endTime;
	public static volatile ListAttribute<ShowEntity, ShowBookingEntity> bookings;
	public static volatile SingularAttribute<ShowEntity, String> uuid;
	public static volatile SingularAttribute<ShowEntity, Integer> totalSeats;

	public static final String THEATRE = "theatre";
	public static final String UNIT_PRICE = "unitPrice";
	public static final String MOVIE = "movie";
	public static final String AVAILABLE_SEATS = "availableSeats";
	public static final String ACTIVE = "active";
	public static final String START_TIME = "startTime";
	public static final String LANGUAGE = "language";
	public static final String ID = "id";
	public static final String END_TIME = "endTime";
	public static final String BOOKINGS = "bookings";
	public static final String UUID = "uuid";
	public static final String TOTAL_SEATS = "totalSeats";

}

