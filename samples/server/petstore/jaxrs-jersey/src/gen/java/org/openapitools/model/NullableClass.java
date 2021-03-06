/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * NullableClass
 */

public class NullableClass extends HashMap<String, Object>  {
  @JsonProperty("integer_prop")
  private Integer integerProp;

  @JsonProperty("number_prop")
  private BigDecimal numberProp;

  @JsonProperty("boolean_prop")
  private Boolean booleanProp;

  @JsonProperty("string_prop")
  private String stringProp;

  @JsonProperty("date_prop")
  private Date dateProp;

  @JsonProperty("datetime_prop")
  private Date datetimeProp;

  @JsonProperty("array_nullable_prop")
  private List<Object> arrayNullableProp = null;

  @JsonProperty("array_and_items_nullable_prop")
  private List<Object> arrayAndItemsNullableProp = null;

  @JsonProperty("array_items_nullable")
  private List<Object> arrayItemsNullable = null;

  @JsonProperty("object_nullable_prop")
  private Map<String, Object> objectNullableProp = null;

  @JsonProperty("object_and_items_nullable_prop")
  private Map<String, Object> objectAndItemsNullableProp = null;

  @JsonProperty("object_items_nullable")
  private Map<String, Object> objectItemsNullable = null;

  public NullableClass integerProp(Integer integerProp) {
    this.integerProp = integerProp;
    return this;
  }

  /**
   * Get integerProp
   * @return integerProp
   **/
  @JsonProperty("integer_prop")
  @ApiModelProperty(value = "")
  
  public Integer getIntegerProp() {
    return integerProp;
  }

  public void setIntegerProp(Integer integerProp) {
    this.integerProp = integerProp;
  }

