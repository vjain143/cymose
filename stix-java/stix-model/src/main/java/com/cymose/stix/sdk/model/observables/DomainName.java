
package com.cymose.stix.sdk.model.observables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * domain-name
 * <p>
 * The Domain Name represents the properties of a network domain name.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "value",
    "resolves_to_refs"
})
public class DomainName extends CyberObservableCore {

    /**
     * The value of this property MUST be `domain-name`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `domain-name`.")
    private String type;
    /**
     * Specifies the value of the domain name.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Specifies the value of the domain name.")
    private String value;
    /**
     * Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.
     * 
     */
    @JsonProperty("resolves_to_refs")
    @JsonPropertyDescription("Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.")
    private List<String> resolvesToRefs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `domain-name`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `domain-name`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies the value of the domain name.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Specifies the value of the domain name.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.
     * 
     */
    @JsonProperty("resolves_to_refs")
    public List<String> getResolvesToRefs() {
        return resolvesToRefs;
    }

    /**
     * Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.
     * 
     */
    @JsonProperty("resolves_to_refs")
    public void setResolvesToRefs(List<String> resolvesToRefs) {
        this.resolvesToRefs = resolvesToRefs;
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
        return new ToStringBuilder(this).append("type", type).append("value", value).append("resolvesToRefs", resolvesToRefs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resolvesToRefs).append(additionalProperties).append(type).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainName) == false) {
            return false;
        }
        DomainName rhs = ((DomainName) other);
        return new EqualsBuilder().append(resolvesToRefs, rhs.resolvesToRefs).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(value, rhs.value).isEquals();
    }

}
