package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BookingTicketEntity.class)
public abstract class BookingTicketEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<BookingTicketEntity, String> ticketNumber;
	public static volatile SingularAttribute<BookingTicketEntity, ShowBookingEntity> booking;
	public static volatile SingularAttribute<BookingTicketEntity, Long> id;

	public static final String TICKET_NUMBER = "ticketNumber";
	public static final String BOOKING = "booking";
	public static final String ID = "id";

}

