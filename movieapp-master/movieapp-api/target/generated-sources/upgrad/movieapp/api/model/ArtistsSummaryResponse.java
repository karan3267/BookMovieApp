package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.ArtistType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ArtistsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:19.438+05:30")

public class ArtistsSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("artists")
  @Valid
  private List<ArtistType> artists = new ArrayList<>();

  public ArtistsSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched artists
   * @return page
  **/
  @ApiModelProperty(value = "page or position of the fetched artists")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ArtistsSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of artists fetched per this request
   * @return limit
  **/
  @ApiModelProperty(value = "number of artists fetched per this request")


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ArtistsSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of artists in the movie
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of artists in the movie")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public ArtistsSummaryResponse artists(List<ArtistType> artists) {
    this.artists = artists;
    return this;
  }

  public ArtistsSummaryResponse addArtistsItem(ArtistType artistsItem) {
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * List of artists
   * @return artists
  **/
  @ApiModelProperty(required = true, value = "List of artists")
  @NotNull

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
    ArtistsSummaryResponse artistsSummaryResponse = (ArtistsSummaryResponse) o;
    return Objects.equals(this.page, artistsSummaryResponse.page) &&
        Objects.equals(this.limit, artistsSummaryResponse.limit) &&
        Objects.equals(this.totalCount, artistsSummaryResponse.totalCount) &&
        Objects.equals(this.artists, artistsSummaryResponse.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, artists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistsSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

