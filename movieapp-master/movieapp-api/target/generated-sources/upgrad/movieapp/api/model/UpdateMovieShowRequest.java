package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import upgrad.movieapp.api.model.LanguageType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateMovieShowRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:13.729+05:30")

public class UpdateMovieShowRequest   {
  @JsonProperty("theatre_id")
  private String theatreId = null;

  @JsonProperty("show_timing")
  private String showTiming = null;

  @JsonProperty("language")
  private LanguageType language = null;

  @JsonProperty("unit_price")
  private BigDecimal unitPrice = null;

  @JsonProperty("total_seats")
  private Integer totalSeats = null;

  public UpdateMovieShowRequest theatreId(String theatreId) {
    this.theatreId = theatreId;
    return this;
  }

  /**
   * Updated movie mapped to this show
   * @return theatreId
  **/
  @ApiModelProperty(value = "Updated movie mapped to this show")


  public String getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(String theatreId) {
    this.theatreId = theatreId;
  }

  public UpdateMovieShowRequest showTiming(String showTiming) {
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

  public UpdateMovieShowRequest language(LanguageType language) {
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

  public UpdateMovieShowRequest unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public UpdateMovieShowRequest totalSeats(Integer totalSeats) {
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
    UpdateMovieShowRequest updateMovieShowRequest = (UpdateMovieShowRequest) o;
    return Objects.equals(this.theatreId, updateMovieShowRequest.theatreId) &&
        Objects.equals(this.showTiming, updateMovieShowRequest.showTiming) &&
        Objects.equals(this.language, updateMovieShowRequest.language) &&
        Objects.equals(this.unitPrice, updateMovieShowRequest.unitPrice) &&
        Objects.equals(this.totalSeats, updateMovieShowRequest.totalSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theatreId, showTiming, language, unitPrice, totalSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMovieShowRequest {\n");
    
    sb.append("    theatreId: ").append(toIndentedString(theatreId)).append("\n");
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

