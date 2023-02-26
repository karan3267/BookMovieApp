package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.BookingType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookingsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class BookingsSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("bookings")
  @Valid
  private List<BookingType> bookings = null;

  public BookingsSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched bookings
   * @return page
  **/
  @ApiModelProperty(value = "page or position of the fetched bookings")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public BookingsSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of bookings fetched per this request
   * @return limit
  **/
  @ApiModelProperty(value = "number of bookings fetched per this request")


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public BookingsSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of bookings
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of bookings")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public BookingsSummaryResponse bookings(List<BookingType> bookings) {
    this.bookings = bookings;
    return this;
  }

  public BookingsSummaryResponse addBookingsItem(BookingType bookingsItem) {
    if (this.bookings == null) {
      this.bookings = new ArrayList<>();
    }
    this.bookings.add(bookingsItem);
    return this;
  }

  /**
   * List of bookins
   * @return bookings
  **/
  @ApiModelProperty(value = "List of bookins")

  @Valid

  public List<BookingType> getBookings() {
    return bookings;
  }

  public void setBookings(List<BookingType> bookings) {
    this.bookings = bookings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingsSummaryResponse bookingsSummaryResponse = (BookingsSummaryResponse) o;
    return Objects.equals(this.page, bookingsSummaryResponse.page) &&
        Objects.equals(this.limit, bookingsSummaryResponse.limit) &&
        Objects.equals(this.totalCount, bookingsSummaryResponse.totalCount) &&
        Objects.equals(this.bookings, bookingsSummaryResponse.bookings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, bookings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingsSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    bookings: ").append(toIndentedString(bookings)).append("\n");
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

