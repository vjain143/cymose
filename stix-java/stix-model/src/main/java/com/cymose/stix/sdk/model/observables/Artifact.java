
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
 * artifact
 * <p>
 * The Artifact Object permits capturing an array of bytes (8-bits), as a base64-encoded string string, or linking to a file-like payload.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "mime_type"
})
public class Artifact extends CyberObservableCore {

    /**
     * The value of this property MUST be `artifact`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `artifact`.")
    private String type;
    /**
     * The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.
     * 
     */
    @JsonProperty("mime_type")
    @JsonPropertyDescription("The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.")
    private String mimeType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `artifact`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `artifact`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.
     * 
     */
    @JsonProperty("mime_type")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.
     * 
     */
    @JsonProperty("mime_type")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
        return new ToStringBuilder(this).append("type", type).append("mimeType", mimeType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mimeType).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Artifact) == false) {
            return false;
        }
        Artifact rhs = ((Artifact) other);
        return new EqualsBuilder().append(mimeType, rhs.mimeType).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
