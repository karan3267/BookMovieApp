package upgrad.movieapp.service.movie.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import upgrad.movieapp.service.user.entity.UserEntity;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ShowBookingEntity.class)
public abstract class ShowBookingEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<ShowBookingEntity, String> bookingReference;
	public static volatile SingularAttribute<ShowBookingEntity, BigDecimal> totalPrice;
	public static volatile SingularAttribute<ShowBookingEntity, ZonedDateTime> bookingAt;
	public static volatile SingularAttribute<ShowBookingEntity, ZonedDateTime> cancelledAt;
	public static volatile SingularAttribute<ShowBookingEntity, ShowEntity> show;
	public static volatile SingularAttribute<ShowBookingEntity, Long> id;
	public static volatile ListAttribute<ShowBookingEntity, BookingTicketEntity> bookingTickets;
	public static volatile SingularAttribute<ShowBookingEntity, String> uuid;
	public static volatile SingularAttribute<ShowBookingEntity, String> couponCode;
	public static volatile SingularAttribute<ShowBookingEntity, Integer> totalSeats;
	public static volatile SingularAttribute<ShowBookingEntity, UserEntity> customer;
	public static volatile SingularAttribute<ShowBookingEntity, String> status;

	public static final String BOOKING_REFERENCE = "bookingReference";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String BOOKING_AT = "bookingAt";
	public static final String CANCELLED_AT = "cancelledAt";
	public static final String SHOW = "show";
	public static final String ID = "id";
	public static final String BOOKING_TICKETS = "bookingTickets";
	public static final String UUID = "uuid";
	public static final String COUPON_CODE = "couponCode";
	public static final String TOTAL_SEATS = "totalSeats";
	public static final String CUSTOMER = "customer";
	public static final String STATUS = "status";

}

