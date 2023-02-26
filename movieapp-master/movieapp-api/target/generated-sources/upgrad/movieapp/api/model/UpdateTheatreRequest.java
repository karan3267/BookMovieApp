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
 * UpdateTheatreRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.196+05:30")

public class UpdateTheatreRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("postal_address")
  private String postalAddress = null;

  @JsonProperty("city_code")
  private String cityCode = null;

  public UpdateTheatreRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Updated name of the theatre
   * @return name
  **/
  @ApiModelProperty(value = "Updated name of the theatre")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateTheatreRequest postalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Updated postal address of the theatre
   * @return postalAddress
  **/
  @ApiModelProperty(value = "Updated postal address of the theatre")


  public String getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
  }

  public UpdateTheatreRequest cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Updated city code of the theatre
   * @return cityCode
  **/
  @ApiModelProperty(value = "Updated city code of the theatre")


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
    UpdateTheatreRequest updateTheatreRequest = (UpdateTheatreRequest) o;
    return Objects.equals(this.name, updateTheatreRequest.name) &&
        Objects.equals(this.postalAddress, updateTheatreRequest.postalAddress) &&
        Objects.equals(this.cityCode, updateTheatreRequest.cityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postalAddress, cityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTheatreRequest {\n");
    
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

