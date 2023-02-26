package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import upgrad.movieapp.api.model.LanguageType;
import upgrad.movieapp.api.model.MovieSummaryType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TheatreShowType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.196+05:30")

public class TheatreShowType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("movie")
  private MovieSummaryType movie = null;

  @JsonProperty("show_timing")
  private String showTiming = null;

  @JsonProperty("language")
  private LanguageType language = null;

  @JsonProperty("unit_price")
  private Float unitPrice = null;

  @JsonProperty("total_seats")
  private Integer totalSeats = null;

  @JsonProperty("available_seats")
  private Integer availableSeats = null;

  public TheatreShowType id(UUID id) {
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

  public TheatreShowType movie(MovieSummaryType movie) {
    this.movie = movie;
    return this;
  }

  /**
   * Get movie
   * @return movie
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MovieSummaryType getMovie() {
    return movie;
  }

  public void setMovie(MovieSummaryType movie) {
    this.movie = movie;
  }

  public TheatreShowType showTiming(String showTiming) {
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

  public TheatreShowType language(LanguageType language) {
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

  public TheatreShowType unitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Unit price of the movie (for e.g. 200.00)
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Unit price of the movie (for e.g. 200.00)")


  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public TheatreShowType totalSeats(Integer totalSeats) {
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

  public TheatreShowType availableSeats(Integer availableSeats) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheatreShowType theatreShowType = (TheatreShowType) o;
    return Objects.equals(this.id, theatreShowType.id) &&
        Objects.equals(this.movie, theatreShowType.movie) &&
        Objects.equals(this.showTiming, theatreShowType.showTiming) &&
        Objects.equals(this.language, theatreShowType.language) &&
        Objects.equals(this.unitPrice, theatreShowType.unitPrice) &&
        Objects.equals(this.totalSeats, theatreShowType.totalSeats) &&
        Objects.equals(this.availableSeats, theatreShowType.availableSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, movie, showTiming, language, unitPrice, totalSeats, availableSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheatreShowType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    movie: ").append(toIndentedString(movie)).append("\n");
    sb.append("    showTiming: ").append(toIndentedString(showTiming)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
    sb.append("    availableSeats: ").append(toIndentedString(availableSeats)).append("\n");
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

