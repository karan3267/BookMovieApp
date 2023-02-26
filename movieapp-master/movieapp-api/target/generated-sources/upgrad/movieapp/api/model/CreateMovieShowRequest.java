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
 * CreateMovieShowRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:13.729+05:30")

public class CreateMovieShowRequest   {
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

  public CreateMovieShowRequest theatreId(String theatreId) {
    this.theatreId = theatreId;
    return this;
  }

  /**
   * Show mapped to this movie show
   * @return theatreId
  **/
  @ApiModelProperty(required = true, value = "Show mapped to this movie show")
  @NotNull


  public String getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(String theatreId) {
    this.theatreId = theatreId;
  }

  public CreateMovieShowRequest showTiming(String showTiming) {
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

  public CreateMovieShowRequest language(LanguageType language) {
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

  public CreateMovieShowRequest unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public CreateMovieShowRequest totalSeats(Integer totalSeats) {
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
    CreateMovieShowRequest createMovieShowRequest = (CreateMovieShowRequest) o;
    return Objects.equals(this.theatreId, createMovieShowRequest.theatreId) &&
        Objects.equals(this.showTiming, createMovieShowRequest.showTiming) &&
        Objects.equals(this.language, createMovieShowRequest.language) &&
        Objects.equals(this.unitPrice, createMovieShowRequest.unitPrice) &&
        Objects.equals(this.totalSeats, createMovieShowRequest.totalSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theatreId, showTiming, language, unitPrice, totalSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMovieShowRequest {\n");
    
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

