
package com.cymose.stix.sdk.model.sdos;

import java.util.HashMap;
import java.util.Map;

import com.cymose.stix.sdk.model.common.Core;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * observed-data
 * <p>
 * Observed data conveys information that was observed on systems and networks, such as log data or network traffic, using the Cyber Observable specification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "first_observed",
    "last_observed",
    "number_observed",
    "objects"
})
public class ObservedData extends Core {

    /**
     * The type of this object, which MUST be the literal `observed-data`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `observed-data`.")
    private String type;
    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("first_observed")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String firstObserved;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("last_observed")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String lastObserved;
    /**
     * The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.
     * (Required)
     * 
     */
    @JsonProperty("number_observed")
    @JsonPropertyDescription("The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.")
    private Integer numberObserved;
    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     * 
     */
    @JsonProperty("objects")
    @JsonPropertyDescription("A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.")
    private Objects objects;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `observed-data`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `observed-data`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("first_observed")
    public String getFirstObserved() {
        return firstObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("first_observed")
    public void setFirstObserved(String firstObserved) {
        this.firstObserved = firstObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("last_observed")
    public String getLastObserved() {
        return lastObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("last_observed")
    public void setLastObserved(String lastObserved) {
        this.lastObserved = lastObserved;
    }

    /**
     * The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.
     * (Required)
     * 
     */
    @JsonProperty("number_observed")
    public Integer getNumberObserved() {
        return numberObserved;
    }

    /**
     * The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.
     * (Required)
     * 
     */
    @JsonProperty("number_observed")
    public void setNumberObserved(Integer numberObserved) {
        this.numberObserved = numberObserved;
    }

    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     * 
     */
    @JsonProperty("objects")
    public Objects getObjects() {
        return objects;
    }

    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     * 
     */
    @JsonProperty("objects")
    public void setObjects(Objects objects) {
        this.objects = objects;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("firstObserved", firstObserved).append("lastObserved", lastObserved).append("numberObserved", numberObserved).append("objects", objects).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstObserved).append(numberObserved).append(lastObserved).append(objects).append(id).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObservedData) == false) {
            return false;
        }
        ObservedData rhs = ((ObservedData) other);
        return new EqualsBuilder().append(firstObserved, rhs.firstObserved).append(numberObserved, rhs.numberObserved).append(lastObserved, rhs.lastObserved).append(objects, rhs.objects).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
