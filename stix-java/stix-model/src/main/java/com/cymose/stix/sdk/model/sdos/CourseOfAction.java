
package com.cymose.stix.sdk.model.sdos;

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
 * course-of-action
 * <p>
 * A Course of Action is an action taken either to prevent an attack or to respond to an attack that is in progress. 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "name",
    "description"
})
public class CourseOfAction extends Core {

    /**
     * The type of this object, which MUST be the literal `course-of-action`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `course-of-action`.")
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
     * The name used to identify the Course of Action.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Course of Action.")
    private String name;
    /**
     * A description that provides more details and context about this object, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides more details and context about this object, potentially including its purpose and its key characteristics.")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `course-of-action`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `course-of-action`.
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
     * The name used to identify the Course of Action.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Course of Action.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about this object, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about this object, potentially including its purpose and its key characteristics.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("name", name).append("description", description).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(id).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseOfAction) == false) {
            return false;
        }
        CourseOfAction rhs = ((CourseOfAction) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