  public NullableClass numberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
    return this;
  }

  /**
   * Get numberProp
   * @return numberProp
   **/
  @JsonProperty("number_prop")
  @ApiModelProperty(value = "")
  @Valid 
  public BigDecimal getNumberProp() {
    return numberProp;
  }

  public void setNumberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
  }

  public NullableClass booleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
    return this;
  }

  /**
   * Get booleanProp
   * @return booleanProp
   **/
  @JsonProperty("boolean_prop")
  @ApiModelProperty(value = "")
  
  public Boolean getBooleanProp() {
    return booleanProp;
  }

  public void setBooleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
  }

  public NullableClass stringProp(String stringProp) {
    this.stringProp = stringProp;
    return this;
  }

  /**
   * Get stringProp
   * @return stringProp
   **/
  @JsonProperty("string_prop")
  @ApiModelProperty(value = "")
  
  public String getStringProp() {
    return stringProp;
  }

  public void setStringProp(String stringProp) {
    this.stringProp = stringProp;
  }

  public NullableClass dateProp(Date dateProp) {
    this.dateProp = dateProp;
    return this;
  }

  /**
   * Get dateProp
   * @return dateProp
   **/
  @JsonProperty("date_prop")
  @ApiModelProperty(value = "")
  
  public Date getDateProp() {
    return dateProp;
  }

  public void setDateProp(Date dateProp) {
    this.dateProp = dateProp;
  }

  public NullableClass datetimeProp(Date datetimeProp) {
    this.datetimeProp = datetimeProp;
    return this;
  }

  /**
   * Get datetimeProp
   * @return datetimeProp
   **/
  @JsonProperty("datetime_prop")
  @ApiModelProperty(value = "")
  
  public Date getDatetimeProp() {
    return datetimeProp;
  }

  public void setDatetimeProp(Date datetimeProp) {
    this.datetimeProp = datetimeProp;
  }

  public NullableClass arrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
    return this;
  }

  public NullableClass addArrayNullablePropItem(Object arrayNullablePropItem) {
    if (this.arrayNullableProp == null) {
      this.arrayNullableProp = new ArrayList<Object>();
    }
    this.arrayNullableProp.add(arrayNullablePropItem);
    return this;
  }

  /**
   * Get arrayNullableProp
   * @return arrayNullableProp
   **/
  @JsonProperty("array_nullable_prop")
  @ApiModelProperty(value = "")
  
  public List<Object> getArrayNullableProp() {
    return arrayNullableProp;
  }

  public void setArrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
  }

  public NullableClass arrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
    return this;
  }

  public NullableClass addArrayAndItemsNullablePropItem(Object arrayAndItemsNullablePropItem) {
    if (this.arrayAndItemsNullableProp == null) {
      this.arrayAndItemsNullableProp = new ArrayList<Object>();
    }
    this.arrayAndItemsNullableProp.add(arrayAndItemsNullablePropItem);
    return this;
  }

  /**
   * Get arrayAndItemsNullableProp
   * @return arrayAndItemsNullableProp
   **/
  @JsonProperty("array_and_items_nullable_prop")
  @ApiModelProperty(value = "")
  
  public List<Object> getArrayAndItemsNullableProp() {
    return arrayAndItemsNullableProp;
  }

  public void setArrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
  }

  public NullableClass arrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
    return this;
  }

  public NullableClass addArrayItemsNullableItem(Object arrayItemsNullableItem) {
    if (this.arrayItemsNullable == null) {
      this.arrayItemsNullable = new ArrayList<Object>();
    }
    this.arrayItemsNullable.add(arrayItemsNullableItem);
    return this;
  }

  /**
   * Get arrayItemsNullable
   * @return arrayItemsNullable
   **/
  @JsonProperty("array_items_nullable")
  @ApiModelProperty(value = "")
  
  public List<Object> getArrayItemsNullable() {
    return arrayItemsNullable;
  }

  public void setArrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
  }

  public NullableClass objectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
    return this;
  }

  public NullableClass putObjectNullablePropItem(String key, Object objectNullablePropItem) {
    if (this.objectNullableProp == null) {
      this.objectNullableProp = new HashMap<String, Object>();
    }
    this.objectNullableProp.put(key, objectNullablePropItem);
    return this;
  }

  /**
   * Get objectNullableProp
   * @return objectNullableProp
   **/
  @JsonProperty("object_nullable_prop")
  @ApiModelProperty(value = "")
  
  public Map<String, Object> getObjectNullableProp() {
    return objectNullableProp;
  }

  public void setObjectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
  }

  public NullableClass objectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
    return this;
  }

  public NullableClass putObjectAndItemsNullablePropItem(String key, Object objectAndItemsNullablePropItem) {
    if (this.objectAndItemsNullableProp == null) {
      this.objectAndItemsNullableProp = new HashMap<String, Object>();
    }
    this.objectAndItemsNullableProp.put(key, objectAndItemsNullablePropItem);
    return this;
  }

  /**
   * Get objectAndItemsNullableProp
   * @return objectAndItemsNullableProp
   **/
  @JsonProperty("object_and_items_nullable_prop")
  @ApiModelProperty(value = "")
  
  public Map<String, Object> getObjectAndItemsNullableProp() {
    return objectAndItemsNullableProp;
  }

  public void setObjectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
  }

  public NullableClass objectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
    return this;
  }

  public NullableClass putObjectItemsNullableItem(String key, Object objectItemsNullableItem) {
    if (this.objectItemsNullable == null) {
      this.objectItemsNullable = new HashMap<String, Object>();
    }
    this.objectItemsNullable.put(key, objectItemsNullableItem);
    return this;
  }

  /**
   * Get objectItemsNullable
   * @return objectItemsNullable
   **/
  @JsonProperty("object_items_nullable")
  @ApiModelProperty(value = "")
  
  public Map<String, Object> getObjectItemsNullable() {
    return objectItemsNullable;
  }

  public void setObjectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableClass nullableClass = (NullableClass) o;
    return Objects.equals(this.integerProp, nullableClass.integerProp) &&
        Objects.equals(this.numberProp, nullableClass.numberProp) &&
        Objects.equals(this.booleanProp, nullableClass.booleanProp) &&
        Objects.equals(this.stringProp, nullableClass.stringProp) &&
        Objects.equals(this.dateProp, nullableClass.dateProp) &&
        Objects.equals(this.datetimeProp, nullableClass.datetimeProp) &&
        Objects.equals(this.arrayNullableProp, nullableClass.arrayNullableProp) &&
        Objects.equals(this.arrayAndItemsNullableProp, nullableClass.arrayAndItemsNullableProp) &&
        Objects.equals(this.arrayItemsNullable, nullableClass.arrayItemsNullable) &&
        Objects.equals(this.objectNullableProp, nullableClass.objectNullableProp) &&
        Objects.equals(this.objectAndItemsNullableProp, nullableClass.objectAndItemsNullableProp) &&
        Objects.equals(this.objectItemsNullable, nullableClass.objectItemsNullable) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integerProp, numberProp, booleanProp, stringProp, dateProp, datetimeProp, arrayNullableProp, arrayAndItemsNullableProp, arrayItemsNullable, objectNullableProp, objectAndItemsNullableProp, objectItemsNullable, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableClass {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    integerProp: ").append(toIndentedString(integerProp)).append("\n");
    sb.append("    numberProp: ").append(toIndentedString(numberProp)).append("\n");
    sb.append("    booleanProp: ").append(toIndentedString(booleanProp)).append("\n");
    sb.append("    stringProp: ").append(toIndentedString(stringProp)).append("\n");
    sb.append("    dateProp: ").append(toIndentedString(dateProp)).append("\n");
    sb.append("    datetimeProp: ").append(toIndentedString(datetimeProp)).append("\n");
    sb.append("    arrayNullableProp: ").append(toIndentedString(arrayNullableProp)).append("\n");
    sb.append("    arrayAndItemsNullableProp: ").append(toIndentedString(arrayAndItemsNullableProp)).append("\n");
    sb.append("    arrayItemsNullable: ").append(toIndentedString(arrayItemsNullable)).append("\n");
    sb.append("    objectNullableProp: ").append(toIndentedString(objectNullableProp)).append("\n");
    sb.append("    objectAndItemsNullableProp: ").append(toIndentedString(objectAndItemsNullableProp)).append("\n");
    sb.append("    objectItemsNullable: ").append(toIndentedString(objectItemsNullable)).append("\n");
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

