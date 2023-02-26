package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MovieGenreEntity.class)
public abstract class MovieGenreEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<MovieGenreEntity, MovieEntity> movie;
	public static volatile SingularAttribute<MovieGenreEntity, GenreEntity> genre;
	public static volatile SingularAttribute<MovieGenreEntity, Integer> id;

	public static final String MOVIE = "movie";
	public static final String GENRE = "genre";
	public static final String ID = "id";

}

