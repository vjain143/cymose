
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
 * kill-chain-phase
 * <p>
 * The kill-chain-phase represents a phase in a kill chain.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kill_chain_name",
    "phase_name"
})
public class KillChainPhase {

    /**
     * The name of the kill chain.
     * (Required)
     * 
     */
    @JsonProperty("kill_chain_name")
    @JsonPropertyDescription("The name of the kill chain.")
    private String killChainName;
    /**
     * The name of the phase in the kill chain.
     * (Required)
     * 
     */
    @JsonProperty("phase_name")
    @JsonPropertyDescription("The name of the phase in the kill chain.")
    private String phaseName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The name of the kill chain.
     * (Required)
     * 
     */
    @JsonProperty("kill_chain_name")
    public String getKillChainName() {
        return killChainName;
    }

    /**
     * The name of the kill chain.
     * (Required)
     * 
     */
    @JsonProperty("kill_chain_name")
    public void setKillChainName(String killChainName) {
        this.killChainName = killChainName;
    }

    /**
     * The name of the phase in the kill chain.
     * (Required)
     * 
     */
    @JsonProperty("phase_name")
    public String getPhaseName() {
        return phaseName;
    }

    /**
     * The name of the phase in the kill chain.
     * (Required)
     * 
     */
    @JsonProperty("phase_name")
    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
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
        return new ToStringBuilder(this).append("killChainName", killChainName).append("phaseName", phaseName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(killChainName).append(additionalProperties).append(phaseName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KillChainPhase) == false) {
            return false;
        }
        KillChainPhase rhs = ((KillChainPhase) other);
        return new EqualsBuilder().append(killChainName, rhs.killChainName).append(additionalProperties, rhs.additionalProperties).append(phaseName, rhs.phaseName).isEquals();
    }

}
