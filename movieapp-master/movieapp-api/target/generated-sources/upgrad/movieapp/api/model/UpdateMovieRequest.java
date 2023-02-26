package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.CensorBoardRatingType;
import upgrad.movieapp.api.model.MovieStatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateMovieRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:22.402+05:30")

public class UpdateMovieRequest   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("storyline")
  private String storyline = null;

  @JsonProperty("genres")
  @Valid
  private List<String> genres = null;

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
  private List<String> artists = null;

  public UpdateMovieRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Updated title of the movie
   * @return title
  **/
  @ApiModelProperty(value = "Updated title of the movie")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdateMovieRequest storyline(String storyline) {
    this.storyline = storyline;
    return this;
  }

  /**
   * Updated storyline of the movie
   * @return storyline
  **/
  @ApiModelProperty(value = "Updated storyline of the movie")


  public String getStoryline() {
    return storyline;
  }

  public void setStoryline(String storyline) {
    this.storyline = storyline;
  }

  public UpdateMovieRequest genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public UpdateMovieRequest addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Updated genres of the movie
   * @return genres
  **/
  @ApiModelProperty(value = "Updated genres of the movie")


  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public UpdateMovieRequest duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Updated duration (in minutes) of the movie
   * @return duration
  **/
  @ApiModelProperty(value = "Updated duration (in minutes) of the movie")


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public UpdateMovieRequest posterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    return this;
  }

  /**
   * Updated poster URL of the movie
   * @return posterUrl
  **/
  @ApiModelProperty(value = "Updated poster URL of the movie")


  public String getPosterUrl() {
    return posterUrl;
  }

  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }

  public UpdateMovieRequest trailerUrl(String trailerUrl) {
    this.trailerUrl = trailerUrl;
    return this;
  }

  /**
   * Updated trailer URL of the movie
   * @return trailerUrl
  **/
  @ApiModelProperty(value = "Updated trailer URL of the movie")


  public String getTrailerUrl() {
    return trailerUrl;
  }

  public void setTrailerUrl(String trailerUrl) {
    this.trailerUrl = trailerUrl;
  }

  public UpdateMovieRequest wikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
    return this;
  }

  /**
   * Updated wiki URL of the movie
   * @return wikiUrl
  **/
  @ApiModelProperty(value = "Updated wiki URL of the movie")


  public String getWikiUrl() {
    return wikiUrl;
  }

  public void setWikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
  }

  public UpdateMovieRequest releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Updated release date of the project
   * @return releaseDate
  **/
  @ApiModelProperty(value = "Updated release date of the project")


  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public UpdateMovieRequest censorBoardRating(CensorBoardRatingType censorBoardRating) {
    this.censorBoardRating = censorBoardRating;
    return this;
  }

  /**
   * Get censorBoardRating
   * @return censorBoardRating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CensorBoardRatingType getCensorBoardRating() {
    return censorBoardRating;
  }

  public void setCensorBoardRating(CensorBoardRatingType censorBoardRating) {
    this.censorBoardRating = censorBoardRating;
  }

  public UpdateMovieRequest rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Updated Rating of the movie
   * @return rating
  **/
  @ApiModelProperty(value = "Updated Rating of the movie")


  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public UpdateMovieRequest status(MovieStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MovieStatusType getStatus() {
    return status;
  }

  public void setStatus(MovieStatusType status) {
    this.status = status;
  }

  public UpdateMovieRequest artists(List<String> artists) {
    this.artists = artists;
    return this;
  }

  public UpdateMovieRequest addArtistsItem(String artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * Unique identifier of an artist in a standard UUID format generated by API backend
   * @return artists
  **/
  @ApiModelProperty(value = "Unique identifier of an artist in a standard UUID format generated by API backend")


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
    UpdateMovieRequest updateMovieRequest = (UpdateMovieRequest) o;
    return Objects.equals(this.title, updateMovieRequest.title) &&
        Objects.equals(this.storyline, updateMovieRequest.storyline) &&
        Objects.equals(this.genres, updateMovieRequest.genres) &&
        Objects.equals(this.duration, updateMovieRequest.duration) &&
        Objects.equals(this.posterUrl, updateMovieRequest.posterUrl) &&
        Objects.equals(this.trailerUrl, updateMovieRequest.trailerUrl) &&
        Objects.equals(this.wikiUrl, updateMovieRequest.wikiUrl) &&
        Objects.equals(this.releaseDate, updateMovieRequest.releaseDate) &&
        Objects.equals(this.censorBoardRating, updateMovieRequest.censorBoardRating) &&
        Objects.equals(this.rating, updateMovieRequest.rating) &&
        Objects.equals(this.status, updateMovieRequest.status) &&
        Objects.equals(this.artists, updateMovieRequest.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, storyline, genres, duration, posterUrl, trailerUrl, wikiUrl, releaseDate, censorBoardRating, rating, status, artists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMovieRequest {\n");
    
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

