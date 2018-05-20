
package com.cymose.stix.sdk.model.sros;

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
 * sighting
 * <p>
 * A Sighting denotes the belief that something in CTI (e.g., an indicator, malware, tool, threat actor, etc.) was seen.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "first_seen",
    "last_seen",
    "count",
    "sighting_of_ref",
    "observed_data_refs",
    "where_sighted_refs",
    "summary"
})
public class Sighting {

    /**
     * The type of this object, which MUST be the literal `sighting`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `sighting`.")
    private String type;
    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private Object id;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("first_seen")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String firstSeen;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("last_seen")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String lastSeen;
    /**
     * This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.")
    private Integer count;
    /**
     * An ID reference to the object that has been sighted.
     * (Required)
     * 
     */
    @JsonProperty("sighting_of_ref")
    @JsonPropertyDescription("An ID reference to the object that has been sighted.")
    private Object sightingOfRef;
    /**
     * A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.
     * 
     */
    @JsonProperty("observed_data_refs")
    @JsonPropertyDescription("A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.")
    private List<Object> observedDataRefs = new ArrayList<Object>();
    /**
     * The ID of the Victim Target objects of the entities that saw the sighting.
     * 
     */
    @JsonProperty("where_sighted_refs")
    @JsonPropertyDescription("The ID of the Victim Target objects of the entities that saw the sighting.")
    private List<Object> whereSightedRefs = new ArrayList<Object>();
    /**
     * The summary property indicates whether the Sighting should be considered summary data. 
     * 
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("The summary property indicates whether the Sighting should be considered summary data. ")
    private Boolean summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `sighting`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `sighting`.
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
    public Object getId() {
        return id;
    }

    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("first_seen")
    public String getFirstSeen() {
        return firstSeen;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("first_seen")
    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("last_seen")
    public String getLastSeen() {
        return lastSeen;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("last_seen")
    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * An ID reference to the object that has been sighted.
     * (Required)
     * 
     */
    @JsonProperty("sighting_of_ref")
    public Object getSightingOfRef() {
        return sightingOfRef;
    }

    /**
     * An ID reference to the object that has been sighted.
     * (Required)
     * 
     */
    @JsonProperty("sighting_of_ref")
    public void setSightingOfRef(Object sightingOfRef) {
        this.sightingOfRef = sightingOfRef;
    }

    /**
     * A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.
     * 
     */
    @JsonProperty("observed_data_refs")
    public List<Object> getObservedDataRefs() {
        return observedDataRefs;
    }

    /**
     * A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.
     * 
     */
    @JsonProperty("observed_data_refs")
    public void setObservedDataRefs(List<Object> observedDataRefs) {
        this.observedDataRefs = observedDataRefs;
    }

    /**
     * The ID of the Victim Target objects of the entities that saw the sighting.
     * 
     */
    @JsonProperty("where_sighted_refs")
    public List<Object> getWhereSightedRefs() {
        return whereSightedRefs;
    }

    /**
     * The ID of the Victim Target objects of the entities that saw the sighting.
     * 
     */
    @JsonProperty("where_sighted_refs")
    public void setWhereSightedRefs(List<Object> whereSightedRefs) {
        this.whereSightedRefs = whereSightedRefs;
    }

    /**
     * The summary property indicates whether the Sighting should be considered summary data. 
     * 
     */
    @JsonProperty("summary")
    public Boolean getSummary() {
        return summary;
    }

    /**
     * The summary property indicates whether the Sighting should be considered summary data. 
     * 
     */
    @JsonProperty("summary")
    public void setSummary(Boolean summary) {
        this.summary = summary;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("firstSeen", firstSeen).append("lastSeen", lastSeen).append("count", count).append("sightingOfRef", sightingOfRef).append("observedDataRefs", observedDataRefs).append("whereSightedRefs", whereSightedRefs).append("summary", summary).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(summary).append(lastSeen).append(firstSeen).append(count).append(whereSightedRefs).append(observedDataRefs).append(id).append(additionalProperties).append(type).append(sightingOfRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sighting) == false) {
            return false;
        }
        Sighting rhs = ((Sighting) other);
        return new EqualsBuilder().append(summary, rhs.summary).append(lastSeen, rhs.lastSeen).append(firstSeen, rhs.firstSeen).append(count, rhs.count).append(whereSightedRefs, rhs.whereSightedRefs).append(observedDataRefs, rhs.observedDataRefs).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(sightingOfRef, rhs.sightingOfRef).isEquals();
    }

}
