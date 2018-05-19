
package com.cymose.stix.sdk.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * cyber-observable-core
 * <p>
 * Common properties and behavior across all Cyber Observable Objects.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "extensions"
})
public class CyberObservableCore {

    /**
     * Indicates that this object is an Observable Object. The value of this property MUST be a valid Observable Object type name, but to allow for custom objects this has been removed from the schema.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates that this object is an Observable Object. The value of this property MUST be a valid Observable Object type name, but to allow for custom objects this has been removed from the schema.")
    private String type;
    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("extensions")
    @JsonPropertyDescription("A dictionary captures a set of key/value pairs")
    private Extensions extensions;

    /**
     * Indicates that this object is an Observable Object. The value of this property MUST be a valid Observable Object type name, but to allow for custom objects this has been removed from the schema.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Indicates that this object is an Observable Object. The value of this property MUST be a valid Observable Object type name, but to allow for custom objects this has been removed from the schema.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("extensions")
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("extensions")
    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("extensions", extensions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(extensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CyberObservableCore) == false) {
            return false;
        }
        CyberObservableCore rhs = ((CyberObservableCore) other);
        return new EqualsBuilder().append(type, rhs.type).append(extensions, rhs.extensions).isEquals();
    }

}
