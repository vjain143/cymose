
package com.cymose.stix.sdk.model.observables;

import java.util.HashMap;
import java.util.Map;

import com.cymose.stix.sdk.model.common.CyberObservableCore;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "data",
    "data_type"
})
public class Value extends CyberObservableCore {

    /**
     * Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.")
    private String name;
    /**
     * Specifies the data contained in the registry value.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Specifies the data contained in the registry value.")
    private String data;
    /**
     * Specifies the registry (REG_*) data type used in the registry value.
     * 
     */
    @JsonProperty("data_type")
    @JsonPropertyDescription("Specifies the registry (REG_*) data type used in the registry value.")
    private Value.DataType dataType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the data contained in the registry value.
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Specifies the data contained in the registry value.
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Specifies the registry (REG_*) data type used in the registry value.
     * 
     */
    @JsonProperty("data_type")
    public Value.DataType getDataType() {
        return dataType;
    }

    /**
     * Specifies the registry (REG_*) data type used in the registry value.
     * 
     */
    @JsonProperty("data_type")
    public void setDataType(Value.DataType dataType) {
        this.dataType = dataType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("data", data).append("dataType", dataType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(additionalProperties).append(data).append(dataType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return new EqualsBuilder().append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).append(data, rhs.data).append(dataType, rhs.dataType).isEquals();
    }

    public enum DataType {

        REG_NONE("REG_NONE"),
        REG_SZ("REG_SZ"),
        REG_EXPAND_SZ("REG_EXPAND_SZ"),
        REG_BINARY("REG_BINARY"),
        REG_DWORD("REG_DWORD"),
        REG_DWORD_BIG_ENDIAN("REG_DWORD_BIG_ENDIAN"),
        REG_LINK("REG_LINK"),
        REG_MULTI_SZ("REG_MULTI_SZ"),
        REG_RESOURCE_LIST("REG_RESOURCE_LIST"),
        REG_FULL_RESOURCE_DESCRIPTION("REG_FULL_RESOURCE_DESCRIPTION"),
        REG_RESOURCE_REQUIREMENTS_LIST("REG_RESOURCE_REQUIREMENTS_LIST"),
        REG_QWORD("REG_QWORD"),
        REG_INVALID_TYPE("REG_INVALID_TYPE");
        private final String value;
        private final static Map<String, Value.DataType> CONSTANTS = new HashMap<String, Value.DataType>();

        static {
            for (Value.DataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DataType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Value.DataType fromValue(String value) {
            Value.DataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
