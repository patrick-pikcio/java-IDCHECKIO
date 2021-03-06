/**
 * IdCheck.IO API
 * Check identity documents
 *
 * OpenAPI spec version: 0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.ariadnext.idcheckio.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GenericData
 */

public class GenericData   {
  @SerializedName("dataKey")
  private String dataKey = null;

  @SerializedName("dataValue")
  private String dataValue = null;

  @SerializedName("title")
  private String title = null;

  public GenericData dataKey(String dataKey) {
    this.dataKey = dataKey;
    return this;
  }

   /**
   * data key
   * @return dataKey
  **/
  @ApiModelProperty(example = "null", value = "data key")
  public String getDataKey() {
    return dataKey;
  }

  public void setDataKey(String dataKey) {
    this.dataKey = dataKey;
  }

  public GenericData dataValue(String dataValue) {
    this.dataValue = dataValue;
    return this;
  }

   /**
   * data value
   * @return dataValue
  **/
  @ApiModelProperty(example = "null", value = "data value")
  public String getDataValue() {
    return dataValue;
  }

  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }

  public GenericData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericData genericData = (GenericData) o;
    return Objects.equals(this.dataKey, genericData.dataKey) &&
        Objects.equals(this.dataValue, genericData.dataValue) &&
        Objects.equals(this.title, genericData.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataKey, dataValue, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericData {\n");
    
    sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
    sb.append("    dataValue: ").append(toIndentedString(dataValue)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

