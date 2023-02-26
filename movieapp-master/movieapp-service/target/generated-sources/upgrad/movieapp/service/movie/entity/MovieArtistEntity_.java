package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MovieArtistEntity.class)
public abstract class MovieArtistEntity_ extends upgrad.movieapp.service.common.entity.ImmutableEntity_ {

	public static volatile SingularAttribute<MovieArtistEntity, MovieEntity> movie;
	public static volatile SingularAttribute<MovieArtistEntity, ArtistEntity> artist;
	public static volatile SingularAttribute<MovieArtistEntity, Integer> id;

	public static final String MOVIE = "movie";
	public static final String ARTIST = "artist";
	public static final String ID = "id";

}

