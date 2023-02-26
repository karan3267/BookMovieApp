package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.UUID;
import upgrad.movieapp.api.model.LanguageType;
import upgrad.movieapp.api.model.MovieShowStatusType;
import upgrad.movieapp.api.model.TheatreSummaryType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MovieShowType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class MovieShowType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("theatre")
  private TheatreSummaryType theatre = null;

  @JsonProperty("show_timing")
  private String showTiming = null;

  @JsonProperty("language")
  private LanguageType language = null;

  @JsonProperty("unit_price")
  private BigDecimal unitPrice = null;

  @JsonProperty("total_seats")
  private Integer totalSeats = null;

  @JsonProperty("available_seats")
  private Integer availableSeats = null;

  @JsonProperty("status")
  private MovieShowStatusType status = null;

  public MovieShowType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the show in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the show in a standard UUID format")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MovieShowType theatre(TheatreSummaryType theatre) {
    this.theatre = theatre;
    return this;
  }

  /**
   * Get theatre
   * @return theatre
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TheatreSummaryType getTheatre() {
    return theatre;
  }

  public void setTheatre(TheatreSummaryType theatre) {
    this.theatre = theatre;
  }

  public MovieShowType showTiming(String showTiming) {
    this.showTiming = showTiming;
    return this;
  }

  /**
   * Show timing in yyyy-MM-ddTHH:MM format
   * @return showTiming
  **/
  @ApiModelProperty(value = "Show timing in yyyy-MM-ddTHH:MM format")


  public String getShowTiming() {
    return showTiming;
  }

  public void setShowTiming(String showTiming) {
    this.showTiming = showTiming;
  }

  public MovieShowType language(LanguageType language) {
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

  public MovieShowType unitPrice(BigDecimal unitPrice) {
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

  public MovieShowType totalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
    return this;
  }

  /**
   * Total number that this show can host
   * @return totalSeats
  **/
  @ApiModelProperty(value = "Total number that this show can host")


  public Integer getTotalSeats() {
    return totalSeats;
  }

  public void setTotalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
  }

  public MovieShowType availableSeats(Integer availableSeats) {
    this.availableSeats = availableSeats;
    return this;
  }

  /**
   * Total available seats that this show still has
   * @return availableSeats
  **/
  @ApiModelProperty(value = "Total available seats that this show still has")


  public Integer getAvailableSeats() {
    return availableSeats;
  }

  public void setAvailableSeats(Integer availableSeats) {
    this.availableSeats = availableSeats;
  }

  public MovieShowType status(MovieShowStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MovieShowStatusType getStatus() {
    return status;
  }

  public void setStatus(MovieShowStatusType status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieShowType movieShowType = (MovieShowType) o;
    return Objects.equals(this.id, movieShowType.id) &&
        Objects.equals(this.theatre, movieShowType.theatre) &&
        Objects.equals(this.showTiming, movieShowType.showTiming) &&
        Objects.equals(this.language, movieShowType.language) &&
        Objects.equals(this.unitPrice, movieShowType.unitPrice) &&
        Objects.equals(this.totalSeats, movieShowType.totalSeats) &&
        Objects.equals(this.availableSeats, movieShowType.availableSeats) &&
        Objects.equals(this.status, movieShowType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, theatre, showTiming, language, unitPrice, totalSeats, availableSeats, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieShowType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    theatre: ").append(toIndentedString(theatre)).append("\n");
    sb.append("    showTiming: ").append(toIndentedString(showTiming)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
    sb.append("    availableSeats: ").append(toIndentedString(availableSeats)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

