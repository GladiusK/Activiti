/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.workflow.simple.definition.form;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

/**
 * Defines one property in a {@link FormDefinition}.
 * 
 * @author Joram Barrez
 * @author Frederik Heremans
 */
@JsonTypeInfo(use=Id.NAME, include=As.PROPERTY, property="type")
public abstract class FormPropertyDefinition {

  protected String name;
  protected boolean mandatory;
  protected boolean writable;
  
  public String getName() {
    return name;
  }

  public void setName(String propertyName) {
    this.name = propertyName;
  }

  public boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(boolean required) {
    this.mandatory = required;
  }
  
  public boolean isWritable() {
	  return writable;
  }
  
  public void setWritable(boolean writable) {
	  this.writable = writable;
  }
}
