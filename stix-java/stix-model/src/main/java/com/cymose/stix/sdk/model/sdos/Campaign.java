
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
 * campaign
 * <p>
 * A Campaign is a grouping of adversary behavior that describes a set of malicious activities or attacks that occur over a period of time against a specific set of targets.
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
    "objective"
})
public class Campaign extends Core {

    /**
     * The type of this object, which MUST be the literal `campaign`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `campaign`.")
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
     * The name used to identify the Campaign.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Campaign.")
    private String name;
    /**
     * A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.")
    private String description;
    /**
     * Alternative names used to identify this campaign.
     * 
     */
    @JsonProperty("aliases")
    @JsonPropertyDescription("Alternative names used to identify this campaign.")
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
     * This field defines the Campaign’s primary goal, objective, desired outcome, or intended effect.
     * 
     */
    @JsonProperty("objective")
    @JsonPropertyDescription("This field defines the Campaign\u2019s primary goal, objective, desired outcome, or intended effect.")
    private String objective;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `campaign`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `campaign`.
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
     * The name used to identify the Campaign.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Campaign.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Alternative names used to identify this campaign.
     * 
     */
    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Alternative names used to identify this campaign.
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
     * This field defines the Campaign’s primary goal, objective, desired outcome, or intended effect.
     * 
     */
    @JsonProperty("objective")
    public String getObjective() {
        return objective;
    }

    /**
     * This field defines the Campaign’s primary goal, objective, desired outcome, or intended effect.
     * 
     */
    @JsonProperty("objective")
    public void setObjective(String objective) {
        this.objective = objective;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("name", name).append("description", description).append("aliases", aliases).append("firstSeen", firstSeen).append("lastSeen", lastSeen).append("objective", objective).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aliases).append(lastSeen).append(firstSeen).append(name).append(description).append(id).append(additionalProperties).append(type).append(objective).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Campaign) == false) {
            return false;
        }
        Campaign rhs = ((Campaign) other);
        return new EqualsBuilder().append(aliases, rhs.aliases).append(lastSeen, rhs.lastSeen).append(firstSeen, rhs.firstSeen).append(name, rhs.name).append(description, rhs.description).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(objective, rhs.objective).isEquals();
    }

}
