package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(GenreEntity.class)
public abstract class GenreEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<GenreEntity, String> genre;
	public static volatile SingularAttribute<GenreEntity, String> description;
	public static volatile SingularAttribute<GenreEntity, Long> id;
	public static volatile SingularAttribute<GenreEntity, String> uuid;

	public static final String GENRE = "genre";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String UUID = "uuid";

}

