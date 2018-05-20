
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
 * ipv6-addr
 * <p>
 * The IPv6 Address Object represents one or more IPv6 addresses expressed using CIDR notation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "value",
    "resolves_to_refs",
    "belongs_to_refs"
})
public class Ipv6Addr extends CyberObservableCore {

    /**
     * The value of this property MUST be `ipv6-addr`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `ipv6-addr`.")
    private String type;
    /**
     * Specifies one or more IPv6 addresses expressed using CIDR notation.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Specifies one or more IPv6 addresses expressed using CIDR notation.")
    private String value;
    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.
     * 
     */
    @JsonProperty("resolves_to_refs")
    @JsonPropertyDescription("Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.")
    private List<String> resolvesToRefs = new ArrayList<String>();
    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.
     * 
     */
    @JsonProperty("belongs_to_refs")
    @JsonPropertyDescription("Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.")
    private List<String> belongsToRefs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `ipv6-addr`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `ipv6-addr`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies one or more IPv6 addresses expressed using CIDR notation.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Specifies one or more IPv6 addresses expressed using CIDR notation.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.
     * 
     */
    @JsonProperty("resolves_to_refs")
    public List<String> getResolvesToRefs() {
        return resolvesToRefs;
    }

    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.
     * 
     */
    @JsonProperty("resolves_to_refs")
    public void setResolvesToRefs(List<String> resolvesToRefs) {
        this.resolvesToRefs = resolvesToRefs;
    }

    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.
     * 
     */
    @JsonProperty("belongs_to_refs")
    public List<String> getBelongsToRefs() {
        return belongsToRefs;
    }

    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.
     * 
     */
    @JsonProperty("belongs_to_refs")
    public void setBelongsToRefs(List<String> belongsToRefs) {
        this.belongsToRefs = belongsToRefs;
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
        return new ToStringBuilder(this).append("type", type).append("value", value).append("resolvesToRefs", resolvesToRefs).append("belongsToRefs", belongsToRefs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resolvesToRefs).append(additionalProperties).append(type).append(value).append(belongsToRefs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ipv6Addr) == false) {
            return false;
        }
        Ipv6Addr rhs = ((Ipv6Addr) other);
        return new EqualsBuilder().append(resolvesToRefs, rhs.resolvesToRefs).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(value, rhs.value).append(belongsToRefs, rhs.belongsToRefs).isEquals();
    }

}
