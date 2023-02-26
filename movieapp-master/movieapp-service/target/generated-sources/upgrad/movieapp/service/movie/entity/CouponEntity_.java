package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CouponEntity.class)
public abstract class CouponEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<CouponEntity, Integer> discountPercentage;
	public static volatile SingularAttribute<CouponEntity, String> code;
	public static volatile SingularAttribute<CouponEntity, String> description;
	public static volatile SingularAttribute<CouponEntity, Long> id;

	public static final String DISCOUNT_PERCENTAGE = "discountPercentage";
	public static final String CODE = "code";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

