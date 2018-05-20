
package com.cymose.stix.sdk.model.sros;

import java.util.HashMap;
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
 * relationship
 * <p>
 * The Relationship object is used to link together two SDOs in order to describe how they are related to each other.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "relationship_type",
    "description",
    "source_ref",
    "target_ref"
})
public class Relationship extends Core {

    /**
     * The type of this object, which MUST be the literal `relationship`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `relationship`.")
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
     * The name used to identify the type of relationship.
     * (Required)
     * 
     */
    @JsonProperty("relationship_type")
    @JsonPropertyDescription("The name used to identify the type of relationship.")
    private String relationshipType;
    /**
     * A description that helps provide context about the relationship.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that helps provide context about the relationship.")
    private String description;
    /**
     * The ID of the source (from) object.
     * (Required)
     * 
     */
    @JsonProperty("source_ref")
    @JsonPropertyDescription("The ID of the source (from) object.")
    private Object sourceRef;
    /**
     * The ID of the target (to) object.
     * (Required)
     * 
     */
    @JsonProperty("target_ref")
    @JsonPropertyDescription("The ID of the target (to) object.")
    private Object targetRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `relationship`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `relationship`.
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
     * The name used to identify the type of relationship.
     * (Required)
     * 
     */
    @JsonProperty("relationship_type")
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * The name used to identify the type of relationship.
     * (Required)
     * 
     */
    @JsonProperty("relationship_type")
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * A description that helps provide context about the relationship.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that helps provide context about the relationship.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The ID of the source (from) object.
     * (Required)
     * 
     */
    @JsonProperty("source_ref")
    public Object getSourceRef() {
        return sourceRef;
    }

    /**
     * The ID of the source (from) object.
     * (Required)
     * 
     */
    @JsonProperty("source_ref")
    public void setSourceRef(Object sourceRef) {
        this.sourceRef = sourceRef;
    }

    /**
     * The ID of the target (to) object.
     * (Required)
     * 
     */
    @JsonProperty("target_ref")
    public Object getTargetRef() {
        return targetRef;
    }

    /**
     * The ID of the target (to) object.
     * (Required)
     * 
     */
    @JsonProperty("target_ref")
    public void setTargetRef(Object targetRef) {
        this.targetRef = targetRef;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("relationshipType", relationshipType).append("description", description).append("sourceRef", sourceRef).append("targetRef", targetRef).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetRef).append(relationshipType).append(description).append(id).append(additionalProperties).append(type).append(sourceRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Relationship) == false) {
            return false;
        }
        Relationship rhs = ((Relationship) other);
        return new EqualsBuilder().append(targetRef, rhs.targetRef).append(relationshipType, rhs.relationshipType).append(description, rhs.description).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(sourceRef, rhs.sourceRef).isEquals();
    }

}
