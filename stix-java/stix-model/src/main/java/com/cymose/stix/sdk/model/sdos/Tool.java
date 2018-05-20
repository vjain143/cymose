
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
 * tool
 * <p>
 * Tools are legitimate software that can be used by threat actors to perform attacks.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "labels",
    "name",
    "description",
    "tool_version",
    "kill_chain_phases"
})
public class Tool extends Core {

    /**
     * The type of this object, which MUST be the literal `tool`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `tool`.")
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
     * The kind(s) of tool(s) being described. Open Vocab - tool-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("The kind(s) of tool(s) being described. Open Vocab - tool-label-ov")
    private List<String> labels = new ArrayList<String>();
    /**
     * The name used to identify the Tool.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Tool.")
    private String name;
    /**
     * Provides more context and details about the Tool object.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Provides more context and details about the Tool object.")
    private String description;
    /**
     * The version identifier associated with the tool.
     * 
     */
    @JsonProperty("tool_version")
    @JsonPropertyDescription("The version identifier associated with the tool.")
    private String toolVersion;
    /**
     * The list of kill chain phases for which this Tool instance can be used.
     * 
     */
    @JsonProperty("kill_chain_phases")
    @JsonPropertyDescription("The list of kill chain phases for which this Tool instance can be used.")
    private List<KillChainPhase> killChainPhases = new ArrayList<KillChainPhase>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `tool`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `tool`.
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
     * The kind(s) of tool(s) being described. Open Vocab - tool-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * The kind(s) of tool(s) being described. Open Vocab - tool-label-ov
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The name used to identify the Tool.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Tool.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Provides more context and details about the Tool object.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Provides more context and details about the Tool object.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The version identifier associated with the tool.
     * 
     */
    @JsonProperty("tool_version")
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * The version identifier associated with the tool.
     * 
     */
    @JsonProperty("tool_version")
    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }

    /**
     * The list of kill chain phases for which this Tool instance can be used.
     * 
     */
    @JsonProperty("kill_chain_phases")
    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    /**
     * The list of kill chain phases for which this Tool instance can be used.
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("labels", labels).append("name", name).append("description", description).append("toolVersion", toolVersion).append("killChainPhases", killChainPhases).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(toolVersion).append(killChainPhases).append(name).append(description).append(id).append(additionalProperties).append(type).append(labels).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tool) == false) {
            return false;
        }
        Tool rhs = ((Tool) other);
        return new EqualsBuilder().append(toolVersion, rhs.toolVersion).append(killChainPhases, rhs.killChainPhases).append(name, rhs.name).append(description, rhs.description).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(labels, rhs.labels).isEquals();
    }

}
