package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import upgrad.movieapp.api.model.ArtistType;
import upgrad.movieapp.api.model.CensorBoardRatingType;
import upgrad.movieapp.api.model.MovieStatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MovieSummaryType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class MovieSummaryType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("storyline")
  private String storyline = null;

  @JsonProperty("genres")
  @Valid
  private List<String> genres = new ArrayList<>();

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("poster_url")
  private String posterUrl = null;

  @JsonProperty("trailer_url")
  private String trailerUrl = null;

  @JsonProperty("wiki_url")
  private String wikiUrl = null;

  @JsonProperty("release_date")
  private String releaseDate = null;

  @JsonProperty("censor_board_rating")
  private CensorBoardRatingType censorBoardRating = null;

  @JsonProperty("rating")
  private Float rating = null;

  @JsonProperty("status")
  private MovieStatusType status = null;

  @JsonProperty("artists")
  @Valid
  private List<ArtistType> artists = null;

  public MovieSummaryType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the movie in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the movie in a standard UUID format")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MovieSummaryType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the movie
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title of the movie")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MovieSummaryType storyline(String storyline) {
    this.storyline = storyline;
    return this;
  }

  /**
   * Storyline of the movie
   * @return storyline
  **/
  @ApiModelProperty(required = true, value = "Storyline of the movie")
  @NotNull


  public String getStoryline() {
    return storyline;
  }

  public void setStoryline(String storyline) {
    this.storyline = storyline;
  }

  public MovieSummaryType genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public MovieSummaryType addGenresItem(String genresItem) {
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Genres of the movie
   * @return genres
  **/
  @ApiModelProperty(required = true, value = "Genres of the movie")
  @NotNull


  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public MovieSummaryType duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration (in minutes) of the movie
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Duration (in minutes) of the movie")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public MovieSummaryType posterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    return this;
  }

  /**
   * Poster URL of the movie
   * @return posterUrl
  **/
  @ApiModelProperty(required = true, value = "Poster URL of the movie")
  @NotNull


  public String getPosterUrl() {
    return posterUrl;
  }

  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }

  public MovieSummaryType trailerUrl(String trailerUrl) {
    this.trailerUrl = trailerUrl;
    return this;
  }

  /**
   * Trailer URL of the movie
   * @return trailerUrl
  **/
  @ApiModelProperty(required = true, value = "Trailer URL of the movie")
  @NotNull


  public String getTrailerUrl() {
    return trailerUrl;
  }

  public void setTrailerUrl(String trailerUrl) {
    this.trailerUrl = trailerUrl;
  }

  public MovieSummaryType wikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
    return this;
  }

  /**
   * Wiki URL of the movie
   * @return wikiUrl
  **/
  @ApiModelProperty(value = "Wiki URL of the movie")


  public String getWikiUrl() {
    return wikiUrl;
  }

  public void setWikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
  }

  public MovieSummaryType releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Release date of the movie
   * @return releaseDate
  **/
  @ApiModelProperty(required = true, value = "Release date of the movie")
  @NotNull


  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public MovieSummaryType censorBoardRating(CensorBoardRatingType censorBoardRating) {
    this.censorBoardRating = censorBoardRating;
    return this;
  }

  /**
   * Get censorBoardRating
   * @return censorBoardRating
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CensorBoardRatingType getCensorBoardRating() {
    return censorBoardRating;
  }

  public void setCensorBoardRating(CensorBoardRatingType censorBoardRating) {
    this.censorBoardRating = censorBoardRating;
  }

  public MovieSummaryType rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Rating of the movie
   * @return rating
  **/
  @ApiModelProperty(required = true, value = "Rating of the movie")
  @NotNull


  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public MovieSummaryType status(MovieStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MovieStatusType getStatus() {
    return status;
  }

  public void setStatus(MovieStatusType status) {
    this.status = status;
  }

  public MovieSummaryType artists(List<ArtistType> artists) {
    this.artists = artists;
    return this;
  }

  public MovieSummaryType addArtistsItem(ArtistType artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * List of artists
   * @return artists
  **/
  @ApiModelProperty(value = "List of artists")

  @Valid

  public List<ArtistType> getArtists() {
    return artists;
  }

  public void setArtists(List<ArtistType> artists) {
    this.artists = artists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieSummaryType movieSummaryType = (MovieSummaryType) o;
    return Objects.equals(this.id, movieSummaryType.id) &&
        Objects.equals(this.title, movieSummaryType.title) &&
        Objects.equals(this.storyline, movieSummaryType.storyline) &&
        Objects.equals(this.genres, movieSummaryType.genres) &&
        Objects.equals(this.duration, movieSummaryType.duration) &&
        Objects.equals(this.posterUrl, movieSummaryType.posterUrl) &&
        Objects.equals(this.trailerUrl, movieSummaryType.trailerUrl) &&
        Objects.equals(this.wikiUrl, movieSummaryType.wikiUrl) &&
        Objects.equals(this.releaseDate, movieSummaryType.releaseDate) &&
        Objects.equals(this.censorBoardRating, movieSummaryType.censorBoardRating) &&
        Objects.equals(this.rating, movieSummaryType.rating) &&
        Objects.equals(this.status, movieSummaryType.status) &&
        Objects.equals(this.artists, movieSummaryType.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, storyline, genres, duration, posterUrl, trailerUrl, wikiUrl, releaseDate, censorBoardRating, rating, status, artists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieSummaryType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    storyline: ").append(toIndentedString(storyline)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    trailerUrl: ").append(toIndentedString(trailerUrl)).append("\n");
    sb.append("    wikiUrl: ").append(toIndentedString(wikiUrl)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    censorBoardRating: ").append(toIndentedString(censorBoardRating)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

