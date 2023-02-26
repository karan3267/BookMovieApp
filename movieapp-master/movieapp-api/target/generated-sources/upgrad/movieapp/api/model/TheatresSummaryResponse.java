package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.TheatreSummaryType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TheatresSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.196+05:30")

public class TheatresSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("theatres")
  @Valid
  private List<TheatreSummaryType> theatres = new ArrayList<>();

  public TheatresSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched theatres
   * @return page
  **/
  @ApiModelProperty(required = true, value = "page or position of the fetched theatres")
  @NotNull


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TheatresSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of theatres fetched per this request
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of theatres fetched per this request")
  @NotNull


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public TheatresSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of theatres in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of theatres in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public TheatresSummaryResponse theatres(List<TheatreSummaryType> theatres) {
    this.theatres = theatres;
    return this;
  }

  public TheatresSummaryResponse addTheatresItem(TheatreSummaryType theatresItem) {
    this.theatres.add(theatresItem);
    return this;
  }

  /**
   * List of theatres
   * @return theatres
  **/
  @ApiModelProperty(required = true, value = "List of theatres")
  @NotNull

  @Valid

  public List<TheatreSummaryType> getTheatres() {
    return theatres;
  }

  public void setTheatres(List<TheatreSummaryType> theatres) {
    this.theatres = theatres;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheatresSummaryResponse theatresSummaryResponse = (TheatresSummaryResponse) o;
    return Objects.equals(this.page, theatresSummaryResponse.page) &&
        Objects.equals(this.limit, theatresSummaryResponse.limit) &&
        Objects.equals(this.totalCount, theatresSummaryResponse.totalCount) &&
        Objects.equals(this.theatres, theatresSummaryResponse.theatres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, theatres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheatresSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    theatres: ").append(toIndentedString(theatres)).append("\n");
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

