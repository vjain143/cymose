
package com.cymose.stix.sdk.model.sdos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * intrusion-set
 * <p>
 * An Intrusion Set is a grouped set of adversary behavior and resources with common properties that is believed to be orchestrated by a single organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "name",
    "description",
    "aliases",
    "first_seen",
    "last_seen",
    "goals",
    "resource_level",
    "primary_motivation",
    "secondary_motivations"
})
public class IntrusionSet extends Core {

    /**
     * The type of this object, which MUST be the literal `intrusion-set`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `intrusion-set`.")
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
     * The name used to identify the Intrusion Set.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Intrusion Set.")
    private String name;
    /**
     * Provides more context and details about the Intrusion Set object.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Provides more context and details about the Intrusion Set object.")
    private String description;
    /**
     * Alternative names used to identify this Intrusion Set.
     * 
     */
    @JsonProperty("aliases")
    @JsonPropertyDescription("Alternative names used to identify this Intrusion Set.")
    private List<String> aliases = new ArrayList<String>();
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
     * The high level goals of this Intrusion Set, namely, what are they trying to do.
     * 
     */
    @JsonProperty("goals")
    @JsonPropertyDescription("The high level goals of this Intrusion Set, namely, what are they trying to do.")
    private List<String> goals = new ArrayList<String>();
    /**
     * This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov
     * 
     */
    @JsonProperty("resource_level")
    @JsonPropertyDescription("This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov")
    private String resourceLevel;
    /**
     * The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("primary_motivation")
    @JsonPropertyDescription("The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov")
    private String primaryMotivation;
    /**
     * The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("secondary_motivations")
    @JsonPropertyDescription("The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov")
    private List<String> secondaryMotivations = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `intrusion-set`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `intrusion-set`.
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
     * The name used to identify the Intrusion Set.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Intrusion Set.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Provides more context and details about the Intrusion Set object.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Provides more context and details about the Intrusion Set object.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Alternative names used to identify this Intrusion Set.
     * 
     */
    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Alternative names used to identify this Intrusion Set.
     * 
     */
    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
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
     * The high level goals of this Intrusion Set, namely, what are they trying to do.
     * 
     */
    @JsonProperty("goals")
    public List<String> getGoals() {
        return goals;
    }

    /**
     * The high level goals of this Intrusion Set, namely, what are they trying to do.
     * 
     */
    @JsonProperty("goals")
    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    /**
     * This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov
     * 
     */
    @JsonProperty("resource_level")
    public String getResourceLevel() {
        return resourceLevel;
    }

    /**
     * This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov
     * 
     */
    @JsonProperty("resource_level")
    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    /**
     * The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("primary_motivation")
    public String getPrimaryMotivation() {
        return primaryMotivation;
    }

    /**
     * The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("primary_motivation")
    public void setPrimaryMotivation(String primaryMotivation) {
        this.primaryMotivation = primaryMotivation;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("secondary_motivations")
    public List<String> getSecondaryMotivations() {
        return secondaryMotivations;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("secondary_motivations")
    public void setSecondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("name", name).append("description", description).append("aliases", aliases).append("firstSeen", firstSeen).append("lastSeen", lastSeen).append("goals", goals).append("resourceLevel", resourceLevel).append("primaryMotivation", primaryMotivation).append("secondaryMotivations", secondaryMotivations).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aliases).append(firstSeen).append(resourceLevel).append(description).append(type).append(lastSeen).append(primaryMotivation).append(name).append(id).append(secondaryMotivations).append(additionalProperties).append(goals).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntrusionSet) == false) {
            return false;
        }
        IntrusionSet rhs = ((IntrusionSet) other);
        return new EqualsBuilder().append(aliases, rhs.aliases).append(firstSeen, rhs.firstSeen).append(resourceLevel, rhs.resourceLevel).append(description, rhs.description).append(type, rhs.type).append(lastSeen, rhs.lastSeen).append(primaryMotivation, rhs.primaryMotivation).append(name, rhs.name).append(id, rhs.id).append(secondaryMotivations, rhs.secondaryMotivations).append(additionalProperties, rhs.additionalProperties).append(goals, rhs.goals).isEquals();
    }

}
