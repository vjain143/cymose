
package com.cymose.stix.sdk.model.sdos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cymose.stix.sdk.model.common.Core;
import com.cymose.stix.sdk.model.common.KillChainPhase;
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
 * attack-pattern
 * <p>
 * Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets. 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "name",
    "description",
    "kill_chain_phases"
})
public class AttackPattern extends Core {

    /**
     * The type of this object, which MUST be the literal `attack-pattern`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `attack-pattern`.")
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
     * The name used to identify the Attack Pattern.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Attack Pattern.")
    private String name;
    /**
     * A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.")
    private String description;
    /**
     * The list of kill chain phases for which this attack pattern is used.
     * 
     */
    @JsonProperty("kill_chain_phases")
    @JsonPropertyDescription("The list of kill chain phases for which this attack pattern is used.")
    private List<KillChainPhase> killChainPhases = new ArrayList<KillChainPhase>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `attack-pattern`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `attack-pattern`.
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
     * The name used to identify the Attack Pattern.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Attack Pattern.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The list of kill chain phases for which this attack pattern is used.
     * 
     */
    @JsonProperty("kill_chain_phases")
    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    /**
     * The list of kill chain phases for which this attack pattern is used.
     * 
     */
    @JsonProperty("kill_chain_phases")
    public void setKillChainPhases(List<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("name", name).append("description", description).append("killChainPhases", killChainPhases).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(killChainPhases).append(name).append(description).append(id).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttackPattern) == false) {
            return false;
        }
        AttackPattern rhs = ((AttackPattern) other);
        return new EqualsBuilder().append(killChainPhases, rhs.killChainPhases).append(name, rhs.name).append(description, rhs.description).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
