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
 * CreateTheatreRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.196+05:30")

public class CreateTheatreRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("postal_address")
  private String postalAddress = null;

  @JsonProperty("city_code")
  private String cityCode = null;

  public CreateTheatreRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the theatre
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the theatre")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTheatreRequest postalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Postal address of the theatre
   * @return postalAddress
  **/
  @ApiModelProperty(required = true, value = "Postal address of the theatre")
  @NotNull


  public String getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
  }

  public CreateTheatreRequest cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * City code of the theatre
   * @return cityCode
  **/
  @ApiModelProperty(required = true, value = "City code of the theatre")
  @NotNull


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTheatreRequest createTheatreRequest = (CreateTheatreRequest) o;
    return Objects.equals(this.name, createTheatreRequest.name) &&
        Objects.equals(this.postalAddress, createTheatreRequest.postalAddress) &&
        Objects.equals(this.cityCode, createTheatreRequest.cityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postalAddress, cityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTheatreRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
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

