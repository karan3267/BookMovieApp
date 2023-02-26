package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.CityType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CitiesSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:11.754+05:30")

public class CitiesSummaryResponse   {
  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("cities")
  @Valid
  private List<CityType> cities = new ArrayList<>();

  public CitiesSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of cities present in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of cities present in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public CitiesSummaryResponse cities(List<CityType> cities) {
    this.cities = cities;
    return this;
  }

  public CitiesSummaryResponse addCitiesItem(CityType citiesItem) {
    this.cities.add(citiesItem);
    return this;
  }

  /**
   * List of cities
   * @return cities
  **/
  @ApiModelProperty(required = true, value = "List of cities")
  @NotNull

  @Valid

  public List<CityType> getCities() {
    return cities;
  }

  public void setCities(List<CityType> cities) {
    this.cities = cities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CitiesSummaryResponse citiesSummaryResponse = (CitiesSummaryResponse) o;
    return Objects.equals(this.totalCount, citiesSummaryResponse.totalCount) &&
        Objects.equals(this.cities, citiesSummaryResponse.cities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, cities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitiesSummaryResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
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

