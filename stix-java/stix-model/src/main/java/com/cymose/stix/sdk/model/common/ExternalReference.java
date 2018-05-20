
package com.cymose.stix.sdk.model.common;

import java.util.HashMap;
import java.util.Map;
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
 * external-reference
 * <p>
 * External references are used to describe pointers to information represented outside of STIX.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "url",
    "hashes"
})
public class ExternalReference {

    /**
     * A human readable description
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A human readable description")
    private String description;
    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("Matches the elements of a URL using a regular expression.")
    private String url;
    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    @JsonPropertyDescription("A dictionary captures a set of key/value pairs")
    private Hashes hashes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A human readable description
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A human readable description
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    public Hashes getHashes() {
        return hashes;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    public void setHashes(Hashes hashes) {
        this.hashes = hashes;
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
        return new ToStringBuilder(this).append("description", description).append("url", url).append("hashes", hashes).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hashes).append(description).append(additionalProperties).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalReference) == false) {
            return false;
        }
        ExternalReference rhs = ((ExternalReference) other);
        return new EqualsBuilder().append(hashes, rhs.hashes).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).append(url, rhs.url).isEquals();
    }

}
