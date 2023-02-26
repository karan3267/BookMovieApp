package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookingCustomerInfoType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class BookingCustomerInfoType   {
  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email_address")
  private String emailAddress = null;

  @JsonProperty("mobile_number")
  private String mobileNumber = null;

  public BookingCustomerInfoType firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the new user
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the new user")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BookingCustomerInfoType lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the new user
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the new user")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BookingCustomerInfoType emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of the new user
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email address of the new user")


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public BookingCustomerInfoType mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Mobile number of the new user
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "Mobile number of the new user")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingCustomerInfoType bookingCustomerInfoType = (BookingCustomerInfoType) o;
    return Objects.equals(this.firstName, bookingCustomerInfoType.firstName) &&
        Objects.equals(this.lastName, bookingCustomerInfoType.lastName) &&
        Objects.equals(this.emailAddress, bookingCustomerInfoType.emailAddress) &&
        Objects.equals(this.mobileNumber, bookingCustomerInfoType.mobileNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, mobileNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingCustomerInfoType {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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

