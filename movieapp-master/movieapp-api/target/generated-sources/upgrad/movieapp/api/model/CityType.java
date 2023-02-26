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
 * CityType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:11.754+05:30")

public class CityType   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  public CityType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * City code
   * @return code
  **/
  @ApiModelProperty(value = "City code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CityType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * City name
   * @return name
  **/
  @ApiModelProperty(value = "City name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityType cityType = (CityType) o;
    return Objects.equals(this.code, cityType.code) &&
        Objects.equals(this.name, cityType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

