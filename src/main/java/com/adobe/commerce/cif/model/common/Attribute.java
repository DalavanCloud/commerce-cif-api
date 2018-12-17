/*******************************************************************************
 *
 *    Copyright 2018 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.commerce.cif.model.common;

import io.swagger.v3.oas.annotations.media.Schema;

public class Attribute {

    @Schema(description = "The unique id for this text attribute, for example 'width'.", required = true)
    protected String id;

    @Schema(description = "The name for this text attribute.", required = true, example = "Width")
    protected String name;

    @Schema(description = "The value of the attribute. This can be any arbitrary valid JSON value.", required = true)
    protected Object value;
    
    @Schema(description = "If true, this attribute is a variant attribute. If not set or false, the attribute is a normal/simple attribute.")
    protected Boolean isVariantAxis;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Boolean getIsVariantAxis() {
        return isVariantAxis;
    }

    public void setIsVariantAxis(Boolean isVariantAxis) {
        this.isVariantAxis = isVariantAxis;
    }
}
