package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import upgrad.movieapp.api.model.TheatreStatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TheatreSummaryType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T18:34:23.757+05:30")

public class TheatreSummaryType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("postal_address")
  private String postalAddress = null;

  @JsonProperty("city_code")
  private String cityCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("status")
  private TheatreStatusType status = null;

  public TheatreSummaryType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the theatre in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the theatre in a standard UUID format")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TheatreSummaryType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the theatre
   * @return name
  **/
  @ApiModelProperty(value = "Name of the theatre")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TheatreSummaryType postalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Postal address of the theatre
   * @return postalAddress
  **/
  @ApiModelProperty(value = "Postal address of the theatre")


  public String getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
  }

  public TheatreSummaryType cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * City code of the theatre
   * @return cityCode
  **/
  @ApiModelProperty(value = "City code of the theatre")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public TheatreSummaryType city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City of the theatre
   * @return city
  **/
  @ApiModelProperty(value = "City of the theatre")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public TheatreSummaryType status(TheatreStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TheatreStatusType getStatus() {
    return status;
  }

  public void setStatus(TheatreStatusType status) {
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
    TheatreSummaryType theatreSummaryType = (TheatreSummaryType) o;
    return Objects.equals(this.id, theatreSummaryType.id) &&
        Objects.equals(this.name, theatreSummaryType.name) &&
        Objects.equals(this.postalAddress, theatreSummaryType.postalAddress) &&
        Objects.equals(this.cityCode, theatreSummaryType.cityCode) &&
        Objects.equals(this.city, theatreSummaryType.city) &&
        Objects.equals(this.status, theatreSummaryType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, postalAddress, cityCode, city, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheatreSummaryType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

