
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
 * threat-actor
 * <p>
 * Threat Actors are actual individuals, groups, or organizations believed to be operating with malicious intent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "labels",
    "name",
    "description",
    "aliases",
    "roles",
    "goals",
    "sophistication",
    "resource_level",
    "primary_motivation",
    "secondary_motivations",
    "personal_motivations"
})
public class ThreatActor extends Core {

    /**
     * The type of this object, which MUST be the literal `threat-actor`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `threat-actor`.")
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
     * This field specifies the type of threat actor. Open Vocab - threat-actor-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("This field specifies the type of threat actor. Open Vocab - threat-actor-label-ov")
    private List<String> labels = new ArrayList<String>();
    /**
     * A name used to identify this Threat Actor or Threat Actor group.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A name used to identify this Threat Actor or Threat Actor group.")
    private String name;
    /**
     * A description that provides more details and context about the Threat Actor.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides more details and context about the Threat Actor.")
    private String description;
    /**
     * A list of other names that this Threat Actor is believed to use.
     * 
     */
    @JsonProperty("aliases")
    @JsonPropertyDescription("A list of other names that this Threat Actor is believed to use.")
    private List<String> aliases = new ArrayList<String>();
    /**
     * This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov
     * 
     */
    @JsonProperty("roles")
    @JsonPropertyDescription("This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov")
    private List<String> roles = new ArrayList<String>();
    /**
     * The high level goals of this Threat Actor, namely, what are they trying to do.
     * 
     */
    @JsonProperty("goals")
    @JsonPropertyDescription("The high level goals of this Threat Actor, namely, what are they trying to do.")
    private List<String> goals = new ArrayList<String>();
    /**
     * The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov
     * 
     */
    @JsonProperty("sophistication")
    @JsonPropertyDescription("The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov")
    private String sophistication;
    /**
     * This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov
     * 
     */
    @JsonProperty("resource_level")
    @JsonPropertyDescription("This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov")
    private String resourceLevel;
    /**
     * The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("primary_motivation")
    @JsonPropertyDescription("The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov")
    private String primaryMotivation;
    /**
     * The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("secondary_motivations")
    @JsonPropertyDescription("The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov")
    private List<String> secondaryMotivations = new ArrayList<String>();
    /**
     * The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("personal_motivations")
    @JsonPropertyDescription("The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov")
    private List<String> personalMotivations = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `threat-actor`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `threat-actor`.
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
     * This field specifies the type of threat actor. Open Vocab - threat-actor-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * This field specifies the type of threat actor. Open Vocab - threat-actor-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * A name used to identify this Threat Actor or Threat Actor group.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A name used to identify this Threat Actor or Threat Actor group.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Threat Actor.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Threat Actor.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A list of other names that this Threat Actor is believed to use.
     * 
     */
    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * A list of other names that this Threat Actor is believed to use.
     * 
     */
    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov
     * 
     */
    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }

    /**
     * This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov
     * 
     */
    @JsonProperty("roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * The high level goals of this Threat Actor, namely, what are they trying to do.
     * 
     */
    @JsonProperty("goals")
    public List<String> getGoals() {
        return goals;
    }

    /**
     * The high level goals of this Threat Actor, namely, what are they trying to do.
     * 
     */
    @JsonProperty("goals")
    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    /**
     * The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov
     * 
     */
    @JsonProperty("sophistication")
    public String getSophistication() {
        return sophistication;
    }

    /**
     * The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov
     * 
     */
    @JsonProperty("sophistication")
    public void setSophistication(String sophistication) {
        this.sophistication = sophistication;
    }

    /**
     * This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov
     * 
     */
    @JsonProperty("resource_level")
    public String getResourceLevel() {
        return resourceLevel;
    }

    /**
     * This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov
     * 
     */
    @JsonProperty("resource_level")
    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    /**
     * The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("primary_motivation")
    public String getPrimaryMotivation() {
        return primaryMotivation;
    }

    /**
     * The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("primary_motivation")
    public void setPrimaryMotivation(String primaryMotivation) {
        this.primaryMotivation = primaryMotivation;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("secondary_motivations")
    public List<String> getSecondaryMotivations() {
        return secondaryMotivations;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("secondary_motivations")
    public void setSecondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
    }

    /**
     * The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("personal_motivations")
    public List<String> getPersonalMotivations() {
        return personalMotivations;
    }

    /**
     * The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov
     * 
     */
    @JsonProperty("personal_motivations")
    public void setPersonalMotivations(List<String> personalMotivations) {
        this.personalMotivations = personalMotivations;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("labels", labels).append("name", name).append("description", description).append("aliases", aliases).append("roles", roles).append("goals", goals).append("sophistication", sophistication).append("resourceLevel", resourceLevel).append("primaryMotivation", primaryMotivation).append("secondaryMotivations", secondaryMotivations).append("personalMotivations", personalMotivations).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aliases).append(sophistication).append(roles).append(resourceLevel).append(description).append(type).append(labels).append(primaryMotivation).append(name).append(personalMotivations).append(id).append(secondaryMotivations).append(additionalProperties).append(goals).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreatActor) == false) {
            return false;
        }
        ThreatActor rhs = ((ThreatActor) other);
        return new EqualsBuilder().append(aliases, rhs.aliases).append(sophistication, rhs.sophistication).append(roles, rhs.roles).append(resourceLevel, rhs.resourceLevel).append(description, rhs.description).append(type, rhs.type).append(labels, rhs.labels).append(primaryMotivation, rhs.primaryMotivation).append(name, rhs.name).append(personalMotivations, rhs.personalMotivations).append(id, rhs.id).append(secondaryMotivations, rhs.secondaryMotivations).append(additionalProperties, rhs.additionalProperties).append(goals, rhs.goals).isEquals();
    }

}
