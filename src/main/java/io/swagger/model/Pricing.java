package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pricing
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T15:59:07.679Z")

public class Pricing   {
  @JsonProperty("pricingId")
  private Long pricingId = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  public Pricing pricingId(Long pricingId) {
    this.pricingId = pricingId;
    return this;
  }

  /**
   * Get pricingId
   * @return pricingId
  **/
  @ApiModelProperty(value = "")


  public Long getPricingId() {
    return pricingId;
  }

  public void setPricingId(Long pricingId) {
    this.pricingId = pricingId;
  }

  public Pricing rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(example = "0.5", value = "")

  @Valid

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pricing pricing = (Pricing) o;
    return Objects.equals(this.pricingId, pricing.pricingId) &&
        Objects.equals(this.rate, pricing.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingId, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pricing {\n");
    
    sb.append("    pricingId: ").append(toIndentedString(pricingId)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

