package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import upgrad.movieapp.api.model.LanguageType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateTheatreShowRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.196+05:30")

public class CreateTheatreShowRequest   {
  @JsonProperty("movie_id")
  private String movieId = null;

  @JsonProperty("show_timing")
  private String showTiming = null;

  @JsonProperty("language")
  private LanguageType language = null;

  @JsonProperty("unit_price")
  private Float unitPrice = null;

  @JsonProperty("total_seats")
  private Integer totalSeats = null;

  public CreateTheatreShowRequest movieId(String movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Movie mapped to this show
   * @return movieId
  **/
  @ApiModelProperty(required = true, value = "Movie mapped to this show")
  @NotNull


  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public CreateTheatreShowRequest showTiming(String showTiming) {
    this.showTiming = showTiming;
    return this;
  }

  /**
   * Show timing in yyyy-MM-ddTHH:MM format
   * @return showTiming
  **/
  @ApiModelProperty(required = true, value = "Show timing in yyyy-MM-ddTHH:MM format")
  @NotNull


  public String getShowTiming() {
    return showTiming;
  }

  public void setShowTiming(String showTiming) {
    this.showTiming = showTiming;
  }

  public CreateTheatreShowRequest language(LanguageType language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LanguageType getLanguage() {
    return language;
  }

  public void setLanguage(LanguageType language) {
    this.language = language;
  }

  public CreateTheatreShowRequest unitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Unit price of the movie (for e.g. 200.00)
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "Unit price of the movie (for e.g. 200.00)")
  @NotNull


  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public CreateTheatreShowRequest totalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
    return this;
  }

  /**
   * Total number that this show can host
   * @return totalSeats
  **/
  @ApiModelProperty(required = true, value = "Total number that this show can host")
  @NotNull


  public Integer getTotalSeats() {
    return totalSeats;
  }

  public void setTotalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTheatreShowRequest createTheatreShowRequest = (CreateTheatreShowRequest) o;
    return Objects.equals(this.movieId, createTheatreShowRequest.movieId) &&
        Objects.equals(this.showTiming, createTheatreShowRequest.showTiming) &&
        Objects.equals(this.language, createTheatreShowRequest.language) &&
        Objects.equals(this.unitPrice, createTheatreShowRequest.unitPrice) &&
        Objects.equals(this.totalSeats, createTheatreShowRequest.totalSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, showTiming, language, unitPrice, totalSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTheatreShowRequest {\n");
    
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    showTiming: ").append(toIndentedString(showTiming)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
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

