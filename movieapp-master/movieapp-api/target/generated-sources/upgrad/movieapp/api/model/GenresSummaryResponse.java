package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.GenreType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenresSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:11.374+05:30")

public class GenresSummaryResponse   {
  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("genres")
  @Valid
  private List<GenreType> genres = new ArrayList<>();

  public GenresSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of genres present in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of genres present in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public GenresSummaryResponse genres(List<GenreType> genres) {
    this.genres = genres;
    return this;
  }

  public GenresSummaryResponse addGenresItem(GenreType genresItem) {
    this.genres.add(genresItem);
    return this;
  }

  /**
   * List of genres
   * @return genres
  **/
  @ApiModelProperty(required = true, value = "List of genres")
  @NotNull

  @Valid

  public List<GenreType> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreType> genres) {
    this.genres = genres;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenresSummaryResponse genresSummaryResponse = (GenresSummaryResponse) o;
    return Objects.equals(this.totalCount, genresSummaryResponse.totalCount) &&
        Objects.equals(this.genres, genresSummaryResponse.genres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, genres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenresSummaryResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
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

