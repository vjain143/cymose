
package com.cymose.stix.sdk.model.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * granular-marking
 * <p>
 * The granular-marking type defines how the list of marking-definition objects referenced by the marking_refs property to apply to a set of content identified by the list of selectors in the selectors property.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "selectors",
    "marking_ref"
})
public class GranularMarking {

    /**
     * A list of selectors for content contained within the STIX object in which this property appears.
     * (Required)
     * 
     */
    @JsonProperty("selectors")
    @JsonPropertyDescription("A list of selectors for content contained within the STIX object in which this property appears.")
    private List<String> selectors = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marking_ref")
    private Object markingRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A list of selectors for content contained within the STIX object in which this property appears.
     * (Required)
     * 
     */
    @JsonProperty("selectors")
    public List<String> getSelectors() {
        return selectors;
    }

    /**
     * A list of selectors for content contained within the STIX object in which this property appears.
     * (Required)
     * 
     */
    @JsonProperty("selectors")
    public void setSelectors(List<String> selectors) {
        this.selectors = selectors;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marking_ref")
    public Object getMarkingRef() {
        return markingRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marking_ref")
    public void setMarkingRef(Object markingRef) {
        this.markingRef = markingRef;
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
        return new ToStringBuilder(this).append("selectors", selectors).append("markingRef", markingRef).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(markingRef).append(additionalProperties).append(selectors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GranularMarking) == false) {
            return false;
        }
        GranularMarking rhs = ((GranularMarking) other);
        return new EqualsBuilder().append(markingRef, rhs.markingRef).append(additionalProperties, rhs.additionalProperties).append(selectors, rhs.selectors).isEquals();
    }

}
