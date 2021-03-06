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
import com.ariadnext.idcheckio.model.Control;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CheckSummaryOfTheSubmittedDocument
 */

public class CheckSummaryOfTheSubmittedDocument   {
  @SerializedName("check")
  private List<Control> check = new ArrayList<Control>();

  public CheckSummaryOfTheSubmittedDocument check(List<Control> check) {
    this.check = check;
    return this;
  }

  public CheckSummaryOfTheSubmittedDocument addCheckItem(Control checkItem) {
    this.check.add(checkItem);
    return this;
  }

   /**
   * check results
   * @return check
  **/
  @ApiModelProperty(example = "null", required = true, value = "check results")
  public List<Control> getCheck() {
    return check;
  }

  public void setCheck(List<Control> check) {
    this.check = check;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckSummaryOfTheSubmittedDocument checkSummaryOfTheSubmittedDocument = (CheckSummaryOfTheSubmittedDocument) o;
    return Objects.equals(this.check, checkSummaryOfTheSubmittedDocument.check);
  }

  @Override
  public int hashCode() {
    return Objects.hash(check);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckSummaryOfTheSubmittedDocument {\n");
    
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
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

