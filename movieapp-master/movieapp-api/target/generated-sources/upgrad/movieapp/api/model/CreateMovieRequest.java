package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.CensorBoardRatingType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateMovieRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:13.729+05:30")

public class CreateMovieRequest   {
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

  @JsonProperty("artists")
  @Valid
  private List<String> artists = new ArrayList<>();

  public CreateMovieRequest title(String title) {
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

  public CreateMovieRequest storyline(String storyline) {
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

  public CreateMovieRequest genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public CreateMovieRequest addGenresItem(String genresItem) {
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

  public CreateMovieRequest duration(Integer duration) {
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

  public CreateMovieRequest posterUrl(String posterUrl) {
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

  public CreateMovieRequest trailerUrl(String trailerUrl) {
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

  public CreateMovieRequest wikiUrl(String wikiUrl) {
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

  public CreateMovieRequest releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Release date of the project
   * @return releaseDate
  **/
  @ApiModelProperty(required = true, value = "Release date of the project")
  @NotNull


  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public CreateMovieRequest censorBoardRating(CensorBoardRatingType censorBoardRating) {
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

  public CreateMovieRequest rating(Float rating) {
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

  public CreateMovieRequest artists(List<String> artists) {
    this.artists = artists;
    return this;
  }

  public CreateMovieRequest addArtistsItem(String artistsItem) {
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * Unique identifier of an artist in a standard UUID format generated by API backend
   * @return artists
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of an artist in a standard UUID format generated by API backend")
  @NotNull


  public List<String> getArtists() {
    return artists;
  }

  public void setArtists(List<String> artists) {
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
    CreateMovieRequest createMovieRequest = (CreateMovieRequest) o;
    return Objects.equals(this.title, createMovieRequest.title) &&
        Objects.equals(this.storyline, createMovieRequest.storyline) &&
        Objects.equals(this.genres, createMovieRequest.genres) &&
        Objects.equals(this.duration, createMovieRequest.duration) &&
        Objects.equals(this.posterUrl, createMovieRequest.posterUrl) &&
        Objects.equals(this.trailerUrl, createMovieRequest.trailerUrl) &&
        Objects.equals(this.wikiUrl, createMovieRequest.wikiUrl) &&
        Objects.equals(this.releaseDate, createMovieRequest.releaseDate) &&
        Objects.equals(this.censorBoardRating, createMovieRequest.censorBoardRating) &&
        Objects.equals(this.rating, createMovieRequest.rating) &&
        Objects.equals(this.artists, createMovieRequest.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, storyline, genres, duration, posterUrl, trailerUrl, wikiUrl, releaseDate, censorBoardRating, rating, artists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMovieRequest {\n");
    
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

