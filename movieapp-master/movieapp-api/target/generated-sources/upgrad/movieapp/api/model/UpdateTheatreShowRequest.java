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
 * UpdateTheatreShowRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:16.896+05:30")

public class UpdateTheatreShowRequest   {
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

  public UpdateTheatreShowRequest movieId(String movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Updated movie mapped to this show
   * @return movieId
  **/
  @ApiModelProperty(value = "Updated movie mapped to this show")


  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public UpdateTheatreShowRequest showTiming(String showTiming) {
    this.showTiming = showTiming;
    return this;
  }

  /**
   * Updated show timing in yyyy-MM-ddTHH:MM format
   * @return showTiming
  **/
  @ApiModelProperty(value = "Updated show timing in yyyy-MM-ddTHH:MM format")


  public String getShowTiming() {
    return showTiming;
  }

  public void setShowTiming(String showTiming) {
    this.showTiming = showTiming;
  }

  public UpdateTheatreShowRequest language(LanguageType language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LanguageType getLanguage() {
    return language;
  }

  public void setLanguage(LanguageType language) {
    this.language = language;
  }

  public UpdateTheatreShowRequest unitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Updated unit price of the movie (for e.g. 200.00)
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Updated unit price of the movie (for e.g. 200.00)")


  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public UpdateTheatreShowRequest totalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
    return this;
  }

  /**
   * Updated total number that this show can host
   * @return totalSeats
  **/
  @ApiModelProperty(value = "Updated total number that this show can host")


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
    UpdateTheatreShowRequest updateTheatreShowRequest = (UpdateTheatreShowRequest) o;
    return Objects.equals(this.movieId, updateTheatreShowRequest.movieId) &&
        Objects.equals(this.showTiming, updateTheatreShowRequest.showTiming) &&
        Objects.equals(this.language, updateTheatreShowRequest.language) &&
        Objects.equals(this.unitPrice, updateTheatreShowRequest.unitPrice) &&
        Objects.equals(this.totalSeats, updateTheatreShowRequest.totalSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, showTiming, language, unitPrice, totalSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTheatreShowRequest {\n");
    
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

