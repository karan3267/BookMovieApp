package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.MovieSummaryType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MoviesSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class MoviesSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("movies")
  @Valid
  private List<MovieSummaryType> movies = new ArrayList<>();

  public MoviesSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched movies
   * @return page
  **/
  @ApiModelProperty(required = true, value = "page or position of the fetched movies")
  @NotNull


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public MoviesSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of movies fetched per this request
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of movies fetched per this request")
  @NotNull


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public MoviesSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of movies in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of movies in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public MoviesSummaryResponse movies(List<MovieSummaryType> movies) {
    this.movies = movies;
    return this;
  }

  public MoviesSummaryResponse addMoviesItem(MovieSummaryType moviesItem) {
    this.movies.add(moviesItem);
    return this;
  }

  /**
   * List of movies
   * @return movies
  **/
  @ApiModelProperty(required = true, value = "List of movies")
  @NotNull

  @Valid

  public List<MovieSummaryType> getMovies() {
    return movies;
  }

  public void setMovies(List<MovieSummaryType> movies) {
    this.movies = movies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoviesSummaryResponse moviesSummaryResponse = (MoviesSummaryResponse) o;
    return Objects.equals(this.page, moviesSummaryResponse.page) &&
        Objects.equals(this.limit, moviesSummaryResponse.limit) &&
        Objects.equals(this.totalCount, moviesSummaryResponse.totalCount) &&
        Objects.equals(this.movies, moviesSummaryResponse.movies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, movies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoviesSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    movies: ").append(toIndentedString(movies)).append("\n");
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

