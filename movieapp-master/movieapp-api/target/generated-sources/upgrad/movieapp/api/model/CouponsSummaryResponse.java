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
 * CouponsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:19.438+05:30")

public class CouponsSummaryResponse   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("description")
  private String description = null;

  public CouponsSummaryResponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * coupon code
   * @return code
  **/
  @ApiModelProperty(value = "coupon code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CouponsSummaryResponse value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * value of the coupon
   * @return value
  **/
  @ApiModelProperty(value = "value of the coupon")


  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public CouponsSummaryResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the coupon
   * @return description
  **/
  @ApiModelProperty(value = "description of the coupon")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponsSummaryResponse couponsSummaryResponse = (CouponsSummaryResponse) o;
    return Objects.equals(this.code, couponsSummaryResponse.code) &&
        Objects.equals(this.value, couponsSummaryResponse.value) &&
        Objects.equals(this.description, couponsSummaryResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponsSummaryResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

