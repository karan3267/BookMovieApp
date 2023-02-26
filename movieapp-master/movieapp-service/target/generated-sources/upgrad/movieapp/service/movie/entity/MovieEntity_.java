package upgrad.movieapp.service.movie.entity;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MovieEntity.class)
public abstract class MovieEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<MovieEntity, String> censorBoardRating;
	public static volatile SingularAttribute<MovieEntity, Float> rating;
	public static volatile SingularAttribute<MovieEntity, String> title;
	public static volatile SingularAttribute<MovieEntity, String> trailerUrl;
	public static volatile SingularAttribute<MovieEntity, String> uuid;
	public static volatile SingularAttribute<MovieEntity, ZonedDateTime> releaseAt;
	public static volatile SingularAttribute<MovieEntity, Integer> duration;
	public static volatile SingularAttribute<MovieEntity, String> posterUrl;
	public static volatile ListAttribute<MovieEntity, MovieArtistEntity> artists;
	public static volatile ListAttribute<MovieEntity, MovieGenreEntity> genres;
	public static volatile SingularAttribute<MovieEntity, String> storyline;
	public static volatile SingularAttribute<MovieEntity, String> wikiUrl;
	public static volatile SingularAttribute<MovieEntity, Integer> id;
	public static volatile SingularAttribute<MovieEntity, String> status;

	public static final String CENSOR_BOARD_RATING = "censorBoardRating";
	public static final String RATING = "rating";
	public static final String TITLE = "title";
	public static final String TRAILER_URL = "trailerUrl";
	public static final String UUID = "uuid";
	public static final String RELEASE_AT = "releaseAt";
	public static final String DURATION = "duration";
	public static final String POSTER_URL = "posterUrl";
	public static final String ARTISTS = "artists";
	public static final String GENRES = "genres";
	public static final String STORYLINE = "storyline";
	public static final String WIKI_URL = "wikiUrl";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

