
package com.cymose.stix.sdk.model.observables;

import java.util.HashMap;
import java.util.Map;

import com.cymose.stix.sdk.model.common.CyberObservableCore;
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
 * autonomous-system
 * <p>
 * The AS object represents the properties of an Autonomous Systems (AS).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "number",
    "name",
    "rir"
})
public class AutonomousSystem extends CyberObservableCore {

    /**
     * The value of this property MUST be `autonomous-system`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `autonomous-system`.")
    private String type;
    /**
     * Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).")
    private Integer number;
    /**
     * Specifies the name of the AS.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Specifies the name of the AS.")
    private String name;
    /**
     * Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.
     * 
     */
    @JsonProperty("rir")
    @JsonPropertyDescription("Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.")
    private String rir;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `autonomous-system`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `autonomous-system`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).
     * (Required)
     * 
     */
    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    /**
     * Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Specifies the name of the AS.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the AS.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.
     * 
     */
    @JsonProperty("rir")
    public String getRir() {
        return rir;
    }

    /**
     * Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.
     * 
     */
    @JsonProperty("rir")
    public void setRir(String rir) {
        this.rir = rir;
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
        return new ToStringBuilder(this).append("type", type).append("number", number).append("name", name).append("rir", rir).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(number).append(rir).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutonomousSystem) == false) {
            return false;
        }
        AutonomousSystem rhs = ((AutonomousSystem) other);
        return new EqualsBuilder().append(name, rhs.name).append(number, rhs.number).append(rir, rhs.rir).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
