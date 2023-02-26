package upgrad.movieapp.service.movie.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ArtistEntity.class)
public abstract class ArtistEntity_ extends upgrad.movieapp.service.common.entity.MutableEntity_ {

	public static volatile SingularAttribute<ArtistEntity, String> profilePictureUrl;
	public static volatile SingularAttribute<ArtistEntity, String> firstName;
	public static volatile SingularAttribute<ArtistEntity, String> lastName;
	public static volatile SingularAttribute<ArtistEntity, String> profileDescription;
	public static volatile SingularAttribute<ArtistEntity, String> wikiUrl;
	public static volatile SingularAttribute<ArtistEntity, Boolean> active;
	public static volatile SingularAttribute<ArtistEntity, Long> id;
	public static volatile SingularAttribute<ArtistEntity, String> type;
	public static volatile SingularAttribute<ArtistEntity, String> uuid;

	public static final String PROFILE_PICTURE_URL = "profilePictureUrl";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PROFILE_DESCRIPTION = "profileDescription";
	public static final String WIKI_URL = "wikiUrl";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String UUID = "uuid";

}

