package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import upgrad.movieapp.api.model.BookingCustomerInfoType;
import upgrad.movieapp.api.model.BookingStatusType;
import upgrad.movieapp.api.model.TheatreSummaryType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookingType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class BookingType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("reference_number")
  private String referenceNumber = null;

  @JsonProperty("movie_title")
  private String movieTitle = null;

  @JsonProperty("coupon_code")
  private String couponCode = null;

  @JsonProperty("show_timing")
  private String showTiming = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("theatre")
  private TheatreSummaryType theatre = null;

  @JsonProperty("total_tickets")
  private Integer totalTickets = null;

  @JsonProperty("total_price")
  private BigDecimal totalPrice = null;

  @JsonProperty("tickets")
  @Valid
  private List<String> tickets = new ArrayList<>();

  @JsonProperty("booked_by")
  private BookingCustomerInfoType bookedBy = null;

  @JsonProperty("status")
  private BookingStatusType status = null;

  public BookingType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the booking in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the booking in a standard UUID format")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BookingType referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Booking reference number
   * @return referenceNumber
  **/
  @ApiModelProperty(required = true, value = "Booking reference number")
  @NotNull


  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public BookingType movieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
    return this;
  }

  /**
   * Movie title
   * @return movieTitle
  **/
  @ApiModelProperty(required = true, value = "Movie title")
  @NotNull


  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public BookingType couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  /**
   * Coupon code
   * @return couponCode
  **/
  @ApiModelProperty(value = "Coupon code")


  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public BookingType showTiming(String showTiming) {
    this.showTiming = showTiming;
    return this;
  }

  /**
   * Get showTiming
   * @return showTiming
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getShowTiming() {
    return showTiming;
  }

  public void setShowTiming(String showTiming) {
    this.showTiming = showTiming;
  }

  public BookingType language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language of the movie
   * @return language
  **/
  @ApiModelProperty(required = true, value = "Language of the movie")
  @NotNull


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public BookingType theatre(TheatreSummaryType theatre) {
    this.theatre = theatre;
    return this;
  }

  /**
   * Get theatre
   * @return theatre
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TheatreSummaryType getTheatre() {
    return theatre;
  }

  public void setTheatre(TheatreSummaryType theatre) {
    this.theatre = theatre;
  }

  public BookingType totalTickets(Integer totalTickets) {
    this.totalTickets = totalTickets;
    return this;
  }

  /**
   * Total number of tickets booked
   * @return totalTickets
  **/
  @ApiModelProperty(required = true, value = "Total number of tickets booked")
  @NotNull


  public Integer getTotalTickets() {
    return totalTickets;
  }

  public void setTotalTickets(Integer totalTickets) {
    this.totalTickets = totalTickets;
  }

  public BookingType totalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }

  public BookingType tickets(List<String> tickets) {
    this.tickets = tickets;
    return this;
  }

  public BookingType addTicketsItem(String ticketsItem) {
    this.tickets.add(ticketsItem);
    return this;
  }

  /**
   * Selected ticket numbers for the show
   * @return tickets
  **/
  @ApiModelProperty(required = true, value = "Selected ticket numbers for the show")
  @NotNull


  public List<String> getTickets() {
    return tickets;
  }

  public void setTickets(List<String> tickets) {
    this.tickets = tickets;
  }

  public BookingType bookedBy(BookingCustomerInfoType bookedBy) {
    this.bookedBy = bookedBy;
    return this;
  }

  /**
   * Get bookedBy
   * @return bookedBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BookingCustomerInfoType getBookedBy() {
    return bookedBy;
  }

  public void setBookedBy(BookingCustomerInfoType bookedBy) {
    this.bookedBy = bookedBy;
  }

  public BookingType status(BookingStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BookingStatusType getStatus() {
    return status;
  }

  public void setStatus(BookingStatusType status) {
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
    BookingType bookingType = (BookingType) o;
    return Objects.equals(this.id, bookingType.id) &&
        Objects.equals(this.referenceNumber, bookingType.referenceNumber) &&
        Objects.equals(this.movieTitle, bookingType.movieTitle) &&
        Objects.equals(this.couponCode, bookingType.couponCode) &&
        Objects.equals(this.showTiming, bookingType.showTiming) &&
        Objects.equals(this.language, bookingType.language) &&
        Objects.equals(this.theatre, bookingType.theatre) &&
        Objects.equals(this.totalTickets, bookingType.totalTickets) &&
        Objects.equals(this.totalPrice, bookingType.totalPrice) &&
        Objects.equals(this.tickets, bookingType.tickets) &&
        Objects.equals(this.bookedBy, bookingType.bookedBy) &&
        Objects.equals(this.status, bookingType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceNumber, movieTitle, couponCode, showTiming, language, theatre, totalTickets, totalPrice, tickets, bookedBy, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    movieTitle: ").append(toIndentedString(movieTitle)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    showTiming: ").append(toIndentedString(showTiming)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    theatre: ").append(toIndentedString(theatre)).append("\n");
    sb.append("    totalTickets: ").append(toIndentedString(totalTickets)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    bookedBy: ").append(toIndentedString(bookedBy)).append("\n");
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

