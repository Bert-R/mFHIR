/*
 * Copyright 2017 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.schema.domain.omh;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmhealth.schema.serializer.SerializationConstructor;

import java.math.BigDecimal;


/**
 * @author Emerson Farrugia
 * @version 1.0
 * @see <a href="http://www.openmhealth.org/documentation/#/schema-docs/schema-library/schemas/omh_plane-angle-unit-value">plane-angle-unit-value</a>
 */
public class PlaneAngleUnitValue extends TypedUnitValue<PlaneAngleUnit> {

    public static final SchemaId SCHEMA_ID = new SchemaId(OMH_NAMESPACE, "plane-angle-unit-value", "1.0");

    @SerializationConstructor
    protected PlaneAngleUnitValue() {
    }

    @JsonCreator
    public PlaneAngleUnitValue(@JsonProperty("unit") PlaneAngleUnit unit, @JsonProperty("value") BigDecimal value) {
        super(unit, value);
    }

    @Override
    public SchemaId getSchemaId() {
        return SCHEMA_ID;
    }

    public PlaneAngleUnitValue(PlaneAngleUnit unit, double value) {
        super(unit, value);
    }

    public PlaneAngleUnitValue(PlaneAngleUnit unit, long value) {
        super(unit, value);
    }
}
