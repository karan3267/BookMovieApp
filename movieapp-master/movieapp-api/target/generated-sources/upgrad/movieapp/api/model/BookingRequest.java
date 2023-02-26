package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookingRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:19.438+05:30")

public class BookingRequest   {
  @JsonProperty("show_id")
  private UUID showId = null;

  @JsonProperty("coupon_code")
  private String couponCode = null;

  @JsonProperty("tickets")
  @Valid
  private List<String> tickets = new ArrayList<>();

  public BookingRequest showId(UUID showId) {
    this.showId = showId;
    return this;
  }

  /**
   * Unique identifier of the show in a standard UUID format
   * @return showId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the show in a standard UUID format")
  @NotNull

  @Valid

  public UUID getShowId() {
    return showId;
  }

  public void setShowId(UUID showId) {
    this.showId = showId;
  }

  public BookingRequest couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  /**
   * Coupon code applied while booking
   * @return couponCode
  **/
  @ApiModelProperty(value = "Coupon code applied while booking")


  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public BookingRequest tickets(List<String> tickets) {
    this.tickets = tickets;
    return this;
  }

  public BookingRequest addTicketsItem(String ticketsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingRequest bookingRequest = (BookingRequest) o;
    return Objects.equals(this.showId, bookingRequest.showId) &&
        Objects.equals(this.couponCode, bookingRequest.couponCode) &&
        Objects.equals(this.tickets, bookingRequest.tickets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showId, couponCode, tickets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingRequest {\n");
    
    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
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

