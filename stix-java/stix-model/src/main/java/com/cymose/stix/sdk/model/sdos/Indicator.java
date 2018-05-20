
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
 * indicator
 * <p>
 * Indicators contain a pattern that can be used to detect suspicious or malicious cyber activity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "labels",
    "name",
    "description",
    "pattern",
    "valid_from",
    "valid_until",
    "kill_chain_phases"
})
public class Indicator extends Core {

    /**
     * The type of this object, which MUST be the literal `indicator`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `indicator`.")
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
     * This field is an Open Vocabulary that specifies the type of indicator. Open vocab - indicator-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("This field is an Open Vocabulary that specifies the type of indicator. Open vocab - indicator-label-ov")
    private List<String> labels = new ArrayList<String>();
    /**
     * The name used to identify the Indicator.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Indicator.")
    private String name;
    /**
     * A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.")
    private String description;
    /**
     * The detection pattern for this indicator. The default language is STIX Patterning.
     * (Required)
     * 
     */
    @JsonProperty("pattern")
    @JsonPropertyDescription("The detection pattern for this indicator. The default language is STIX Patterning.")
    private String pattern;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("valid_from")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String validFrom;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("valid_until")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String validUntil;
    /**
     * The phases of the kill chain that this indicator detects.
     * 
     */
    @JsonProperty("kill_chain_phases")
    @JsonPropertyDescription("The phases of the kill chain that this indicator detects.")
    private List<KillChainPhase> killChainPhases = new ArrayList<KillChainPhase>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `indicator`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `indicator`.
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
     * This field is an Open Vocabulary that specifies the type of indicator. Open vocab - indicator-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * This field is an Open Vocabulary that specifies the type of indicator. Open vocab - indicator-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The name used to identify the Indicator.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Indicator.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The detection pattern for this indicator. The default language is STIX Patterning.
     * (Required)
     * 
     */
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * The detection pattern for this indicator. The default language is STIX Patterning.
     * (Required)
     * 
     */
    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("valid_from")
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("valid_from")
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("valid_until")
    public String getValidUntil() {
        return validUntil;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("valid_until")
    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * The phases of the kill chain that this indicator detects.
     * 
     */
    @JsonProperty("kill_chain_phases")
    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    /**
     * The phases of the kill chain that this indicator detects.
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("labels", labels).append("name", name).append("description", description).append("pattern", pattern).append("validFrom", validFrom).append("validUntil", validUntil).append("killChainPhases", killChainPhases).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(killChainPhases).append(name).append(pattern).append(description).append(validUntil).append(id).append(validFrom).append(additionalProperties).append(type).append(labels).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Indicator) == false) {
            return false;
        }
        Indicator rhs = ((Indicator) other);
        return new EqualsBuilder().append(killChainPhases, rhs.killChainPhases).append(name, rhs.name).append(pattern, rhs.pattern).append(description, rhs.description).append(validUntil, rhs.validUntil).append(id, rhs.id).append(validFrom, rhs.validFrom).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(labels, rhs.labels).isEquals();
    }

}
